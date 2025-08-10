package Other;

public  class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println("Привет, меня зовут" + name + "мне" + age + "лет.");
    }

    public static void main(String[] args) {
        Human h = new Human("Piter", 12);
        h.sayHello();

    }
    void testCatchException(int a, int b) {
try {
    int c = a/b;
    System.out.println(c);
}
catch (java.lang.ArithmeticException e) {
    System.out.println("На 0 делить нельзя");
}
    }

}
