public class exercicio4 {
    public static void main(String[] args) {
        double[] notasAlunos = {7.5, 8.0, 9.2, 6.7, 10.0, 8.5, 7.8};
        double media = mediaTurma(notasAlunos);
        System.out.println("A média total da sala é: " + media);
    }

    public static double mediaTurma(double[] notasAlunos) {
        double soma = 0.0;
        for (double nota : notasAlunos) {
            soma += nota;
        }
        return soma / notasAlunos.length;
    }
}
// Não consegui aproximar as casas decimal
// O(n log n): Tempo linear-logarítmico