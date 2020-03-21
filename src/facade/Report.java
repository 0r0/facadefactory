package facade;

public class Report {
    private   ReportData data;
    private ReportFooter footer;
    private ReportHeader header;

    public ReportData getData() {
        return data;
    }

    public void setData(ReportData data) {
        this.data = data;
        data.PrintReport();
    }

    public ReportFooter getFooter() {
        return footer;
    }

    public void setFooter(ReportFooter footer) {
        this.footer = footer;
        footer.PrintReport();
    }

    public ReportHeader getHeader() {
        return header;
    }

    public void setHeader(ReportHeader header) {
        this.header = header;
        footer.PrintReport();
    }
}
