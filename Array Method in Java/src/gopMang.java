import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int size1, size2;
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so phan tu trong mang array1: ");
        size1 = input.nextInt();

        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + " trong mang array1 : ");
            arr1[i] = input.nextInt();
        }

        System.out.print("Nhap so phan tu trong mang array2: ");
        size2 = input.nextInt();

        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + " trong mang array2 : ");
            arr2[i] = input.nextInt();
        }

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }

        System.out.print("new Array=" + Arrays.toString(arr3));
    }
}
