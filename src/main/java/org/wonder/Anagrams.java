package org.wonder;

import java.util.Arrays;
import java.util.List;

public class Anagrams {

    public static List<String> of(String origin) {
        if(origin.equals("")){
            return Arrays.asList("");
        }

        return Arrays.asList(origin);
    }
}
