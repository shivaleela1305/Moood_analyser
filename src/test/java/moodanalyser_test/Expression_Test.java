package moodanalyser_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class Expression_Test {

	//Tc 1.2 “I am in Any Mood” message returns HAPPY
	@Test
	public void testAnyMood() throws MoodAnalysisException {
        Expression moodAnalyser = new moodDetection();
        String message = "I'm in Any Mood today!";
        String mood = moodAnalyser.analyseExpression(message);
        assertEquals("Happy Mood", mood);
    }

	//Tc 1.1 : given "i am in sad mood" message return Sad  
    @Test
    public void testSadMood() throws MoodAnalysisException {
    	Expression moodAnalyser = new moodDetection();
        String message = "I am in sad mood.";
        String mood = moodAnalyser.analyseExpression(message);
        assertEquals("Sad Mood", mood);
    }
    
    @Test
    public void testNullMessage() throws MoodAnalysisException {
    	Expression MoodAnalyser = new moodDetection();
        String message = null;
        assertThrows(MoodAnalysisException.class, ()-> MoodAnalyser.analyseExpression(message));
    }
    
    @Test
    public void testEmptyMessage() throws MoodAnalysisException {
    	Expression moodAnalyser = new moodDetection();
        String message = "";
        assertThrows(MoodAnalysisException.class, ()-> moodAnalyser.analyseExpression(message));
    }
    

}
