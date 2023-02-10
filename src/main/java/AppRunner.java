import Password_Generator.Creator.CreatorFacade;
import Password_Strength_Verifier_I.Creator_PSVI.CreatorFacade_PSVI;

public class AppRunner {

    public static void main(String[] args) {

        CreatorFacade creatorFacade = new CreatorFacade();
        CreatorFacade_PSVI creatorFacadePSVI = new CreatorFacade_PSVI();


        creatorFacade.getGeneratedPassword();
        creatorFacadePSVI.getHandMadePassword();



    }

}
