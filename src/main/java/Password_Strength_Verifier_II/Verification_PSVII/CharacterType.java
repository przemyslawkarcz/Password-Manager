package Password_Strength_Verifier_II.Verification_PSVII;

public class CharacterType {

    public static String fieldThatCollectsCapitalCharacters = "";
    public static String fieldThatCollectsSmallCharacters = "";
    public static String fieldThatCollectsSpecialSigns = "";
    public static String fieldThatCollectsDigits = "";
    public static String fieldThatCollectsAllCharacters = "";

    public static String getFieldThatCollectsCapitalCharacters() {
        return fieldThatCollectsCapitalCharacters;
    }

    public static String setFieldThatCollectsCapitalCharacters(String fieldThatCollectsCapitalCharacters) {
        CharacterType.fieldThatCollectsCapitalCharacters = fieldThatCollectsCapitalCharacters;
        return fieldThatCollectsCapitalCharacters;
    }

    public static String getFieldThatCollectsSmallCharacters() {
        return fieldThatCollectsSmallCharacters;
    }

    public static String setFieldThatCollectsSmallCharacters(String fieldThatCollectsSmallCharacters) {
        CharacterType.fieldThatCollectsSmallCharacters = fieldThatCollectsSmallCharacters;
        return fieldThatCollectsSmallCharacters;
    }

    public static String getFieldThatCollectsSpecialSigns() {
        return fieldThatCollectsSpecialSigns;
    }

    public static String setFieldThatCollectsSpecialSigns(String fieldThatCollectsSpecialSigns) {
        CharacterType.fieldThatCollectsSpecialSigns = fieldThatCollectsSpecialSigns;
        return fieldThatCollectsSpecialSigns;
    }

    public static String getFieldThatCollectsDigits() {
        return fieldThatCollectsDigits;
    }

    public static String setFieldThatCollectsDigits(String fieldThatCollectsDigits) {
        CharacterType.fieldThatCollectsDigits = fieldThatCollectsDigits;
        return fieldThatCollectsDigits;
    }

    public static String getFieldThatCollectsAllCharacters() {
        return fieldThatCollectsAllCharacters;
    }

    public static void setFieldThatCollectsAllCharacters(String fieldThatCollectsAllCharacters) {
        CharacterType.fieldThatCollectsAllCharacters = fieldThatCollectsAllCharacters;
    }

    protected String checksCharacterType(String someString){

        VerificationFacade_PSV_II verificationFacade_psv_ii = new VerificationFacade_PSV_II();

        String checkedCharacter = verificationFacade_psv_ii.getLengthOfCharacter(someString);

        for (int i = 0; i < checkedCharacter.length(); i++) {

            char c = checkedCharacter.charAt(i);

            setFieldThatCollectsAllCharacters(fieldThatCollectsAllCharacters.concat(checkedCharacter));

            if (Character.isLowerCase(c)){

                return setFieldThatCollectsSmallCharacters(fieldThatCollectsSmallCharacters.concat(checkedCharacter));

            }
            if (Character.isUpperCase(c)){

                return setFieldThatCollectsCapitalCharacters(fieldThatCollectsCapitalCharacters.concat(checkedCharacter));

            }
            if (Character.isDigit(c)){

                return setFieldThatCollectsDigits(fieldThatCollectsDigits.concat(checkedCharacter));

            }
            if (!Character.isAlphabetic(c)){

                return setFieldThatCollectsSpecialSigns(fieldThatCollectsSpecialSigns.concat(checkedCharacter));

            }

        }

        return checkedCharacter;
    }

    protected void printsSummaryOfCharacters() {

        System.out.println("Password: \t" + getFieldThatCollectsAllCharacters());
        System.out.println("Uppercase: \t" + getFieldThatCollectsCapitalCharacters() + "\t, number of characters: " + getFieldThatCollectsCapitalCharacters().length());
        System.out.println("Lowercase: \t" + getFieldThatCollectsSmallCharacters() + "\t, number of characters: " + getFieldThatCollectsSmallCharacters().length());
        System.out.println("Digits: \t" + getFieldThatCollectsDigits() + "\t, number of characters: " + getFieldThatCollectsDigits().length());
        System.out.println("Symbols: \t" + getFieldThatCollectsSpecialSigns() + "\t, number of characters: " + getFieldThatCollectsSpecialSigns().length());

    }

}
