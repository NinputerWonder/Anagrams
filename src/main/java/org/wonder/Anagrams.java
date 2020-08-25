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
        result.add(origin.substring(0 , 1) + of(dropCharacter(origin , 0)).get(0));
        result.add(origin.substring(0 , 1) + of(dropCharacter(origin , 0)).get(1));
        result.add(origin.substring(1 , 2) + of(dropCharacter(origin , 1)).get(0));
        result.add(origin.substring(1 , 2) + of(dropCharacter(origin , 1)).get(1));
        result.add(origin.substring(2 , 3) + of(dropCharacter(origin , 2)).get(0));
        result.add(origin.substring(2 , 3) + of(dropCharacter(origin , 2)).get(1));
        return result;
    }

    static String dropCharacter(String origin, int index){
        return origin.substring(0, index) + origin.substring(index + 1);
    }
}
