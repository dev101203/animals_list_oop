package lesson19.level3;

import lesson19.level2.Dog;

public class DomesticDog extends Dog {
    private String type;

    public DomesticDog(String name, double weight, int energyLevel, String type) {
        super(name, weight, energyLevel);
        this.type = type;
    }

    public DomesticDog() {
    }

    @Override
    public String smell() {
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String sound() {
        return "Bark";
    }

    @Override
    public String toString() {
        return "DomesticDog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", energyLevel=" + energyLevel +
                ", type='" + type + '\'' +
                '}';
    }
}
