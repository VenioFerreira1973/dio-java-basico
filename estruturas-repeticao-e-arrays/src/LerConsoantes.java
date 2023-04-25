import java.util.Scanner;

public class LerConsoantes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String consoantes[] = new String[6];

        int contaConsoante = 0;
        int contaVogal = 0;
        int contador = 0;

        do {

            System.out.println("Letra: ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                contaConsoante++;
            }
            contador++;

        } while (contador < consoantes.length);

        contaConsoante = 0;

        System.out.print("{ ");
        for (int i = 0; i < consoantes.length; i++) {

            if (consoantes[i] != "a"
                    && consoantes[i] != "e"
                    && consoantes[i] != "i"
                    && consoantes[i] != "o"
                    && consoantes[i] != "u" && consoantes[i] != null) {
                System.out.print(consoantes[i]);
                contaConsoante++;
            } else {
                contaVogal++;
            }

            if (contaConsoante + contaVogal < consoantes.length - 1
                    && contaConsoante > 0) {

                System.out.print(", ");
            }

        }

        System.out.println("}");
        System.out.println("O vetor possui " + contaConsoante + " consoantes.");
        scanner.close();
    }
}
