import java.util.Scanner;

public class tongCacSoTrongCot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so dong phan tu : ");
        int num1 = input.nextInt();
        System.out.print("Nhap so cot phan tu : ");
        int num2 = input.nextInt();

        double[][] arr = new double[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.printf("Phan tu thu [%d][%d] : ", i, j);
                arr[i][j] = input.nextDouble();
            }
        }

        System.out.print("Nhap cot can tinh tong : ");
        int number = input.nextInt();
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][number];
        }

        System.out.printf("Tong cac so o cot [%d] : " + sum, number);
    }
}
