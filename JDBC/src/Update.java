import java.io.*;
import java.sql.*;



public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection c = ConnectionProvider.getConnection();
			
			String q = "update table1 set Name=? , City=? where ID=?";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter new name : ");
			String name = br.readLine();
			
			System.out.println("Enter new city : ");
			String city = br.readLine();
			
			System.out.println("Enter ID : ");
			int id = Integer.parseInt(br.readLine());
			
			PreparedStatement pstmt = c.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
			
			pstmt.executeUpdate();
			System.out.println("Done");
			c.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
