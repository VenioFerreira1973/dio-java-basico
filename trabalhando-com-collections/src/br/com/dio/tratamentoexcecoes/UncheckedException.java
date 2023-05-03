package br.com.dio.tratamentoexcecoes;

import javax.swing.JOptionPane;

public class UncheckedException {

    public static void main(String[] args) {

        boolean continueLoop = true;

        do {

            String a = JOptionPane.showInputDialog("Numerador:");
            String b = JOptionPane.showInputDialog("Denominador:");

            try {

                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                JOptionPane.showMessageDialog(null, "Resultado de divisão: "
                        + resultado);
                continueLoop = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! "
                        + e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível efetuar divisão por zero! "
                        + e.getMessage());
            } finally {
                JOptionPane.showMessageDialog(null, "Chegou no finally");
            }

        } while (continueLoop);
        JOptionPane.showMessageDialog(null, "Chegou ao fim do codigo.");
    }

    public static int dividir(Integer a, Integer b) {
        return a / b;
    }
}
