package Exerc12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        // scanner de entrada
        Scanner scanner = new Scanner(System.in);

        // formato da data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate primeiraData = null;
        LocalDate segundaData = null;

        // primeira data
        while (primeiraData == null) {
            System.out.println("Por favor, insira a primeira data (dd/mm/yyyy):");
            String primeiraDataInput = scanner.nextLine();
            try {
                primeiraData = LocalDate.parse(primeiraDataInput, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, insira a data no formato correto (dd/mm/yyyy).");
            }
        }

        // segunda data
        while (segundaData == null) {
            System.out.println("Por favor, insira a segunda data (dd/mm/yyyy):");
            String segundaDataInput = scanner.nextLine();
            try {
                segundaData = LocalDate.parse(segundaDataInput, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, insira a data no formato correto (dd/mm/yyyy).");
            }
        }

        // fechar o scanner
        scanner.close();

        // calcular a diferença
        long diferencaEmDias = ChronoUnit.DAYS.between(primeiraData, segundaData);

        // exibi a diferença
        System.out.println("A diferença entre as datas é: " + diferencaEmDias);
    }
}
