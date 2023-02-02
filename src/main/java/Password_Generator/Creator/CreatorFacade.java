package Password_Generator.Creator;

public class CreatorFacade {

    public String getCreatedPassword(){

        PasswordCreator passwordCreator = new PasswordCreator();
        return passwordCreator.createsPassword();

    }

    public void getGeneratedPassword(){

        PasswordCreator passwordCreator = new PasswordCreator();
        passwordCreator.generatesPassword();

    }

}
