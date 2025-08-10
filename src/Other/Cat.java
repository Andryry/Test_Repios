package Other;

import java.util.Objects;

public class Cat {
    String name;
    int age;
    Color color;

    public Cat(String name, int age, Color color) {
        if (age >= 0 && age <= 150) {
            this.name = name;
            this.age = age;
            this.color = color;
        } else {
            throw new RuntimeException("Неправильный возраст");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Cat cat = (Cat) o;
        return this.age == cat.age && Objects.equals(this.color, cat.color);
    }

    @Override
    public String toString() {
        return "Cat [" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", color = '" + color + '\'' +
                ']';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    enum Color {
        GREEN, BLACK, BROVN, WHITE, YELLOW;

    }


    public static void main(String[] args) {
        Cat c1 = new Cat("Barsik", 123, Color.GREEN);
        Cat c2 = new Cat("Vasya", 123, Color.GREEN);

        System.out.println(c1.equals(c2));
    }
}


