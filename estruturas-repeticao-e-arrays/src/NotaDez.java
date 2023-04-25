import java.util.Scanner;

public class NotaDez {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;

        while (true) {

            System.out.println("Digite uma nota entre 0 e 10");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido, tente novamente");
            } else {
                System.out.println("Finalmente acertou");
                break;
            }
        }

        scanner.close();

    }
}
