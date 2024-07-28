package exerc4;

import java.util.Scanner;


public class Exerc4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas palavras deseja inserir: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] palavras = new String[n];
        
        // usuário entrar com as palavras
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            palavras[i] = scanner.nextLine();
        }
        
        // usar StringBuilder para construir a string
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(palavras[i]);
            
            // adicionar espaços 
            if (i != n - 1) {
                sb.append(" ");
            }
        }
        
        // exibir a palavra escrita
        System.out.println("String construída: " + sb.toString());
        
        scanner.close();
    }
}
