package Animals;

public class Cat extends AbstractAnimal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("야옹");
    }
}
