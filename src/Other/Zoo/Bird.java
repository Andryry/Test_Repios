package Other.Zoo;

public class Bird extends Animal {


    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Чирик");
    }
}
