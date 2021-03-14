package be.ict.mb;

public interface CanScan {
    default String scan() {
        return "Here's what I scanned";
    }
}
