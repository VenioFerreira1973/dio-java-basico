package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciciosTemperaturas {

    private static int numero;
    private static String nome;
    private static Object temperatura;

    public static void main(String[] args) {

        List<Mes> temperaturas = new ArrayList<>() {
            private int numero;
            private String nome;
            private Double temperatura;

            {
                add(new Mes(numero = 1, nome = "Janeiro", temperatura = 20.5));
                add(new Mes(numero = 2, nome = "Fevereiro", temperatura = 21.5));
                add(new Mes(numero = 3, nome = "Março", temperatura = 18.5));
                add(new Mes(numero = 4, nome = "Abril", temperatura = 17.5));
                add(new Mes(numero = 5, nome = "Maio", temperatura = 16.5));
                add(new Mes(numero = 6, nome = "Junho", temperatura = 15.5));
            }
        };

        Iterator<Mes> iterator = temperaturas.iterator();
        Double soma = 0D;

        while (iterator.hasNext()) {
            soma += iterator.next().temperatura;
        }

        Double media = soma / temperaturas.size();

        System.out.println("Media semestral: " + media);

        System.out.println("Mês com temperatura acima da média: ");
        Iterator<Mes> iterator2 = temperaturas.iterator();

        while (iterator2.hasNext()) {

            Mes proximo = iterator2.next();

            if (proximo.getTemperatura() > media) {
                System.out.println(proximo.getNumero() + " - "
                        + proximo.getNome() + " - "
                        + proximo.getTemperatura());
            }

        }

    }

}

class Mes implements Comparable<Mes> {
    int numero;
    String nome;
    Double temperatura;

    public Mes(int numero, String nome, Double temperatura) {
        this.numero = numero;
        this.nome = nome;
        this.temperatura = temperatura;
    }

    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
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
     * @return Double return the temperatura
     */
    public Double getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "{numero: " + numero + ", " +
                "nome: '" + nome + '\'' + ", " +
                "temperatura:  " + temperatura + ", " + "}";
    }

    @Override
    public int compareTo(Mes mes) {
        return this.getNome().compareTo(mes.getNome());
    }

}
