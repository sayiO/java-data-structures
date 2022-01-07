import java.util.*;

public class WorkingWithMAp {
    public static void main(String[] args) {
//creating and populating a map
        Map <Integer, String> stringMap = new HashMap<>();
//populating a map
        stringMap.put(1, "SayiBee");
        stringMap.put(2, "Onias");
        stringMap.put(3, "sauka");
        stringMap.put(4, "sauka");
        stringMap.put(5, "Deya");
        stringMap.put(1, "replacer");
        System.out.println(stringMap);
        //get map size
        System.out.println(stringMap.size());
        //two ways to check if map is empty or not

        boolean isempty = stringMap.size() ==0;
        boolean isempty2 = stringMap.isEmpty();
        System.out.println(isempty);
        System.out.println(isempty2);

        //check if map contains a key or value
        System.out.println(stringMap.containsKey("234"));
        System.out.println(stringMap.containsValue("replacer"));

        stringMap.remove(2);
        System.out.println(stringMap);

        //iterating the map values

        //using the standard iterator
        System.out.println("USING STANDARD ITERATOR");
        Iterator<Integer> keyIterator = stringMap.keySet().iterator();
        while(keyIterator.hasNext()){
            Integer nextKey = keyIterator.next();
            System.out.print(nextKey + ":");
            System.out.println(stringMap.get(nextKey));

        }
        //using a for each loop
        System.out.println("USING FOREACH LOOP");

        for(Integer key: stringMap.keySet()){
            System.out.print(key + ":");
            System.out.println(stringMap.get(key));
        }






    }
}
