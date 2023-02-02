package Password_Generator.Characters;

import Password_Generator.Verification.Strength;
import java.util.HashMap;
import java.util.Map;

public class CharactersStatistics {

    protected void countsIndividualCharactersOfPassword() {

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        String lineOfText = String.valueOf(Strength.password);

        char[] charArray = lineOfText.toCharArray();

        for (char c : charArray) {

            if (!characterIntegerMap.containsKey(c)) {

                characterIntegerMap.put(c, 1);

            } else {

                Integer counter = characterIntegerMap.get(c);
                counter++;
                characterIntegerMap.put(c, counter);
            }

        }

        System.out.print("Characters in password individually: ");
        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            Character key = map.getKey();
            Integer value = map.getValue();

            System.out.print(key + ":" + value + " | ");

        }
        
    }

}
