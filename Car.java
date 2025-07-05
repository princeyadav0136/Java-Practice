public class Car implements Vehicle {
    
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
    
    public void drive() {
        System.out.println("Car is driving.");
    }
}
