package Labtest;

public class FixedDepositAccount implements Account {
    private double Fixed_rate = 0.75;
    public String Account_Name;
    public String Account_Number;
    public double Balance;
    FixedDepositAccount(String account_name,String account_number,double balance){
        Account_Name = account_name;
        Account_Number = account_number;
        Balance = balance;
    }
    public void show_info(){
        System.out.println("Account information----------");
        System.out.println("Account name :" + Account_Name);
        System.out.println("Account number :" + Account_Number);
        System.out.println("Balance :" + Balance);
    }
    public double getinterest(int year){
        return year * Balance * Fixed_rate;
    }
}
