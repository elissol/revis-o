package Exerc11;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        // scanner de entrada
        Scanner scanner = new Scanner(System.in);

        // usuário insere string
        System.out.println("Por favor insira um número separado por espaços:");
        String input = scanner.nextLine();

        // fecha o scanner
        scanner.close();

        // separa a string
        String[] numerosString = input.split(" ");

        // armazenar a soma
        int soma = 0;

          for (String numero : numerosString) {
            try {
                // converter em inteiro
                int valor = Integer.parseInt(numero);
                // somando o valor
                soma += valor;
            } catch (NumberFormatException e) {
                // Exibindo uma mensagem de aviso se a conversão falhar
                System.out.println("Aviso: \"" + numero + "\" não é um número válido insira novamente.");
            }
        }

        // exibi o total
        System.out.println("A soma total dos números é: " + soma);
    }
}
