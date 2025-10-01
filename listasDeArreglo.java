package clases;

import java.util.ArrayList;

public class listasDeArreglo {

    public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<String>();
        ArrayList<Integer> listaEdades = new ArrayList<Integer>();

        listaEdades.add(22);
        listaEdades.add(16);
        listaEdades.add(34);
        listaEdades.add(72);
        listaNombres.add("Camila");
        listaNombres.add("Benjamín");
        listaNombres.add("Francisco");
        listaNombres.add("Carlos");

        System.out.println(listaNombres.get(2));
        System.out.println(listaEdades.get(1));

        for (int i = 0; i < listaEdades.size(); i++) {
            System.out.println("elemento: " + listaEdades.get(i) + " en posición " + i);
        }

        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println("elemento: " + listaNombres.get(i) + " en posición " + i);
        }

    }

}
