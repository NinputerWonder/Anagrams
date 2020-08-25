package org.wonder;

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

        return Arrays.asList(
                origin.substring(0, 1) + of(dropCharacter(origin, 0)).get(0),
                origin.substring(0, 1) + of(dropCharacter(origin, 0)).get(1),
                origin.substring(1, 2) + of("AC").get(0),
                origin.substring(1, 2) + of("AC").get(1),
                origin.substring(2, 3) + of("AB").get(0),
                origin.substring(2, 3) + of("AB").get(1)
        );
    }

    static String dropCharacter(String origin, int index){
        return "BC";
    }
}
