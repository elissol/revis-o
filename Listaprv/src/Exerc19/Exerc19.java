package Exerc19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exerc19{
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // criar mapa
        Map<String, Integer> inventario = new HashMap<>();

        while (true) {
            // menu
            System.out.println("\nInventário");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Buscar produto");
            System.out.println("4. Listar todos os produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            while (true) {
                try {
                    opcao = Integer.parseInt(scanner.nextLine());
                    if (opcao < 1 || opcao > 5) {
                        throw new NumberFormatException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida. Por favor, insira opção entre os números 1 e 5.");
                }
            }

            switch (opcao) {
                case 1:
                    // adicionar produto
                    System.out.print("Digite o nome do produto: ");
                    String nomeProdutoAdicionar = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeAdicionar;
                    
                    while (true) {
                        try {
                            quantidadeAdicionar = Integer.parseInt(scanner.nextLine());
                            if (quantidadeAdicionar < 0) {
                                throw new NumberFormatException();
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Por favor, insira um número inteiro positivo para a quantidade.");
                        }
                    }

                    inventario.put(nomeProdutoAdicionar, inventario.getOrDefault(nomeProdutoAdicionar, 0) + quantidadeAdicionar);
                    System.out.println("Produto adicionado com sucesso.");
                    break;

                case 2:
                    // remover produto
                    System.out.print("Digite o nome do produto a ser removido: ");
                    String nomeProdutoRemover = scanner.nextLine();
                    
                    if (inventario.containsKey(nomeProdutoRemover)) {
                        System.out.print("Digite a quantidade a ser removida: ");
                        int quantidadeRemover;
                        
                        while (true) {
                            try {
                                quantidadeRemover = Integer.parseInt(scanner.nextLine());
                                if (quantidadeRemover < 0) {
                                    throw new NumberFormatException();
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Número inválido. Por favor, insira um número válido para a quantidade.");
                            }
                        }
                        
                        int quantidadeAtual = inventario.get(nomeProdutoRemover);
                        if (quantidadeRemover >= quantidadeAtual) {
                            inventario.remove(nomeProdutoRemover);
                            System.out.println("Produto removido com sucesso.");
                        } else {
                            inventario.put(nomeProdutoRemover, quantidadeAtual - quantidadeRemover);
                            System.out.println("Quantidade reduzida com sucesso.");
                        }
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    // buscar produto
                    System.out.print("Digite o nome do produto a ser buscado: ");
                    String nomeProdutoBuscar = scanner.nextLine();
                    
                    if (inventario.containsKey(nomeProdutoBuscar)) {
                        System.out.println("Produto: " + nomeProdutoBuscar + ", Quantidade: " + inventario.get(nomeProdutoBuscar));
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    // listar todos os produtos
                    if (inventario.isEmpty()) {
                        System.out.println("Nenhum produto no inventário.");
                    } else {
                        System.out.println("Inventário:");
                        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
                            System.out.println("Produto: " + entry.getKey() + ", Quantidade: " + entry.getValue());
                        }
                    }
                    break;

                case 5:
                    // sair do programa
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
