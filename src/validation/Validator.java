package validation;


public class Validator {


    // First and Last name
    public static boolean validName(String name){


        return name.matches("[A-Za-z]{2,30}");


    }



    // NIN exactly 14 uppercase letters/numbers
    public static boolean validNIN(String nin){


        return nin.matches("[A-Z0-9]{14}");


    }



    // Email format
    public static boolean validEmail(String email){


        return email.matches(
        "^[A-Za-z0-9+_.-]+@(.+)$"
        );


    }



    // Uganda phone format
    public static boolean validPhone(String phone){


        return phone.matches(
        "\\+256[0-9]{9}"
        );


    }



    // PIN 4-6 digits
    public static boolean validPIN(String pin){


        return pin.matches("\\d{4,6}")
                &&
                !pin.matches("(\\d)\\1+");


    }


}