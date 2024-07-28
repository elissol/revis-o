package Exerc23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exerc23 {

    public static void main(String[] args) {
        // verifica se o caminho do arquivo de origem e destino foram fornecidos
        if (args.length < 2) {
            System.out.println("Escreva o caminho de origem e destino do arquivo.");
            return;
        }

        String caminhoArquivoOrigem = args[0];
        String caminhoArquivoDestino = args[1];

        // Usa um bloco try-with-resources para garantir que os fluxos de entrada e saída sejam fechados automaticamente
        try (FileInputStream fis = new FileInputStream(caminhoArquivoOrigem);
             FileOutputStream fos = new FileOutputStream(caminhoArquivoDestino)) {

            byte[] buffer = new byte[1024];
            int bytesLidos;

            // lê o arquivo de origem e escreve no arquivo de destino
            while ((bytesLidos = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesLidos);
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (IOException e) {
            // captura e trata erros de leitura e escrita
            System.out.println("Ocorreu um erro ao copiar o arquivo: " + e.getMessage());
        }
    }
}

