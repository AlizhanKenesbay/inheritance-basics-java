package VehicleTask;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.make = "BMW";
        car.model = "X8";
        car.year = 2020;
        car.numDoors = 4;

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.make = "Suzuki";
        motorcycle.model = "GSX-R750";
        motorcycle.year = 2001;
        motorcycle.isNew = true;

        car.displayInfo();
        motorcycle.displayInfo();
    }
}
