package one.digitalinovattion.oo.interfaces;

public class Calculadora implements OperacaoMatematica {

    @Override
    public void somar(int a, int b) {
        System.out.println("Soma: " + (a + b));

    }

    @Override
    public void subtrair(int a, int b) {
        System.out.println("Subtração: " + (a - b));

    }

    @Override
    public void multiplicar(int a, int b) {
        System.out.println("Multiplicação: " + (a * b));

    }

    @Override
    public void dividir(int a, int b) {
        System.out.println("Divisão: " + (a / b));

    }

}
