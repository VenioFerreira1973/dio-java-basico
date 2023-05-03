package br.com.dio.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExercicioPopulacao {

    public static void main(String[] args) {

        System.out.println("Crie um dicionario que relacione os estados e suas respectivas populações");
        Map<String, Integer> estadosPopulacao = new HashMap<>() {
            {

                put("pe", 9616621);
                put("al", 5351543);
                put("ce", 9187103);
                put("rn", 3534265);

            }
        };

        System.out.println(estadosPopulacao.toString());

        System.out.println("Substitua a população do RN por 3534165");
        estadosPopulacao.put("rn", 3534165);
        System.out.println(estadosPopulacao.toString());

        System.out.println("Confira se o estado pb está no dicionário, caso contrario adicione-o: ");
        if (!estadosPopulacao.containsKey("pb")) {
            estadosPopulacao.put("pb", 4039277);
        }
        System.out.println(estadosPopulacao);

        System.out.println("Exibir os estados na ordem que foram informados: ");

        Map<String, Integer> estadosPopulacao1 = new LinkedHashMap<>() {
            {

                put("pe", 9616621);
                put("al", 5351543);
                put("ce", 9187103);
                put("rn", 3534265);

            }
        };

        System.out.println(estadosPopulacao1.toString());

        System.out.println("Exiba a população do estado pe: " + estadosPopulacao.get("pe"));

        System.out.println("Exiba o dicionario ordenado pelo ordem alfabética pelo nome: ");

        Map<String, Integer> estadosPopulacao2 = new TreeMap<>() {
            {

                put("pe", 9616621);
                put("al", 5351543);
                put("ce", 9187103);
                put("rn", 3534265);
            }
        };
        System.out.println(estadosPopulacao2.toString());

        System.out.println("Exiba o estado com a menor população: ");
        Integer populacao = Collections.min(estadosPopulacao.values());

        Set<Map.Entry<String, Integer>> entries1 = estadosPopulacao.entrySet();
        String estado = "";
        for (Map.Entry<String, Integer> entry : entries1) {
            if (entry.getValue().equals(populacao)) {
                estado = entry.getKey();
            }
        }
        System.out.println("O estado com a menor população é: " + estado + " consumo " + populacao);

        System.out.println("Exiba o estado com a maior população: ");
        Integer populacao1 = Collections.max(estadosPopulacao.values());

        Set<Map.Entry<String, Integer>> entries2 = estadosPopulacao.entrySet();
        String estado1 = "";
        for (Map.Entry<String, Integer> entry : entries2) {
            if (entry.getValue().equals(populacao1)) {
                estado1 = entry.getKey();
            }
        }
        System.out.println("O estado com a maior população é: " + estado1 + " consumo " + populacao1);

        System.out.println("Exiba a soma das populações dos estados: ");

        Iterator<Integer> iterator = estadosPopulacao.values().iterator();
        Double soma = 0D;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("Soma das pupulações é: " + soma);

        System.out.println("Exibir a média das populações: " + soma / estadosPopulacao.size());

        System.out.println("Remover estados com populações menor que 4 milhões");

        Iterator<Integer> iterator2 = estadosPopulacao.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next() < 4000000) {
                iterator2.remove();
            }
        }
        System.out.println(estadosPopulacao);

        System.out.println("Apagar o dicionario de estados: ");
        estadosPopulacao.clear();
        estadosPopulacao1.clear();
        estadosPopulacao2.clear();

        System.out.println(estadosPopulacao.toString());
        System.out.println(estadosPopulacao1.toString());
        System.out.println(estadosPopulacao2.toString());

        System.out.println("Verificar se o dicionario está vazio: ");

        System.out.println(estadosPopulacao.isEmpty());
        System.out.println(estadosPopulacao1.isEmpty());
        System.out.println(estadosPopulacao2.isEmpty());
    }

}
