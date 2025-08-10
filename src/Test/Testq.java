package Test;

@FunctionalInterface
public interface Testq {
    void say(String a);

    default void sayHell() {
        System.out.println("Hello");

    }
}

class Loh implements Testq {


    static void hel() {
        System.out.println("H");
    }


    public void say(String a) {
        System.out.println("Hello");
    }

    @Override
    public void sayHell() {
        Testq.super.sayHell();
    }

    static void lala() {
        System.out.println("lal");
    }

    public static void main(String[] args) {
        Loh loh = new Loh();
        Testq testq = loh::say;
    }
}


