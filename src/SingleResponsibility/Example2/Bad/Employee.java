package SingleResponsibility.Example2.Bad;

public class Employee {

    private int employeeId;

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Double calculatePay() {
        //do stuff
        return 0.0;
    }

    public void saveEmployee() {
        //do stuff
    }

    public void getEmployeeReport() {
        //do stuff
    }
}
