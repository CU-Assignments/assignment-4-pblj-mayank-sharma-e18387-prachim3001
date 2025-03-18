import java.util.*;
class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

class EmployeeManagement {
    private static List<Employee> employees = new ArrayList<>();

    public static void addEmployee(int id, String name, double salary) {
        employees.add(new Employee(id, name, salary));
        System.out.println("Employee added successfully!");
    }

    public static void updateEmployee(int id, String newName, double newSalary) {
        for (Employee e : employees) {
            if (e.id == id) {
                e.name = newName;
                e.salary = newSalary;
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void removeEmployee(int id) {
        employees.removeIf(e -> e.id == id);
        System.out.println("Employee removed successfully!");
    }

    public static void searchEmployee(int id) {
        for (Employee e : employees) {
            if (e.id == id) {
                System.out.println(e);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void displayEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
public class Main {
    public static void main(String[] args) {

        EmployeeManagement.addEmployee(101, "John Doe", 50000);
        EmployeeManagement.searchEmployee(101);

    }
}
