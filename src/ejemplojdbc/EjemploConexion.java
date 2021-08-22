package ejemplojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class EjemploConexion {

	public static void main(String[] args) {
		Connection con = null;
		// Usamos un objeto properties para pasar
		// de una manera mas comoda el user y password
		Properties properties = new Properties();
		properties.put("user", "root");
		properties.put("password", "root");
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", properties);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SHOW TABLES");
			boolean hayFilas = false;
			while(rs.next()) {
				hayFilas = true;
				System.out.println(rs.getString(1));
			}
			
			if(!hayFilas) {
				System.out.println("No hay resultados");
			}
			
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
