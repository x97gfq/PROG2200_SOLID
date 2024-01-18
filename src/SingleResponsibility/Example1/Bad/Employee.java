package SingleResponsibility.Example1.Bad;

import java.util.Date;

public class Employee {

    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;
    public boolean isPromotionDueThisYear(){
        //promotion logic implementation
        System.out.println("determines if promotion is due current year");
        return true;
    }
    public Double calcIncomeTaxForCurrentYear(){
        //income tax logic implementation
        System.out.println("calculating income tax for current year");
        return 0.0;
    }
    //Getters & Setters for all the private attributes

}
