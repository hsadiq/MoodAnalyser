package com.bl;

public class ExceptionMood {

    private String message;

    public ExceptionMood(String message) {
        this.message = message;
    }

    public String analyseMood(){
        try {
            if (this.message.trim().toLowerCase().contains("sad")){
                return "SAD";
            }else {
                return "HAPPY";
            }
        }catch (Exception e){
            return "HAPPY";
        }
    }
}
