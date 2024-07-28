package Exerc7;

import java.util.Random;

public class Exerc7 {
    public static void main(String[] args) {
        // gerador de numeros
        Random random = new Random();
        
        // gera um número aleatório entre 1 e 100
        int randomNumber = random.nextInt(100) + 1;
        
        // Exibe o número gerado
        System.out.println("Número gerado aleatório: " + randomNumber);
    }
}
