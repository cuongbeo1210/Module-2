package trienkhaiphuongthucArray;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(12);
        list.add(10);
        list.add(19);
        list.add(98);

        print(list.getData());
        System.out.println(list.indexOf(12));
        System.out.println(list.indexOf(19));
        list.remove(1);
        list.add(21,1);
        print(list.getData());
        MyList<Integer> clone = list.clone();
        System.out.println(clone.contains(12));
        System.out.println(clone.contains(10));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }
    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println(x);
            }
        }
        System.out.println("\n");
    }
}
