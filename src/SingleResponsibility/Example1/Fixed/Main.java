package SingleResponsibility.Example1.Fixed;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();

        HRPromotions hrp = new HRPromotions();
        boolean promotion = hrp.isPromotionDueThisYear(emp);

        IncomeTaxCalculation inc = new IncomeTaxCalculation();
        double tax = inc.calcIncomeTaxForCurrentYear(emp);
    }
}
