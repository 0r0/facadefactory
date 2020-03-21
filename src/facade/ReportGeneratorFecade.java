package facade;

public class ReportGeneratorFecade {
    public static void  reportGenerator(ReportType  reportType){
        Report report  =new Report();
        report.setHeader(new ReportHeader());
        report.setData(new ReportData());
        report.setFooter(new ReportFooter());
        ReportWriter reportWriter=new ReportWriter();
        switch (reportType)
        {
            case PDF:
                reportWriter.pdfReport(report);
                break;
            case HTML:
                reportWriter.htmlReport(report);
                break;
        }

    }

}
