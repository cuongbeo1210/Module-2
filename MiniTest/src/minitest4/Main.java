package minitest4;

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
            System.out.println("*       3. Sửa theo ID                     *");
            System.out.println("*       4. Xóa sinh viên                   *");
            System.out.println("*       5. Điểm trung bình tăng dần        *");
            System.out.println("*       6. Điểm trung bình giảm dần        *");
            System.out.println("*       7. Sinh viên có điểm cao nhất      *");
            System.out.println("*       8. Tìm sinh viên                   *");
            System.out.println("*       9. Đọc file CSV                    *");
            System.out.println("*       0. Exit                            *");
            System.out.println("* * * * * * * * *______* * * * * * * * * * *");
            System.out.print("      Nhập lựa chọn của bạn : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Manager.createStudent(scanner, students);
                    break;
                case 2:
                    Manager.displayStudent(students);
                    break;
                case 3:
                    Manager.editStudent(scanner, students);
                    break;
                case 4:
                    Manager.deleteStudent(scanner, students);
                    break;
                case 5:
                    Manager.sortPointUp(students);
                    break;
                case 6:
                    Manager.sortPointDown(students);
                    break;
                case 7:
                    Manager.maxPoint(students);
                    break;
                case 8:
                    Manager.findStudent(scanner,students);
                    break;
                case 9:
                    ArrayList<Student> newStudents;
                    newStudents = Manager.readFile(Manager.PATH_NAME);
                    newStudents.forEach(System.out::println);
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choice != 0);
    }
}
