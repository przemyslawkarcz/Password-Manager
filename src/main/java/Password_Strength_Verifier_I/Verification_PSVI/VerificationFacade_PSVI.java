package Password_Strength_Verifier_I.Verification_PSVI;

public class VerificationFacade_PSVI {

    public int getNumberCapitalLetters(String somePassword){

        CapitalLetters_PSVI capitalLettersPSVI = new CapitalLetters_PSVI();
        return capitalLettersPSVI.checksNumberOfCapitalLetters(somePassword);

    }

    public int getNumberCharacters(String somePassword){

        Characters_PSVI charactersPSVI = new Characters_PSVI();
        return charactersPSVI.checksNumberOfCharacters(somePassword);

    }

    public int getNumberDigits(String somePassword){

        Digits_PSVI digitsPSVI = new Digits_PSVI();
        return digitsPSVI.checksNumberOfDigits(somePassword);

    }

    public int getNumberSpecialSigns(String somePassword){

        SpecialSigns_PSVI specialSignsPSVI = new SpecialSigns_PSVI();
        return specialSignsPSVI.checksNumberOfSpecialSigns(somePassword);

    }

}
