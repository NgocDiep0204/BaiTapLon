package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect_sql.connect;
import Information.points;
import Information.points_detail;

public class points_detailDAO implements dao<points_detail>{
	private int choice;

	public static points_detailDAO getMethod() {
		return new points_detailDAO();
	}

	@Override
	public int insert(points_detail t) {
		int results = 0;
		try {
			//tao ket noi csdl
			Connection conn = connect.getConnection();
			
			//dao doi tuong statement
			String sql = "insert into points_detail"+
					 " values(?, ?, ?, ?, ?)";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, t.getS_id());
			pstm.setString(2, t.getSemester());
			pstm.setString(3, t.getSubjects());
			pstm.setFloat(4, t.getPoints());
			pstm.setInt(5, t.getCredits() );
			
			
			results =pstm.executeUpdate();
			conn.close();
			
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return results;
}

	@Override
	public int update(points_detail t) {
		int results = 0;
		try {
		Connection conn = connect.getConnection();
		
		String sql = "update points_detail"+
		" set "+
		" semester=?"+
		", subjects=?"+
		", points=?"+
		", credits=?"+
		" where s_id=?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		
		pstm.setString(1,t.getSemester());
		pstm.setString(2, t.getSubjects());
		pstm.setFloat(3,t.getPoints());
		pstm.setInt(4, t.getCredits());
		pstm.setString(5,t.getS_id());
		
		results = pstm.executeUpdate();
		conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}
	

	@Override
	public int delete(points_detail t) {
		// TODO Auto-generated method stub
		int results = 0;
		try {
		Connection conn = connect.getConnection();
		
		String sql = "delete from points_detail"+
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
	public ArrayList<points_detail> selectAll() {
		ArrayList<points_detail> results = new ArrayList<points_detail>();
		try {
		Connection conn = connect.getConnection();
		
		String sql = "select * from points_detail";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		
		while(rs.next()) {
			String s_id = rs.getString("s_id");
			String semester = rs.getString("semester");
			String subjects = rs.getString("subjects");
			float points = rs.getFloat("points");
			int credits = rs.getInt("credits");
			
			points_detail points_detail = new points_detail(s_id, semester, subjects, points, credits);
			results.add(points_detail);
		
		}
		conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return results;
	}
		

	@Override
	public points_detail selectByid(points_detail t) {
		
		points_detail results = null;
		Connection conn = connect.getConnection();
		String sql = "select * from points_detail where s_id=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, t.getS_id());
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				String s_id = rs.getString("s_id");
				String semester = rs.getString("semester");
				String subjects = rs.getString("subjects");
				float points = rs.getFloat("points");
				int credits = rs.getInt("credits");
				
				results = new points_detail(s_id, semester, subjects, points, credits );
			}
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}
		
	
}
