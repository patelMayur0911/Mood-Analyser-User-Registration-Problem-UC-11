import com.moodAnalyzerExe.MoodAnalysisException;
import com.moodAnalyzerExe.MoodAnalyzer;
import com.moodAnalyzerExe.MoodEnum;

public class MoodAnalyzerTest {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        // Test cases
        try {
            String message1 = "I am feeling Sad today.";
            String mood1 = moodAnalyzer.analyseMood(message1);
            System.out.println("Mood 1: " + mood1); // Expected output: Sad

            String message2 = "I am feeling Happy!";
            String mood2 = moodAnalyzer.analyseMood(message2);
            System.out.println("Mood 2: " + mood2); // Expected output: Happy

            String message3 = ""; // Empty mood
            String mood3 = moodAnalyzer.analyseMood(message3);
            System.out.println("Mood 3: " + mood3);
        } catch (MoodAnalysisException e) {
            if (e.getMoodEnum() == MoodEnum.EMPTY_MOOD) {
                System.out.println("Empty mood entered!");
            } else if (e.getMoodEnum() == MoodEnum.INVALID_MOOD) {
                System.out.println("Invalid mood entered!");
            } else if (e.getMoodEnum() == MoodEnum.NULL_MOOD) {
                System.out.println("NULL mood entered!");
            }
        }
    }
}

