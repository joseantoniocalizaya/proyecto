
package modelo;

import bean.Caja;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Arreglocaja {
     private ArrayList<Caja> listacad;

    public Arreglocaja() {
        listacad = new ArrayList<Caja>();
        cargar();
    }
    public String adicionar(Caja D){
        String mensaje;
        Caja x = buscar(D.getCodigo());
        if (x==null){
            listacad.add(D);
            mensaje = "los datos de la caja se gusradron sorrectamente";
        }else{
            mensaje = "los datos de la caja ya existen";
        }
        return mensaje;
    }
    
    public void eliminar(Caja D){
        listacad.remove(D);
    }
    
    public Caja obtener(int posicion){
        return listacad.get(posicion);
    }
    
    public Caja buscar(int codigo){
         Caja D=null;
        for(int i=0; i<listacad.size(); i++){
            if(obtener(i).getCodigo()==codigo){
                D = obtener(i);
                i = listacad.size();
            }
        }
        return D;
    }
    
    public int buscarPosicion(int codigo){
        int posicion = -1;
        for(int i=0; i<listacad.size(); i++){
            if(obtener(i).getCodigo()==codigo){
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    
    public void actualizar(Caja D){
        listacad.set(buscarPosicion(D.getCodigo()), D);
    }
    
    public int totalProd(){
        return listacad.size();
    }
    
  
    
    
    //Métodos para manipular el archivo de texto
    private void cargar(){
        try{
            File archivo = new File("Caja.txt");
            if(archivo.exists()){
                BufferedReader br=new BufferedReader(new FileReader("Caja.txt"));
                String linea;

                while((linea=br.readLine())!=null){
                    StringTokenizer st=new StringTokenizer(linea,",");

                    int cod = Integer.parseInt(st.nextToken().trim());
                    String nombre=st.nextToken().trim();
                    String nombrebebida=st.nextToken().trim();
                    int cantidad = Integer.parseInt(st.nextToken().trim());
                    int cantidadpersonas = Integer.parseInt(st.nextToken().trim());
                    double precio= Double.parseDouble(st.nextToken().trim());
                     String horallegada=st.nextToken().trim();
                    int total= Integer.parseInt(st.nextToken().trim());

                    Caja x =new Caja(cod, nombre, nombrebebida, cantidad,cantidadpersonas,precio,horallegada,total);
                    adicionar(x);
                }
                br.close();
            }
            else
                JOptionPane.showMessageDialog(null,"El archivo Cajatxt no existe");
            } catch(Exception x){
                JOptionPane.showMessageDialog(null,"Se produjo un error: "+x.toString());
            }

 }

    public void grabar(){
        try{
            PrintWriter pw =new PrintWriter(new FileWriter("Caja.txt"));
            for(int i=0; i<totalProd(); i++)
                pw.println(obtener(i).getCodigo()+","+obtener(i).getNombre()+","+obtener(i).getNombrebebida()+","+obtener(i).getCantidad()+","+obtener(i).getCantidadpersonas()+","+obtener(i).getPrecio()+","+obtener(i).getHorallegada()+","+obtener(i).getTotal());
            pw.close();
        }catch(Exception x){
            JOptionPane.showMessageDialog(null,"Se produjo un error: "+x.toString());
        }
    }

    



}
