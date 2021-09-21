import java.io.NotActiveException;
import java.sql.*;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Load the driver
			Connection c = ConnectionProvider.getConnection();

			// Create a Query
			String q = "create table table1(ID int(5) primary key auto_increment,"
					+ "Name varchar(20) not null, City varchar(15))";

			// Create a Statement
			Statement stmt = c.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table Created in Database");
			c.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
