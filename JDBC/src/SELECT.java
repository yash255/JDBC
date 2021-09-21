import java.sql.*;


public class SELECT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection c = ConnectionProvider.getConnection();
			
			String query = "select * from table1";
			
			Statement stmt = c.createStatement();
			ResultSet set= stmt.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);
				
				System.out.println(name+" : "+id+" : "+city);
						
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
