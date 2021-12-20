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
            System.out.print("Nhập lựa chọn của bạn : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("1. Chó");
                        System.out.println("2. Mèo");
                        System.out.println("2. Chuột");
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
//                                        boolean check = false;
                                    for (int i = 0; i < animals.size(); i++) {
                                        for (int k = 0; k < animals.size(); k++) {
                                            if (i == k)   {
                                                break;
                                            } else {
                                                if (animals.get(i).getName().equals(animals.get(k).getName())) {
                                                    System.out.println("Trùng tên rồi ^^");
//                                                check = true;
                                                    animals.remove(k);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
//                                        if (!check) {
//                                            animals.add(dog1);
//
                                break;
                            case 2:
                                if (animals.size() < 1) {
                                    Cat cat = (Cat) Manager.createAnimal(scanner, choice1);
                                    animals.add(cat);
                                } else {
                                    Cat cat1 = (Cat) Manager.createAnimal(scanner, choice1);
                                    animals.add(cat1);
//                                        boolean check = false;
                                    for (int i = 0; i < animals.size(); i++) {
                                        for (int k = 0; k < animals.size(); k++) {
                                            if (i == k)   {
                                                break;
                                            } else {
                                                if (animals.get(i).getName().equals(animals.get(k).getName())) {
                                                    System.out.println("Trùng tên rồi ^^");
//                                                check = true;
                                                    animals.remove(k);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 3:
                                if (animals.size() < 1) {
                                    Mouse mouse = (Mouse) Manager.createAnimal(scanner, choice1);
                                    animals.add(mouse);
                                } else {
                                    Mouse mouse1 = (Mouse) Manager.createAnimal(scanner, choice1);
                                    animals.add(mouse1);
//                                        boolean check = false;
                                    for (int i = 0; i < animals.size(); i++) {
                                        for (int k = 0; k < animals.size(); k++) {
                                            if (i == k)   {
                                                break;
                                            } else {
                                                if (animals.get(i).getName().equals(animals.get(k).getName())) {
                                                    System.out.println("Trùng tên rồi ^^");
//                                                check = true;
                                                    animals.remove(k);
                                                    break;
                                                }
                                            }
                                        }
                                    }
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

            }
        }
        while (choice != 0);
        }

    }


