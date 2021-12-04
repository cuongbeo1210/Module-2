public class soNgToNhoHon100 {
    public static void main(String[] args) {
        int number = 2;
        int stt = 1;
        while (number < 100){
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    stt = 0;
                    break;
                }
            }
            if (stt != 0) {
                System.out.println(number);

            }
            stt = 1;
            number++;
        }
    }
}
