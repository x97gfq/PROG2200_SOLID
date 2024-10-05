package LiskovSubstitution.example2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee();
        System.out.println(fullTimeEmp.calculateBonus(1000)); // Output: 200.0

        Employee partTimeEmp = new PartTimeEmployee();
        System.out.println(partTimeEmp.calculateBonus(1000)); // Output: 50.0

        //in a list:
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(fullTimeEmp);
        employees.add(partTimeEmp);

        for(Employee emp:employees) {
            System.out.println(emp.calculateBonus(1000));
        }
    }
}
