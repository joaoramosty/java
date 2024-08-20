public class exercicio2 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        escreveApenasValores(array);
    }

    public static void escreveApenasValores(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
    }
}
//utilizando um loop for-each
//O(n): Tempo linear