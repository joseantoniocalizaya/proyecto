
package modelo;
import bean.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Arreglousuario {
     private ArrayList<Usuario> lista;

    public Arreglousuario() {
        lista = new ArrayList<Usuario>();
        cargar();
    }
    public String adicionar(Usuario P){
        String mensaje;
        Usuario x = buscar(P.getCodigo());
        if (x==null){
            lista.add(P);
            mensaje = "los datos  del usuario se guardaron";
        }else{
            mensaje = " los datos del usuario ya exixten";
        }
        return mensaje;
    }
    
    public void eliminar(Usuario P){
        lista.remove(P);
    }
    
    public Usuario obtener(int posicion){
        return lista.get(posicion);
    }
    
    public Usuario buscar(int codigo){
         Usuario P=null;
        for(int i=0; i<lista.size(); i++){
            if(obtener(i).getCodigo()==codigo){
                P = obtener(i);
                i = lista.size();
            }
        }
        return P;
    }
    
    public int buscarPosicion(int codigo){
        int posicion = -1;
        for(int i=0; i<lista.size(); i++){
            if(obtener(i).getCodigo()==codigo){
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    
    public void actualizar(Usuario P){
        lista.set(buscarPosicion(P.getCodigo()), P);
    }
    
    public int totalProd(){
        return lista.size();
    }
    
  
    
    
    //Métodos para manipular el archivo de texto
    private void cargar(){
        try{
            File archivo = new File("Usuario.txt");
            if(archivo.exists()){
                BufferedReader br=new BufferedReader(new FileReader("Usuario.txt"));
                String linea;

                while((linea=br.readLine())!=null){
                    StringTokenizer st=new StringTokenizer(linea,",");

                    int cod = Integer.parseInt(st.nextToken().trim());
                    String nombre=st.nextToken().trim();
                    String apellido=st.nextToken().trim();
                    String distrito=st.nextToken().trim();
                    String direccion=st.nextToken().trim();
                    String correo=st.nextToken().trim();
                    String fecha=st.nextToken().trim();
                    int dni = Integer.parseInt(st.nextToken().trim());
                     int edad= Integer.parseInt(st.nextToken().trim());
                    int telefono= Integer.parseInt(st.nextToken().trim());

                    Usuario x =new Usuario(cod, nombre, apellido, distrito,direccion,correo,fecha,dni,edad,telefono);
                    adicionar(x);
                }
                br.close();
            }
            else
                JOptionPane.showMessageDialog(null,"El archivo Usuario.txt no existe");
            } catch(Exception x){
                JOptionPane.showMessageDialog(null,"Se produjo un error: "+x.toString());
            }

 }

    public void grabar(){
        try{
            PrintWriter pw =new PrintWriter(new FileWriter("Usuario.txt"));
            for(int i=0; i<totalProd(); i++)
                pw.println(obtener(i).getCodigo()+","+obtener(i).getNombre()+","+obtener(i).getApellido()+","+obtener(i).getDistrito()+","+obtener(i).getDireccion()+","+obtener(i).getCorreo()+","+obtener(i).getFecha()+","+obtener(i).getDni()+","+obtener(i).getEdad()+","+obtener(i).getTelefono());
            pw.close();
        }catch(Exception x){
            JOptionPane.showMessageDialog(null,"Se produjo un error: "+x.toString());
        }
    }

    

}
