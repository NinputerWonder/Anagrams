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

    @Test
    public void testOneCharacter()
    {
        assertThat(Anagrams.of("A"), is(Arrays.asList("A")));
    }

    @Test
    public void testTwoCharacters()
    {
        assertThat(Anagrams.of("AB"), is(Arrays.asList("AB", "BA")));
    }

    @Test
    public void testThreeCharacters()
    {
        assertThat(Anagrams.of("ABC"), is(Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA")));
    }
}
