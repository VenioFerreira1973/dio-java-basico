public class OrdemInversa {
    public static void main(String[] args) {
        int vetor[] = { -3, 6, 7, -8, 9, 5 };

        System.out.print("{ ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i]);

            if (i > 0) {

                System.out.print(", ");
            }

        }

        System.out.print("}");
    }
}
