import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contaPar = 0;
        int contaImpar = 0;
        int numero;
        int qtd;

        System.out.println("Quantidade de números: ");
        qtd = scanner.nextInt();

        do {
            System.out.println("Digite um número:");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                contaPar++;
            } else {
                contaImpar++;

            }

            qtd--;

        } while (qtd > 0);

        System.out.println("Numeros impares: " + contaImpar);
        System.out.println("Numeros pares: " + contaPar);

        scanner.close();

        System.out.println("Terminou...");

    }

}
