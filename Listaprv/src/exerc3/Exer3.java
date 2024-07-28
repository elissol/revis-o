package exerc3;

import java.util.Scanner;

public class Exer3 {
    
       //função
   	  public static int primeiraOcorrencia(String str, char caractere) {
     
   		  // percorre a string
        for (int i = 0; i < str.length(); i++) {
           
        	// verificar o caractere
            if (str.charAt(i) == caractere) {
                return i; 
            }
        }
        return -1; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();
        
        System.out.print("Digite a letra a ser procurada: ");
        char caractere = scanner.next().charAt(0); 
        int posicao = primeiraOcorrencia(input, caractere);
        if (posicao != -1) {
            System.out.println("Primeira ocorrência de '" + caractere + "' encontrada na posição: " + posicao);
        } else {
            System.out.println("Caractere '" + caractere + "' não encontrado na string.");
        }
        
        scanner.close();
    }
}
