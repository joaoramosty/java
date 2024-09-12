package br.com.everdev.linkedlist;

public class LinkedListTestDesafio {
    public static void main(String[] args) {
        LinkedListDesafio<String> nomes = new LinkedListDesafio<>();
        nomes.adicionarNodeInicial("Everton");
        nomes.adicionarElemento("Joao");
        nomes.adicionarElemento("Maria");
        nomes.adicionarElemento("Pedro");
        nomes.adicionarElemento("Suzana");

        System.out.println("Lista original:");
        printLinkedList(nomes.getHead());

        System.out.println("-------------------------");

        // Remoção do último elemento
        nomes.removerUltimoElemento();
        System.out.println("Após remover o último elemento:");
        printLinkedList(nomes.getHead());

        System.out.println("-------------------------");

        // Remoção do último elemento novamente
        nomes.removerUltimoElemento();
        System.out.println("Após remover o último elemento novamente:");
        printLinkedList(nomes.getHead());

        System.out.println("-------------------------");

        // Adicionar dois novos elementos
        nomes.adicionarElemento("Carlos");
        nomes.adicionarElemento("Ana");
        System.out.println("Após adicionar Carlos e Ana:");
        printLinkedList(nomes.getHead());

        System.out.println("-------------------------");

        // Remover o primeiro elemento
        nomes.removerPrimeiroElemento();
        System.out.println("Após remover o primeiro elemento:");
        printLinkedList(nomes.getHead());
    }

    // Método para impressão da lista
    public static void printLinkedList(Node<String> atual) {
        while (atual != null) {
            System.out.println(atual.data);
            atual = atual.next;
        }
    }
}
