import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm : ");
        int number = scanner.nextInt();

        Product[] products = new Product[number];
        for (int i = 0; i < products.length; i++) {
            products[i] = createProduct(scanner);
            sum += products[i].getPrice();
        }
        for (Product x : products) {
            System.out.println(x);
        }
        System.out.println("Tổng tiền sản phẩm : "+sum);
        FindProduct(scanner, products);
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

   public static void FindProduct(Scanner scanner, Product[] product){
        boolean check = false;
       System.out.print("Nhập tên sản phẩm muốn tìm : ");
       int id = scanner.nextInt();
       for (int i = 0; i < product.length; i++) {
           if (id == product[i].getID()) {
               System.out.print(product[i]);
               check = true;
               break;
           }
           if (!check){
               System.out.print("Không có sản phẩm muốn tìm");
           }

       }
   }
   public static void EditProduct(Scanner scanner, Product[] product) {

       System.out.print("Nhập ID sản phẩm cần sử:");
       int id = scanner.nextInt();
       for (int i = 0; i < product.length ; i++) {
           if (product[i].ID == id){
               System.out.print("Nhap ten san pham: ");
               product[i].setName(scanner.nextLine());
               System.out.print("Nhap gia san pham: ");
               product[i].setPrice(scanner.nextDouble());
               scanner.nextLine();
               System.out.print("Nhap loai san pham: ");
               product[i].setType(scanner.nextLine());
               System.out.print("Nhap don vi tien san pham: ");
               product[i].setMoney(scanner.nextLine());
           }
       }
   }

}

