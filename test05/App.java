package test05;


public class App {
	public static void main(String[] args) {
		//Instantiate the AsterickLogger
		Logger asterickLogger = new AsteriskLogger();
		asterickLogger.log("Hello");
		asterickLogger.error("Hello");
		
		//Instantiate SpacedLogger
	
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Hello");
		spacedLogger.error("Hello");
	}
}
