package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    protected String name;
    protected int weight;
    protected String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String status() {
        return getName() + ", weight: " + getWeight() + ", color: " + getColor() +
                ", short term memory loss: " + hasMemoryLoss();
    }

    public abstract void feed();

    public abstract boolean hasMemoryLoss();
}

