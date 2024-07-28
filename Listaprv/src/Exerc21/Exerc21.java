package Exerc21;

import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exerc21 {
    // HashMap para armazenar contatos
    private HashMap<String, String> contatos;

    // construtor
    public void Contatos() {
        contatos = new HashMap<>();
    }

    //adicionar contato
    public void adicionarContato(String nome, String telefone) {
        contatos.put(nome, telefone);
    }

    // buscar contato pelo nome
    public String buscarContato(String nome) {
        return contatos.get(nome);
    }

    public static void main(String[] args) {
        Contatos agenda = new Contatos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. Adicionar contato");
                System.out.println("2. Buscar contato");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
             // limpar o buffer do scanner
                scanner.nextLine(); 
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o telefone: ");
                        String telefone = scanner.nextLine();
                        agenda.adicionarContato(nome, telefone);
                        System.out.println("Contato adicionado com sucesso!");
                        break;

                    case 2:
                        System.out.print("Digite o nome para buscar: ");
                        nome = scanner.nextLine();
                        String resultado = agenda.buscarContato(nome);
                        if (resultado != null) {
                            System.out.println("Telefone: " + resultado);
                        } else {
                            System.out.println("Contato não encontrado.");
                        }
                        break;

                    case 3:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
             // limpar o buffer do scanner
                scanner.nextLine(); 
            }
        }
    }
}
