package display_odd_even;

public class TestThread {
    public static void main(String[] args) {
        EvenThread et = new EvenThread();
        OddThread ot = new OddThread();
        Thread thread1 = new Thread(et);
        Thread thread2 = new Thread(ot);
        thread1.start();
        thread2.start();
    }
}
