package Password_Generator.Verification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapitalLettersTest {


    @Test
    public void checksNumberOfCapitalLettersNotNull(){

        CapitalLetters capitalLetters = new CapitalLetters();
        Integer integer = capitalLetters.checksNumberOfCapitalLetters();

        Assertions.assertNotNull(integer);

    }

    @Test
    public void checksNumberOfCapitalLettersNotEqualsNull(){

        CapitalLetters capitalLetters = new CapitalLetters();
        Integer integer = capitalLetters.checksNumberOfCapitalLetters();

        Assertions.assertNotEquals(null, integer);

    }

}
