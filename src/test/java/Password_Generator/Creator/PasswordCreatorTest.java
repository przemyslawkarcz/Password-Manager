package Password_Generator.Creator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordCreatorTest {

    @Test
    public void createsPasswordTestLength_01(){

        PasswordCreator passwordCreator = new PasswordCreator();
        String createdPassword = passwordCreator.createsPassword();

        Assertions.assertNotEquals(17, createdPassword.length());

    }

    @Test
    public void createsPasswordTestLength_02(){

        PasswordCreator passwordCreator = new PasswordCreator();
        String createdPassword = passwordCreator.createsPassword();

        Assertions.assertNotEquals(15, createdPassword.length());

    }

    @Test
    public void createsPasswordTestLength_03(){

        PasswordCreator passwordCreator = new PasswordCreator();
        String createdPassword = passwordCreator.createsPassword();

        Assertions.assertEquals(16, createdPassword.length());

    }

    @Test
    public void createsPasswordTestCharacters_01(){

        PasswordCreator passwordCreator = new PasswordCreator();
        String createdPassword01 = passwordCreator.createsPassword();
        String createdPassword02 = passwordCreator.createsPassword();

        Assertions.assertNotEquals(createdPassword02, createdPassword01);

    }

    @Test
    public void createsPasswordTestCharacters_02(){

        PasswordCreator passwordCreator = new PasswordCreator();
        String createdPassword = passwordCreator.createsPassword();
        String text = "j#Km)W0%m0Klm&w2";

        Assertions.assertNotEquals(text, createdPassword);

    }

    @Test
    public void createsPasswordTestCharacters_03(){

        PasswordCreator passwordCreator = new PasswordCreator();
        String createdPassword = passwordCreator.createsPassword();

        Assertions.assertNotNull(createdPassword);

    }

}
