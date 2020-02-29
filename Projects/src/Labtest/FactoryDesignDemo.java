package Labtest;

public class FactoryDesignDemo {
    public static void main(String args[]){
        AccountFactory accountFactory = new AccountFactory();
        Account accountOne = accountFactory.getAccount("SavingsAccount", "A101", 1000);
        accountOne.show_info();
        System.out.println(accountOne.getinterest(10));
        Account accountTwo = accountFactory.getAccount("CurrentAccount", "A102", 2000);
        accountTwo.show_info();
        System.out.println(accountTwo.getinterest(10));
        Account accountThree = accountFactory.getAccount("FixedDepositAccount", "A103", 3000);
        accountThree.show_info();
        System.out.println(accountThree.getinterest(10));
    }
}
