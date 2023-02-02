package Password_Generator.Verification;

import static Password_Generator.Verification.Strength.password;

public class Characters {

    protected void checksNumberOfCharacters(){

        System.out.println("Password length: " + password.length() + " character/s.");

    }

}
