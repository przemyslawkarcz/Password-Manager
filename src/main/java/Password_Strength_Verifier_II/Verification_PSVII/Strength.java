package Password_Strength_Verifier_II.Verification_PSVII;

import static Password_Strength_Verifier_II.Verification_PSVII.CharacterType.*;

public class Strength {

    protected void checksPasswordStrengthSymbolBySymbol(){

        int passwordLength = getFieldThatCollectsAllCharacters().length();

        int counterOfDigits = getFieldThatCollectsDigits().length();

        int counterOfCapitalLetters = getFieldThatCollectsCapitalCharacters().length();

        int counterOfSpecialSigns = getFieldThatCollectsSpecialSigns().length();

        if (passwordLength <= 7){
            System.out.println("- - - Analysis: Very week password! - - -");
        } else if ((passwordLength >= 8) && (counterOfDigits == 0 || counterOfCapitalLetters == 0 || counterOfSpecialSigns == 0)){
            System.out.println("- - - Analysis: Weak password! - - -");
        } else if ((passwordLength >= 8) && (counterOfDigits == 1 || counterOfCapitalLetters == 1 || counterOfSpecialSigns == 1)){
            System.out.println("- - - Analysis: Medium strength password. - - -");
        }else if ((passwordLength >= 8) && (counterOfDigits == 2 || counterOfCapitalLetters == 2 || counterOfSpecialSigns == 2)) {
            System.out.println("- - - Analysis: Strong password. - - -");
        }else if ((passwordLength >= 8) && (counterOfDigits > 2 || counterOfCapitalLetters > 2 || counterOfSpecialSigns > 2)){
            System.out.println("- - - Analysis: Very strong password :) - - -");
        }

    }

}
