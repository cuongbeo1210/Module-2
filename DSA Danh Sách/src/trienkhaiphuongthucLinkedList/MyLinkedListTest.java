package trienkhaiphuongthucLinkedList;


import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList("Đẹp trai");
        list.add(1, 12);
        list.add(2, 10);
        list.add(3, 19);
        list.add(4, 98);
        list.addFirst("Cuong");
        System.out.println("Check : indexOf");
        System.out.println(list.indexOf("Cuong"));
        System.out.println("--------------------");
        System.out.println("Check : Display List");
        list.printList();
        System.out.println("--------------------");
        System.out.println("Check : Quantity elements of List");
        list.size();
        System.out.println("--------------------");
        System.out.println("Check : Contain");
        System.out.println(list.contains(10));
        System.out.println("--------------------");
        System.out.println("Check : Get the element of a specified index within the list.");
        list.get(2);
        System.out.println("---------------------");
        System.out.println("Check : Remove element");
        list.remove(3);
        list.printList();
        System.out.println("-----------------------");
        System.out.println("Check : Add Last");
        list.addLast("Hello Kitty");
        list.printList();
    }

}
