import java.sql.ResultSet;

public class Admin {
	
	private String pass;
	private String name;
	
	
	
	public Admin(String name) {
		this.name = name;
	}
	
	
	public Admin( String ps, String nm) {
	
		pass = ps;
		name = nm;
	
	}


	public String getPassword() {
		return pass;
	}


	public void setPassword(String pass) {
		this.pass = pass;
	}



	public String getUserName() {
		return name;
	}


	public void setUserName(String name) {
		this.name = name;
	}

	public static void addAdmin(Admin ad) {
	
		String q = new String("INSERT INTO admin(password,username) VALUES(" + "'" + ad.getPassword() + "','" + ad.getUserName() + "')");
		
		int reply = Session.db.updateDB(q);
	}
	
	public static Boolean validateAdmin(String username, String pass) {
		String q = new String("SELECT username FROM admin WHERE username = '" + username + "' AND password = '" + pass + "'");
		ResultSet rs = null;
		
		try{
			rs = Session.db.getData(q);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(rs == null) return false;
		
		try{
			if(rs.next()) return true;
		}
		catch (Exception e) {
			
		}
		
		return false;
	}
	
	
}
