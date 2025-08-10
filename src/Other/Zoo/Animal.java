package Other.Zoo;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Animal implements Comparable <Animal> {
    private String name;

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.print(name + " издает звук: ");
    }

    public String getName() {
        return name;
    }
    public static void performConcert (ArrayList <Animal> al) {
        for (Animal a : al){
            a.makeSound();
        }
    }




}
