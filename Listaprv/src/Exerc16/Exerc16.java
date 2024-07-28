package Exerc16;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc16{
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // usuário entra com número de elementos
        System.out.print("Qual a quantidade de números? ");
        int tamanho;
        
        // captura de erro
        while (true) {
            try {
                tamanho = Integer.parseInt(scanner.nextLine());
                if (tamanho <= 0) {
                    throw new NumberFormatException("O número deve ser diferente de zero.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro positivo.");
            }
        }

        // criando a matriz
        int[] numeros = new int[tamanho];

        // usuário entra com a quantidade de números
        System.out.println("Insira " + tamanho + " números inteiros:");

        for (int i = 0; i < tamanho; i++) {
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = Integer.parseInt(scanner.nextLine());
                    break; 
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                }
            }
        }

        // fechar o scanner
        scanner.close();

        Arrays.sort(numeros);

        // exibindo a lista
        System.out.println("Lista de números:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

