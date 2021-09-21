import java.io.*;

import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ImagesSave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Load the driver
			Connection c = ConnectionProvider.getConnection();

			String q = "insert into images(Pic) values(?)";
			PreparedStatement pstmt = c.prepareStatement(q);

			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);

			File file = jfc.getSelectedFile();
			FileInputStream fis = new FileInputStream(file);

			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();

			System.out.println("Done");
			JOptionPane.showMessageDialog(null, "success");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
