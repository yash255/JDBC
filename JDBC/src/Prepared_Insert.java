import java.sql.*;

public class Prepared_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection c = ConnectionProvider.getConnection();
			// Create a Query
			String q = "insert into table1(Name,City) values (?,?)";

			// Get the Prepared Statement object

			PreparedStatement pstmt = c.prepareStatement(q);

			// Set the values to query

			pstmt.setString(1, "Yash Khandelwal");
			pstmt.setString(2, "Pune");

			pstmt.executeUpdate();

			System.out.println("inserted...");
			c.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
