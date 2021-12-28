package find_prime_number;

public class Main {
    public static void main(String[] args) {
        thuatToanKemHon toanKemHon = new thuatToanKemHon();
        thuatToanThongMinh toanThongMinh = new thuatToanThongMinh();
        Thread thread1 = new Thread(toanKemHon);
        Thread thread2 = new Thread(toanThongMinh);
        thread2.start();
        thread1.start();

    }
}
