package br.com.dio.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExercicioMap {

    public static void main(String[] args) {

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>() {
            {

                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);

            }
        };

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15.2");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        // Não é possivel exibir a ordem em que um valor foi adicionado

        System.out.println("Exiba os modelos: " + carrosPopulares.keySet());

        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("Exiba os consumos: " + consumos);

        System.out.println("Exiba o modelo mais economico e o seu consumo: ");
        Double consumo = Collections.max(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modelo = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumo)) {
                modelo = entry.getKey();
            }
        }
        System.out.println("Modelo mais eficiente: " + modelo + " consumo " + consumo);

        System.out.println("Exiba o modelo menos economico e o seu consumo: ");
        Double consumo1 = Collections.min(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modelo1 = "";
        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(consumo1)) {
                modelo1 = entry.getKey();
            }
        }
        System.out.println("Modelo menos eficiente: " + modelo1 + " consumo " + consumo1);

        System.out.println("Exiba a soma dos consumos: ");

        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        Double soma = 0D;

        for (Map.Entry<String, Double> entry : entries2) {
            soma += entry.getValue();

        }
        System.out.println("Soma dos consumos: " + soma);

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma2 = 0D;
        while (iterator.hasNext()) {
            soma2 += iterator.next();
        }
        System.out.println("Soma dos consumos: " + soma2);

        System.out.println("Exibir a média dos consumos: " + soma / carrosPopulares.size());

        System.out.println("Remova os modelos com consumo igual a 15,6 ");
        System.out.println(carrosPopulares);

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) {
                iterator1.remove();
                ;
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("Exibir os carros na ordem que foram informados: ");

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {
            {

                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);

            }
        };

        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");

        Map<String, Double> carrosPopulares2 = new TreeMap<>() {
            {

                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apagar o dicionario de carros: ");
        carrosPopulares.clear();
        carrosPopulares1.clear();
        carrosPopulares2.clear();

        System.out.println(carrosPopulares.toString());
        System.out.println(carrosPopulares1.toString());
        System.out.println(carrosPopulares2.toString());

        System.out.println("Verificar se o dicionario está vazio: ");

        System.out.println(carrosPopulares.isEmpty());
        System.out.println(carrosPopulares1.isEmpty());
        System.out.println(carrosPopulares2.isEmpty());

    }

}
