import java.util.ArrayList;
import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double soma = 0.0;

        System.out.println("Digite a quantidade de alunos na turma:");
        int quantidadeAlunos = scanner.nextInt();

        // Receber as notas dos alunos
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            double nota = scanner.nextDouble();
            notas.add(nota);
            soma += nota; // Soma as notas
        }

        // Calcula a média da turma
        double media = soma / notas.size();
        System.out.printf("A média da turma é: %.2f\n", media);

        scanner.close();
    }
}
