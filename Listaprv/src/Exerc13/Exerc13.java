package Exerc13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // formato data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataOriginal = null;
        int diasParaAdicionar = 0;

        
        while (dataOriginal == null) {
            System.out.println("Inserir a data (dd/MM/yyyy):");
            String dataInput = scanner.nextLine();
            try {
                dataOriginal = LocalDate.parse(dataInput, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, insira a data no formato correto (dd/MM/yyyy).");
            }
        }

        // processando numero de dias
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Por favor, insira o número de dias a adicionar:");
            String diasInput = scanner.nextLine();
            try {
                diasParaAdicionar = Integer.parseInt(diasInput);
                entradaValida = true; 
            } catch (NumberFormatException e) {
                System.out.println("Número de dias inválido. Por favor, insira um número inteiro.");
            }
        }

        // fechar o scanner
        scanner.close();

        
        LocalDate novaData = dataOriginal.plusDays(diasParaAdicionar);

        // exibi a nova data
        System.out.println("A nova data, após adicionar " + diasParaAdicionar + " dias, é: " + novaData.format(formatter));
    }
}
