package com.moodAnalyzer;

import java.util.Scanner;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        try {
            if (message != null && message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }


    public static void main(String[] args) {
        MoodAnalyzer m = new MoodAnalyzer();
//        Scanner scannerText = new Scanner(System.in);

//        System.out.println(" Enter Mood Text : ");
        String m3 = "" ;
        System.out.println("Mood 3: " + m.analyseMood(m3));
    }
}
