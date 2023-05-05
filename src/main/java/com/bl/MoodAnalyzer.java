package com.bl;

public class MoodAnalyzer {

    public String moodAnalyze(String message){
        if (message.contains("sad")){
            return "SAD";
        }else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer analyzer = new MoodAnalyzer();

        String mood = "I am in Happy Mood";
        String mAnalyse = analyzer.moodAnalyze(mood);
        System.out.println("Mood Is: " + mAnalyse);
    }
}
