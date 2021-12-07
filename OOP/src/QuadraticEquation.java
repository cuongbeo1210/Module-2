import java.util.Scanner;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (this.b * this.b - 4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        double num1 = input.nextDouble();

        System.out.print("Enter B: ");
        double num2 = input.nextDouble();

        System.out.print("Enter C: ");
        double num3 = input.nextDouble();

        display(num1, num2, num3);
    }

    public static void display(double num1, double num2, double num3) {
        if (num1 == 0) {
            if (num2 == 0) {
                if (num3 == 0) {
                    System.out.print("The equation has infinitely many solutions");
                } else {
                    System.out.print("The equation has no solution");
                }
            } else {
                FirstDegreeEquation PTBac1 = new FirstDegreeEquation(num2, num3);
                System.out.printf("The equation has solution: X = %.3f", PTBac1.getRoot());
            }
        } else {
            QuadraticEquation PTBac2 = new QuadraticEquation(num1, num2, num3);
            double delta = PTBac2.getDiscriminant();

            if (delta < 0) {
                System.out.print("The equation has no solution");
            } else if (delta == 0) {
                System.out.printf("The equation has solution: X = %.3f", PTBac2.getRoot1());
            } else {
                System.out.printf("The equation has solutions: X1 = %.3f, X2 = %.3f", PTBac2.getRoot1(), PTBac2.getRoot2());
            }
        }

    }
}
