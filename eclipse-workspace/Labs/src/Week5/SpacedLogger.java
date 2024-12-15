package Week5;

public class SpacedLogger implements Logger{
	
	public void log (String Hello) {
		StringBuilder spaces = new StringBuilder();
		for (int i = 0; i < Hello.length(); i++) {
			spaces.append(Hello.charAt(i));
			if (i != Hello.length() - 1) {
				spaces.append(" ");
			}
		}
		System.out.println(spaces.toString());
	}
	
	public void error (String Hello ) {
		StringBuilder spaces = new StringBuilder();
		for (int i = 0; i < Hello.length(); i++) {
			spaces.append(Hello.charAt(i));
			if (i != Hello.length() - 1) {
				spaces.append(" ");
			}
				
	}
		System.out.println("ERROR: " + spaces.toString());
	

	}
	}
	
	
	

