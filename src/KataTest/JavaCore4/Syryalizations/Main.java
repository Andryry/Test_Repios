package KataTest.JavaCore4.Syryalizations;

import java.io.*;
import java.util.Objects;

public class Main {
}
class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}
class AnimalDeserializer  {
    public static Animal[] deserializeAnimalArray(byte[] data) {

        try (ByteArrayInputStream byteStream = new ByteArrayInputStream(data);
             ObjectInputStream objectStream = new ObjectInputStream(byteStream)) {


            int size = objectStream.readInt();

            Animal[] animals = new Animal[size];


            for (int i = 0; i < size; i++) {
                Object obj = objectStream.readObject();
                if (!(obj instanceof Animal)) {
                    throw new IllegalArgumentException("Expected Animal object but found " + obj.getClass());
                }
                animals[i] = (Animal) obj;
            }

            return animals;

        } catch (IOException | ClassNotFoundException | NegativeArraySizeException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}