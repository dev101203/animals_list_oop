package lesson19.level2;

import lesson19.level1.Animal;

public abstract class Cat extends Animal {
    protected String mood;

 /*   @Override
    public String sound() {
        return "Rrrrr";
    }*/

    public Cat(String name, double weight, String mood) {
        super(name, weight);
        this.mood = mood;
    }

    public Cat(){
        super();
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}
