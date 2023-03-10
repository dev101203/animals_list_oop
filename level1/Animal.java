package lesson19.level1;

public abstract class Animal {
    public abstract String sound();

    protected String name;

    protected double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }

    /* public Animal() {
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
