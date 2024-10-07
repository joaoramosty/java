public static void main(String[] args) {
    DoubledLinkedListBase<Integer> lista = new DoubledLinkedListBase<>();

    lista.inserirElementoNoInicio(1);
    lista.inserirElementoNoInicio(2);
    lista.inserirElementoNoInicio(3);
    lista.inserirElementoNoInicio(4);
    lista.inserirElementoNoInicio(5);

    System.out.println("Lista original:");
    lista.imprimir();

    lista.trocarCabecaCauda();

    System.out.println("Lista após trocar cabeça e cauda:");
    lista.imprimir();
}