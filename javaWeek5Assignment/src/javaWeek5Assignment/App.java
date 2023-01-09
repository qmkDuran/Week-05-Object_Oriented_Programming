package javaWeek5Assignment;

public class App {

	public static void main(String[] args) {

		Logger asteriskLogger = new AsteriskLogger();
		
		asteriskLogger.Log("Test 1");
		System.out.println(); /* Creates Space in the Console */
		asteriskLogger.Error("Test 2");
		System.out.println(); /* Creates Space in the Console */

		Logger spacedLogger = new SpacedLogger();
		
		spacedLogger.Log("Test 3");
		System.out.println(); /* Creates Space in the Console */
		spacedLogger.Error("Test 4");

	}
}
