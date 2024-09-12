package br.com.everdev.linkedlist;

import java.util.Scanner;

public class CorridaCarros {
    public static void main(String[] args) {
        LinkedListDesafio<String> classificacao = new LinkedListDesafio<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de carros na corrida:");
        int quantidadeCarros = scanner.nextInt();
        scanner.nextLine();  // Consumir o '\n' que resta da leitura anterior

        // Receber os nomes dos carros e suas classificações
        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.println("Digite o nome do carro na posição " + (i + 1) + ":");
            String nomeCarro = scanner.nextLine();
            classificacao.addElemento(nomeCarro);
        }

        System.out.println("\nClassificação da corrida:");
        imprimirClassificacao(classificacao.getHead());

        scanner.close();
    }

    // Método para imprimir a classificação
    public static void imprimirClassificacao(Node<String> atual) {
        int posicao = 1;
        while (atual != null) {
            System.out.println(posicao + "º lugar: " + atual.data);
            atual = atual.next;
            posicao++;
        }
    }
}
