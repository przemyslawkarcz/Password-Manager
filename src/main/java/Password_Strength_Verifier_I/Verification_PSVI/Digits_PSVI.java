package Password_Strength_Verifier_I.Verification_PSVI;

public class Digits_PSVI {

    protected int checksNumberOfDigits(String somePassword){

        int counterOfDigits = 0;

        String [] digits = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        char[] passwordAsCharArray = somePassword.toCharArray();

        for (int i = 0; i < digits.length; i++) {

            String cipher = digits[i];
            String symbol;

            for (int j = 0; j < passwordAsCharArray.length; j++) {

                symbol = String.valueOf(passwordAsCharArray[j]);

                if (cipher.equals(symbol)) {
                    counterOfDigits++;
                }

            }

        }

        System.out.println("The password has " + counterOfDigits + " digit/s.");

        return counterOfDigits;

    }

}
