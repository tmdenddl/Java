package Animals;

public class Dog extends AbstractAnimal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("왈왈");
    }
}
