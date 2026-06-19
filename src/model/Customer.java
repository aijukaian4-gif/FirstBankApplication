package model;


public class Customer {


    private String firstName;
    private String lastName;
    private String nin;
    private String email;
    private String phone;
    private String pin;


    public Customer(String firstName,
                    String lastName,
                    String nin,
                    String email,
                    String phone,
                    String pin){


        this.firstName = firstName;
        this.lastName = lastName;
        this.nin = nin;
        this.email = email;
        this.phone = phone;
        this.pin = pin;


    }


    public String getFirstName(){

        return firstName;

    }


    public String getLastName(){

        return lastName;

    }


    public String getNin(){

        return nin;

    }


    public String getEmail(){

        return email;

    }


    public String getPhone(){

        return phone;

    }


}