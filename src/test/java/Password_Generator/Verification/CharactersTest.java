package Password_Generator.Verification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharactersTest {

    @Test
    public void checksNumberOfCharactersTestLength01(){

        Characters characters = new Characters();
        Integer integer = characters.checksNumberOfCharacters();

        Assertions.assertNotEquals(17, integer);

    }

    @Test
    public void checksNumberOfCharactersTestLength02(){

        Characters characters = new Characters();
        Integer integer = characters.checksNumberOfCharacters();

        Assertions.assertEquals(16, integer);

    }

    @Test
    public void checksNumberOfCharactersTestNotNull(){

        Characters characters = new Characters();
        Integer integer = characters.checksNumberOfCharacters();

        Assertions.assertNotNull(integer);

    }

}
