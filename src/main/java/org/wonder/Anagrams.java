package org.wonder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

    public static List<String> of(String origin) {
        if(origin.length() <= 1){
            return Arrays.asList(origin);
        }

        if(origin.length() == 2){
            return Arrays.asList(origin, origin.substring(1) + origin.substring(0, 1));
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < origin.length(); i++) {
            String droppedCharacter = origin.substring(i , i + 1);
            List<String> anagramsOfRest = of(dropCharacter(origin , i));
            for (String anagramOfRest: anagramsOfRest) {
                result.add(droppedCharacter + anagramOfRest);
            }
        }

        return result;
    }

    static String dropCharacter(String origin, int index){
        return origin.substring(0, index) + origin.substring(index + 1);
    }
}
