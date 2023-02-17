package Password_Strength_Verifier_II.Verification_PSVII;

public class CharacterLength {

    protected String checksLengthOfCharacter(String someString){

        int characterLength = someString.length();

        if (characterLength != 1){
            System.out.println("Enter 1 by 1 character only. Start again.");
            System.exit(0);

            //return String.valueOf(0);
        }

        return someString;
    }

}
