package javaWeek5Assignment;

public class AsteriskLogger implements Logger {
	@Override
	public void Log(String word) {
		System.out.println("***" + word + "***");
	}

	@Override
	public void Error(String word) {
		String error = "Error: " + word;
		System.out.println("*******************");
		System.out.println(); /* Creates Space in the Console */
		Log(error);
		System.out.println(); /* Creates Space in the Console */
		System.out.println("*******************");
	}
}
