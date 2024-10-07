import java.util.List;
import java.util.Arrays;
import java.util.ArrysList;
package br.com.everdev.linkedlist;

    public void imprimirLista() {
        if (head == null) {
            System.out.println("Lista vazia!");
            return;
        }
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void dobrarValores() {
        if (head == null) {
            return;
        }
        Node<T> current = head;
        while (current != null) {
            if (current.data instanceof Integer) {
                current.data = (T) ((Integer) current.data * 2);
            }
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedListDesafio<Integer> lista = new LinkedListDesafio<>();

        lista.adicionarElemento(1);
        lista.adicionarElemento(2);
        lista.adicionarElemento(3);
        lista.adicionarElemento(4);
        lista.adicionarElemento(5);

        System.out.println("Lista original:");
        lista.imprimirLista();

        lista.dobrarValores();

        System.out.println("Lista após dobrar valores:");
        lista.imprimirLista();
    }
}