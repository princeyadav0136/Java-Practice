import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    static void checkPin(int pin) throws InvalidPinExceptions {
        if (pin != 1234) {
            throw new InvalidPinExceptions("Invalid PIN entered.");
        } else {
            System.out.println("PIN is valid.");
        }
    }
        
    public static void main(String[] args) {

        //POJO Example
        // Book book1 = new Book();
        // book1.setTitle("1984");
        // book1.setAuthor("George Orwell");
        // System.out.println("Title: " + book1.getTitle());
        // System.out.println("Author: " + book1.getAuthor());

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

        // Custom Annotation Example
        Class<Book> obj = Book.class;

        if (obj.isAnnotationPresent(Info.class)) {
            Info info = obj.getAnnotation(Info.class);
            System.out.println("Author: " + info.author());
            System.out.println("Version: " + info.version());
        }

        try{
            int result = 10 / 0; // This will throw an ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of an exception.");
        }

        try {
            checkPin(1235);
        }
        catch (InvalidPinExceptions e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Operators in Java
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (5 + 3));
        System.out.println("Subtraction: " + (5 - 3));
        System.out.println("Multiplication: " + (5 * 3));
        System.out.println("Division: " + (5 / 3));
        System.out.println("Modulus: " + (5 % 3));
        
        System.out.println("Relational Operators:");
        System.out.println("Equal to: " + (5 == 3));
        System.out.println("Not equal to: " + (5 != 3));
        System.out.println("Greater than: " + (5 > 3));
        System.out.println("Less than: " + (5 < 3));
        System.out.println("Greater than or equal to: " + (5 >= 3));
        System.out.println("Less than or equal to: " + (5 <= 3));

        System.out.println("Logical Operators:");
        System.out.println("AND: " + (true && false));
        System.out.println("OR: " + (true || false));
        System.out.println("NOT: " + !true);

        System.out.println("Bitwise Operators:");
        System.out.println("Bitwise AND: " + (5 & 3));
        System.out.println("Bitwise OR: " + (5 | 3));
        System.out.println("Bitwise XOR: " + (5 ^ 3));
        System.out.println("Bitwise Complement: " + (~5));
        System.out.println("Left Shift: " + (5 << 1));
        System.out.println("Right Shift: " + (5 >> 1));

        System.out.println("Assignment Operators:");
        int a = 5;
        System.out.println("Initial value of a: " + a);
        a += 3; // a = a + 3
        System.out.println("After += 3, a: " + a);
        a -= 2; // a = a - 2
        System.out.println("After -= 2, a: " + a);
        a *= 2; // a = a * 2
        System.out.println("After *= 2, a: " + a);
        a /= 4; // a = a / 4
        System.out.println("After /= 4, a: " + a);
        a %= 3; // a = a % 3
        System.out.println("After %= 3, a: " + a);
        
        System.out.println("Unary Operators:");
        int b = 5;
        System.out.println("Initial value of b: " + b);
        System.out.println("Post-increment: " + (b++));
        System.out.println("After post-increment, b: " + b);
        System.out.println("Pre-increment: " + (++b));
        System.out.println("After pre-increment, b: " + b);
        System.out.println("Post-decrement: " + (b--));
        System.out.println("After post-decrement, b: " + b);
        System.out.println("Pre-decrement: " + (--b));
        System.out.println("After pre-decrement, b: " + b);
        System.out.println("Unary plus: " + (+b));
        System.out.println("Unary minus: " + (-b));

        System.out.println("Ternary Operator:");
        int x = 10, y = 20;
        int max = (x > y) ? x : y;
        System.out.println("Maximum of x and y: " + max);

        System.out.println("Instanceof Operator:");
        String str = "Hello";
        if (str instanceof String) {
            System.out.println("str is an instance of String");
        } else {
            System.out.println("str is not an instance of String");
        }

        System.out.println("Bitwise AND of 1 and 1: ");
        // This will print 1 because 1 & 1 is 1 in binary
        // Bitwise AND operation
        // 1 in binary is 0001
        // 1 in binary is 0001
        // 0001 & 0001 = 0001 (which is 1 in
        // decimal)
        // This is a simple example of using the bitwise AND operator
        // in Java.
        // It demonstrates how the bitwise AND operator works with two integers.
        // The output will be 1, as both bits are 1.
        System.out.println(1 & 1); 


        // Control Flow Example
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch Case Example
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("It's Monday, start of the week!");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday, keep going!");
                break;
            case "Wednesday":       
                System.out.println("It's Wednesday, halfway through!");
                break;
            case "Thursday":
                System.out.println("It's Thursday, almost there!");
                break;
            case "Friday":
                System.out.println("It's Friday, weekend is near!");
                break;
            case "Saturday":
                System.out.println("It's Saturday, enjoy your day!");
                break;
            case "Sunday":
                System.out.println("It's Sunday, relax and prepare for the week ahead!");
                break;
            default:
                System.out.println("Invalid day!");
        }

        // For Loop Example
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop Example
        System.out.println("While Loop Example:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-While Loop Example
        System.out.println("Do-While Loop Example:");
        int doCount = 1;
        do {
            System.out.println("Do Count: " + doCount);
            doCount++;
        } while (doCount <= 5);

        // Enhanced For Loop Example
        System.out.println("Enhanced For Loop Example:");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Java Collection Framework Example
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names in the list:");
        for (String name : names) {
            System.out.println(name);
        }

        // Priority Queue Example
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        System.out.println("Priority Queue Elements:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer k, Integer l) -> l-k);
        maxPQ.add(1);
        maxPQ.add(2);
        maxPQ.add(3);
        System.out.println("Max Priority Queue Elements:");
        while (!maxPQ.isEmpty()) {
            System.out.println(maxPQ.poll());
        }

        // Comparable Example
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 21));
        students.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println("Sorted Students by Age:");
        for (Student student1 : students) {
            System.out.println(student1.getName() + " - Age: " + student1.getAge());
        }

        // Comparator Example
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Sorted Students by Name:");
        for (Student student1 : students) {
            System.out.println(student1.getName() + " - Age: " + student1.getAge());
        }
    }
}

