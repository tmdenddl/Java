package CodeBox;

public class Seat {
    // Variables
    private String name = null;
    private boolean occupied = false;

    // Getter
    public String getName() {
        return name;
    }

    // Methods
    public void reserve(String name) {
        this.name = name;
        occupied = true;
    }

    public void cancel() {
        this.name = null;
        occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean match(String checkName) {
        return this.name == checkName;
    }
}
