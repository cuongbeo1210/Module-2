import java.util.Scanner;

public class deleteElemInArray {
    public static void main(String[] args) {
        int number, count = 0;
        boolean check = false;
        int[] array = {1, 2, 3, 3, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to be checked : ");
        number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                check = true;
                count += 1;
                System.out.println("Index of Element is : " + i);
            }
        }   for (int j = 0, i = 0; i < array.length; i++) {
            if (array[i] != number) {
                array[j] = array[i];
                j++;
            }
        }
        if (!check) {
            System.out.println("Not found");
        }
        for (int i = 0; i < count; i++) {
            for (int j = array.length - count; j < array.length; j++) {
                array[j] = 0;
            }
        }
        System.out.println("Mảng còn lại sau khi xóa phần tử " +number + " là: ");
        for (int X : array) {
            System.out.printf("%d \t", X);
        }
    }
}
