package Password_Strength_Verifier_I.Verification_PSVI;

public class Characters_PSVI {

    protected int checksNumberOfCharacters(String somePassword){

        int counterOfCharacters = somePassword.length();

        System.out.println("Password length: " + counterOfCharacters + " character/s.");

        return counterOfCharacters;

    }

}
