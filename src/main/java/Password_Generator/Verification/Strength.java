package Password_Generator.Verification;

import Password_Generator.Creator.CreatorFacade;
import static Password_Generator.Verification.CapitalLetters.counterOfCapitalLetters;
import static Password_Generator.Verification.Digits.counterOfDigits;
import static Password_Generator.Verification.SpecialSigns.counterOfSpecialSigns;

public class Strength {

    public static String password = new CreatorFacade().getCreatedPassword();

    protected void checkPasswordStrength (){

        System.out.println();
        if (password.length() <= 7){
            System.out.println("Password strength: Very week password!");
        } else if ((password.length() >= 8) && (counterOfDigits == 0 || counterOfCapitalLetters == 0 || counterOfSpecialSigns == 0)){
            System.out.println("Password strength: Weak password!");
        } else if ((password.length() >= 8) && (counterOfDigits == 1 || counterOfCapitalLetters == 1 || counterOfSpecialSigns == 1)){
            System.out.println("Password strength: Medium strength password.");
        } else if ((password.length() >= 8) && (counterOfDigits == 2 || counterOfCapitalLetters == 2 || counterOfSpecialSigns == 2)) {
            System.out.println("Password strength: Strong password.");
        } else if ((password.length() >= 8) && (counterOfDigits > 2 || counterOfCapitalLetters > 2 || counterOfSpecialSigns > 2)){
            System.out.println("Password strength: Very strong password :)");
        }

    }

}
