package Other.Sureal;

import java.io.Serializable;

public class Car implements Serializable {
    String color;
    String mark;

    public Car(String color, String mark) {
        this.color = color;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
