package com.bl;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;

public class TestingMood {

    @Test
    public void SadMood() throws MoodAnalysisException{
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = analyzer.moodAnalyze();
        Assertions.assertEquals("SAD", mood);
        System.out.println(mood);
    }

    @Test
    public  void HappyMood() throws MoodAnalysisException {
        MoodAnalyzer analyzer = new MoodAnalyzer("Today I am So Happy");
        String mood = analyzer.moodAnalyze();
        Assertions.assertEquals("HAPPY", mood);
        System.out.println(mood);
    }

    @Test
    public void NullMood(){
        MoodAnalyzer analyzer = new MoodAnalyzer(null);
        try {
            analyzer.moodAnalyze();
        }catch (MoodAnalysisException e){
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.NULL_MOOD, e.getType());
        }
    }
}

