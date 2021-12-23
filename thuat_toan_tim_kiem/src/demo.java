import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        themKeo(numbers,10);
        themKeo(numbers1, 9);


    }
    public static void themKeo(ArrayList<Integer> numbers, int number){
        numbers.add(number);
        System.out.println(numbers);
    }

}
