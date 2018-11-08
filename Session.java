
public class Session {
	private static Boolean loggedIn;
	private static User usr;
	public static DataAccess db;

	
	private static Boolean aloggedIn;
	private static Admin ad;
	//public static DataAccess db;
	
	
	public static Boolean isLoggedIn() {
		return loggedIn;
	}
	
	public static void reset() {
		loggedIn = false;
		usr = null;
	}
	
	public static void setUser(User u) {
		loggedIn = true;
		usr = u;
	}
	
	public static User getUser() {
		return usr;
	}
	
		
	public static void setDatabase(DataAccess d) {
		db = d;
	}
	
	//***
	
	public static Boolean aisLoggedIn() {
		return aloggedIn;
	}
	
	public static void Areset() {
		aloggedIn = false;
		ad = null;
	}
	
	public static void setAdmin(Admin a) {
		aloggedIn = true;
		ad = a;
	}
	
	public static Admin getAdmin() {
		return ad;
	}
	
		
	public static void setaDatabase(DataAccess p) {
		db = p;
	}
}
