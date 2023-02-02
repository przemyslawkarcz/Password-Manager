package Password_Generator.Verification;

public class VerificationFacade {

    public void getNumberCharacters(){

        Characters characters = new Characters();
        characters.checksNumberOfCharacters();

    }

    public void getNumberSpecialSigns(){

        SpecialSigns specialSigns = new SpecialSigns();
        specialSigns.checksNumberOfSpecialSigns();

    }

    public void getNumberDigits(){

        Digits digits = new Digits();
        digits.checksNumberOfDigits();

    }

    public void getNumberCapitalLetters(){

        CapitalLetters capitalLetters = new CapitalLetters();
        capitalLetters.checksNumberOfCapitalLetters();

    }

    public void getPasswordStrength(){

        Strength strength = new Strength();
        strength.checkPasswordStrength();

    }
}
