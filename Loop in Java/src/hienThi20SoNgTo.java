public class hienThi20SoNgTo {
    public static void main(String[] args) {
        int number = 2;
        int stt = 1;
        for (int i = 1; i <= 20; ) {
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    stt = 0;
                    break;
                }
            }
            if (stt != 0) {
                System.out.println(number);
                i++;
            }
            stt = 1;
            number++;
        }
    }
}
