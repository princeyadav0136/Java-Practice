public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getStudentInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}
