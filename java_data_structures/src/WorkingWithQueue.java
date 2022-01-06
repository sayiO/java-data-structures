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

    static final class Person {
        private final String name;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String name() {
            return name;
        }

        public int age() {
            return age;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            Person that = (Person) obj;
            return Objects.equals(this.name, that.name) &&
                    this.age == that.age;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Person[" +
                    "name=" + name + ", " +
                    "age=" + age + ']';
        }
    }
}

