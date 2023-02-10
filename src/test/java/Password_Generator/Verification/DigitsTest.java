package Password_Generator.Verification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitsTest {

    @Test
    public void checksNumberOfDigitsNotNull(){

        Digits digits = new Digits();
        Integer integer = digits.checksNumberOfDigits();

        Assertions.assertNotNull(integer);

    }

    @Test
    public void checksNumberOfDigitsNotEqualsNull(){

        Digits digits = new Digits();
        Integer integer = digits.checksNumberOfDigits();

        Assertions.assertNotEquals(null, integer);

    }

}
