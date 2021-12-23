import java.util.*;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> girlFriends = new ArrayList<>();
        girlFriends.add("Simbisanai");
        girlFriends.add("Vongai");
        girlFriends.add("Lisah");
        girlFriends.add("Yeukai");
        girlFriends.add("Audrey");
        System.out.println(girlFriends.size());

        for(String gfs: girlFriends){
            System.out.println(gfs);
        }

    }
}
