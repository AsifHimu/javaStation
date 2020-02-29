package Labtest;

public interface Account {
    String account_name = "";
    String account_number = "";
    double balance = 0.0;
    void show_info();
    double getinterest(int year);
}
