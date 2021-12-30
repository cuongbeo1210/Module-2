package minitest4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public static final String PATH_NAME = "src/minitest4/student.csv";
    public static void createStudent(Scanner scanner, ArrayList<Student> students) {
        scanner.nextLine();
        System.out.print("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập điểm toán : ");
        double mathPoint = scanner.nextDouble();
        System.out.print("Nhập điểm lý : ");
        double physicPoint = scanner.nextDouble();
        System.out.print("Nhập điểm hóa : ");
        double chemistryPoint = scanner.nextDouble();
        Student student = new Student(name, age, physicPoint, mathPoint, chemistryPoint);
        students.add(student);
        System.out.println("Thêm thành công !!!");
        writeFile(students,PATH_NAME);
    }

    public static void editStudent(Scanner scanner, ArrayList<Student> students) {
        scanner.nextLine();
        boolean check = false;
        System.out.print("Nhập ID muốn sửa : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student : students) {
            if (student.getId() == id) {
                check = true;
                System.out.print("Nhập tên mới : ");
                student.setName(scanner.nextLine());
                System.out.print("Nhập tuổi mới : ");
                student.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.print("Nhập điểm toán mới : ");
                student.setMathPoint(scanner.nextDouble());
                System.out.print("Nhập điểm lý mới : ");
                student.setPhysicPoint(scanner.nextDouble());
                System.out.print("Nhập điểm hóa mới : ");
                student.setChemistryPoint(scanner.nextDouble());
                student.setAveragePoint(student.getMathPoint(), student.getPhysicPoint(), student.getChemistryPoint());
                System.out.print("Sửa thành công !!!");
                System.out.println();
                writeFile(students,PATH_NAME);
            }
        }
        if (!check) System.out.println("Không có ID nào phù hợp");
    }

    public static void deleteStudent (Scanner scanner, ArrayList<Student> students){
        scanner.nextLine();
        boolean check = false;
        System.out.print("Nhập ID sinh viên cần xóa : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getId() == id){
                check = true;
                students.remove(i);
                writeFile(students,PATH_NAME);
                break;
            }
        }
        if (!check) System.out.println("Không tìm thấy ID phù hợp");
        else System.out.println("Xóa thành công !!!");
    }

    public static void sortPointUp (ArrayList<Student> students){
        students.sort(((o1, o2) -> (int) (o1.getAveragePoint() - o2.getAveragePoint())));
        students.forEach(System.out::println);
    }
    public static void sortPointDown (ArrayList<Student> students){
        students.sort(((o1, o2) -> (int) (o2.getAveragePoint() - o1.getAveragePoint())));
        students.forEach(System.out::println);
    }

    public static void maxPoint (ArrayList<Student> students){
        students.sort(((o1, o2) -> (int) (o1.getAveragePoint() - o2.getAveragePoint())));
        Student student1 ;
        student1 = students.get(students.size()-1);
        System.out.println(student1);
    }

    public static void displayStudent(ArrayList<Student> students){
        if (students.size() > 0){
            for(Student student : students){
                System.out.println(student);
            }
        } else System.out.println("Không có sinh viên");
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

    public static ArrayList<Student> readFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[1], Integer.parseInt(strings[2]), Double.parseDouble(strings[3]), Double.parseDouble(strings[4]), Double.parseDouble(strings[5])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void writeFile(ArrayList<Student> students, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getId()+ "," + student.getName() + "," + student.getAge() + ","
                        +student.getMathPoint()+ "," +student.getPhysicPoint()+ "," +student.getChemistryPoint() +"\n");
            }
            bufferedWriter.close();
            System.out.println("Write file successfully!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
