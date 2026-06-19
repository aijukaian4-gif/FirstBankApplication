package model;

public class StudentAccount extends Account{


    public StudentAccount(String accountNumber,double balance){

        super(accountNumber,balance);

    }


    @Override
    public double minimumDeposit(){

        return 10000;

    }

}