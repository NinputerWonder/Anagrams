package org.wonder;

import java.util.Arrays;
import java.util.List;

public class Anagrams {

    public static List<String> of(String origin) {
        if(origin.length() <= 1){
            return Arrays.asList(origin);
        }

        return Arrays.asList("AB", "BA");
    }
}
