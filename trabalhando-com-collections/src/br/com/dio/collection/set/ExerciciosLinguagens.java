package br.com.dio.collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExerciciosLinguagens {

    public static void main(String[] args) {

        Set<Linguagem> linguagens = new HashSet<>() {
            private String nome;
            private int anoCriacao;
            private String ide;
            {
                add(new Linguagem(nome = "java", anoCriacao = 1970, ide = "eclipse"));
                add(new Linguagem(nome = "python", anoCriacao = 1980, ide = "pycharm"));
                add(new Linguagem(nome = "javascript", anoCriacao = 1990, ide = "vscode"));
            }
        };

        System.out.println("Ordem de inserção");
        Set<Linguagem> linguagens1 = new LinkedHashSet<>() {
            private String nome;
            private int anoCriacao;
            private String ide;
            {
                add(new Linguagem(nome = "java", anoCriacao = 1970, ide = "eclipse"));
                add(new Linguagem(nome = "python", anoCriacao = 1980, ide = "pycharm"));
                add(new Linguagem(nome = "javascript", anoCriacao = 1990, ide = "vscode"));
            }
        };

        for (Linguagem linguagem : linguagens1) {
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoCriacao() + " - " + linguagem.getIde());
        }

        System.out.println("Ordem natural por ano de criação");
        Set<Linguagem> linguagens2 = new TreeSet<>(linguagens1);

        for (Linguagem linguagem : linguagens2) {
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoCriacao() + " - " + linguagem.getIde());
        }

        System.out.println("Ordem IDE");
        Set<Linguagem> linguagens3 = new TreeSet<>(new ComparatorIde());
        linguagens3.addAll(linguagens);
        for (Linguagem linguagem : linguagens3) {
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoCriacao() + " - " + linguagem.getIde());
        }

        System.out.println("Ordem Ano de criação e Nome");
        Set<Linguagem> linguagens4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagens4.addAll(linguagens);
        for (Linguagem linguagem : linguagens) {
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoCriacao() + " - " + linguagem.getIde());
        }

        System.out.println("Ordem Nome, Ano de criação e Ide");
        Set<Linguagem> linguagens5 = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        linguagens5.addAll(linguagens);
        for (Linguagem linguagem : linguagens) {
            System.out.println(linguagem.getNome() + " - "
                    + linguagem.getAnoCriacao() + " - " + linguagem.getIde());
        }

        System.out.println("Linguagens uma embaixo da outra:");
        Iterator<Linguagem> iterator = linguagens.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getNome());
        }

    }

}

class Linguagem implements Comparable<Linguagem> {
    private String nome;
    private Integer anoCriacao;
    private String ide;

    public Linguagem(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;

    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {

        return "{nome: '" + nome + '\'' + ", " +
                "anoCriacao: " + anoCriacao + ", " +
                "ide:  '" + ide + '\'' + ", " + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Linguagem linguagem = (Linguagem) o;
        return nome.equals(linguagem.nome)
                && ide.equals(linguagem.ide);
    }

    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }

    @Override
    public int compareTo(Linguagem linguagem) {
        int anoCriacao = Integer.compare(this.getAnoCriacao(), linguagem.getAnoCriacao());
        if (anoCriacao != 0)
            return anoCriacao;

        return this.getIde().compareTo(linguagem.getIde());
    }
}

class ComparatorIde implements Comparator<Linguagem> {

    public int compare(Linguagem l1, Linguagem l2) {

        return l1.getIde().compareTo(l2.getIde());

    }

}

class ComparatorAnoCriacaoNome implements Comparator<Linguagem> {

    @Override
    public int compare(Linguagem l1, Linguagem l2) {

        int anoCriacao = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        if (anoCriacao != 0) {
            return anoCriacao;
        }

        return l1.getNome().compareTo(l2.getNome());

    }

}

class ComparatorNomeAnoCriacaoIde implements Comparator<Linguagem> {

    @Override
    public int compare(Linguagem l1, Linguagem l2) {

        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) {
            return nome;
        }

        int ide = l1.getIde().compareTo(l2.getIde());
        if (ide != 0) {
            return ide;
        }

        return Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());

    }

}
