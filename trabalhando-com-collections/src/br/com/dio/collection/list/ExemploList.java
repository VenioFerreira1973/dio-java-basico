package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adiciona as 7 notas: ");
        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        // Exercicios extras
        List<Double> notas2 = new LinkedList<>();

        notas2.addAll(notas);

        System.out.println(notas.toString());

        System.out.println("Exibir a posição da nota 5.0");
        System.out.println("Posição: " + notas.indexOf(5.0));

        System.out.println("Adicionar na lista nota 8.0 na posição 4");
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista");
        System.out.println("Contem a nota 5.0? " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informadas");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota informada");
        System.out.println("A terceira nota informada foi: " + notas.get(2));

        System.out.println("Exiba a menor nota");
        System.out.println("A menor nota é: " + Collections.min(notas));

        System.out.println("Exiba a maior nota");
        System.out.println("A maior nota é: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores");

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0D;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma das notas: " + soma);

        System.out.println("Exiba a média das notas: " + soma / notas.size());

        System.out.println("Remova a nota 0.0");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next() < 7) {
                iterator2.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();

        System.out.println(notas);

        System.out.println("Confira se a lista está vazia");
        System.out.println("Lista vazia? " + notas.isEmpty());

        // Continuação exercicios
        System.out.println("Notas2: " + notas2);

        System.out.println("Mostre a primeira nota da nova lista sem remove-lo: " + notas2.get(0));

        System.out.println(
                "Mostre a primeira nota da nova lista removendo-o: "
                        + notas2.remove(notas2.get(0)));
        System.out.println(notas2);

    }
}
