import Password_Generator.Creator.CreatorFacade;
import Password_Strength_Verifier_I.Creator_PSVI.CreatorFacade_PSVI;
import Password_Strength_Verifier_II.Creator_PSVII.CreatorFacade_PSVII;

public class AppRunner {

    public static void main(String[] args) {

        CreatorFacade creatorFacade = new CreatorFacade();
        CreatorFacade_PSVI creatorFacade_PSVI = new CreatorFacade_PSVI();
        CreatorFacade_PSVII creatorFacade_PSVII = new CreatorFacade_PSVII();

        creatorFacade.getGeneratedPassword();

        //creatorFacade_PSVI.getHandMadePassword();

        //creatorFacade_PSVII.getHandMadePassword_II();


    }

}
