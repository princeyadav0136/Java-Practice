public abstract class Animal {
    
    // Abstract method to be implemented by subclasses
    public abstract void makeSound();

    // Concrete method that can be used by subclasses
    public void eat() {
        System.out.println("This animal is eating.");
    }
}
