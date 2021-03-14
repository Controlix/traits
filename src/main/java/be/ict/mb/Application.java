package be.ict.mb;

public class Application {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner();

        printer.print(scanner.scan());

        AllInOne allInOne = new AllInOne();
        allInOne.print(allInOne.scan());
    }
}
