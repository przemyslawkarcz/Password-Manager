package Password_Strength_Verifier_II.Verification_PSVII;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharacterLengthTest {

    @Test
    public void checksLengthOfCharacterTestReturnValue01(){

        CharacterLength characterLength = new CharacterLength();

        String s = "a";

        String character = characterLength.checksLengthOfCharacter(s);

        Assertions.assertEquals("a", character);

    }

    @Test
    public void checksLengthOfCharacterTestReturnValue02(){

        CharacterLength characterLength = new CharacterLength();

        String s = "a";

        String character = characterLength.checksLengthOfCharacter(s);

        Assertions.assertNotEquals("b", character);

    }

    @Test
    public void checksLengthOfCharacterTestLength(){

        CharacterLength characterLength = new CharacterLength();

        String s = "a";

        String character = characterLength.checksLengthOfCharacter(s);

        int length = character.length();

        Assertions.assertEquals(1, length);

    }

}
