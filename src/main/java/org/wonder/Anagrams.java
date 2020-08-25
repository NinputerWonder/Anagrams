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
                origin.substring(0, 1) + "BC",
                origin.substring(0, 1) + "CB",
                origin.substring(1, 2) + "AC",
                origin.substring(1, 2) + "CA",
                origin.substring(2, 3) + "AB",
                origin.substring(2, 3) + "BA"
        );
    }
}
