package Password_Strength_Verifier_I.Creator_PSVI;

import Password_Strength_Verifier_I.Verification_PSVI.VerificationFacade_PSVI;
import java.util.Scanner;

public class UserHandMadePassword_PSVI {

    protected void checksPasswordStrengthThroughTheWholePassword(){

        VerificationFacade_PSVI verificationFacade_PSVI = new VerificationFacade_PSVI();

        System.out.print("Enter password: ");

        Scanner enteredPassword = new Scanner(System.in);
        String password = enteredPassword.nextLine();

        int counterOfCharacters = verificationFacade_PSVI.getNumberCharacters(password);

        int counterOfDigits = verificationFacade_PSVI.getNumberDigits(password);

        int counterOfCapitalLetters = verificationFacade_PSVI.getNumberCapitalLetters(password);

        int counterOfSpecialSigns = verificationFacade_PSVI.getNumberSpecialSigns(password);

        if (counterOfCharacters <= 7){
            System.out.println("Very week password!");
        } else if ((counterOfCharacters >= 8) && (counterOfDigits == 0 || counterOfCapitalLetters == 0 || counterOfSpecialSigns == 0)){
            System.out.println("Weak password!");
        } else if ((counterOfCharacters >= 8) && (counterOfDigits == 1 || counterOfCapitalLetters == 1 || counterOfSpecialSigns == 1)){
            System.out.println("Medium strength password.");
        }else if ((counterOfCharacters >= 8) && (counterOfDigits == 2 || counterOfCapitalLetters == 2 || counterOfSpecialSigns == 2)) {
            System.out.println("Strong password.");
        }else if ((counterOfCharacters >= 8) && (counterOfDigits > 2 || counterOfCapitalLetters > 2 || counterOfSpecialSigns > 2)){
            System.out.println("Very strong password :)");
        }

    }

}
