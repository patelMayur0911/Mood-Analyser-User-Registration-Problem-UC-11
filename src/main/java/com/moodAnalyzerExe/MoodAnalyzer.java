package com.moodAnalyzerExe;

import java.util.Scanner;


public class MoodAnalyzer {
    public String analyseMood(String message) throws MoodAnalysisException {
        try {
            if (message == null || message.isEmpty()) {
                throw new MoodAnalysisException(MoodEnum.EMPTY_MOOD);
            } else if (message.contains("Sad")) {
                return "Sad";
            } else if (message.contains("Happy")) {
                return "Happy";
            } else {
                throw new MoodAnalysisException(MoodEnum.INVALID_MOOD);
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodEnum.NULL_MOOD);
        }
    }
}



