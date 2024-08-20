public class exercicio3 {
    public static void main(String[] args) {
        int[] num1a10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        escreveNumPar(num1a10);
    }

    public static void escreveNumPar(int[] num1a10) {
        for (int num : num1a10) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}

//O(1): Tempo constante
