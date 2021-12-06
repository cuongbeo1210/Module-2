import java.util.Scanner;

public class MinTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int size = input.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Phan tu thu %d trong mang: ", i + 1);
            array[i] = input.nextInt();
        }

        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        System.out.printf("Gia tri nho nhat trong mang Array[%d]= " + min, index);
    }
}
