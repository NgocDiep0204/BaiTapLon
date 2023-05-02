package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import Connect_sql.connect;
import Information.points;
import Information.student;

public class pointsDAO implements dao<points>{


	public static pointsDAO getMethod() {
		return new pointsDAO();
	}

	@Override
	public int insert(points t) {
		int results = 0;
		try {
			//tao ket noi csdl
			Connection conn = connect.getConnection();
			
			//dao doi tuong statement
			String sql = "insert into points "+
					 " values (?, ?, ?)";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, t.getS_id());
			pstm.setString(2, t.getSemester());
			pstm.setFloat(3, t.getGpa());
			
			results =pstm.executeUpdate();
			conn.close();
			
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return results;
}
	@Override
	public int update(points t) {
		int results = 0;
		try {
		Connection conn = connect.getConnection();
		
		String sql = "update points " +
		" set "+
		" semester=?"+
		", gpa=?"+
		" where s_id=?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		
		pstm.setString(1,t.getSemester());
		pstm.setFloat(2,t.getGpa());
		pstm.setString(3,t.getS_id());
		
		results = pstm.executeUpdate();
		conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}

	@Override
	public int delete(points t) {
		int results = 0;
		try {
		Connection conn = connect.getConnection();
		
		String sql = "delete from points"+
					 " where s_id=?";
		
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1,t.getS_id());
			
			results = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return results;
	}

	@Override
	public ArrayList<points> selectAll() {
		ArrayList<points> results = new ArrayList<points>();
		try {
		Connection conn = connect.getConnection();
		
		String sql = "select * from points";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		
		while(rs.next()) {
			String s_id = rs.getString("s_id");
			String semester = rs.getString("semester");
			float gpa = rs.getFloat("gpa");
			
			points points = new points(s_id, semester, gpa);
			results.add(points);
			
			
		}
		conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return results;
	}

	@Override
	public points selectByid(points t) {
		points results = null;
		Connection conn = connect.getConnection();
		String sql = "select * from points where s_id=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, t.getS_id());
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				String s_id = rs.getString("s_id");
				String semester = rs.getString("semester");
				float gpa = rs.getFloat("gpa");
				
				results = new points(s_id, semester, gpa);
			}
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}
		
}