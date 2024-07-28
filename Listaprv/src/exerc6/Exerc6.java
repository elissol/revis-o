package exerc6;

import java.util.Scanner;

public class Exerc6 {
    
    // Função para inserir uma string em outra string em uma posição específica usando StringBuilder
    public static String inserirString(String original, String inserida, int posicao) {
        StringBuilder sb = new StringBuilder();
        
        // Adicionar parte inicial da string original até a posição desejada
        sb.append(original.substring(0, posicao));
        
        // Adicionar a string a ser inserida
        sb.append(inserida);
        
        // Adicionar o restante da string original
        sb.append(original.substring(posicao));
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase original: ");
        String original = scanner.nextLine();
        
        System.out.print("Digite uma frase para inserir: ");
        String inserida = scanner.nextLine();
        
        System.out.print("Digite a posição para inserir a frase: ");
        int posicao = scanner.nextInt();
        
        // Inserir a frase na posição especificada na frase original
        String resultado = inserirString(original, inserida, posicao);
        
        System.out.println("Frase resultante: " + resultado);
        
        scanner.close();
    }
}
