package Password_Strength_Verifier_II.Verification_PSVII;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharacterTypeTest {

    @Test
    public void checksCharacterTypeTestReturnValueCapitalLetter01(){

        CharacterType characterType = new CharacterType();

        String s = "A";

        String checksCharacterType = characterType.checksCharacterType(s);

        Assertions.assertEquals("A", checksCharacterType);

    }

    @Test
    public void checksCharacterTypeTestReturnValueCapitalLetter02(){

        CharacterType characterType = new CharacterType();

        String s = "B";

        String checksCharacterType = characterType.checksCharacterType(s);

        Assertions.assertNotEquals("C", checksCharacterType);

    }

    @Test
    public void checksCharacterTypeTestReturnValueDigit01(){

        CharacterType characterType = new CharacterType();

        String s = "1";

        String checksCharacterType = characterType.checksCharacterType(s);

        Assertions.assertEquals("1", checksCharacterType);

    }

    @Test
    public void checksCharacterTypeTestReturnValueDigit02(){

        CharacterType characterType = new CharacterType();

        String s = "2";

        String checksCharacterType = characterType.checksCharacterType(s);

        Assertions.assertNotEquals("3", checksCharacterType);

    }

    @Test
    public void checksCharacterTypeTestReturnValueAlphabetic01(){

        CharacterType characterType = new CharacterType();

        String s = "#";

        String checksCharacterType = characterType.checksCharacterType(s);

        Assertions.assertEquals("#", checksCharacterType);

    }

    @Test
    public void checksCharacterTypeTestReturnValueAlphabetic02(){

        CharacterType characterType = new CharacterType();

        String s = "$";

        String checksCharacterType = characterType.checksCharacterType(s);

        Assertions.assertNotEquals("%", checksCharacterType);

    }

}
