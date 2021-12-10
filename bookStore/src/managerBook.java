import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class managerBook {

    public static Book createBook(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter Name's Book : ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity : ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Price : ");
        double price = scanner.nextDouble();
        System.out.println("Enter Publication Date (YY/MM/DD) : ");
        LocalDate nsx = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        return new Book(name, quantity, price, nsx);
    }

    public static void enterBooks(Scanner scanner, ArrayList<Book> books) {
//        System.out.print("Nhập số lượng sách : ");
//        int number = scanner.nextInt();
        for (int i = 0; i < 1; i++) {
            books.add(createBook(scanner));
        }
//        System.out.println(books);
    }

    public static scienceBook enterScienceBook(Scanner scanner, ArrayList<Book> books) {
        scanner.nextLine();
        System.out.print("Enter Name's Science Book : ");
        String name = scanner.nextLine();
        System.out.print("Enter Type : ");
        String type = scanner.nextLine();
        System.out.print("Enter Quantity : ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Price : ");
        double price = scanner.nextDouble();
        System.out.println("Enter Publication Date (YY/MM/DD) : ");
        LocalDate nsx = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        return new scienceBook(name, quantity, price, nsx, type);
    }
    public static void display(ArrayList<Book> books){
        System.out.println(books);
        System.out.println("Tổng giá tiền kho sách : "+Book.sum);
    }
    public static void findMaxPriceBook(ArrayList<Book> books){
        double max = books.get(0).getPrice();
        int index = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPrice() > max){
                max = books.get(i).getPrice();
                index = i;
            }
        }
        System.out.println("Cuốn sách đắt nhất Shop hiện tại là : " +books.get(index).getName()+ " với giá : " +books.get(index).getPrice());
        }
    public static void findMinPriceBook(ArrayList<Book> books) {
        double min = books.get(0).getPrice();
        int index1 = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPrice() < min) {
                min = books.get(i).getPrice();
                index1 = i;
            }
        }
        System.out.println("Cuốn sách rẻ nhất Shop hiện tại là : " +books.get(index1).getName()+ " với giá : " +books.get(index1).getPrice());
    }
    public static void findBook(Scanner scanner, ArrayList<Book> books){
        System.out.print("Nhập thể loại sách muốn tìm : ");
        String typeBook = scanner.nextLine();
//        for (int i = 0; i < books.size(); i++) {
//            if (books.get(i).){
//
//            }
//        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
//        enterBooks(scanner, books);
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Nhập sách khoa học");
            System.out.println("2. Nhập sách bình thường");
            System.out.println("3. Hiển thị kho sách");
            System.out.println("4. Hiển thị quyển sách đắt nhất");
            System.out.println("5. Hiển thị quyển sách rẻ nhất");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    books.add(enterScienceBook(scanner, books));
//                    System.out.println(books);
                    break;
                case 2:
                    enterBooks(scanner, books);
                    break;
                case 3:
                    display(books);
                    break;
                case 4:
                    findMaxPriceBook(books);
                    break;
                case 5:
                    findMinPriceBook(books);
                    break;
            }

        }
    }
}