package com.example.user.wordcounter;

/**
 * Created by user on 08/11/2016.
 */

public class Counter {

    private String sentence;

    public Counter(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return this.sentence;
    }

    public Integer countWord() {
        String word = getSentence();
        if (word == null) { return 0;}
        String input = word.trim();
        int count = input.isEmpty() ? 0 : input.split("\\s+").length;
        return count;

    }



}
