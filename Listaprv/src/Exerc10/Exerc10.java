package Exerc10;

import java.util.ArrayList;
import java.util.List;

public class Exerc10 {
    public static void main(String[] args) {
        // lista de inteiros
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(5);
        listaDeNumeros.add(4);
        listaDeNumeros.add(10);
        listaDeNumeros.add(15);
        listaDeNumeros.add(12);

        // calcula a soma
        int soma = 0;
        for (int numero : listaDeNumeros) {
            soma += numero;
        }

        // calcula a media
        double media = (double) soma / listaDeNumeros.size();

        // mostra a soma e a media
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}
