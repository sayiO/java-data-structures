import java.util.*;
public class WorkingWithDeque {
    public static void main(String[] args) {
        //declare a deque.

        Deque<String> deque1 = new ArrayDeque<>();
        // a deque is an abbreviation for double ended queue, which basically
        // can act in queue mode and stack mode
        //this means a deque we can use it a standard queue where insertion is at the tail and removal is at the head
        //we can also use as stack where insertion and deletion happen at the same position which is the head

        //adding values to a deque

        deque1.addFirst("Java");
        deque1.addFirst("Python");
        deque1.addFirst("C#");
        deque1.addFirst("JavaScript");
        deque1.addLast("Go");
        deque1.addFirst("Go");
        System.out.println(deque1);


    }
}
