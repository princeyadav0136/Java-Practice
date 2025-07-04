public class Main {
    public static void main(String[] args) {
        System.out.println("✅ JDK, JRE, JVM are working perfectly!");
        BankAccount account = new BankAccount();
        account.setAccountNumber(123456);
        account.setBalance(1000);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        Shape circle = new Circle(5.0);
        circle.displayShapeType();
        System.out.println("Area of Circle: " + circle.area());

        Car myCar = new Car();
        myCar.start();
        myCar.drive();
        myCar.stop();

        Calculator calc = new Calculator();
        System.out.println("Sum (int, int): " + calc.add(2, 3)); // Method Overloading
        System.out.println("Sum (double, double): " + calc.add(2.5, 4.2)); // Method Overloading
        System.out.println("Sum (int, int, int): " + calc.add(1, 2, 3)); // Method Overloading

        Animal a = new Dog();  // Upcasting
        a.makeSound(); 

        System.out.println(MathUtil.square(5));  // Static method call

        Greeter greeter = new Greeter();
        greeter.greet("Prince"); // Non static method call

        System.out.println("Subtract " + calc.subtract(10, 5)); // User-defined method call
    }
}

