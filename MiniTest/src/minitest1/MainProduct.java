package minitest1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        enterProduct(scanner, products);
        sumPrice(products);
        findProduct(scanner, products);
        editProduct(scanner, products);
        deleteProduct(scanner, products);

        System.out.println(products);
    }


    public static Product createProduct(Scanner scanner) {
        System.out.print("Enter ID : ");
        int id = scanner.nextInt();
        System.out.print("Enter Price : ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Type : ");
        String type = scanner.nextLine();
        System.out.print("Enter Money : ");
        String money = scanner.nextLine();
        return new Product(id, name, price, type, money);
    }

    public static void deleteProduct(Scanner scanner, ArrayList<Product> products) {
        System.out.print("Nhập ID muốn xóa : ");
        boolean check = false;
        int id = scanner.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getID() == id) {
                products.remove(i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("ID này không trùng sản phẩm");
        }
    }

    public static void findProduct(Scanner scanner, ArrayList<Product> products) {
        boolean check = false;
        System.out.print("Nhập ID sản phẩm muốn tìm : ");
        int id = scanner.nextInt();
        for (Product product : products) {
            if (product.getID() == id) {
                check = true;
                System.out.println(product);
                break;
            }
        }
        if (!check) {
            System.out.println("Không có sản phẩm muốn tìm");
        }
    }

    public static void enterProduct(Scanner scanner, ArrayList<Product> products) {
        System.out.print("Nhập số sản phẩm : ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            products.add(createProduct(scanner));
        }
        System.out.println(products);
    }

    public static void editProduct(Scanner scanner, ArrayList<Product> products) {
        boolean check = false;
        System.out.print("Nhập ID sản phẩm muốn sửa : ");
        int id = scanner.nextInt();
        for (Product product : products) {
            if (product.getID() == id) {
                check = true;
                System.out.print("Nhập giá mới : ");
                product.setPrice(scanner.nextDouble());
                System.out.print("Nhập tên mới : ");
                scanner.nextLine();
                product.setName(scanner.nextLine());
                System.out.print("Nhập kiểu mới : ");
                product.setType(scanner.nextLine());
                System.out.println(product);
                break;
            }
        }
        if (!check) {
            System.out.println("ID không tồn tại");
        }
    }

    public static void sumPrice(ArrayList<Product> products) {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        System.out.println("Tổng giá tiền là : " + sum);
    }
}
