package be.ict.mb;

public class AllInOne {

    private Printer meAsAPrinter = new Printer();
    private Scanner meAsAScanner = new Scanner();

    public void print(String text) {
        meAsAPrinter.print(text);
    }

    public String scan() {
        return meAsAScanner.scan();
    }
}
