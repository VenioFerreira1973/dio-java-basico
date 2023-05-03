package br.com.dio.collection.streamApi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.Function;

import br.com.dio.collection.map.exercicios.Contato;

public class RefatoracaoOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória");
        Map<Integer, Contato> agenda = new HashMap<>() {
            private String nome;
            private Integer numero;

            {
                put(1, new Contato(nome = "Cami", numero = 5555));
                put(4, new Contato(nome = "Simba", numero = 1111));
                put(3, new Contato(nome = "Jon", numero = 2222));
            }
        };
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("Ordem de inserção");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {
            private String nome;
            private Integer numero;

            {
                put(1, new Contato(nome = "Cami", numero = 5555));
                put(4, new Contato(nome = "Simba", numero = 1111));
                put(3, new Contato(nome = "Jon", numero = 2222));
            }
        };
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("Ordem id");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());

        }

        System.out.println("Ordem numero de telefone");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorNumeroTelefone());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out
                    .println(
                            entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        // refatorando o codigo acima com uso de classe anônima
        System.out.println("Ordem numero de telefone usando classe anônima");
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {

            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }

        });

        set2.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out
                    .println(
                            entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        // refatorando o codigo acima com uso do método estático
        System.out.println("Ordem numero de telefone usando METODO ESTATICO");
        Set<Map.Entry<Integer, Contato>> set3 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {

                    @Override
                    public Integer apply(Entry<Integer, Contato> t) {
                        return t.getValue().getNumero();
                    }

                }));

        set3.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out
                    .println(
                            entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        // refatorando o codigo acima com uso de funções lambda
        System.out.println("Ordem numero de telefone usando FUNCAO LAMBDA");
        Set<Map.Entry<Integer, Contato>> set4 = new TreeSet<>(Comparator.comparing(
                t -> t.getValue().getNumero()));

        set4.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out
                    .println(
                            entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        System.out.println("Ordem nome contato");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorNomeContato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set1) {
            System.out
                    .println(
                            entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }

        // Refatoração para utilizar função lambda
        System.out.println("Ordem pelo nome do contato usando FUNCAO LAMBDA");
        Set<Map.Entry<Integer, Contato>> set5 = new TreeSet<>(Comparator.comparing(
                t -> t.getValue().getNome()));

        set5.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set5) {
            System.out
                    .println(
                            entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }

        // refatorando o codigo acima com uso do método estático
        System.out.println("Ordem pelo nome do contato usando METODO ESTATICO");
        Set<Map.Entry<Integer, Contato>> set6 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, String>() {

                    @Override
                    public String apply(Entry<Integer, Contato> t) {
                        return t.getValue().getNome();
                    }

                }));

        set6.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set6) {
            System.out
                    .println(
                            entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }

    }

}

class ComparatorNumeroTelefone implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Entry<Integer, Contato> l1, Entry<Integer, Contato> l2) {

        return l1.getValue().getNumero().compareTo(l2.getValue().getNumero());
    }

}

class ComparatorNomeContato implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> l1, Map.Entry<Integer, Contato> l2) {

        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}