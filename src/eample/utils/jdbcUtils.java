package eample.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcUtils {
	public static Connection getConnection() throws Exception {
		String url = "jdbc:mysql://localhost:3306/articles";
		String uid = "root";
		String pwd = "password";
		Connection dbConnection = DriverManager.getConnection(url, uid, pwd);
		return dbConnection;

	}

}
