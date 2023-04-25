import java.time.LocalDateTime;
import java.util.Scanner;

public class ExercicioSobreMetodos {

    public static void main(String[] args) {

        System.out.println(saudarUsuario());

        System.out.println("Somando 2 + 4 = " + somar(2, 4));
        System.out.println("Subtraindo 4 - 2 = " + subtrair(4, 2));
        System.out.println("Multiplicando 2 * 4 = " + multiplicar(2, 4));
        System.out.println("Dividindo 4 / 2 = " + dividir(4, 2));

        Scanner scanner = new Scanner(System.in);
        Double emprestimo;
        int quantidadeMeses;

        System.out.println("Quanto deseja tomar emprestado?");
        emprestimo = scanner.nextDouble();

        System.out.println("Em quantos meses deseja pagar?");
        quantidadeMeses = scanner.nextInt();

        System.out.println("Nosso banco cobra uma taxa de 3% ao mês");

        System.out.println("Você pagará ao final dos " + quantidadeMeses + " meses "
                + calculoEmprestimo(emprestimo, quantidadeMeses) + " reais.");

        scanner.close();

    }

    private static Double calculoEmprestimo(Double emprestimo, int quantidadeMeses) {

        Double resultado = 0D;

        for (int i = 1; i <= quantidadeMeses; i++) {
            resultado = emprestimo * Math.pow((1 + 0.03), i);

            System.out.println(resultado);
        }

        return resultado;
    }

    private static String saudarUsuario() {

        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() < 12) {
            return "Bom dia";
        } else if (agora.getHour() > 12 && agora.getHour() < 18) {
            return "Boa tarde";

        } else {
            return "Boa noite";
        }
    }

    public static int dividir(int i, int j) {
        return i / j;
    }

    public static int multiplicar(int i, int j) {
        return i * j;
    }

    public static int subtrair(int i, int j) {
        return i - j;
    }

    public static int somar(int i, int j) {
        return i + j;
    }
}
