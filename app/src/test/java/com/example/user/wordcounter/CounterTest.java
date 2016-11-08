package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/11/2016.
 */

public class CounterTest {

    Counter sentence;

    @Before
    public void before() {
        sentence = new Counter("I am hoping that I can get this sentence");
    }

    @Test
    public void counterHasSentence() {
        assertEquals("I am hoping that I can get this sentence", sentence.getSentence());
    }

    @Test
    public void counterCanCount() {
        assertEquals(9, sentence.countWord().intValue());
    }


}
