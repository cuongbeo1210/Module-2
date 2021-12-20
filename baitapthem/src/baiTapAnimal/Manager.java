package baiTapAnimal;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public static Animal createAnimal(Scanner scanner, int choice) {
        scanner.nextLine();
        System.out.print("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi : ");
        int age = scanner.nextInt();
        System.out.print("Nhập cân nặng : ");
        double weight = scanner.nextDouble();
        switch (choice) {
            case 1:
                return new Dog(name, age, weight);
            case 2:
                return new Cat(name, age, weight);
            case 3:
                return new Mouse(name, age, weight);
            default:
                return null;
        }
    }

    public static void display(ArrayList<Animal> animals) {
        if (animals.size() > 0) {
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        } else
            System.out.println("Không có gì");
    }

    public static void editAnimal(ArrayList<Animal> animals, Scanner scanner) {
        scanner.nextLine();
        boolean check = false;
        System.out.print("Nhập tên con vật muốn sửa : ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                check = true;
                System.out.print("Nhập tên mới : ");
                animal.setName(scanner.nextLine());
                System.out.print("Nhập tuổi mới : ");
                animal.setAge(scanner.nextInt());
                System.out.print("Nhập cân nặng mới : ");
                animal.setWeight(scanner.nextDouble());
                System.out.println("Sửa thành công !!!");
            }
        }
        if (!check) System.out.println("Không có tên con vật muốn sửa");
    }

    public static void getInfor(Scanner scanner, ArrayList<Animal> animals) {
        scanner.nextLine();
        boolean check = false;
        System.out.print("Nhập tên con vật : ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                check = true;
                System.out.println(animal);
            }
        }
        if (!check) System.out.println("Không tìm thấy");
    }

    public static void displayAllDogs(Scanner scanner, ArrayList<Animal> animals) {
        ArrayList<Dog> dogs = new ArrayList<>();
        scanner.nextLine();
        boolean check = false;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                check = true;
                dogs.add((Dog) animal);
            }
        }
        System.out.println(dogs);
        if (!check) System.out.println("Không có chó nào");
    }

    public static void rangeWeight(Scanner scanner, ArrayList<Animal> animals) {
        scanner.nextLine();
        boolean check = false;
        System.out.println("Nhập khoảng cân nặng : ");
        System.out.print("Từ : ");
        double from = scanner.nextDouble();
        System.out.print("Đến : ");
        double to = scanner.nextDouble();
        double temp;
        if (from > to) {
            temp = from;
            from = to;
            to = temp;
        }
        for (Animal animal : animals) {
            if (animal.getWeight() >= from && animal.getWeight() <= to) {
                check = true;
                System.out.printf("Những con vật trong khoảng cân nặng %.2f tới %.2f là : ", from, to);
                System.out.printf("%s có cân nặng là %.2f", animal.getName(), animal.getWeight());
                System.out.println();
            }
        }
        if (!check) System.out.println("Không tìm thấy");
    }
    public void deleteByName(Scanner scanner, ArrayList<Animal> animals) {
        scanner.nextLine();
        System.out.print("Nhập tên muốn xóa: ");
        String name = scanner.nextLine();
        animals.removeIf(animal -> animal.getName().equals(name));
    }

}



