package Other.Sureal;

import java.io.Serializable;

public class Emploee implements Serializable {
    String name;
    int age;
    String department;
    double salry;
    Car car;

    public Emploee(String name, int age, double salry, String department, Car car) {
        this.name = name;
        this.age = age;
        this.salry = salry;
        this.department = department;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salry=" + salry +
                ", car=" + car +
                '}';
    }
}
