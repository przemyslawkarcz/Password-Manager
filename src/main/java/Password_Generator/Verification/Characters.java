package Password_Generator.Verification;

public class Characters {

    protected Integer checksNumberOfCharacters(){

        System.out.println("Password length: " + Strength.password.length() + " character/s.");

        return Strength.password.length();

    }

}
