package Other.Sureal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Boss implements Serializable {
    public static void main(String[] args) {

        Emploee e1;
        try (ObjectInputStream members = new ObjectInputStream(new FileInputStream("Members2.dat"))) {
            // Чтение списка сотрудников
            List<Emploee> employees = (List<Emploee>) members.readObject();

            // Вывод информации о сотрудниках
            System.out.println("Получен список сотрудников:");
            for (Emploee emp : employees) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}