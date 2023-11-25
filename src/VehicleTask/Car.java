package VehicleTask;

public class Car extends Vehicle {
    public int numDoors;

    @Override
    public void displayInfo() {
        System.out.println("Производитель машины: " + make + " | Модель: "
                + model + " | Год: " + year + " | Колличество дверей: " + numDoors);
    }
}
