package test;

import facade.ReportGeneratorFecade;
import facade.ReportType;

public class Test {
    public static void main(String[] args){
        ReportGeneratorFecade.reportGenerator(ReportType.PDF);
        ReportGeneratorFecade.reportGenerator(ReportType.HTML);
    }
}
