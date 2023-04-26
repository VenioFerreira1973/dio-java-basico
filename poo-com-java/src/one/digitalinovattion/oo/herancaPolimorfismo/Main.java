package one.digitalinovattion.oo.herancaPolimorfismo;

public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        // Exemplos de upcast
        Funcionario v1 = new Vendedor();
        Funcionario g2 = new Gerente();
        Funcionario ff2 = new Faxineiro();

        // Exemplo de downcast -- dá erro de compilação pois a subclasse tem atributos
        // especificos
        // que a classe não tem então deve ser evitado
        // Vendedor vendedor = (Vendedor) new Funcionario();

        // Abaixo exemplos de polimorfismo
        Funcionario[] classes = new Funcionario[] { new Vendedor(), new Faxineiro(), new Funcionario() };

        for (Funcionario classe : classes) {
            classe.metodo1();
        }
        System.out.println();

        for (Funcionario classe : classes) {
            classe.metodo2();
        }
        System.out.println();

        // Exemplo de sobrescrita
        Vendedor vendedor = new Vendedor();
        vendedor.metodo2();

    }

}
