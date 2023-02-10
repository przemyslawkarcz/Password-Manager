package Password_Strength_Verifier_I.Verification_PSVI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Characters_PSVI_Test {

    @Test
    public void NumberOfCapitalLettersTestReturnValue01(){

        Characters_PSVI characters_psvi = new Characters_PSVI();

        String someText = "some text";

        int numberOfCharacters = characters_psvi.checksNumberOfCharacters(someText);

        Assertions.assertEquals(9, numberOfCharacters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue02(){

        Characters_PSVI characters_psvi = new Characters_PSVI();

        String someText = "";

        int numberOfCharacters = characters_psvi.checksNumberOfCharacters(someText);

        Assertions.assertEquals(0, numberOfCharacters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue03(){

        Characters_PSVI characters_psvi = new Characters_PSVI();

        String someText = "ab AB";

        int numberOfCharacters = characters_psvi.checksNumberOfCharacters(someText);

        Assertions.assertEquals(5, numberOfCharacters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue04(){

        Characters_PSVI characters_psvi = new Characters_PSVI();

        String someText = "a";

        int numberOfCharacters = characters_psvi.checksNumberOfCharacters(someText);

        Assertions.assertNotEquals(2, numberOfCharacters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue05(){

        Characters_PSVI characters_psvi = new Characters_PSVI();

        String someText = "bb";

        int numberOfCharacters = characters_psvi.checksNumberOfCharacters(someText);

        Assertions.assertNotEquals(1, numberOfCharacters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue06(){

        Characters_PSVI characters_psvi = new Characters_PSVI();

        String someText = "aa..bb..cc..dd..ee";

        int numberOfCharacters = characters_psvi.checksNumberOfCharacters(someText);

        Assertions.assertNotEquals(19, numberOfCharacters);

    }

}
