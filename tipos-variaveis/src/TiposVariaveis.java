public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        double salarioMinimo = 1420.22;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        // declaração de constantes exigem a palavra reservada final
        final double VALOR_DE_PI = 3.1416;

        System.out.println(VALOR_DE_PI);
    }
}
