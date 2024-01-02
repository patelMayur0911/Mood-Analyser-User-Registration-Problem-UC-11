import com.moodAnalyzer.MoodAnalyzer;


public class MoodAnalyzerTest {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        // Test cases
        String message1 = "I am feeling Sad today.";
        String mood1 = moodAnalyzer.analyseMood(message1);
        System.out.println("Mood 1: " + mood1); // Expected output: Sad

        String message2 = "I am feeling Happy!";
        String mood2 = moodAnalyzer.analyseMood(message2);
        System.out.println("Mood 2: " + mood2); // Expected output: Happy

        String message3 = null;
        String mood3 = moodAnalyzer.analyseMood(message2);
        System.out.println("Mood 2: " + mood3); // Expected output: Happy
    }
}
