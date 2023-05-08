package com.bl;

public class MoodAnalyzer {

    private String message;
    public MoodAnalyzer(String message){
        this.message = message;
    }


    public String moodAnalyze() throws MoodAnalysisException {
        if (this.message == null){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_MOOD, "Mood cannot be null");
        }
        if (this.message.isEmpty()){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MOOD, "Mood Cannot be Empty");
        }
        if (this.message.trim().toLowerCase().contains("sad")){
            return "SAD";
        }else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Happy Mood");

        try {
            String hAnalyse = analyzer.moodAnalyze();
            System.out.println("Mood Is: " + hAnalyse);
        } catch (MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }

        MoodAnalyzer analyser = new MoodAnalyzer("I am in SAD mood");

        try {
            String sAnalyse = analyser.moodAnalyze();
            System.out.println("Mood Is: " + sAnalyse);
        } catch (MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }

        MoodAnalyzer check = new MoodAnalyzer("I am Not in any mood");

        try {
            String any = check.moodAnalyze();
            System.out.println("Mood Is: " + any);
        } catch (MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }

        MoodAnalyzer nullCheck = new MoodAnalyzer(null);

        try {
            String nullMood = nullCheck.moodAnalyze();
            System.out.println("Mood Is: " + nullMood);
        } catch (MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }

        MoodAnalyzer emptyCheck = new MoodAnalyzer("");

        try {
            String emptyMood = emptyCheck.moodAnalyze();
            System.out.println("Mood Is: " + emptyMood);
        } catch (MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MoodAnalysisException extends Exception {
    enum ExceptionType {
        NULL_MOOD, EMPTY_MOOD
    }

    private ExceptionType type;
    public MoodAnalysisException(ExceptionType type, String message){
        super(message);
        this.type = type;
    }

    public ExceptionType getType(){
        return this.type;
    }
}