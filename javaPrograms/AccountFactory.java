//package LabTest1.Problem1;

public class AccountFactory{
    public Account getAccount(String account_name, String account_number, double balance) {
        if(account_name ==null) {
            return null;
        } else if(account_name.equalsIgnoreCase("SavingsAccount")) {
            return new SavingsAccount(account_name, account_number, balance);
        } else if(account_name.equalsIgnoreCase("CurrentAccount")) {
            return new CurrentAccount(account_name, account_number, balance);
        } else if (account_name.equalsIgnoreCase("FixedDeposit Account")) {
            return new FixedDepositAccount(account_name, account_number, balance);
        } else {
            return null;
        }
    }
}
