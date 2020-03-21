package facade;

public class ReportWriter {
    public void htmlReport(Report report){
        System.out.println("this is html report"+report.getData());

    }
    public  void pdfReport(Report report){
        System.out.println("this is pdf report"+report.getData());
    }
}
