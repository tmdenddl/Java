package Animals;

public class Pig extends AbstractAnimal {
    // Constructor
    public Pig(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("꿀꿀");
    }
}
