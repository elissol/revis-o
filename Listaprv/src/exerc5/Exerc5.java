package exerc5;

import java.util.Scanner;

public class Exerc5 {
    
    // função para verificar se um caractere é uma vogal
    public static boolean ehVogal(char c) {
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    // função para remover vogais de uma palavra usando StringBuilder
    public static String removerVogais(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char caractere = str.charAt(i);
            
            // verificar se o caractere não é uma vogal
            if (!ehVogal(caractere)) {
                sb.append(caractere);
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entre com uma frase: ");
        String input = scanner.nextLine();
        
        // tirar as vogais da palavra que entrou
        String resultado = removerVogais(input);
        
        System.out.println("Frase sem vogais: " + resultado);
        
        scanner.close();
    }
}
