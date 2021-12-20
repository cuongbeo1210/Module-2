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
        switch (choice){
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
    public static void display(ArrayList<Animal> animals){
        if (animals.size() > 0){
            for (Animal animal : animals){
                System.out.println(animal);
            }
        } else
            System.out.println("Không có gì");
    }

}



