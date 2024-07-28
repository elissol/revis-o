package exerc2;

import java.util.Scanner;

public class exer2 {
    
    // função de vogal
    public static boolean evogal(char c) {
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    // função para contar vogais em uma string
    public static int contarVogais(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (evogal(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entre com uma string: ");
        String input = scanner.nextLine();
        
        // contar o número de vogais na string
        int numVogais = contarVogais(input);
        
        System.out.println("O número de vogais na string: " + numVogais);
        
        scanner.close();
    }
}
