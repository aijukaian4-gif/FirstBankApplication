package model;

public abstract class Account {

    protected String accountNumber;
    protected double balance;


    public Account(String accountNumber, double balance){

        this.accountNumber = accountNumber;
        this.balance = balance;

    }


    public String getAccountNumber(){

        return accountNumber;

    }


    public double getBalance(){

        return balance;

    }


    public abstract double minimumDeposit();

}