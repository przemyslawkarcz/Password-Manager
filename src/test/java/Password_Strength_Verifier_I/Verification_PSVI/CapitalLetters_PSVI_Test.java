package Password_Strength_Verifier_I.Verification_PSVI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapitalLetters_PSVI_Test {

    @Test
    public void NumberOfCapitalLettersTestReturnValue01(){

        CapitalLetters_PSVI capitalLetters_psvi = new CapitalLetters_PSVI();

        String someText = "some text";

        int numberOfCapitalLetters = capitalLetters_psvi.checksNumberOfCapitalLetters(someText);

        Assertions.assertEquals(0, numberOfCapitalLetters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue02(){

        CapitalLetters_PSVI capitalLetters_psvi = new CapitalLetters_PSVI();

        String someText = "abc Abc";

        int numberOfCapitalLetters = capitalLetters_psvi.checksNumberOfCapitalLetters(someText);

        Assertions.assertEquals(1, numberOfCapitalLetters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue03(){

        CapitalLetters_PSVI capitalLetters_psvi = new CapitalLetters_PSVI();

        String someText = "mnk KNM";

        int numberOfCapitalLetters = capitalLetters_psvi.checksNumberOfCapitalLetters(someText);

        Assertions.assertEquals(3, numberOfCapitalLetters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue04(){

        CapitalLetters_PSVI capitalLetters_psvi = new CapitalLetters_PSVI();

        String someText = "mmnn llkk ii MNBV oo KIUH lp";

        int numberOfCapitalLetters = capitalLetters_psvi.checksNumberOfCapitalLetters(someText);

        Assertions.assertEquals(8, numberOfCapitalLetters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue05(){

        CapitalLetters_PSVI capitalLetters_psvi = new CapitalLetters_PSVI();

        String someText = "QWER iuyg";

        int numberOfCapitalLetters = capitalLetters_psvi.checksNumberOfCapitalLetters(someText);

        Assertions.assertNotEquals(3, numberOfCapitalLetters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue06(){

        CapitalLetters_PSVI capitalLetters_psvi = new CapitalLetters_PSVI();

        String someText = "QWER iuyg OOOO pppp UUUU ssss";

        int numberOfCapitalLetters = capitalLetters_psvi.checksNumberOfCapitalLetters(someText);

        Assertions.assertNotEquals(13, numberOfCapitalLetters);

    }
    
}
