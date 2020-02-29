//package LabTest1.Problem1;

public abstract class Account {
    String account_name = "";
    String account_number = "";
    double balance = 0.0;

    abstract void showInfo();
    abstract double getInterest(int year);
}
