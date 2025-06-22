package EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement ems = new EmployeeManagement(5);

        ems.addEmployee(new Employee(1, "Alice", "Manager", 70000));
        ems.addEmployee(new Employee(2, "Bob", "Engineer", 50000));
        ems.addEmployee(new Employee(3, "Charlie", "Intern", 20000));

        ems.traverseEmployees();

        System.out.println("\nSearching for employee with ID 2:");
        Employee e = ems.searchEmployee(2);
        if (e != null) e.display();
        else System.out.println("Employee not found.");

        System.out.println("\nDeleting employee with ID 1:");
        ems.deleteEmployee(1);
        
        System.out.println("\nEmployees after deletion:");
        ems.traverseEmployees();
    }
}
