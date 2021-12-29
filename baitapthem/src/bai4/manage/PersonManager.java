package bai4.manage;

import bai4.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Person> people = new ArrayList<>();
    public ArrayList<Person> createPerson(int i){
        for (int j = 1; j <= i; j++) {
            System.out.print("Nhập tên thành viên thứ "+j+" : ");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày sinh (YY/MM/DD) : ");
            LocalDate birthDate = LocalDate.of(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
            System.out.print("Nhập nghề nghiệp : ");
            String job = scanner.nextLine();
            Person person = new Person(name, birthDate, job);
            people.add(person);
        }
       return people;
    }
    public  void displayPerson(){
        for (Person person : people){
            System.out.println(person);
        }
    }

}
