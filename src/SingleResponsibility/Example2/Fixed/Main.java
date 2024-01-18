package SingleResponsibility.Example2.Fixed;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setEmployeeId(1);

        EmployeeReport eRpt = new EmployeeReport();
        eRpt.getEmployeeReport(emp);

        EmployeePayment ePay = new EmployeePayment();
        double pay = ePay.calculatePay(emp);

        EmployeeRepository eRepo = new EmployeeRepository();
        eRepo.saveEmployee(emp);

    }
}
