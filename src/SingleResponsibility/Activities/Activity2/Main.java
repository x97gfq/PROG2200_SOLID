package SingleResponsibility.Activities.Activity2;

public class Main {

    public static void main(String[] args) {

        ReportGenerator reportGenerator = new ReportGenerator();

        reportGenerator.generateReport();

        reportGenerator.printReport();

        reportGenerator.saveReportToFile("helloworld.txt");

    }

}