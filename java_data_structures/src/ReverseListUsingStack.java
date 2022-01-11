import java.util.*;
public class ReverseListUsingStack {
    public static void main(String[] args) {
        List list = new ArrayList();
        Stack stack = new Stack();

        list.add(89);
        list.add(34);
        list.add(15);
        list.add(7);
        System.out.println(list);

        while(list.size() >0){
            stack.push(list.remove(0));
        }
        System.out.println(stack);

        while(stack.size() >0){
            list.add(stack.pop());
        }
        System.out.println("here is the reversed list");
        System.out.println(list);

    }
}
