package moodanalyser_test;

public class MoodAnalysisException extends Exception{
	public MoodAnalysisException(String message){
		super(message);
	}
	
}

interface Expression{
	String analyseExpression(String message) 
			throws MoodAnalysisException;
}

class IdentifyMood implements Expression{
	@Override
	public String analyseExpression(String message) throws MoodAnalysisException {
		if(message.toLowerCase().contains("happy")) {
			return "Happy Mood";
		}
		else if(message.toLowerCase().contains("sad")) {
			return "Sad Mood";
			}
		else {
			throw new MoodAnalysisException("unable to determine mood");
		}
		
	}
	
}
