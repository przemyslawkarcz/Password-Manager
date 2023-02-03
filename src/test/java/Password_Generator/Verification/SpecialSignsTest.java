package Password_Generator.Verification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpecialSignsTest {

    @Test
    public void checksNumberOfSpecialSignsNotNull(){

        SpecialSigns specialSigns = new SpecialSigns();
        Integer integer = specialSigns.checksNumberOfSpecialSigns();

        Assertions.assertNotNull(integer);

    }

    @Test
    public void checksNumberOfSpecialSignsNotEqualsNull(){

        SpecialSigns specialSigns = new SpecialSigns();
        Integer integer = specialSigns.checksNumberOfSpecialSigns();

        Assertions.assertNotEquals(null, integer);

    }

}
