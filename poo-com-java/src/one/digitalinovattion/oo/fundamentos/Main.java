package one.digitalinovattion.oo.fundamentos;

public class Main {

    public static void main(String[] args) {

        Carro c = new Carro();
        c.setModelo("Ferrari");
        c.setCor("Vermelha");
        c.setCapacidadeTanque(80);

        Double tanqueCheio = c.calculaValorParaEncherTaque(5.6);

        System.out.println("Para encher o tanque da " + c.getModelo() + " " + c.getCor() + " é necessário gastar" +
                " R$ " + tanqueCheio + " reais.");

    }

}
