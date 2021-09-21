import java.sql.*;
import java.io.*;

public class Prepared_insert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection c = ConnectionProvider.getConnection();

			// Create a Query
			String q = "insert into table1(Name,City) values (?,?)";

			// Get the Prepared Statement object

			PreparedStatement pstmt = c.prepareStatement(q);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter name :");
			String name = br.readLine();

			System.out.println("Enter City :");
			String city = br.readLine();

			// Set the values to query

			pstmt.setString(1, name);
			pstmt.setString(2, city);

			pstmt.executeUpdate();

			System.out.println("inserted...");
			c.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
