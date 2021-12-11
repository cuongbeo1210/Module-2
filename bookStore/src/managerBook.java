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
        for (int i = 0; i < 1; i++) {
            books.add(createBook(scanner));
        }
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
    public static void findBook(Scanner scanner, ArrayList<scienceBook> scienceBooks){
        boolean check = false;
        System.out.print("Nhập thể loại sách muốn tìm : ");
        String typeBook = scanner.nextLine();
        for (scienceBook scienceBook : scienceBooks) {
            if (scienceBook.getType().equals(typeBook)) {
                check = true;
                System.out.println(scienceBook);
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy thể loại sách này");
        }
    }
    public static novelBook createNovel (Scanner scanner, ArrayList<Book> books){
        scanner.nextLine();
        System.out.print("Enter Name's Novel : ");
        String name = scanner.nextLine();
        System.out.print("Enter Author : ");
        String author = scanner.nextLine();
        System.out.print("Enter Quantity : ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Price : ");
        double price = scanner.nextDouble();
        System.out.println("Enter Publication Date (YY/MM/DD) : ");
        LocalDate nsx = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        return new novelBook(name, quantity, price, nsx, author);
    }
    public static void findNovel(Scanner scanner, ArrayList<novelBook> novelBooks){
        scanner.nextLine();
        boolean check = false;
        System.out.print("Nhập tên tác giả : ");
        String author = scanner.nextLine();
        for (novelBook novelBook: novelBooks) {
            if (novelBook.getAuthor().equals(author)){
                check = true;
                System.out.println(novelBook);
                break;
            }
        }
        if (!check) System.out.println("Không tìm thấy sách nào của tác giả này");
    }
    public static double averagePriceScienceBook(ArrayList<scienceBook> scienceBooks){
        double averagePrice = 0;
        for (scienceBook scienceBook : scienceBooks){
            averagePrice += scienceBook.getPrice();
        }
        return averagePrice/scienceBooks.size();
    }
    public static void findAllBooksOfAuthor(Scanner scanner,ArrayList<novelBook> novelBooks){
        ArrayList<novelBook> novelBooks1 = new ArrayList<>();
        boolean check = false;
        scanner.nextLine();
        System.out.print("Nhập tên tác giả muốn tìm : ");
        String str = scanner.nextLine();
        for (novelBook novelBook: novelBooks) {
            if(novelBook.getAuthor().equals(str)){
                novelBooks1.add(novelBook);
                check = true;
            }
        }
        if (!check) System.out.println("Không có sách nào của tác giả này");
        System.out.println(novelBooks1);
    }
    public static void findAboutBookPrice(Scanner scanner, ArrayList<Book> books){
        double temp;
        boolean check = false;
        System.out.println("Nhập khoảng giá sách muốn tìm kiếm : ");
        System.out.print("Từ : ");
        double price = scanner.nextDouble();
        System.out.print("Đến : ");
        double price1 = scanner.nextDouble();
        if(price > price1){
            temp = price;
            price = price1;
            price1 = temp;
        }
        for (Book book : books) {
            if(book.getPrice() >= price && book.getPrice() <= price1){
                System.out.println(book);
                check = true;
            }
        }
        if (!check) System.out.println("Không có sách nào trong khoảng này");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<scienceBook> scienceBooks = new ArrayList<>();
        ArrayList<novelBook> novelBooks = new ArrayList<>();
//        enterBooks(scanner, books);
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Nhập sách");
            System.out.println("2. Tìm kiếm sách");
            System.out.println("3. Hiển thị");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Nhập sách khoa học");
                    System.out.println("2. Nhập sách bình thường");
                    System.out.println("3. Nhập sách tiểu thuyết");
                    System.out.print("Nhập lựa chọn của bạn : ");
                    int choice1 = input.nextInt();
                    switch (choice1) {
                        case 1:
                            Book book = new scienceBook();
                            book = enterScienceBook(scanner, books);
                            books.add(book);
                            scienceBook SB = (scienceBook) book;
                            scienceBooks.add(SB);
//                    System.out.println(books);
                            break;
                        case 2:
                            enterBooks(scanner, books);
                            break;
                        case 3:
                            Book book1 = new novelBook();
                            book1 = createNovel(scanner, books);
                            books.add(book1);
                            novelBook NB = (novelBook) book1;
                            novelBooks.add(NB);
                            break;

                    }
                    break;
                case 2:
                    System.out.println("1. Tìm sách theo thể loại");
                    System.out.println("2. Tìm sách theo tên tác giả");
                    System.out.println("3. Tìm tất cả sách của tác giả");
                    System.out.println("4. Tìm sách trong khoảng giá");
                    System.out.print("Nhập lựa chọn của bạn : ");
                    int choice2 = input.nextInt();
                    switch (choice2) {
                        case 1:
                            findBook(scanner, scienceBooks);
                            break;
                        case 2:
                            findNovel(scanner, novelBooks);
                            break;
                        case 3:
                            findAllBooksOfAuthor(scanner, novelBooks);
                            break;
                        case 4:
                            findAboutBookPrice(scanner, books);
                            break;
                    }
                    break;

                case 3:
                    System.out.println("1. Hiển thị kho sách");
                    System.out.println("2. Hiển thị quyển sách đắt nhất");
                    System.out.println("3. Hiển thị quyển sách rẻ nhất");
                    System.out.println("4. Hiển thị đơn giá trung bình sách Khoa Học");
                    System.out.println("5. Hiển thị tất cả sách Khoa Học");
                    System.out.println("6. Hiển thị tất cả sách Tiểu Thuyết");
                    System.out.print("Nhập lựa chọn của bạn : ");
                    int choice3 = input.nextInt();
                    switch (choice3) {
                        case 1:
                            display(books);
                            break;
                        case 2:
                            findMaxPriceBook(books);
                            break;
                        case 3:
                            findMinPriceBook(books);
                            break;
                        case 4:
                            System.out.println("Đơn giá trung bình sách khoa học là : "+(averagePriceScienceBook(scienceBooks)));;
                            break;
                        case 5:
                            System.out.println(scienceBooks);
                            break;
                        case 6:
                            System.out.println(novelBooks);
                            break;
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}