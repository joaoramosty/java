/******************************************************************************
        QUESTÃO 1 - PROVA JAVA - ESTRUTURA DE DADOS - AV1
        ENGENHARIA DE SOFTWARE
        DOCENTE : Prof Glaucya Boechat
        DISCENTE: João Victor Silva Ramos
        
    Escreva uma função recursiva em Java chamada  somatorioNum(n) 
    que receba um número inteiro n e retorne o somatório de 
    todos os números inteiros de 1 até n. 
    O somatório de n é a soma de todos os números de 1 até n, ou seja:    (1,5 pontos)

*******************************************************************************/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int resultadoDaSoma = somatorioDoNum(n);
        System.out.println("A soma dos números de 1 até " + n + " é " + resultadoDaSoma);
    }

    public static int somatorioDoNum(int n) {
        if (n == 1) {
            return 1; // caso base
        } else {
            return n + somatorioDoNum(n - 1); // fazendo a chamda da função recursiva
        }
    }
}