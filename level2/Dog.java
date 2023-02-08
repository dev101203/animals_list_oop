package lesson19.level2;

import lesson19.level1.Animal;

public abstract class Dog extends Animal {
    public abstract String smell();

    protected int energyLevel;

    public Dog(String name, double weight, int energyLevel) {
        super(name, weight);
        this.energyLevel = energyLevel;
    }

    public Dog() {
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
