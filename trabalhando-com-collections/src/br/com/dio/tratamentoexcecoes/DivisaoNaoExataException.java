package br.com.dio.tratamentoexcecoes;

public class DivisaoNaoExataException extends Exception {

    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String mensagem, int numerador, int denominador) {
        super(mensagem);
        this.numerador = numerador;
        this.denominador = denominador;

    }

}
