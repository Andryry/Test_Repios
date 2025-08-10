package Test;

public class Driver {
    private String driverName; // имя водителя
    private Car car; // машина водителя

    public Driver(String driverName, Car car) {
        this.driverName = driverName;
        this.car = car;
    }

    // constructor

    public void driveByCar() {
        Float f = car.getFuelQuantity();
if (f<=10&& f>0){
    System.out.println("Ох, доехать бы до заправки");
    car.drive(this);
}
else if  (f==0){
    System.out.println("Сегодня я никуда не поеду");
}
else if (f>10){
    System.out.println("Вроде права не забыл, ну поехали");
    car.drive(this);
}
    }



    public String getDriverName() {
        return driverName;
    }


// getters/setters

}
