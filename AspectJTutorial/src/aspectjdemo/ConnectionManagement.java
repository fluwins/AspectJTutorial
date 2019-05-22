package aspectjdemo;

public class ConnectionManagement {
	public static void openConnection() {
		System.out.println("Open connection to database...");
	}
	
	public static void closeConnection() {
		System.out.println("Close connection.");
	}
	
	public static void logError(Exception e) {
		System.out.println("Something went wrong...\t" + e.getMessage());
	}
}
