package VehicleTask;

public class Motorcycle extends Vehicle {
    public boolean isNew;

    @Override
    public void displayInfo() {
        String status = isNew ? "Новый" : "С пробегом";
        System.out.println("Производитель машины: " + make + " | Модель: "
                + model + " | Год: " + year + " | Состояние: " + status);
    }
}
