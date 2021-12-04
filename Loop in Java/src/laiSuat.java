import java.util.Scanner;

public class laiSuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi : ");
        int money = scanner.nextInt();
        System.out.print("Nhập số tháng gửi : ");
        int months = scanner.nextInt();
        System.out.print("Nhập lãi suất : ");
        float rate = scanner.nextFloat();
        float totalMoney = 0;
        for (int i = 0; i < months; i++) {
            totalMoney = money * (rate / 100) * months;
        }
        System.out.println("Số tiền lãi hàng tháng : " + totalMoney);
    }
}
