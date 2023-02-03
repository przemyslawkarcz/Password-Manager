package Password_Generator.Verification;

import static Password_Generator.Verification.Strength.password;

public class Digits {

    public static int counterOfDigits = 0;

    protected Integer checksNumberOfDigits(){

        String [] digits = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        };

        char[] passwordAsCharArray = password.toCharArray();

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
