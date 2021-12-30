package baitap29_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public static Student createStudent(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập tên sinh viên : ");
        int choice;
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Chọn giới tính : ");
        String sex;
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.println("3. Other");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    sex = "Nam";
                    break;
                case 2:
                    sex = "Nữ";
                    break;
                case 3:
                    sex = "Other";
                    break;
                default:
                    sex = "Unknown";
                    break;
            }

        System.out.print("Nhập địa chỉ : ");
        String address = scanner.nextLine();
        System.out.print("Nhập điểm trung bình : ");
        double averagePoint = scanner.nextDouble();
        return new Student(name, age, sex, address, averagePoint);
    }

    public void deleteStudent(Scanner scanner, ArrayList<Student> students) {
        boolean check = false;
        System.out.print("Nhập tên cần xóa : ");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
                check = true;
            }
        }
        if (!check) System.out.println("Not found");
    }

    public static void displayStudent(ArrayList<Student> students) {
        if (students.size() <= 0) {
            System.out.println("Không có sinh viên nào");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    public void displayAvgPoints(ArrayList<Student> students) {
        if (students.size() <= 0){
            System.out.println("Không có sinh viên");
        } else {
            for (Student student : students){
                if (student.getAveragePoint() > 7.5){
                    System.out.println(student);
                }
            }
        }
    }
    public static void displayStudentByRank(ArrayList<Student> students){
        if (students.size() <= 0){
            System.out.println("Không có sinh viên");
        } else {
            for (Student student : students){
                if (student.getAveragePoint() > 8){
                    System.out.printf("Tên : %s - ĐTB : %.2f - Xếp Loại : Giỏi ",student.getName(),student.getAveragePoint());
                    System.out.println();
                } else if (student.getAveragePoint() > 6){
                    System.out.printf("Tên : %s - ĐTB : %.2f - Xếp Loại : Khá ",student.getName(),student.getAveragePoint());
                    System.out.println();
                } else if (student.getAveragePoint() > 4.5){
                    System.out.printf("Tên : %s - ĐTB : %.2f - Xếp Loại : Trung Bình ",student.getName(),student.getAveragePoint());
                    System.out.println();
                }
                else{
                    System.out.printf("Tên : %s - ĐTB : %.2f - Xếp Loại : Yếu ",student.getName(),student.getAveragePoint());
                    System.out.println();
                }
            }
        }
    }
}
