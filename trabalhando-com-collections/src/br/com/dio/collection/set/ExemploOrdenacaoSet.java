package br.com.dio.collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória");
        Set<Serie> minhasSeries = new HashSet<>() {
            private String nome;
            private String genero;
            private int tempoEpisodio;

            {

                add(new Serie(nome = "got", genero = "fantasia", tempoEpisodio = 60));
                add(new Serie(nome = "dark", genero = "drama", tempoEpisodio = 20));
                add(new Serie(nome = "pink blinders", genero = "gangster", tempoEpisodio = 30));
            }
        };

        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem de inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
            private String nome;
            private String genero;
            private int tempoEpisodio;

            {

                add(new Serie(nome = "got", genero = "comedia", tempoEpisodio = 60));
                add(new Serie(nome = "dark", genero = "drama", tempoEpisodio = 20));
                add(new Serie(nome = "pink blinders", genero = "gangster", tempoEpisodio = 30));
            }
        };

        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem natural por tempo de episodio");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);

        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem Nome/Genero/TempoEpisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem Genero");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4) {
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem Tempos Episodio");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie : minhasSeries5) {
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }

}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {

        return "{nome: '" + nome + '\'' + ", " +
                "genero: '" + genero + '\'' + ", " +
                "tempoEpisodio:  " + tempoEpisodio + ", " + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome)
                && genero.equals(serie.genero)
                && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0)
            return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {

        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) {
            return nome;
        }

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) {
            return genero;
        }
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }

}

class ComparatorGenero implements Comparator<Serie> {

    public int compare(Serie s1, Serie s2) {

        return s1.getGenero().compareTo(s2.getGenero());

    }

}

class ComparatorTempoEpisodio implements Comparator<Serie> {

    public int compare(Serie s1, Serie s2) {

        int tempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        if (tempoEpisodio != 0)
            return tempoEpisodio;

        return s1.getGenero().compareTo(s2.getGenero());

    }

}