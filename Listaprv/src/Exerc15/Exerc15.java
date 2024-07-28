package Exerc15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        // lista para armazenar as tarefas
        List<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // menu
            System.out.println("\nGerenciador de Tarefas");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    // adicionar tarefa
                    System.out.print("Digite a tarefa para adicionar: ");
                    String tarefaParaAdicionar = scanner.nextLine();
                    tarefas.add(tarefaParaAdicionar);
                    System.out.println("Tarefa adicionada com sucesso.");
                    break;
                
                case 2:
                    // remover tarefa
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa para remover.");
                        break;
                    }
                    System.out.println("Tarefas atuais:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    System.out.print("Digite o número da tarefa para remover: ");
                    int indiceParaRemover = scanner.nextInt() - 1;
                    if (indiceParaRemover >= 0 && indiceParaRemover < tarefas.size()) {
                        tarefas.remove(indiceParaRemover);
                        System.out.println("Tarefa removida com sucesso.");
                    } else {
                        System.out.println("Número da tarefa inválido.");
                    }
                    break;

                case 3:
                    // listar as tarefas
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa para listar.");
                    } else {
                        System.out.println("Tarefas atuais:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;

                case 4:
                    // sair
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    // Opção inválida
                    System.out.println("Inválida a opção escolha novamente.");
                    break;
            }
        }
    }
}
