import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {

            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.print("Numeros aleatorios: ");
        for (int i : numerosAleatorios) {
            System.out.print(" " + i);

        }
        System.out.println("");

        System.out.print("Antecessores: ");

        for (int i : numerosAleatorios) {
            System.out.print(" " + (i - 1));

        }
        System.out.println("");

        System.out.print("Sucessores: ");

        for (int i : numerosAleatorios) {
            System.out.print(" " + (i + 1));

        }
    }

}
