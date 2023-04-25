public class QuadrilateroComRetorno {

    public double area(double lado) {

        return lado * lado;
    }

    public double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    public double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public float area(float lado1, float lado2) {

        return (lado1 * lado2) / 2;
    }

}
