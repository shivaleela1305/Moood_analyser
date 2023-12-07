package moodanalyser_test;

public class MoodAnalysisException extends Exception{
	Mood errorType;
	public MoodAnalysisException(Mood errorType){
		this.errorType = errorType;
	}	
}

//UC3: enum for different mood analysis errors
enum Mood{
	Null_Mood,
	Empty_Mood
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
		//Uc3: informing user if provided with invalid mood
			if(message == null || message.isEmpty()) {
				if(message == null) {
					throw new MoodAnalysisException(Mood.Null_Mood);
					}
				else if(message.isEmpty()){
					throw new MoodAnalysisException(Mood.Empty_Mood);
					}
			else if(message.contains("I am in sad mood")) {
				return "Sad Mood";
				}
			else {
				return "Happy Mood";
			}
		}
				return "Happy Mood";
	}
	
}