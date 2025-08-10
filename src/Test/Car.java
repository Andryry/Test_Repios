package Test;

public class Car {
        private String modelName; // марка машины
        private Float fuelQuantity; // количество топлива
        private Driver driver = null; // сидит ли кто в машине

    public Car(String modelName, Float fuelQuantity) {
        this.modelName = modelName;
        this.fuelQuantity = fuelQuantity;
    }
    public Float getFuelQuantity() {
        return fuelQuantity;
    }

    public Driver getDriver() {
        return driver;
    }

    public void drive(Driver driver) {
        System.out.printf("Ну что %s, %s отвезет тебя куда угодно %n", driver.getDriverName() , modelName);
        this.driver = driver;
    }

}
