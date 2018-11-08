import java.sql.ResultSet;

public class User {
	private String email;
	private String pass;
	private String country;
	private String district;
	private String phone;
	private String name;
	
	public User(String email) {
		this.email = email;
	}
	
	public User(String em, String ps, String nm, String con, String dis, String ph) {
		email = em;
		pass = ps;
		name = nm;
		country = con;
		district = dis;
		phone = ph;
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return pass;
	}


	public void setPassword(String pass) {
		this.pass = pass;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getContact() {
		return phone;
	}


	public void setContact(String phone) {
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public static void addUser(User usr) {
		
		String q = new String("INSERT INTO user(email,password,name,contact,country,district) VALUES(" + "'" + usr.getEmail() + "','" + usr.getPassword() + "','" + usr.getName() +  "','" + usr.getContact() + "','" + usr.getCountry() + "','" + usr.getDistrict() + "')");
		//System.out.println(q);
		int reply = Session.db.updateDB(q);
	}
	
	public static Boolean validateUser(String email, String pass) {
		String q = new String("SELECT name FROM user WHERE email = '" + email + "' AND password = '" + pass + "'");
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
