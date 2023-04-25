import java.util.Random;

public class MatrizAleatoria {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] numeros = new int[4][4];

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros.length; j++) {
                numeros[i][j] = random.nextInt(9);
            }

        }

        System.out.println("Matriz aula: ");

        for (int[] linha : numeros) {
            for (int coluna : linha) {
                System.out.print(" " + coluna);
            }
            System.out.println();
        }

        System.out.println("Minha Matriz: ");
        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros.length; j++) {
                System.out.print(" " + numeros[i][j]);
            }
            System.out.println();

        }
    }
}
