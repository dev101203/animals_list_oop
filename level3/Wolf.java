package lesson19.level3;

import lesson19.level2.Dog;

public class Wolf extends Dog {
    private String packLeaderName;

    public Wolf(String name, double weight, int energyLevel, String packLeaderName) {
        super(name, weight, energyLevel);
        this.packLeaderName = packLeaderName;
    }

    public String getPackLeaderName() {
        return packLeaderName;
    }

    public void setPackLeaderName(String packLeaderName) {
        this.packLeaderName = packLeaderName;
    }

    @Override
    public String sound() {
        return "Auuu";
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", energyLevel=" + energyLevel +
                ", packLeaderName='" + packLeaderName + '\'' +
                '}';
    }

    @Override
    public String smell() {
        return null;
    }
}
