import java.util.*;
public class WorkingWithDeque {
    public static void main(String[] args) {
        //declare a deque.

        Deque<String> deque1 = new ArrayDeque<>();
        // a deque is an abbreviation for double ended queue, which basically
        // can act in queue mode and stack mode
        //this means a deque we can use it as a standard queue where insertion is at the tail and removal is at the head
        //we can also use as stack where insertion and deletion happen at the same position which is the head

        //adding values to a deque

        deque1.addFirst("Java");
        deque1.addFirst("Python");
        deque1.addFirst("C#");
        deque1.addFirst("JavaScript");
        deque1.addLast("Go");
        System.out.println(deque1);
        System.out.println(deque1.peekFirst());
        deque1.removeFirst();
        System.out.println(deque1);



        /*System.out.println(deque1.peek());
        System.out.println(deque1.peekFirst());
        System.out.println(deque1.peekLast());
       */
        System.out.println(deque1.pop());
        System.out.println(deque1);

        //iterating the collection using iterator

        Iterator<String> dequeValue = deque1.iterator();
        while(dequeValue.hasNext()){
            System.out.println(dequeValue.next());

        }

        for(String element:deque1){
            System.out.println("fav programming language is " + element);

        }
        deque1.stream().forEach((element)->{
            System.out.println("i am using a stream for " + element);
        });


    }
}
