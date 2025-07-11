/*
 * 📌 Exercício 02 – Classe Produto com Estoque
 *
 * Descrição:
 * Crie uma classe Produto com os seguintes atributos:
 * - nome (String)
 * - preco (double)
 * - quantidade (int)
 *
 * A classe deve conter os seguintes métodos:
 * - comprar(int quantidade): adiciona ao estoque
 * - vender(int quantidade): retira do estoque (se possível)
 * - exibir(): exibe nome, preço e estoque atual do produto
 *
 * No método main, crie uma instância da classe Produto, realize operações de compra e venda,
 * e exiba os dados atualizados após cada operação.
 *
 * 💡 Desenvolvido em Java como parte dos exercícios de Programação Orientada a Objetos (POO),
 * no curso de Análise e Desenvolvimento de Sistemas (ADS).
 */

import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int quantidade;

    // Construtor
    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos
    void comprar(int quantidadeComprada) {
        this.quantidade += quantidadeComprada;
        System.out.println(" Produto comprado com sucesso!");
    }

    void vender(int quantidadeVendida) {
        if (quantidadeVendida <= this.quantidade) {
            this.quantidade -= quantidadeVendida;
            System.out.println(" Venda realizada com sucesso!");
        } else {
            System.out.println(" Estoque insuficiente para realizar a venda.");
        }
    }

    void exibir() {
        System.out.println(" Produto: " + nome);
        System.out.printf(" Preço: R$ %.2f\n", preco);
        System.out.println(" Quantidade em estoque: " + quantidade);
        System.out.println("---------------------------");
    }
}

public class Exercicio02_ProdutoComEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro do produto
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade inicial em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        produto.exibir();

        char opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Comprar produto");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Exibir dados do produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.print("Quantidade para comprar: ");
                    int qCompra = scanner.nextInt();
                    produto.comprar(qCompra);
                    break;
                case '2':
                    System.out.print("Quantidade para vender: ");
                    int qVenda = scanner.nextInt();
                    produto.vender(qVenda);
                    break;
                case '3':
                    produto.exibir();
                    break;
                case '0':
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != '0');
    }
}
