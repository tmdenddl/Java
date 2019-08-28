package Variables;

public class Person {
    // Class variable: All instances of this class have the same value of the class variable
    static int count;

    public Person() {
        count++;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();

        System.out.println(Person.count);
    }
}

