public class MainSobrecarga {

    public static void main(String[] args) {

        Quadrilatero q1 = new Quadrilatero();

        q1.area(2D, 4D);

        q1.area(2, 3, 4);

        q1.area(36);

        q1.area(3F, 5F);

        QuadrilateroComRetorno q2 = new QuadrilateroComRetorno();

        System.out.println("Area do retangulo: " + q2.area(2D, 4D));

        System.out.println("Area do trapezio: " + q2.area(2, 3, 4));

        System.out.println("Area do quadrado: " + q2.area(36));

        System.out.println("Area do losango: " + q2.area(3F, 5F));
    }

}
