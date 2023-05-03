package br.com.dio.tratamentoexcecoes;

import javax.swing.JOptionPane;

public class ExceptionCustomizada2 {

    public static void main(String[] args) {
        int[] numerador = { 4, 5, 8, 10 };
        int[] denominador = { 2, 4, 0, 2, 8 };

        for (int i = 0; i < denominador.length; i++) {

            try {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExataException("Divisão não exata não é permitida",
                            numerador[i], denominador[i]);
                }
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);

            } catch (DivisaoNaoExataException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Tentativa de divisão por zero não é permitida ." + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null,
                        "O array de numeradores é menor, portanto não é possível fazer todas as operações"
                                + e.getMessage());
            }

        }
        System.out.println("O programa continua...");
    }
}
