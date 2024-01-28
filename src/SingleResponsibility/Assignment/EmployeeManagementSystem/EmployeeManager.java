package SingleResponsibility.Assignment.EmployeeManagementSystem;


import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addNewEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateSalary(Employee employee) {
        // Assuming a simple salary calculation
        return employee.getBaseSalary() + (employee.getYearsOfExperience() * 1000);
    }

    public void manageBenefits(Employee employee) {
        // Simulate managing employee benefits
        System.out.println("Managing benefits for: " + employee.getName());
    }

    public void generatePerformanceReport(Employee employee) {
        // Simulate generating a performance report
        System.out.println("Generating performance report for: " + employee.getName());
    }
}
