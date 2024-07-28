package Exerc22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exerc22 {

    public static void main(String[] args) {
        // Verifica se o caminho do arquivo foi passado como argumento
        if (args.length < 1) {
            System.out.println("Forneça o caminho do arquivo.");
            return;
        }

        String caminhoArquivo = args[0];

            try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            // lê o arquivo linha por linha
            while ((linha = br.readLine()) != null) {
                //iImprime a linha no console
                System.out.println(linha);
            }
        } catch (IOException e) {
            // captura e trata erros de leitura do arquivo
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
