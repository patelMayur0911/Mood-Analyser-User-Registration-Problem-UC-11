package com.moodAnalyzerExe;


public class MoodAnalysisException extends Exception {
    private final MoodEnum moodEnum;

    public MoodAnalysisException(MoodEnum moodEnum) {
        this.moodEnum = moodEnum;
    }

    public MoodEnum getMoodEnum() {
        return moodEnum;
    }
}
