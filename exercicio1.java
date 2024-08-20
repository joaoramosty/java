public class exercicio1 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        escreveArray(array);
    }

    public static void escreveArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

//O(n): Tempo linear