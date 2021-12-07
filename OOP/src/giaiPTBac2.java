import java.util.Scanner;

public class giaiPTBac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        double num1 = input.nextDouble();

        System.out.print("Enter B: ");
        double num2 = input.nextDouble();

        System.out.print("Enter C: ");
        double num3 = input.nextDouble();

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
