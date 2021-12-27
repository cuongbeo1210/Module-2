package product_manage;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<Product> products;
    Scanner input = new Scanner(System.in);
    private final File pathName =new File("src/product_manage/products") ;

    public Manager() {
        if (pathName.length() == 0){
            products = new ArrayList<>();
        } else {
            products = readDataFromFile(pathName);
        }
    }

    public Product createProducts(){
        System.out.print("Nhap ID san pham: ");
        int id = input.nextInt();
        id = checkID(id, input);
        input.nextLine();
        System.out.print("Nhap ten san pham: ");
        String name = input.nextLine();
        System.out.print("Nhap ten hang san xuat: ");
        String manufacturer = input.nextLine();
        System.out.print("Nhap gia san pham: ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.print("Nhap loai san pham: ");
        String type = input.nextLine();
        Product product = new Product(id, name, manufacturer, price, type);
        products.add(product);
        writeToFile(pathName,products);
        return product;
    }

    public int checkID(int id, Scanner input) {
        try {
            for (Product product : products) {
                while (product.getId() == id) {
                    System.out.print("ID bị trùng, nhập lại ID: ");
                    id = input.nextInt();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public void writeToFile(File path, ArrayList<Product> product){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
        } catch ( IOException e ) {
            System.out.println("File not found");
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            assert fos != null;
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Product> readDataFromFile(File path){
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (ArrayList<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public void displayProduct(){
        for (Product product1 : products) {
            System.out.println(product1);
        }
        if (products.size() == 0) System.out.println("Không có sản phẩm nào");
    }

    public void findProduct(int id){
        boolean check = false;
        for (Product product2 : products) {
            if (product2.getId() == id){
                System.out.println(product2);
                check = true;
            }
        }
        if (!check){
            System.out.println("Khong tim thay san pham theo ma tren! ");
        }
    }

    public void deleteProduct(int id) {
        boolean check = false;
        for (int i = 0; i < products.size(); i++){
            if(products.get(i).getId() == id){
                check = true;
                products.remove(i);
                System.out.println("Xóa thành công !!!");
                break;
            }
        }
        if (!check) System.out.println("Not Found");
        writeToFile(pathName,products);
    }
}
