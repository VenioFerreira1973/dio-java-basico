package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {

        List<Gato> seusGatos = new ArrayList<>() {
            private String nome;
            private int idade;
            private String cor;

            {
                add(new Gato(nome = "Jon", idade = 10, cor = "preto"));
                add(new Gato(nome = "Simba", idade = 6, cor = "tigrado"));
                add(new Gato(nome = "Jon", idade = 12, cor = "amarelo"));
            }
        };

        System.out.println("Mostranda a lista na ordem de inserção: " + seusGatos);

        System.out.println("Mostrar a lista em ordem aleatoria");
        Collections.shuffle(seusGatos);
        System.out.println(seusGatos);

        System.out.println("Mostrar a lista na ordem natural: ");
        Collections.sort(seusGatos);
        System.out.println(seusGatos);

        System.out.println("Ordem de idade");
        // Collections.sort(seusGatos, new ComparatorIdade());
        seusGatos.sort(new ComparatorIdade());
        System.out.println(seusGatos);

        System.out.println("Ordem de cor");
        Collections.sort(seusGatos, new ComparatorCor());
        // seusGatos.sort(new ComparatorCor());
        System.out.println(seusGatos);

        System.out.println("Ordem de Nome, cor e Idade");
        Collections.sort(seusGatos, new ComparatorNomeCorIdade());
        // seusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(seusGatos);

    }

}

class Gato implements Comparable<Gato> {

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Integer return the idade
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{nome: '" + nome + '\'' + ", " +
                "idade: " + idade + ", " +
                "cor: '" + cor + '\'' + "}";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());

    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) {
            return nome;
        }

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) {
            return cor;
        }

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}
