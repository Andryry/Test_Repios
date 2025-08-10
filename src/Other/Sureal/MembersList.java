package Other.Sureal;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MembersList {
    public static void main(String[] args) {
        Car c = new Car("White","Nissan");
        Emploee e1 = new Emploee("Egor", 23, 1000.234, "Exploring", c);
        Emploee e2 = new Emploee("Pitr", 30, 12300.23, "Chef", c);
        Emploee e3 = new Emploee("Olga", 27, 2123.201, "Secretary", c);
        List<Emploee> man = new ArrayList<>();
        man.add(e1);
        man.add(e2);
        man.add(e3);

        try (ObjectOutputStream members = new ObjectOutputStream(
                new FileOutputStream("Members2.dat"))) {
            members.writeObject(man);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
