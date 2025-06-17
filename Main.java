public class Main {
    public static void main(String[] args) {
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
    }
}

