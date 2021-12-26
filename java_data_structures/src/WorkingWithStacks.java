import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args){
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(23);
        st1.push(34);
        st1.push(900);
        st1.push(45);
        st1.push(6);
        st1.push(89);
        System.out.println(st1.size());
        System.out.println(st1.search(67));



    }
}
