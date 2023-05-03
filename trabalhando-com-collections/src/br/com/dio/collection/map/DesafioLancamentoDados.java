package br.com.dio.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

public class DesafioLancamentoDados {

    public static void main(String[] args) {

        Random gerador = new Random();
        Map<Integer, Integer> lancamentosDado = new HashMap<>();

        // imprime sequência de 10 números inteiros aleatórios
        for (int i = 1; i <= 100; i++) {
            lancamentosDado.put(i, gerador.nextInt(6) + 1);

        }
        // System.out.println(lancamentosDado.toString());

        Set<Entry<Integer, Integer>> entries = lancamentosDado.entrySet();
        int conta1 = 0;
        int conta2 = 0;
        int conta3 = 0;
        int conta4 = 0;
        int conta5 = 0;
        int conta6 = 0;

        for (Entry<Integer, Integer> entry : entries) {

            if (entry.getValue() == 1) {
                conta1++;
            } else if (entry.getValue() == 2) {
                conta2++;
            } else if (entry.getValue() == 3) {
                conta3++;
            } else if (entry.getValue() == 4) {
                conta4++;
            } else if (entry.getValue() == 5) {
                conta5++;
            } else if (entry.getValue() == 6) {
                conta6++;
            }
        }
        System.out.println(conta1 + " lançamentos com a face 1");
        System.out.println(conta2 + " lançamentos com a face 2");
        System.out.println(conta3 + " lançamentos com a face 3");
        System.out.println(conta4 + " lançamentos com a face 4");
        System.out.println(conta5 + " lançamentos com a face 5");
        System.out.println(conta6 + " lançamentos com a face 6");

    }

}
