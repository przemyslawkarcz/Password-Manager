package Password_Strength_Verifier_I.Verification_PSVI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpecialSigns_PSVI_Test {

    @Test
    public void NumberOfSpecialSignsTestReturnValue01(){

        SpecialSigns_PSVI specialSigns_psvi = new SpecialSigns_PSVI();

        String someText = "special signs";

        int numberOfSpecialSigns = specialSigns_psvi.checksNumberOfSpecialSigns(someText);

        Assertions.assertEquals(0, numberOfSpecialSigns);

    }

    @Test
    public void NumberOfSpecialSignsTestReturnValue02(){

        SpecialSigns_PSVI specialSigns_psvi = new SpecialSigns_PSVI();

        String someText = "# java";

        int numberOfSpecialSigns = specialSigns_psvi.checksNumberOfSpecialSigns(someText);

        Assertions.assertEquals(1, numberOfSpecialSigns);

    }

    @Test
    public void NumberOfSpecialSignsTestReturnValue03(){

        SpecialSigns_PSVI specialSigns_psvi = new SpecialSigns_PSVI();

        String someText = "^o^ meow";

        int numberOfSpecialSigns = specialSigns_psvi.checksNumberOfSpecialSigns(someText);

        Assertions.assertEquals(2, numberOfSpecialSigns);

    }

    @Test
    public void NumberOfSpecialSignsTestReturnValue04(){

        SpecialSigns_PSVI specialSigns_psvi = new SpecialSigns_PSVI();

        String someText = "!@#$abcd";

        int numberOfSpecialSigns = specialSigns_psvi.checksNumberOfSpecialSigns(someText);

        Assertions.assertNotEquals(5, numberOfSpecialSigns);

    }

    @Test
    public void NumberOfSpecialSignsTestReturnValue05(){

        SpecialSigns_PSVI specialSigns_psvi = new SpecialSigns_PSVI();

        String someText = "#n#n#n#n#n#n";

        int numberOfSpecialSigns = specialSigns_psvi.checksNumberOfSpecialSigns(someText);

        Assertions.assertNotEquals(7, numberOfSpecialSigns);

    }

    @Test
    public void NumberOfSpecialSignsTestReturnValue06(){

        SpecialSigns_PSVI specialSigns_psvi = new SpecialSigns_PSVI();

        String someText = " a & b & c & = abcd";

        int numberOfSpecialSigns = specialSigns_psvi.checksNumberOfSpecialSigns(someText);

        Assertions.assertNotEquals(3, numberOfSpecialSigns);

    }

}
