import java.util. *;
public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> shop = new LinkedList<>();
        shop.add(new Person("Onias Sayi", 34));
        shop.add(new Person("Simbisanai", 30));
        shop.add(new Person("Tinez", 45));
        shop.add(new Person("Sauka", 89));
        System.out.println(shop.size());
        System.out.println(shop.peek());

    }
    static record Person(String name, int age){}
}

