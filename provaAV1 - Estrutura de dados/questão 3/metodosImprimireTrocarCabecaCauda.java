public void imprimir() {
    Node<T> current = head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}

public void trocarCabecaCauda() {
    if (head == null || head.next == null) {
        return;
    }

    Node<T> current = head;
    Node<T> previous = null;
    while (current.next != null) {
        previous = current;
        current = current.next;
    }

    tail = head;
    head = current;
    tail.next = null;
    current.prev = null;
    current.next = head;
    head.prev = current;
    head = current;
}