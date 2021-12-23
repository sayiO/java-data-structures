import java.util.*;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> girlFriends = new ArrayList<>();
        girlFriends.add("Simbisanai");
        girlFriends.add("Vongai");
        girlFriends.add("Lisah");
        girlFriends.add("Yeukai");
        girlFriends.add("Audrey");
        System.out.println(girlFriends.contains("Patie"));
        System.out.println(girlFriends.contains("Tomaidah"));
        System.out.println(girlFriends.contains("Simbisanai"));

        for(String gfs: girlFriends){
            System.out.println(gfs);
        }

    }
}
