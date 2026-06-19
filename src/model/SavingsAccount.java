package model;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public double minimumDeposit(){
        return 50000;
    }
}