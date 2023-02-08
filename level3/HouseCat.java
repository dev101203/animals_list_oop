package lesson19.level3;

import lesson19.level2.Cat;

public class HouseCat extends Cat {
    private String type;

    @Override
    public String sound() {
        return "Miau";
    }

    public HouseCat(String name, double weight, String mood, String type) {
        super(name, weight, mood);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "HouseCat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", mood='" + mood + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public HouseCat() {
        super();
    }


}
