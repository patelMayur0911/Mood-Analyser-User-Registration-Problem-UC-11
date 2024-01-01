package com.moodAnalyzer;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        String message1 = "I am feeling Sad today.";
        System.out.println("Mood 1: " + message1);

        String message2 = "I am feeling Happy!";
        System.out.println("Mood 2: " + message2);
    }
}
