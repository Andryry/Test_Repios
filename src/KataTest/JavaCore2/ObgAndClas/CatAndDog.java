package KataTest.JavaCore2.ObgAndClas;

public class CatAndDog {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.catchCat(c);
    }
}

class Cat {
    void sayHello() {
        System.out.println("Мяу!");
    }
}

class Dog {
    void sayHello() {
        System.out.println("Гав!");
    }

    void catchCat(Cat cat) {
        System.out.println("Кошка поймана");
        this.sayHello();
        cat.sayHello();
    }

}
