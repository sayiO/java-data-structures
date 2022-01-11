import java.util.*;
public class WorkingWithStack {
    public static void main(String[]args){
        Stack st1 = new Stack();
        st1.push("onias");
        st1.push("sayi");
        st1.push(23);
        st1.push(65);
        st1.push("onias sayi");
        st1.push("sauka");
        st1.push("oniasbee");

        //st1.pop();
        //System.out.println(st1);
       // System.out.println(st1.peek());
        Iterator iterator = st1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
