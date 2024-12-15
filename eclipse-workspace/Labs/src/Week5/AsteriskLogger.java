package Week5;

public class AsteriskLogger implements Logger {
	
		public void log(String Hello) {
			System.out.println("***" + Hello + "***");
		}
		public void error(String Hello) {
			String error = "ERROR: " + Hello;
			String box = "****************"; // 16 asterisks per the projects example
			
			System.out.println(box);
			System.out.println(error);
			System.out.println(box);
		}
	}
	

