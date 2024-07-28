package Exerc18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);
        
        // lista
        List<Integer> numeros = new ArrayList<>();

        // usuário entra com quantidade de números
        System.out.print("Qual a quantidade deseja inserir? ");
        int quantidade;
        
            while (true) {
            try {
                quantidade = Integer.parseInt(scanner.nextLine());
                if (quantidade <= 0) {
                    throw new NumberFormatException("Número inválida precisa ser diferente de zero.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        }

        // usuário entra com os números
        System.out.println("Insira " + quantidade + " números inteiros:");

        for (int i = 0; i < quantidade; i++) {
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    int numero = Integer.parseInt(scanner.nextLine());
                    numeros.add(numero);
                    break; 
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                }
            }
        }

        // fechar o scanner
        scanner.close();

        // verificar a lista
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
            return;
        }

        // encontra o maior número e o menor número
        int maior = numeros.get(0);
        int menor = numeros.get(0);

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        //exibi o maior e menor número
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}
