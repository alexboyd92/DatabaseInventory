package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
	final String url = "jdbc:mysql://localhost:3306/inv?useSSL=false&serverTimezone=EST";
	final String user = "root";
	final String pass = "rootpasswordgiven";
	private Connection mycon;

	DataConnect() {

		try {
			mycon = DriverManager.getConnection(url, user, pass);
			mycon.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	Connection getConnect() {
		return this.mycon;
	}
}
