package Password_Strength_Verifier_II.Creator_PSVII;

import Password_Strength_Verifier_II.Verification_PSVII.VerificationFacade_PSV_II;
import java.util.Scanner;

public class UserHandMadePassword_PSVII {

    protected void createPassword() {

        VerificationFacade_PSV_II verificationFacade_psv_ii = new VerificationFacade_PSV_II();

        Scanner introducesCharacters = new Scanner(System.in);
        int numberOfCharactersInPassword = 12;

        System.out.print("* * * Enter characters symbol by symbol * * *");
        System.out.print("\n* * * Password should consists of at least " + numberOfCharactersInPassword + " characters * * *");

        for (int i = 1; i <= numberOfCharactersInPassword; i++) {

            System.out.print("\nSymbol " + i + " of " + numberOfCharactersInPassword + ": ");
            String enteredCharacter = introducesCharacters.nextLine();

            verificationFacade_psv_ii.getCharacterType(enteredCharacter);

            verificationFacade_psv_ii.getPasswordStrength();

            verificationFacade_psv_ii.getPrintsSummaryOfCharacters();

        }

    }

}
