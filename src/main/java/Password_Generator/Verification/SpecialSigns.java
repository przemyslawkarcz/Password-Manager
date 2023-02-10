package Password_Generator.Verification;

public class SpecialSigns {

    public static int counterOfSpecialSigns = 0;

    protected Integer checksNumberOfSpecialSigns(){

        String [] specialSigns = new String[]{
                "~", "`", "!", "@", "#", "$", "%", "^", "&", "*",
                "(", ")", "_", "-", "=", "+", "[", "]", "{", "}",
                "|", "/", ";", ":", "'", "<", ">", ",", ".", "?"
        };

        char[] passwordAsCharArray = Strength.password.toCharArray();

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
