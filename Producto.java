package clases;

public class Producto {

    private String nombre;
    private int precio;

    public Producto() {

    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void retiroEmpaque() {
        System.out.println("\nRecuerde retirar su compra");
    }
}
