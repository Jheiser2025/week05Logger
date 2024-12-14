package test05;

public class AsteriskLogger implements Logger {



		public void log(String message) {
			System.out.println("***Error: " + message + "***");
		}
		public void error (String message) {
			String errorMessage = "Error: " + message + "***";
			String star= "*";
			String border = star.repeat(errorMessage.length());
			System.out.println(border);
			System.out.println(errorMessage);
			System.out.println(border);
		}

	
}




