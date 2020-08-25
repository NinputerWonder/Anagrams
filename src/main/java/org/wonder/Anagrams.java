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

        for (int i = 0; i < 3; i++) {
            result.add(origin.substring(i , i + 1) + of(dropCharacter(origin , i)).get(0));
            result.add(origin.substring(i , i + 1) + of(dropCharacter(origin , i)).get(1));
        }

        return result;
    }

    static String dropCharacter(String origin, int index){
        return origin.substring(0, index) + origin.substring(index + 1);
    }
}
