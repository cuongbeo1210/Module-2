package minitest2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Tạo mới");
            System.out.println("2. Tìm kiếm");
            System.out.println("3. Hiển thị");
            System.out.println("0. Exit");
            System.out.print("Nhập lựa chọn của bạn : ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Nhập người bình thường");
                    System.out.println("2. Nhập sách sinh viên");
                    System.out.print("Nhập lựa chọn của bạn : ");
                    int choice1 = input.nextInt();
    }
}
