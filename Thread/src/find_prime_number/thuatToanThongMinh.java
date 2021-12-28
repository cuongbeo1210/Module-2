package find_prime_number;

public class thuatToanThongMinh implements Runnable{
    @Override
    public void run() {
        boolean check = true;
        int N = 2;
        int count = 0;
        while (count < 100){
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(N +" tm");
                count++;
            }
            check = true;
            N++;
        }
    }
}
