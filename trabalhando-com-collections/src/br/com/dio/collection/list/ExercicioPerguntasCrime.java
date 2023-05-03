package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioPerguntasCrime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda as perguntas: ");

        List<Interrogatorio> interrog = new ArrayList<>() {
            private String pergunta;
            private String resposta;

            {
                add(new Interrogatorio(pergunta = "Telefonou para a vítima?", resposta = null));
                add(new Interrogatorio(pergunta = "Esteve no local do crime?", resposta = null));
                add(new Interrogatorio(pergunta = "Mora perto da vítima?", resposta = null));
                add(new Interrogatorio(pergunta = "Devia para a vítima?", resposta = null));
                add(new Interrogatorio(pergunta = "Já trabalhou com a vítima?", resposta = null));

            }
        };

        Iterator<Interrogatorio> iterator = interrog.iterator();

        while (iterator.hasNext()) {
            Interrogatorio i = iterator.next();

            System.out.println(i.getPergunta());
            i.setResposta(scanner.next());
        }

        scanner.close();

        Iterator<Interrogatorio> iterator2 = interrog.iterator();
        int contaRespostas = 0;

        while (iterator2.hasNext()) {

            Interrogatorio proximo = iterator2.next();

            if (proximo.getResposta() == "Sim") {

                contaRespostas++;
            }

        }
        if (contaRespostas == 2) {
            System.out.println("A pessoa é suspeita");
        } else if (contaRespostas < 2 && contaRespostas < 5) {
            System.out.println("A pessoa é cumplice");
        } else if (contaRespostas == 5) {
            System.out.println("A pessoa é a assassina");
        } else {
            System.out.println("A pessoa é inocente");
        }

    }
}

class Interrogatorio {

    String pergunta;
    String resposta;

    public Interrogatorio(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;

    }

    @Override
    public String toString() {
        return "{pergutna: " + pergunta + ", " +
                "resposta: '" + resposta + ", }";
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getPergunta() {
        return this.pergunta;
    }

    public String getResposta() {
        return this.resposta;
    }

}
