package facade;

import facade.print.PrintReport;

public class ReportData implements PrintReport {

    @Override
    public void PrintReport() {
        System.out.println("print Data");
    }
}
