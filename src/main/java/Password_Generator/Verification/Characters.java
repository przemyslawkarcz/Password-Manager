package Password_Generator.Verification;

import static Password_Generator.Verification.Strength.password;

public class Characters {

    protected Integer checksNumberOfCharacters(){

        System.out.println("Password length: " + password.length() + " character/s.");

        return password.length();

    }

}
