
package bean;


public class Caja {
    private int codigo;
    private String nombre;
    private String nombrebebida;
    private int cantidad;
    private int cantidadpersonas;
    private double precio;
    private String horallegada;
    private int total;

    public Caja(int codigo, String nombre, String nombrebebida, int cantidad, int cantidadpersonas, double precio, String horallegada, int total) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nombrebebida = nombrebebida;
        this.cantidad = cantidad;
        this.cantidadpersonas = cantidadpersonas;
        this.precio = precio;
        this.horallegada = horallegada;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrebebida() {
        return nombrebebida;
    }

    public void setNombrebebida(String nombrebebida) {
        this.nombrebebida = nombrebebida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadpersonas() {
        return cantidadpersonas;
    }

    public void setCantidadpersonas(int cantidadpersonas) {
        this.cantidadpersonas = cantidadpersonas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(String horallegada) {
        this.horallegada = horallegada;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

   
    
}
