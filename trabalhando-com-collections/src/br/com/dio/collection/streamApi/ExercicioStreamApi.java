package br.com.dio.collection.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStreamApi {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos da lista");
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("Coloque os 5 primeiros número dentre de um Set");
        numerosAleatorios.stream()
                .limit(6)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme a lista de Strings em uma lista de inteiros");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(collectList);

        System.out.println("Pegue os numeros pares maiores que 2 e coloque em uma lista");
        List<Integer> numerosPares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(p -> p % 2 == 0 && p > 2)
                .collect(Collectors.toList());

        System.out.println(numerosPares);

        System.out.println("Mostre a média dos números");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                // .reduce(0, (a, b) -> a + b) --faria a soma dos elementos
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares");
        List<Integer> numeros = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numeros.removeIf(i -> i % 2 != 0);
        System.out.println(numeros);

    }

}
