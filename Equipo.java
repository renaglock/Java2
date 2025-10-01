package clases;

import java.util.ArrayList;

public class Equipo {

    public static void main(String[] args) {
        ArrayList<String> listaEquipos = new ArrayList<String>();

        listaEquipos.add("Colo-Colo");
        listaEquipos.add("Universidad Católica");
        listaEquipos.add("Deportes Temuco");
        listaEquipos.add("Cobreloa");
        listaEquipos.add("Manchester City");
        listaEquipos.add("Audax Italiano");
        listaEquipos.add("Arsenal");
        listaEquipos.add("O'Higgins");
        listaEquipos.add("Huachipato");
        listaEquipos.add("Universidad de Chile");

        System.out.println("Lista: " + listaEquipos);
        System.out.println("Tamaño: " + listaEquipos.size());

        boolean vacia = listaEquipos.isEmpty();
        if (vacia) {
            System.out.println("Está vacía");
        } else {
            System.out.println("Tiene datos");
        }

        listaEquipos.remove(4);
        System.out.println("Después de eliminar " + listaEquipos);

        listaEquipos.set(0, "Arbo canpion");
        System.out.println("Lista: " + listaEquipos);

    }

}
