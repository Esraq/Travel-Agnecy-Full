import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Package {
	private String id;
	private String place;
	private String price;
	private String dur;
	
	public Package(String id, String pl, String cost, String d) {
		this.id = id;
		place = pl;
		price = cost;
		dur = d;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDur() {
		return dur;
	}

	public void setDur(String dur) {
		this.dur = dur;
	}
	
	public static ArrayList<Package> fetchAllPackage() {
		ArrayList <Package> list = new ArrayList<Package>();
		
		String q = new String("SELECT * FROM package ORDER BY id ASC");
		ResultSet rs = null;
		
		try{
			rs = Session.db.getData(q);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		try{
			Package pk;
			while(rs.next()) {
				pk = new Package(rs.getString("id"), rs.getString("place"), rs.getString("price"), rs.getString("dur"));
				list.add( pk );
			}
		}
		catch (Exception e) {
			
		}
		
		return list;
	}
	
	public static void addNewEntry(String email, String id) {
		// Insert to teacher table
		String q = new String("INSERT INTO slpackage(email,package) VALUES(" + "'" + email + "','" + id + "')");
		//System.out.println(q);
		int reply = Session.db.updateDB(q);
	}
	
	public String toString() {
		return id;
	}
	
}

class SlPackage{
	private String id;
	private String email;
	private String status;
	
	SlPackage() {
		
	}
	
	SlPackage(String i, String n) {
		id = i;
		email = n;
		status = "Not Paid";
	}
	
	SlPackage(String i, String n, String p) {
		id = i;
		email = n;
		status = p;
	}
	
	public String getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getStatus() {
		return status;
	}
	
	
	public static ArrayList<SlPackage> fetchAllSlPackage() {
		ArrayList <SlPackage> list = new ArrayList<SlPackage>();
		
		String q = new String("SELECT * FROM slpackage ORDER BY package ASC");
		ResultSet rs = null;
		
		try{
			rs = Session.db.getData(q);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		try{
			SlPackage pk;
			while(rs.next()) {
				pk = new SlPackage(rs.getString("package"), rs.getString("email"), rs.getString("status"));
				list.add( pk );
			}
		}
		catch (Exception e) {
			
		}
		
		return list;
	}
	
}


