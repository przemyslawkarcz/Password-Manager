package Password_Strength_Verifier_II.Verification_PSVII;

public class VerificationFacade_PSV_II {

    public String getLengthOfCharacter(String someString){

        CharacterLength characterLength = new CharacterLength();
        return characterLength.checksLengthOfCharacter(someString);

    }

    public void getPasswordStrength(){

        Strength strength = new Strength();
        strength.checksPasswordStrengthSymbolBySymbol();

    }

    public String getCharacterType(String someString ){

        CharacterType characterType = new CharacterType();
        return characterType.checksCharacterType(someString);

    }

    public void getPrintsSummaryOfCharacters(){

        CharacterType characterType = new CharacterType();
        characterType.printsSummaryOfCharacters();

    }

}
