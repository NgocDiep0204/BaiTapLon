package test;

import java.sql.Connection;

import Connect_sql.connect;

public class testsql {

		public static void main(String[] args) {
			Connection conn = connect.getConnection();
			System.out.println(conn);
			
			//Connect.printfInf(conn);
			
			connect.closeConnection(conn);
			System.out.println(conn);
		}
	}


