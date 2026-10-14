import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a number: ");
        double a = in.nextDouble();
        System.out.println(rootSquare(a));
        System.out.println("Close enough");
    }
    public static double rootSquare(double a) {
        double y = a / 2;
        double x1 = (y + a / y) / 2;
        while (Math.abs(x1 - y) >= 0.0001) {
            y = x1;
            x1 = (y + a / y) / 2;
        }
        return x1;
    }
}
