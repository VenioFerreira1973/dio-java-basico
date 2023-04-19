public class Operadores {

    public static void main(String[] args) {

        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numero = 5;

        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);
        System.out.println(numero++);// imprime o valor original

        numero--;
        System.out.println(numero);
        System.out.println(--numero);// imprime o valor subtraido de um

        boolean variavel = true;
        System.out.println(variavel);// imprime true

        variavel = !variavel;
        System.out.println(variavel);// imprime false

        // Operador ternario
        int a, b;
        a = 5;
        b = 6;
        String resultado = a == b ? "verdade" : "mentira";

        System.out.println(resultado);

        // Operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2 - " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente do numero2 - " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior que o numero2 - " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numero1 é menor que o numero2 - " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numero1 é maior ou igual a numero2 - " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numero1 é menor ou igual a numero2 - " + simNao);

        String nome1 = "venio";
        String nome2 = "venio";
        String nome3 = new String("venio");

        simNao = nome1 == nome2;

        System.out.println("Os nomes são iguais: " + simNao);

        simNao = nome1 == nome3;

        System.out.println("Os nomes são iguais: " + simNao);// retorna false pois neste caso estão sendo comparadas
                                                             // duas posições de memória diferentes
        simNao = nome1.equals(nome3);
        System.out.println("Os nomes são iguais: " + simNao);// neste caso retorna true pois estão sendo comparados dois
                                                             // conteudos

        // Operadores logicos
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");

        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das duas condições é verdadeira");

        }
    }

}
