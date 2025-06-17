public class Main {
    public static void main(String[] args) {
        Student s = new Student("Prince", 101);
        s.displayInfo();
    }
}

class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + roll);
    }
}
