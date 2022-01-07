import java.util.*;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
         set1.add("Onias");
         set1.add("788");
         set1.add("20");
         set1.add("Single");
         set1.add("45");
        System.out.println(set1);
        //set1.clear();
        System.out.println(set1.isEmpty());
        boolean contains = set1.contains("");
        boolean contains2 = set1.contains("Onias");
        //System.out.println(contains);
        //System.out.println(contains2);

        boolean removed1 = set1.remove("45");
        boolean removed2 = set1.remove("sinikiwe");
        //System.out.println(removed1);
        //System.out.println(removed2);
        System.out.println(set1);
//converting a set to a list
        List<String> list = new ArrayList<>();
        list.addAll(set1);
        System.out.println(list);

    }
}
