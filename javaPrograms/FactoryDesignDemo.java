//package LabTest1.Problem1;

public class FactoryDesignDemo {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        Account accountOne = accountFactory.getAccount("SavingsAccount", "10121082", 1000);
        accountOne.showInfo();
        System.out.println(accountOne.getInterest(10));
        accountOne = accountFactory.getAccount("CurrentAccount", "10082", 100);
        accountOne.showInfo();
        System.out.println(accountOne.getInterest(10));
        accountOne = accountFactory.getAccount("FixedDepositAccount", "222", 10);
        accountOne.showInfo();
        System.out.println(accountOne.getInterest(10));
    }
}
