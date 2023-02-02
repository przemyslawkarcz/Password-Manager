package Password_Generator.Creator;

import Password_Generator.Characters.CharactersFacade;
import Password_Generator.Verification.VerificationFacade;
import java.util.Random;

public class PasswordCreator {

    protected String createsPassword(){

        String receivedPassword = "";

        String [] arrayOfSigns = new String[]{
                "A", "Ą", "B", "C", "Ć", "D", "E", "Ę", "F", "G",
                "H", "I", "J", "K", "L", "Ł", "M", "N", "Ń", "O",
                "Ó", "P", "Q", "R", "S", "Ś", "T", "U", "V", "W",
                "X", "Y", "Z", "Ź", "Ż", "a", "ą", "b", "c", "ć",
                "d", "e", "ę", "f", "g", "h", "i", "j", "k", "l",
                "ł", "m", "n", "ń", "o", "ó", "p", "q", "r", "s",
                "ś", "t", "u", "v", "w", "x", "y", "z", "ź", "ż",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "~", "`", "!", "@", "#", "$", "%", "^", "&", "*",
                "(", ")", "_", "-", "=", "+", "[", "]", "{", "}",
                "|", "/", ";", ":", "'", "<", ">", ",", ".", "?"
        };

        int passwordLength = 16;

        for (int i = 0; i < passwordLength; i++) {

            int randomInt = new Random().nextInt(arrayOfSigns.length);

            receivedPassword = receivedPassword.concat(arrayOfSigns[randomInt]);

        }

        System.out.println("Automatically generated password: " + receivedPassword);

        return receivedPassword;

    }

    protected void generatesPassword(){

        CharactersFacade charactersFacade = new CharactersFacade();
        VerificationFacade verificationFacade = new VerificationFacade();

        verificationFacade.getNumberCharacters();
        verificationFacade.getNumberDigits();
        verificationFacade.getNumberCapitalLetters();
        verificationFacade.getNumberSpecialSigns();
        charactersFacade.getIndividualCharacters();
        verificationFacade.getPasswordStrength();

    }

}
