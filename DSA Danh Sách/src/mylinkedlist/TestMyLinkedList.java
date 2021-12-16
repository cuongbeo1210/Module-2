package mylinkedlist;


import java.util.Iterator;
import java.util.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(14);
        ll.addFirst(14);
        ll.addFirst(15);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,10);
        ll.printList();

    }
}
