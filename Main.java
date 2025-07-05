public class Main {
    public static void main(String[] args) {

        //POJO Example
        Book book1 = new Book();
        book1.setTitle("1984");
        book1.setAuthor("George Orwell");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());

        // Concrete Class Example
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 3);
        System.out.println("Sum: " + sum);
        int difference = calculator.subtract(10, 4);
        System.out.println("Difference: " + difference);
        int product = calculator.multiply(6, 7);
        System.out.println("Product: " + product);
        double quotient = calculator.divide(20, 4);
        System.out.println("Quotient: " + quotient);

        // Abstract Class Example
        Animal dog = new Dog();
        dog.makeSound(); // Outputs: Woof! Woof!
        dog.eat(); // Outputs: This animal is eating.

        //Static Nested Class Example
        Outer.StaticNested nestedClass = new Outer.StaticNested();
        nestedClass.display();

        // Non-Static Inner Class Example
        Outer outer = new Outer();
        Outer.Inner innerClass = outer.new Inner();
        innerClass.display();

        // Local Inner Class Example
        Outer localOuter = new Outer();
        localOuter.display();

        // Generic Class Example
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello, Generics!");
        System.out.println("String Box Value: " + stringBox.getValue());
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(123);
        System.out.println("Integer Box Value: " + integerBox.getValue());

        // Generic Pair Example
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println("Pair Key: " + pair.getKey() + ", Value: " + pair.getValue());

        // Enum Example
        Directions direction = Directions.NORTH;
        System.out.println("Direction: " + direction);

        OrderStatus orderStatus = OrderStatus.SHIPPED;
        System.out.println("Order Status: " + orderStatus);

        OrderStatus[] allStatuses = OrderStatus.values();
        System.out.println("All Order Statuses:");
        for (OrderStatus status : allStatuses) {
            System.out.println(status + " - " + status.ordinal());
        }

        // Singleton Example
        MySingleton singletonInstance = MySingleton.getInstance();
        MySingleton anotherInstance = MySingleton.getInstance();

        singletonInstance.doSomething();
        System.out.println("Are both instances the same? " + (singletonInstance == anotherInstance));

        // Immutable Class Example
        Student student = new Student("John Doe", 20);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Wrapper Class Example
        Integer wrappedInteger = Integer.valueOf(42);
        System.out.println("Wrapped Integer: " + wrappedInteger);
        Double wrappedDouble = Double.valueOf(3.14);
        System.out.println("Wrapped Double: " + wrappedDouble);

        //Interface Example
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        // Nested Interface Example
        IntefaceOuter.InnerInterface innerInterface = new InnerImpl();
        innerInterface.innerMethod();

        // Java 8 Interface with Default and Static Method Example
        MobileService mobileService = new Jio();
        mobileService.call();
        mobileService.checkBalance();
        MobileService.sendSMS();

        // Java 9 Interface with Private Method Example
        BankService bankService = new SBI();
        bankService.withdraw();
        BankService.deposit();

        // Lambda Expression Example
        MessagePrinter messagePrinter = (message) -> System.out.println("Message: " + message.toUpperCase());
        messagePrinter.printMessage("Hello, Lambda!");
    }
}

