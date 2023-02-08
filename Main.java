package animalsgroup

import animalsgroup.level2.Dog;
import animalsgroup.level1.Animal;
import animalsgroup.level3.HouseCat;
import animalsgroup.level3.Leopard;
import animalsgroup.level3.Wolf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new DomesticDog("Bobik", 5, 30, "Alabay");
        animals[1] = new Wolf("Bob", 12, 45, "Bob");
        animals[2] = new HouseCat("Murka", 12, "Agressive", "Scotish");
        animals[3] = new Leopard("Jafar", 20, "Mad", 24);

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getClass() + " " + animals[i].sound());
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof DomesticDog) {
                System.out.println(DomesticDog.class);
                System.out.println(animals[i].getName());
                System.out.println(animals[i].getWeight());
                System.out.println(((DomesticDog)animals[i]).getEnergyLevel());
                System.out.println(((DomesticDog)animals[i]).getType());
            } else if (animals[i] instanceof Wolf) {
                System.out.println(Wolf.class);
                System.out.println(animals[i].getName());
                System.out.println(animals[i].getWeight());
                System.out.println(((Wolf)animals[i]).getEnergyLevel());
                System.out.println(((Wolf)animals[i]).getPackLeaderName());
            } else if (animals[i] instanceof HouseCat) {
                System.out.println(HouseCat.class);
                System.out.println(animals[i].getName());
                System.out.println(animals[i].getWeight());
                System.out.println(((HouseCat)animals[i]).getMood());
                System.out.println(((HouseCat)animals[i]).getType());
            } else if (animals[i] instanceof Leopard) {
                System.out.println(Leopard.class);
                System.out.println(animals[i].getName());
                System.out.println(animals[i].getWeight());
                System.out.println(((Leopard)animals[i]).getMood());
                System.out.println(((Leopard)animals[i]).getNumberOfSpots());
            }
        }

        /*System.out.println(Arrays.toString(animals));
        System.out.println(((DomesticDog)animals[0]).getType());
        System.out.println(((Wolf)animals[1]).getPackLeaderName());
        System.out.println(((HouseCat)animals[2]).getType());
        System.out.println(((Leopard)animals[3]).getNumberOfSpots());*/
    }
}
