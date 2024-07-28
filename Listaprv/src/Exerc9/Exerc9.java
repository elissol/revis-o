package Exerc9;

import java.util.ArrayList;
import java.util.List;

public class Exerc9{
    public static void main(String[] args) {
        // lista de string
        List<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("5");
        listaDeStrings.add("10");
        listaDeStrings.add("15");
        listaDeStrings.add("20");
        listaDeStrings.add("25");

        // nova lista
        List<Integer> listaDeInteiros = new ArrayList<>();

        // convertendo a lista
        for (String s : listaDeStrings) {
            listaDeInteiros.add(Integer.parseInt(s));
        }

        // mostrando a lista
        System.out.println("Lista de inteiros: " + listaDeInteiros);
    }
}
