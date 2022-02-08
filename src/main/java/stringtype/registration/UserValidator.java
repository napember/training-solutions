package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String username) {
        return username.length()>0;
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length()>=8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int pkukac = email.indexOf('@');
        int pdot= email.indexOf('.');

        return pkukac > -1 && pdot > pkukac+1 && pkukac !=0 && pdot != email.length()-1;
    }
}
