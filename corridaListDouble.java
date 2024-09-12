class Corredor {
    String nome;
    int pontuacao;
    Corredor frente;
    Corredor tras;

    public Corredor(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.frente = null;
        this.tras = null;
    }
}

class Corrida {
    private Corredor inicio;
    private Corredor fim;

    public Corrida() {
        this.inicio = null;
        this.fim = null;
    }

    // Adiciona um corredor na corrida
    public void adicionarCorredor(String nome, int pontuacao) {
        Corredor novoCorredor = new Corredor(nome, pontuacao);
        if (inicio == null) {
            inicio = fim = novoCorredor;
        } else {
            fim.frente = novoCorredor;
            novoCorredor.tras = fim;
            fim = novoCorredor;
        }
    }

    // Imprime a ordem dos corredores da corrida
    public void imprimirOrdem() {
        Corredor atual = inicio;
        System.out.println("Ordem dos corredores:");
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", Pontuação: " + atual.pontuacao);
            atual = atual.frente;
        }
    }

    // Retorna o início da lista de corredores para iteração
    public Corredor getInicio() {
        return inicio;
    }
}

import java.util.*;

public class Campeonato {

    // Função para calcular e imprimir o pódio final
    public static void calcularPodio(List<Corrida> corridas) {
        Map<String, Integer> pontuacoes = new HashMap<>();

        // Percorre todas as corridas e soma as pontuações dos corredores
        for (Corrida corrida : corridas) {
            Corredor atual = corrida.getInicio();
            while (atual != null) {
                pontuacoes.put(atual.nome, pontuacoes.getOrDefault(atual.nome, 0) + atual.pontuacao);
                atual = atual.frente;
            }
        }

        // Ordena os corredores pela pontuação
        List<Map.Entry<String, Integer>> ranking = new ArrayList<>(pontuacoes.entrySet());
        ranking.sort((a, b) -> b.getValue() - a.getValue());

        // Imprime o pódio (top 3)
        System.out.println("\nPódio Final do Campeonato:");
        for (int i = 0; i < Math.min(3, ranking.size()); i++) {
            System.out.println((i + 1) + "º Lugar: " + ranking.get(i).getKey() + " com " + ranking.get(i).getValue() + " pontos");
        }
    }

    public static void main(String[] args) {
        // Criando 3 corridas
        Corrida corrida1 = new Corrida();
        corrida1.adicionarCorredor("Corredor A", 10);
        corrida1.adicionarCorredor("Corredor B", 8);
        corrida1.adicionarCorredor("Corredor C", 6);

        Corrida corrida2 = new Corrida();
        corrida2.adicionarCorredor("Corredor A", 7);
        corrida2.adicionarCorredor("Corredor B", 10);
        corrida2.adicionarCorredor("Corredor D", 5);

        Corrida corrida3 = new Corrida();
        corrida3.adicionarCorredor("Corredor C", 10);
        corrida3.adicionarCorredor("Corredor D", 8);
        corrida3.adicionarCorredor("Corredor A", 6);

        // Imprimindo a ordem das corridas
        corrida1.imprimirOrdem();
        corrida2.imprimirOrdem();
        corrida3.imprimirOrdem();

        // Calculando e imprimindo o pódio final
        List<Corrida> corridas = Arrays.asList(corrida1, corrida2, corrida3);
        calcularPodio(corridas);
    }
}
