package minitest2;


import java.util.ArrayList;
import java.util.Scanner;

public  class Manager implements Manage {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addPerson(ArrayList<Person> people) {
        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        int age = scanner.nextInt();

        Person person1 = new Person(name , age);
        people.add(person1);
    }

    @Override
    public void displayPerson(ArrayList<Person> people) {
        for (Person value : people) {
            System.out.println(value);
        }
    }

    @Override
    public void findIndexPerson(ArrayList<Person> people) {
        boolean check = false;
        System.out.println("Nhập tên người muốn tìm : ");
        String name = scanner.nextLine();
        for (int i = 0; i < people.size(); i++){
            if (people.get(i).getName().equals(name)){
                check = true;
                System.out.println(i);
            }
        }
        if (!check) System.out.println("Không tìm thấy");
    }

    @Override
    public void deletePerson(ArrayList<Person> people) {
        boolean check = false;
        System.out.println("Nhâp tên người cần xóa : ");
        String name = scanner.nextLine();
        for (Person x:people) {
            if (x.getName().equals(name)){
                check = true;
                people.remove(x);
            }
        }
        if (!check) System.out.println("Không tìm thấy");
    }

    @Override
    public void editPerson(ArrayList<Person> people) {
        boolean check = false;
        System.out.println("Nhập tên người cần sửa : ");
        String name = scanner.nextLine();
        for (Person person : people){
            if (person.getName().equals(name)){
                check = true;
                System.out.println("Nhập tên mới : ");
                person.setName(scanner.nextLine());
                System.out.println("Nhập tuổi mới :");
                person.setAge(scanner.nextInt());
            }
        }
        if (!check) System.out.println("Không tìm thấy");
    }

    @Override
    public void sortAveragePoints() {

    }

    @Override
    public double sumAveragePoints() {
        return 0;
    }

    public static void createStudent(Scanner scanner, ArrayList<Person> people){
        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm trung bình : ");
        double averagePoint = scanner.nextDouble();
        Person person2 = new Student(name, age, averagePoint);
        people.add(person2);
    }
}
