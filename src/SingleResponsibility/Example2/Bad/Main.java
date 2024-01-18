package SingleResponsibility.Example2.Bad;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setEmployeeId(1);

        emp.getEmployeeReport();

        double pay = emp.calculatePay();

        emp.saveEmployee();
    }
}
