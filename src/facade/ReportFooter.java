package facade;

import facade.print.PrintReport;

public class ReportFooter implements PrintReport {

    @Override
    public void PrintReport() {
        System.out.println("Print Footer");
    }
}
