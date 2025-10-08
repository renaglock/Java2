package clases;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Producto[] listaProductos = new Producto[2];
        listaProductos[0] = new Producto("Cerveza Artesanal", 8000);
        listaProductos[1] = new Producto("Vino Cartone", 500);

        for (int i = 0; i < listaProductos.length; i++) {
            System.out.println((i + 1) + ": " + listaProductos[i].getNombre() + " $" + listaProductos[i].getPrecio());

        }
        System.out.print("Seleccione un producto: ");
        int opcion = x.nextInt();
        String nombreProducto;
        double precioProducto;
        switch (opcion) {
            case 1:
                System.out.println("==============");
                nombreProducto = listaProductos[0].getNombre();
                precioProducto = listaProductos[0].getPrecio();
                System.out.println("==============");
                break;
            case 2:
                System.out.println("==============");
                nombreProducto = listaProductos[1].getNombre();
                precioProducto = listaProductos[1].getPrecio();
                System.out.println("==============");
                break;
            default:
                System.out.println("Opción no valida");
                return;
        }
        System.out.println("Ingresa la edad:");
        int edad = x.nextInt();
        
        if (edad >= 60){
            precioProducto = precioProducto * 0.9;
            System.out.println("Descuento aplicado");
        }
        System.out.println("Resumen");
        System.out.println("Producto: "+ nombreProducto);
        System.out.println("Precio final: "+ precioProducto);
        
        Producto objProducto = new Producto();
        objProducto.retiroEmpaque();

    }

}
