package be.ict.mb;

public interface CanPrint {
    default void print(String text) {
        System.out.println("Look, I can print: " + text);
    }
}
