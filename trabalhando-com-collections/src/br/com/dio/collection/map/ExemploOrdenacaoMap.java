package br.com.dio.collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");

        Map<String, Livro> meusLivros = new HashMap<>() {
            private String nome;
            private int paginas;

            {
                put(" Hawking, Stephen", new Livro(nome = "Uma breve história do tempo", paginas = 256));
                put(" Duhigg, Charles", new Livro(nome = "O poder do hábito", paginas = 408));
                put(" Harari, Yuval Noah", new Livro(nome = "21 lições para o seculo 21", paginas = 432));
                put(" Julio, Verne", new Livro(nome = "Vinte mil leguas submarinas", paginas = 150));

            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem de inserção: ");

        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
            private String nome;
            private int paginas;

            {
                put(" Hawking, Stephen", new Livro(nome = "Uma breve história do tempo", paginas = 256));
                put(" Duhigg, Charles", new Livro(nome = "O poder do hábito", paginas = 408));
                put(" Harari, Yuval Noah", new Livro(nome = "21 lições para o seculo 21", paginas = 432));

            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem alfabética autores: ");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem alfabética nomes dos livros");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(livro.getValue().getNome());
        }

        System.out.println("Ordem crescente numero de páginas");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNumeroPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4) {
            System.out.println(livro.getValue().getPaginas() + " - " + livro.getValue().getNome());
        }

    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
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
     * @return Integer return the paginas
     */
    public Integer getPaginas() {
        return paginas;
    }

    /**
     * @param paginas the paginas to set
     */
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {

        return "{nome: '" + nome + '\'' + ", " +
                "paginas:  " + paginas + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {

        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}

class ComparatorNumeroPagina implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {

        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }

}