package Connect_sql;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class connect {
	
	private static String url      =  "jdbc:mySQL://localhost:3306/studentmanagement";
	private static String user	   =  "root";
	private static String password =  "ngocdiep020403";
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			// đăng kí my sql driver với driver manager
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection(url, user,password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}
	public static void closeConnection(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
				
			}catch (Exception e) {
				e.printStackTrace();
		}
	}
	

	
}	

