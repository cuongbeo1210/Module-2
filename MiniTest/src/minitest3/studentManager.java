package minitest3;

import java.util.ArrayList;
import java.util.Scanner;

public class studentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("* * * * * * * * * Menu * * * * * * * * * * *");
            System.out.println("*       1. Thêm mới sinh viên              *");
            System.out.println("*       2. Sửa thông tin sinh viên         *");
            System.out.println("*       3. Xóa sinh viên                   *");
            System.out.println("*       4. Tìm kiếm sinh viên              *");
            System.out.println("*       5. Hiển thị ds SV theo điểm TB     *");
            System.out.println("*       6. Tìm sinh viên có điểm cao nhất  *");
            System.out.println("*       0. Exit                            *");
            System.out.println("* * * * * * * * *______* * * * * * * * * * *");
            System.out.print("      Nhập lựa chọn của bạn : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createStudent(scanner, students);
                    break;
                case 2:
                    editStudent(scanner, students);
                    break;
                case 3:
                    deleteStudent(scanner, students);
                    break;
                case 4:
                    findStudent(scanner, students);
                    break;
                case 5:
                    sortPoint(students);
                    break;
                case 6:
                    maxPoint(students);
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
        while(choice != 0);
    }

    public static void createStudent(Scanner scanner, ArrayList<Student> students){
        System.out.print("Nhập ID : ");
        int id = scanner.nextInt();
        System.out.print("Nhập tên : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi : ");
        int age = scanner.nextInt();
        System.out.print("Nhập điểm lý : ");
        double physicPoint = scanner.nextDouble();
        System.out.print("Nhập điểm toán : ");
        double mathPoint = scanner.nextDouble();
        System.out.print("Nhập điểm hóa : ");
        double chemistryPoint = scanner.nextDouble();
        Student student = new Student(id, name, age, physicPoint, mathPoint, chemistryPoint);
        students.add(student);
    }

    public static void editStudent (Scanner scanner, ArrayList<Student> students){
        scanner.nextLine();
        boolean check = false;
        System.out.print("Nhập ID muốn sửa : ");
        int id = scanner.nextInt();
        for (Student student : students){
            if (student.getId() == id){
                check = true;
                System.out.print("Nhập tên mới : ");
                student.setName(scanner.nextLine());
                scanner.nextLine();
                System.out.print("Nhập tuổi mới : ");
                student.setAge(scanner.nextInt());
                System.out.print("Nhập điểm toán mới : ");
                student.setMathPoint(scanner.nextDouble());
                System.out.print("Nhập điểm lý mới : ");
                student.setPhysicPoint(scanner.nextDouble());
                System.out.print("Nhập điểm hóa mới : ");
                student.setChemistryPoint(scanner.nextDouble());
                System.out.print("Sửa thành công !!!");
            }
        }
        if (!check) System.out.println("Không có ID nào phù hợp");
    }
    public static void deleteStudent (Scanner scanner, ArrayList<Student> students){
        scanner.nextLine();
        boolean check = false;
        System.out.print("Nhập ID sinh viên cần xóa : ");
        int id = scanner.nextInt();
        for (Student student : students){
            if (student.getId() == id){
                check = true;
                students.remove(student);
            }
        }
        if (!check) System.out.println("Không tìm thấy ID phù hợp");
        else System.out.println("Xóa thành công !!!");
    }
    public static void sortPoint (ArrayList<Student> students){
        students.sort(((o1, o2) -> (int) (o1.getAveragePoint() - o2.getAveragePoint())));
        System.out.println(students);
           }
    public static void maxPoint (ArrayList<Student> students){
        students.sort(((o1, o2) -> (int) (o1.getAveragePoint() - o2.getAveragePoint())));
        Student student1 ;
        student1 = students.get(students.size()-1);
        System.out.println(student1);
    }

    public static void findStudent(Scanner scanner, ArrayList<Student> students){
        boolean check = false;
        System.out.print("Nhập ID cần tìm : ");
        int id = scanner.nextInt();
        for(Student student : students){
            if (student.getId() == id){
                check = true;
                System.out.println(student);
                break;
            }
        }
        if (!check) System.out.println("Không tìm thấy");
    }
}

