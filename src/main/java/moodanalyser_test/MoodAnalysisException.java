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

//uc1 : ability to analyse and respond Happy or Sad Mood
class moodDetection implements Expression{
	@Override
	public String analyseExpression(String message) throws MoodAnalysisException {
		//UC2 : Handaling exception if user provides a invalid expression
		if(message == null || message.isEmpty()){
			throw new
			MoodAnalysisException("Invalid mood");
		}
		else if(message.contains("I am in sad mood")) {
			return "Sad Mood";
			}
		else {
			return "Happy Mood";
		}
		
	}
	
}
