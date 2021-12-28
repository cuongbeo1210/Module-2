package find_prime_number;

public class thuatToanKemHon implements Runnable{

    @Override
    public void run() {
        boolean check = true;
        int N = 2;
        int count = 0;
        while (count < 100){
            for (int k = 2; k < N; k++) {
                if (N % k == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(N);
                count++;
            }
            check = true;
            N++;
        }
    }
}
