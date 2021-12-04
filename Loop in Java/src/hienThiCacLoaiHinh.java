import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1 :
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <= 6; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2 :
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3 :
                    for (int i = 7; i >= 1 ; i--) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4 :
                    System.exit(0);
            }
        }
    }
}
