package moodanalyser_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class Expression_Test {

	//Tc 1.2 “I am in Any Mood” message returns HAPPY
	@Test
	public void testAnyMood() throws MoodAnalysisException {
		try {
        Expression moodAnalyser = new moodDetection();
        String message = "I'm in Any Mood today!";
        String mood = moodAnalyser.analyseExpression(message);
        assertEquals("Happy Mood", mood);
		}
		catch(MoodAnalysisException e) {
			fail("Unexpected MoodAnalysisException was thrown");
		}
		}

	//Tc 1.1 : given "i am in sad mood" message return Sad  
    @Test
    public void testSadMood() throws MoodAnalysisException {
    	try {
    	Expression moodAnalyser = new moodDetection();
        String message = "I am in sad mood";
        String mood = moodAnalyser.analyseExpression(message);
        assertEquals("Happy Mood", mood);
    	}
    	catch(MoodAnalysisException e) {
    		fail("Unexpected MoodAnalysisException was thrown");
    	}
    }
    
    //tc3.1 : Given NULL Mood Throws MoodAnalysisException
    @Test
    public void testNullMessage() throws MoodAnalysisException {
    	try {
    	Expression moodAnalyser = new moodDetection();
        String message = null;
        String mood = moodAnalyser.analyseExpression(message);
        fail("Expected MoodAnalysisException was not thrown");
    	}
    	catch(MoodAnalysisException e) {
    		assertEquals(Mood.Null_Mood, e.errorType);
    	}
    }
    
    //Tc3.2: Given Empty Mood Throws MoodAnalysisException
    @Test
    public void testEmptyMessage() throws MoodAnalysisException {
    	try {
    	Expression moodAnalyser = new moodDetection();
        String message = "";
        String mood = moodAnalyser.analyseExpression(message);
        fail("Expected MoodAnalysisException was not thrown");
    	}
    	catch(MoodAnalysisException e) {
    		assertEquals(Mood.Empty_Mood, e.errorType);
    	}
    }

    
}
