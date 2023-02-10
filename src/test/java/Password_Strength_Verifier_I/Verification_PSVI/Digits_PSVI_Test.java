package Password_Strength_Verifier_I.Verification_PSVI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Digits_PSVI_Test {

    @Test
    public void NumberOfDigitsTestReturnValue01(){

        Digits_PSVI digits_psvi = new Digits_PSVI();

        String someText = "bb";

        int numberOfDigits = digits_psvi.checksNumberOfDigits(someText);

        Assertions.assertEquals(0, numberOfDigits);

    }

    @Test
    public void NumberOfDigitsTestReturnValue02(){

        Digits_PSVI digits_psvi = new Digits_PSVI();

        String someText = "bb 2 cc";

        int numberOfDigits = digits_psvi.checksNumberOfDigits(someText);

        Assertions.assertEquals(1, numberOfDigits);

    }

    @Test
    public void NumberOfDigitsTestReturnValue03(){

        Digits_PSVI digits_psvi = new Digits_PSVI();

        String someText = "op 333 po";

        int numberOfDigits = digits_psvi.checksNumberOfDigits(someText);

        Assertions.assertEquals(3, numberOfDigits);

    }

    @Test
    public void NumberOfDigitsTestReturnValue04(){

        Digits_PSVI digits_psvi = new Digits_PSVI();

        String someText = "a1b2 c3d4";

        int numberOfDigits = digits_psvi.checksNumberOfDigits(someText);

        Assertions.assertNotEquals(3, numberOfDigits);

    }

    @Test
    public void NumberOfDigitsTestReturnValue05(){

        Digits_PSVI digits_psvi = new Digits_PSVI();

        String someText = "1234567890";

        int numberOfDigits = digits_psvi.checksNumberOfDigits(someText);

        Assertions.assertNotEquals(11, numberOfDigits);

    }

    @Test
    public void NumberOfDigitsTestReturnValue06(){

        Digits_PSVI digits_psvi = new Digits_PSVI();

        String someText = "987 bca";

        int numberOfDigits = digits_psvi.checksNumberOfDigits(someText);

        Assertions.assertNotEquals(2, numberOfDigits);

    }

}
