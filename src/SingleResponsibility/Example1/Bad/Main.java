package SingleResponsibility.Example1.Bad;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();

        //calculate income tax on the employee
        double tax = emp.calcIncomeTaxForCurrentYear();

        boolean promotion = emp.isPromotionDueThisYear();

    }

}
