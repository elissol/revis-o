package Exerc24;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exerc24 {

    public static void main(String[] args) {
        // o que será gravado no arquivo
        String[] arrayDeStrings = {
            "Primeira linha",
            "Segunda linha",
            "Terceira linha",
            "Quarta linha"
        };

        // caminho do arquivo que será gravado
        String caminhoArquivo = "saida.txt";

        // usa um bloco try-with-resources para garantir que o BufferedWriter seja fechado automaticamente
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            // percorre o array e grava cada string no arquivo, cada uma em uma nova linha
            for (String linha : arrayDeStrings) {
                bw.write(linha);
             // adiciona uma nova linha
                bw.newLine(); 
            }

            System.out.println("Array gravado no arquivo com sucesso!");

        } catch (IOException e) {
            // captura e trata erros de escrita no arquivo
            System.out.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
        }
    }
}
