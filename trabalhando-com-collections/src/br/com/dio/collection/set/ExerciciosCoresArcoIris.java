package br.com.dio.collection.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExerciciosCoresArcoIris {

    public static <T> void main(String[] args) {

        System.out.println("Exibir as cores do arco-iris uma em baixo da outra");
        Set<String> cores = new HashSet<>(Arrays.asList("vermelha", "laranja", "amarela",
                "verde", "azul", "anil", "violeta"));

        Iterator<String> iterator = cores.iterator();
        int contaCores = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            contaCores++;
        }
        System.out.println("O arco-iris tem " + contaCores + " cores.");

        System.out.println("Exibir as cores em ordem alfabetica");
        Set<String> cores1 = new TreeSet<>(cores);
        System.out.println(cores1);

        Set<String> cores2 = new TreeSet<String>(new ComparatorCor().reversed());
        cores2.addAll(cores);
        System.out.println("Cores invertidas:");
        System.out.println(cores2);

        System.out.println("Cores com a letra v");
        Iterator<String> iterator2 = cores.iterator();
        while (iterator2.hasNext()) {
            String next = iterator2.next();
            if (next.startsWith("v")) {
                System.out.println(next);

            }
        }

        System.out.println("Remover cores que não começam com a letra v");
        Set<String> cores3 = new HashSet<>();
        Iterator<String> iterator3 = cores.iterator();
        while (iterator3.hasNext()) {
            String next = iterator3.next();
            if (next.startsWith("v")) {
                cores3.add(next);
            }

        }
        System.out.println(cores3);

        System.out.println("Limpar o conjunto ");
        cores.clear();
        System.out.println(cores);

        System.out.println("Conferir se o conjunto está vazio" + cores.isEmpty());

    }
}

class ComparatorCor implements Comparator<String> {

    public int compare(String s1, String s2) {

        return s1.compareTo(s2);

    }

}