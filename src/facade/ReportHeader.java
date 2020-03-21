package facade;

import facade.print.PrintReport;

public class ReportHeader implements PrintReport {
    @Override
    public void PrintReport() {
        System.out.println("Report Header");
    }
}
