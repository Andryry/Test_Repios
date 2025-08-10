package KataTest.JavaCore2.Exeption.Car;

public class Car implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Машина закрывается...");
    }

    public void drive() {
        System.out.println("Машина поехала");
    }

    public static void main(String[] args) {
        try (Car c = new Car ()) {
            c.drive();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
