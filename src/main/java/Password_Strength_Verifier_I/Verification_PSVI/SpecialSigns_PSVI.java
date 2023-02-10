package Password_Strength_Verifier_I.Verification_PSVI;

public class SpecialSigns_PSVI {

    protected int checksNumberOfSpecialSigns(String somePassword){

        int counterOfSpecialSigns = 0;

        String [] specialSigns = new String[]{"~", "`", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "=", "+", "[",
                "]", "{", "}", "|", "/", ";", ":", "'", "<", ">", ",", ".", "?"};

        char[] passwordAsCharArray = somePassword.toCharArray();

        for (int i = 0; i < specialSigns.length; i++) {

            String specialSign = specialSigns[i];
            String symbol;

            for (int j = 0; j < passwordAsCharArray.length; j++) {

                symbol = String.valueOf(passwordAsCharArray[j]);

                if (specialSign.equals(symbol)) {

                    counterOfSpecialSigns++;

                }

            }

        }

        System.out.println("The password has " + counterOfSpecialSigns + " special sign/s.");

        return counterOfSpecialSigns;

    }

}
