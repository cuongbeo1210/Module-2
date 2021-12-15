import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class studentManager  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        createStudent(scanner, students);
        System.out.println(students);
        deleteStudent(scanner, students);
        System.out.println(students);
        Student students1 = new Student("Nam",23,"Nam","Hà Nội",8.6);
        Student students2 = new Student("Long",23,"Nam","Hà Nội",8.7);
        Student students3 = new Student("Quang",23,"Nam","Hà Nội",8.9);
        students.add(students3);
        students.add(students2);
        students.add(students1);

    }



    private static void createStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Nhập tên sinh viên : ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi : ");
        int age = scanner.nextInt();
        System.out.print("Nhập giới tính : ");
        scanner.nextLine();
        String sex = scanner.nextLine();
        System.out.print("Nhập địa chỉ : ");
        String address = scanner.nextLine();
        System.out.print("Nhập điểm trung bình : ");
        double avgPoint = scanner.nextDouble();
        Student student = new Student(name, age, sex, address, avgPoint);
        students.add(student);
    }

    public static void display(ArrayList<Student> students){
        System.out.println(students);
    }

    public static void deleteStudent(Scanner scanner, ArrayList<Student> students){
        boolean check = false;
        scanner.nextLine();
        System.out.print("Nhập tên sinh viên muốn xóa : ");
        String name = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                check = true;
                students.remove(students.get(i));
            }
        }
        if (!check) System.out.println("Không tìm thấy sinh viên muốn xóa");
    }

    public static void findStudent(Scanner scanner, ArrayList<Student> students){
        scanner.nextLine();
        boolean check = false;
        System.out.print("Nhập tên sinh viên muốn tìm : ");
        String name = scanner.nextLine();
        for (Student student : students){
            if (student.getName().equals(name)){
                check = true;
                System.out.println(student);
            }
        }
        if (!check) System.out.println("Không tìm thấy sinh viên này");
    }

    public static void displayMaleStudent(ArrayList<Student> students){
        boolean check = false;
        for (Student student : students) {
            if(student.getSex().equals("Nam")){
                System.out.println(student);
                check = true;
            }
        }
        if(!check) System.out.println("Không có học sinh nam nào");
    }

    public static void displayFemaleStudent(ArrayList<Student> students){
        boolean check = false;
        for(Student student : students){
            if(student.getSex().equals("Nữ")){
                System.out.println(student);
                check = true;
            }
        }
        if(!check) System.out.println("Không có học sinh nữ nào");
    }


}
