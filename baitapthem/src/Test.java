import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a : ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b : ");
        int b = scanner.nextInt();
        System.out.println("Tổng 2 số a và b là : " + tinhTong(a,b));
    }
    public static int tinhTong(int a, int b){
        return (a+b);
    }
}
