package Exerc8;

public class Exerc8 {
    public static void main(String[] args) {
        // Matriz
        int[] numeros = {22, 51, 10, 8, 11, 18, 50};

        // Inicia o maior valor
        int maiorValor = numeros[0];

        // interando a matriz com o valor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
        }

        // exibi o valor
        System.out.println("O maior valor da matriz é: " + maiorValor);
    }
}
