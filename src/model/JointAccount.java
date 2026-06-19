package model;

public class JointAccount extends Account{


    public JointAccount(String accountNumber,double balance){

        super(accountNumber,balance);

    }


    @Override
    public double minimumDeposit(){

        return 300000;

    }

}