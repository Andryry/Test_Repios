package Other.Zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();


        Animal cat = new Cat("Barsic");
        Animal dog = new Dog("Pirat");
        Bird b = new Bird("Kesha");
        Lion lion = new Lion("Leon");
        zoo.add(cat);
        zoo.add(dog);
        zoo.add(b);
        zoo.add(lion);
        Collections.sort(zoo);
        Animal.performConcert(zoo);


    }
}
