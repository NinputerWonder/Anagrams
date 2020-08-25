package org.wonder;


import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class AnagramsTest
{
    @Test
    public void testNoCharacters()
    {
        assertThat(Anagrams.of("") , is(Arrays.asList("")));
    }
}
