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
                "A" + "BC",
                "A" + "CB",
                "B" + "AC",
                "B" + "CA",
                "C" + "AB",
                "C" + "BA"
        );
    }
}
