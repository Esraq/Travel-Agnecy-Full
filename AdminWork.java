import java.sql.ResultSet;

public class AdminWork{
	private String place;
	private String cost;
	private String id;
	private String duration;
	
	/*public User(String email) {
		this.email = email;
	}*/
	
	public AdminWork(String i, String plc, String cst, String dur) {
		id = i;
		place = plc;
		cost = cst;
		duration = dur;
	
	}
	
	public String getId() {
		return id;
	}


	public void setId(String i) {
		this.id = i;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String plc) {
		this.place = plc;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String dur) {
		this.duration = dur;
	}


	public String getCost() {
		return cost;
	}


	public void setCost(String cst) {
		this.cost = cst;
	}




	public static void addAdminWork(AdminWork aw) {
		
		String q = new String("INSERT INTO package(id,place,price,dur) VALUES(" + "'" + aw.getId() + "','" + aw.getPlace() + "','" + aw.getCost() +  "','" + aw.getDuration() + "')");
		//System.out.println(q);
		int reply = Session.db.updateDB(q);
	}
	
	public static int updateAdminWork(AdminWork aw) {
		String q = new String("UPDATE package SET place = '" + aw.getPlace() + "', price='" + aw.getCost() + "',dur='" + aw.getDuration() + "' WHERE id = '" + aw.getId() + "'");
		//System.out.println(q);
		int reply = Session.db.updateDB(q);
		return reply;
	}
	
	public static int deleteAdminWork(String s) {
		String q = new String("DELETE FROM package WHERE id = '" + s + "'");
		//System.out.println(q);
		int reply = Session.db.updateDB(q);
		return reply;
	}
	
	
}

