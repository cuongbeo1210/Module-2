package create_simple_thread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator();
        NumberGenerator ng1 = new NumberGenerator();
        Thread thread = new Thread(ng);
        Thread thread1 = new Thread(ng1);
        thread.start();
        thread1.start();
        int max = Thread.MAX_PRIORITY;
        int min = Thread.MIN_PRIORITY;
        thread.setPriority(max);
        thread1.setPriority(min);
    }
}
