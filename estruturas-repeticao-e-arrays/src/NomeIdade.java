import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "1";

        while (true) {
            System.out.println("Nome:");
            nome = scanner.next();

            if (nome.equals("0"))
                break;

            System.out.println("Idade:");
            scanner.nextInt();

        }

        scanner.close();

        System.out.println("Terminou...");

    }
}
