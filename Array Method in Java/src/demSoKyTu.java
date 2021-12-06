import java.util.Scanner;

public class demSoKyTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("String: ");
        String str = input.nextLine();

        System.out.print("In char: ");
        char inChar = input.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == inChar) {
                count++;
            }
        }
        System.out.printf("So lan xuat hien cua ky tu %s trong chuoi %s la %d", inChar, str, count);
    }
}
