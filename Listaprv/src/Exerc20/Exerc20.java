package Exerc20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // usuário entra com um texto
        System.out.println("Por favor, insira um texto:");
        String texto = scanner.nextLine();

        // fechar scanner
        scanner.close();

        // verificando o texto
        if (texto.trim().isEmpty()) {
            System.out.println("Não há texto digitado não é possível contar as palavras..");
            return;
        }

        // criar mapa
        Map<String, Integer> frequenciaPalavras = new HashMap<>();

        // dividir o texto em palavras
        String[] palavras = texto.split("\\s+");

        // contando as palavras
        for (String palavra : palavras) {
        	// converter para minuscula
            palavra = palavra.toLowerCase(); 
            if (frequenciaPalavras.containsKey(palavra)) {
                frequenciaPalavras.put(palavra, frequenciaPalavras.get(palavra) + 1);
            } else {
                frequenciaPalavras.put(palavra, 1);
            }
        }

        // exibindo a frequência das palavras
        System.out.println("\nFrequência das palavras:");
        for (Map.Entry<String, Integer> entry : frequenciaPalavras.entrySet()) {
            System.out.println("Palavra: \"" + entry.getKey() + "\" - Frequência: " + entry.getValue());
        }
    }
}
