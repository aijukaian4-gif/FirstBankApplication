package model;

public class CurrentAccount extends Account{


    public CurrentAccount(String accountNumber,double balance){

        super(accountNumber,balance);

    }


    @Override
    public double minimumDeposit(){

        return 100000;

    }

}