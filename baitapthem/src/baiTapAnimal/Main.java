package baiTapAnimal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Nhập động vật mới");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Sửa theo tên");
            System.out.println("4. Lấy thông tin theo tên");
            System.out.println("5. Hiển thị ra tất cả chó");
            System.out.println("6. Hiển thị con vật trong khoảng cân nặng");
            System.out.println("0. Exit");
            System.out.print("Nhập lựa chọn của bạn : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("1. Chó");
                        System.out.println("2. Mèo");
                        System.out.println("3. Chuột");
                        System.out.println("0. Quay lại");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                if (animals.size() < 1) {
                                    Dog dog = (Dog) Manager.createAnimal(scanner, choice1);
                                    animals.add(dog);
                                } else {
                                    Dog dog1 = (Dog) Manager.createAnimal(scanner, choice1);
                                    animals.add(dog1);
                                    Manager.checkSameName(animals);
                                }
                                break;
                            case 2:
                                if (animals.size() < 1) {
                                    Cat cat = (Cat) Manager.createAnimal(scanner, choice1);
                                    animals.add(cat);
                                } else {
                                    Cat cat1 = (Cat) Manager.createAnimal(scanner, choice1);
                                    animals.add(cat1);
                                    Manager.checkSameName(animals);
                                }
                                break;
                            case 3:
                                if (animals.size() < 1) {
                                    Mouse mouse = (Mouse) Manager.createAnimal(scanner, choice1);
                                    animals.add(mouse);
                                } else {
                                    Mouse mouse1 = (Mouse) Manager.createAnimal(scanner, choice1);
                                    animals.add(mouse1);
                                    Manager.checkSameName(animals);
                                }
                                break;
                        }
                    }
                    while (choice1 != 0);
                    break;
                case 2:
                    Manager.display(animals);
                    break;
                case 3:
                    Manager.editAnimal(animals, scanner);
                    break;
                case 4:
                    Manager.getInfor(scanner, animals);
                    break;
                case 5:
                    Manager.displayAllDogs(scanner, animals);
                    break;
                case 6:
                    Manager.rangeWeight(scanner, animals);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
        while (choice != 0);
    }
}


