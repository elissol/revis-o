package Exerc14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // definir o formato da data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data1 = null;
        LocalDate data2 = null;

        //  primeira data
        while (data1 == null) {
            System.out.println("Insira a primeira data (dd/MM/yyyy):");
            String dataInput1 = scanner.nextLine();
            try {
                data1 = LocalDate.parse(dataInput1, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, insira a data no formato correto (dd/MM/yyyy).");
            }
        }

        //  segunda data
        while (data2 == null) {
            System.out.println("Por favor, insira a segunda data (dd/MM/yyyy):");
            String dataInput2 = scanner.nextLine();
            try {
                data2 = LocalDate.parse(dataInput2, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Por favor, insira a data no formato correto (dd/MM/yyyy).");
            }
        }

        // fechar o Scanner
        scanner.close();

        // comparar as datas
        if (data1.isBefore(data2)) {
            System.out.println("A primeira data (" + data1.format(formatter) + ") é antes da segunda data (" + data2.format(formatter) + ").");
        } else if (data1.isAfter(data2)) {
            System.out.println("A primeira data (" + data1.format(formatter) + ") é depois da segunda data (" + data2.format(formatter) + ").");
        } else {
            System.out.println("As datas são iguais.");
        }
    }
}
