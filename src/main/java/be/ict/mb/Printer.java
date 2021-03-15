package be.ict.mb;

public class Printer implements CanPrint {

    @Override
    public void print(String text) {
        System.out.println("Look, I can print: " + text);
    }
}
