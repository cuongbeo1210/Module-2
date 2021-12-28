package racing_boys;

public class Main {
    public static int DISTANCE = 100;

    public static int STEP = 2;

    public static void main(String[] args) {
        Car BMW = new Car("A");
        Car Audi = new Car("B");
        Car Mercedes = new Car("C");

        Thread thread1 = new Thread(BMW);
        Thread thread2 = new Thread(Audi);
        Thread thread3 = new Thread(Mercedes);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
