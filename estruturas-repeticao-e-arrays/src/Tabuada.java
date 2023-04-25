import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 1;
        int tabuada;

        System.out.println("Qual tabuada deseja gerar?");
        tabuada = scanner.nextInt();

        int tabuadaFixa = tabuada;

        System.out.println("Tabuada de " + tabuada + ":");
        while (tabuada > 0) {

            System.out.println(tabuadaFixa + " x " + numero + " = " + (tabuadaFixa * numero));

            tabuada--;
            numero++;
        }

        System.out.println("The end.");
        scanner.close();

    }

}
