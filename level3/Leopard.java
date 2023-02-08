package lesson19.level3;

import lesson19.level2.Cat;

public class Leopard extends Cat {
    private int numberOfSpots;

    public Leopard(String name, double weight, String mood, int numberOfSpots) {
        super(name, weight, mood);
        this.numberOfSpots = numberOfSpots;
    }

    public Leopard() {
        super();
    }

    @Override
    public String sound() {
        return "Arrr";
    }

    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }

    @Override
    public String toString() {
        return "Leopard{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", mood='" + mood + '\'' +
                ", numberOfSpots=" + numberOfSpots +
                '}';
    }
}
