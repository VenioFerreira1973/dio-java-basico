public class Quadrilatero {

    public void area(double lado) {

        System.out.println("Area do quadrado: " + lado * lado);
    }

    public void area(double lado1, double lado2) {

        System.out.println("Area do retangulo: " + lado1 * lado2);
    }

    public void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Area do quadrado: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public void area(float lado1, float lado2) {

        System.out.println("Area do losango: " + (lado1 * lado2) / 2);
    }

}
