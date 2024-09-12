package br.com.everdev.listaduplamenteencadeada;

public class DoubledLinkedListTest {
    public static void main(String[] args) {
        DoubledLinkedListBase<String> nomes = new DoubledLinkedListBase<>();
        nomes.inserirElementoNoInicio("Everton");
        nomes.inserirElemento("Joao");
        printLinkedList(nomes.getHead());

        // Faça a remoção do ultimo elemento da lista e imprima
        public void removerUltimoElemento() {
        if (tail != null) {
            Node<T> prev = tail.prev;
            if (prev != null) {
                prev.next = null;
            } else {
                head = null;
            }
            tail = prev;
            size--;
        }
    }
    removerUltimoElemento()
    // Faça novamente a remoção do ultimo elemento da lista e imprima
    removerUltimoElemento()

        // Adicione dois elementos na lista e imprima
        
        public void inserirElemento(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    inserirElemento(T data)
    inserirElemento(T data)

        // Crie um método para remoção do primeiro elemento da lista e imprima
        public void removerPrimeiroElemento() {
        if (head != null) {
            Node<T> next = head.next;
            if (next != null) {
                next.prev = null;
            } else {
                tail = null;
            }
            head = next;
            size--;
        }
    }
}

removerPrimeiroElemento()
    }

    // Crie um método para impressao da lista
    public static void printLinkedList(Node<String> atual) {
        while (atual != null) {
            System.out.println(atual.data);
            atual = atual.next;
        }
    }
}
