import java.util.Scanner;

public class demSoLuongSinhVien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so sinh vien : ");
        int size = input.nextInt();
        double[] array = new double[size];
        int i = 0;
        do {
            System.out.printf("Diem sinh vien thu %d : ", i + 1);
            double number = input.nextDouble();
            if (number >= 0 & number <= 10) {
                array[i] = number;
                i++;
            }
        } while (i < size);

        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= 5) {
                count++;
            }
        }
        System.out.printf("So luong hoc sinh thi do : %d", count);
    }
}
