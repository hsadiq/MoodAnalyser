package com.bl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingMood {

    //TC1.1

    @Test
    public void testAnalyseMoodForSad() {
        MoodAnalyzer analyser = new MoodAnalyzer("I am in Sad Mood");
        String mood = analyser.moodAnalyze();
        assertEquals("SAD", mood);
        System.out.println(mood);
    }

    @Test
    public void testAnalyseMoodForHappy() {
        MoodAnalyzer analyser = new MoodAnalyzer("I am feeling happy today");
        String mood = analyser.moodAnalyze();
        assertEquals("HAPPY", mood);
        System.out.println(mood);
    }

    @Test
    public void testAnalyseMoodForAny(){
        MoodAnalyzer analyzer = new MoodAnalyzer("I am Not in any Mood");
        String mood = analyzer.moodAnalyze();
        assertEquals("HAPPY", mood);
        System.out.println(mood);
    }
}

