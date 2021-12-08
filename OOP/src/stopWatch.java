import java.time.LocalTime;

public class stopWatch {
    private LocalTime startTime, endTime;

    public stopWatch() {
        startTime = LocalTime.now();
    }

    public stopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }

    public double getElapsedTime() {
        return (endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()) * 1000;
    }

    public static int[] selectionSort(int... a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        LocalTime start = LocalTime.now();
        selectionSort(array);
        LocalTime end = LocalTime.now();
        stopWatch sw = new stopWatch(start, end);
        System.out.println("Time: " + sw.getElapsedTime());
        for (int x : array) {
            System.out.println(x);
        }
    }
}
