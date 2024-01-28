package SingleResponsibility.Assignment.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {

        /*
        In this setup, the EmployeeManager class handles multiple
        responsibilities like adding employees, calculating salaries,
        managing benefits, and generating performance reports. Students
        should refactor this class to align with the Single Responsibility
        Principle, creating separate classes to handle these individual
        responsibilities.
         */

        EmployeeManager manager = new EmployeeManager();

        Employee employee1 = new Employee("John Doe", 50000, 5);
        manager.addNewEmployee(employee1);

        double salary = manager.calculateSalary(employee1);
        System.out.println("Salary for " + employee1.getName() + ": " + salary);

        manager.manageBenefits(employee1);
        manager.generatePerformanceReport(employee1);
    }
}
