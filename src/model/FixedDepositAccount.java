package model;

public class FixedDepositAccount extends Account{


    public FixedDepositAccount(String accountNumber,double balance){

        super(accountNumber,balance);

    }


    @Override
    public double minimumDeposit(){

        return 200000;

    }

}