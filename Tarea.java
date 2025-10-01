package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaAlumnos = new ArrayList<String>();

        System.out.println("Bienvenido a la lista del curso");
        System.out.println("Ingresa la cantidad de alumnos del curso: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa nombre y apellido: ");
            listaAlumnos.add(sc.nextLine());

        }
        System.out.println("Lista: " + listaAlumnos);

    }

}
