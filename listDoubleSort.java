public class LinkedListTestDesafio {
    public static void main(String[] args) {
        LinkedListDesafio<String> nomes = new LinkedListDesafio<>();
        nomes.adicionarNodeInicial("Everton");
        nomes.adicionarElemento("Joao");
        nomes.adicionarElemento("Maria");
        nomes.adicionarElemento("Pedro");
        nomes.adicionarElemento("Suzana");

        printLinkedList(nomes.getHead());

        System.out.println("-------------------------");

        // Ordenar a lista
        nomes.ordenarLista();
        printLinkedList(nomes.getHead());

        System.out.println("-------------------------");

        // Remover o último elemento da lista e imprimir
        nomes.removerUltimoElemento();
        printLinkedList(nomes.getHead());

        // Remover novamente o último elemento da lista e imprimir
        nomes.removerUltimoElemento();
        printLinkedList(nomes.getHead());

        // Adicionar dois elementos na lista e imprimir
        nomes.adicionarElemento("Ana");
        nomes.adicionarElemento("Carlos");
        printLinkedList(nomes.getHead());

        // Criar um método para remoção do primeiro elemento da lista e imprimir
        nomes.removerPrimeiroElemento();
        printLinkedList(nomes.getHead());
    }

    public static void printLinkedList(Node<String> atual) {
        while (atual != null) {
            System.out.println(atual.data);
            atual = atual.next;
        }
    }
}