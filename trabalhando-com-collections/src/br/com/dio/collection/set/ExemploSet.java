package br.com.dio.collection.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

    public static void main(String[] args) {

        System.out.println("Criando um conjunto e adicionando as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7D, 8.5, 9.3, 5D, 7D, 0D, 3.6));
        System.out.println(notas);

        // Não é possível obter a posição de uma nota usando Set
        // Não é possível adicionar elementos por posição usando Set
        // Não é possível substituir um elemento por outro

        System.out.println("Conferir se determinada nota está no conjunto");
        System.out.println("A nota 5.0 está no conjunto: " + notas.contains(5.0));

        System.out.println("Exibir a menor nota " + Collections.min(notas));
        System.out.println("Exibir a maior nota " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0D;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("Exibir a soma dos valores:  " + soma);

        System.out.println("Exibir a média das notas: " + soma / notas.size());

        System.out.println("Remover a nota 0.0");
        notas.remove(0D);
        System.out.println(notas);

        System.out.println("Remover as notas menores que 7.0");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7D) {
                iterator1.remove();
            }
        }

        System.out.println(notas);

        // Não é possível listar as notas na ordem informada usando set por isso vamos
        // usar LinkedHashSet
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7D);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5D);
        notas2.add(7D);
        notas2.add(0D);
        notas2.add(3.6);

        System.out.println("Exibir as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apagar todo conjunto");
        notas.clear();

        System.out.println("Conferir se o conjunto está vazio");
        System.out.println("Conjunto vazio? " + notas.isEmpty());

    }

}
