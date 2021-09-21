import java.sql.*;
import java.io.*;

public class ImagesSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection c = ConnectionProvider.getConnection();
			String q = "insert into images(pic) values(?)";
			PreparedStatement pstmt = c.prepareStatement(q);

			FileInputStream fis = new FileInputStream("/home/yash/Documents/JDBC/index.jpeg");

			pstmt.setBinaryStream(1, fis, fis.available());

			pstmt.executeUpdate();

			System.out.println("image saved");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}

	}

}
