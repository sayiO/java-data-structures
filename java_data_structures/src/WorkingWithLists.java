import java.util.*;

public class WorkingWithLists {
    public static void main(String[] args) {
        List <String>gfs = new ArrayList<>();
        gfs.add("Yeukai");
        gfs.add("Tomaidah");
        gfs.add("Simbie");
        gfs.add("Audrey");
        gfs.add("Lorraine");
        gfs.add("Lisah");
        gfs.add("Notando");

//list interface object methods...
        System.out.println(gfs.contains("Patie"));
        System.out.println(gfs.contains("Simbisanai"));
        System.out.println(gfs.get(0));
        System.out.println("The list size is " + gfs.size());
        //gfs.remove(2);
        //gfs.add(new Integer(2022));

//iterate list using a new for loop

/*
for(Object i: gfs){
    System.out.println(i);
}

*/
//iterate list using the iterator(the old way).
Iterator iterator = gfs.iterator();
while(iterator.hasNext()){
    Object next = iterator.next();
    System.out.println(next);
}


    }
}
