import java.util.Scanner;

public class pushElements {
    public static void main(String[] args) {
        int number;
        boolean check = false;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to be checked : ");
        number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                check = true;
                System.out.println("Index of Element is : " + i);
            }
        }
        if (!check) {
            System.out.println("Not Found");
        }
        System.out.print("Enter index to push : ");
        int index = scanner.nextInt();
        System.out.print("Enter Elements : ");
        int Element = scanner.nextInt();
        for(int i = n; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = Element;

        System.out.println("Mảng sau khi thêm phần tử " + Element + " là : ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}

