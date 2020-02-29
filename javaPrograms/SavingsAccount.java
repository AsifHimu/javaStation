//package LabTest1.Problem1;

public class SavingsAccount extends Account{
    private double SavingsAccountRate = .045;

    SavingsAccount(String account_name, String account_number, double balance) {
        this.account_name = account_name;
        this.account_number = account_number;
        this.balance = balance;
    }

    @Override
    void showInfo() {
        System.out.println("Account Information: ");
        System.out.println("--------------------");
        System.out.println("Account Name: " + this.account_name);
        System.out.println("Account Number: " + this.account_number);
        System.out.println("Balance: " + this.balance);
        System.out.println();
    }

    @Override
    double getInterest(int year) {
        return this.balance * this.SavingsAccountRate * year;
    }
}
