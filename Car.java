public class Car extends Vehicle {
    int wheels = 4;

    public void drive() {
        System.out.println("Car is driving with " + wheels + " wheels at speed " + speed + " km/h.");
    }
}