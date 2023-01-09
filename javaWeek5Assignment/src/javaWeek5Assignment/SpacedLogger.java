package javaWeek5Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String word) {
		StringBuilder log = new StringBuilder();
		
		for (int i = 0; i < word.length(); i++) {
			log.append(word.charAt(i)).append(" ");
		}
		
		System.out.println(log);
	}

	@Override
	public void Error(String word) {
		StringBuilder log = new StringBuilder();
		
		for (int i = 0; i < word.length(); i++) {
			log.append(word.charAt(i)).append(" ");	
		}
		
		String error = ("ERROR: " + log);
		
		System.out.println(error);

	}
}
