import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int numero;
        int maior = 0;
        int media = 0;

        while (i < 5) {

            System.out.println("Digite um numero: ");

            numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            media += numero;

            i++;

        }
        media = media / i;

        System.out.println("Maior numero: " + maior);
        System.out.println("Média: " + media);
        scanner.close();

    }
}
