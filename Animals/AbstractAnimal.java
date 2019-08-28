package Animals;

public abstract class AbstractAnimal {
    // Variable
    public final String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public abstract void cry();
}
