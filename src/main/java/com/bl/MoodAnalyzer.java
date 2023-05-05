package com.bl;

public class MoodAnalyzer {

    private String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String moodAnalyze() {
        if (message.trim().toLowerCase().contains("sad")) {
            return "SAD";
        }else {
            return "HAPPY";
        }
    }
    public static void main(String[] args) {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Happy Mood");

        String hAnalyse = analyzer.moodAnalyze();
        System.out.println("Mood Is: " + hAnalyse);

        MoodAnalyzer analyser = new MoodAnalyzer("I am in SAD mood");

         String sAnalyse = analyser.moodAnalyze();
        System.out.println("Mood Is: " + sAnalyse);

        MoodAnalyzer check = new MoodAnalyzer("I am Not in any mood");
        String any = check.moodAnalyze();
        System.out.println("Mood Is: " + any);
    }
}
