public class Student {
    String name;
    int age;
    String grade;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    String getStudentInfo() {
        return "Name: " + name + ", Age: " + age + (grade != null ? ", Grade: " + grade : "");
    }
}
