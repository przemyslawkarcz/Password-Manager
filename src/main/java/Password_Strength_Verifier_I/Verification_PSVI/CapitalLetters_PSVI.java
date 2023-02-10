package Password_Strength_Verifier_I.Verification_PSVI;

public class CapitalLetters_PSVI {

    protected int checksNumberOfCapitalLetters(String somePassword){

        int counterOfCapitalLetters = 0;

        String [] capitalLetters = new String[]{"A", "Ą", "B", "C", "Ć", "D", "E", "Ę", "F", "G", "H", "I", "J", "K", "L", "Ł", "M",
                "N", "Ń", "O", "Ó", "P", "Q", "R", "S", "Ś", "T", "U", "V", "W", "X", "Y", "Z", "Ź", "Ż"};

        char[] passwordAsCharArray = somePassword.toCharArray();

        for (int i = 0; i < capitalLetters.length; i++) {

            String capitalLetter = capitalLetters[i];
            String symbol;

            for (int j = 0; j < passwordAsCharArray.length; j++) {

                symbol = String.valueOf(passwordAsCharArray[j]);

                if (capitalLetter.equals(symbol)) {
                    counterOfCapitalLetters++;
                }

            }

        }

        System.out.println("The password has " + counterOfCapitalLetters + " capital letter/s.");

        return counterOfCapitalLetters;

    }

}
