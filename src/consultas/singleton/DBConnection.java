package consultas.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jdbc";
	
	private static Connection instance = null;
	
	private DBConnection() {}
	
	public static Connection getConnection() throws SQLException {
		if(instance == null) {
			Properties properties = new Properties();
			properties.put("user", "root");
			properties.put("password", "root");
			instance = DriverManager.getConnection(JDBC_URL, properties);
		}
		
		return instance;
	}

}
