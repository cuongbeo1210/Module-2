package baitap29_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("* * * * * * * * * Menu * * * * * * * * * * *");
            System.out.println("*       1. Tạo sinh viên mới               *");
            System.out.println("*       2. Hiển thị danh sách              *");
            System.out.println("*       3. Sửa theo tên                    *");
            System.out.println("*       4. Xóa sinh viên                   *");
            System.out.println("*       5. Hiển thị ra điểm TB trên 7.5    *");
            System.out.println("*       6. Hiển thị ra Rank sinh viên      *");
            System.out.println("*       0. Exit                            *");
            System.out.println("* * * * * * * * *______* * * * * * * * * * *");
            System.out.print("      Nhập lựa chọn của bạn : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student student = new Student();
                    student = Manager.createStudent(scanner);
                    students.add(student);
                    break;
                case 2:
                    Manager.displayStudent(students);
                    break;
                case 6:
                    Manager.displayStudentByRank(students);
                    break;
            }
        }
        while (choice != 0);
    }
}
