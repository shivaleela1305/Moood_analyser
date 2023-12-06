package moodanalyser_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Expression_Test {

	@Test
	public void testHappyMood() throws MoodAnalysisException {
        Expression moodAnalyser = new IdentifyMood();
        String message = "I'm feeling very happy today!";
        assertEquals("Happy Mood", moodAnalyser.analyseExpression(message));
    }

    @Test
    public void testSadMood() throws MoodAnalysisException {
    	Expression moodAnalyser = new IdentifyMood();
        String message = "Life is tough and I feel sad.";
        assertEquals("Sad Mood", moodAnalyser.analyseExpression(message));
    }

}
