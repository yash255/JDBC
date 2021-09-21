import java.sql.*;
public class ConnectionProvider {
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			if(con==null) {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","user","password");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}

}
