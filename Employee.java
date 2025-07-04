public class Employee {
    String name;
    int id;
    Employee() {
        this("Prince", 25);
    }

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String getEmployeeInfo() {
        return "Name: " + name + ", ID: " + id;
    }

}
