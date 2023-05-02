package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

import Connect_sql.connect;
import Information.student;

public class studentDAO implements dao<student>{
	
	public static studentDAO getMethod() {
		return new studentDAO();
	}

	@Override
	public int insert(student t) {
		int results = 0;
		try {
			//tao ket noi csdl
			Connection conn = connect.getConnection();
			
			//dao doi tuong statement
			String sql = "insert into student"+
					 " values(?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, t.getS_id());
			pstm.setString(2, t.getS_name());
			pstm.setString(3, t.getSex());
			pstm.setString(4, t.getDate_of_birth());
			pstm.setString(5, t.getAddress());
			pstm.setString(6, t.getClasses());
			pstm.setString(7, t.getCourse());
			pstm.setString(8, t.getMajors());
			
			//thuc thi cau lech sql
			results = pstm.executeUpdate();
			
			conn.close();
			
						 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}

	@Override
	public int update(student t) {
		// TODO Auto-generated method stub
		
		int results = 0;
		try {
		Connection conn = connect.getConnection();
		
		String sql = "update student" +
		" set "+
		" s_name=?"+
		", sex=?"+
		", date_of_birth=?"+
		", address=?"+
		", classes=?"+
		", course=?"+
		", majors=?"+
		" where s_id=?";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
	
		pstm.setString(2,t.getSex());
		pstm.setString(1,t.getS_name());
		pstm.setString(3,t.getDate_of_birth());
		pstm.setString(4,t.getAddress());
		pstm.setString(5,t.getClasses());
		pstm.setString(6,t.getCourse());
		pstm.setString(7,t.getMajors());
		pstm.setString(8,t.getS_id());
		
		results = pstm.executeUpdate();
		
		conn.close();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}

	@Override
	public int delete(student t) {
		// TODO Auto-generated method stub
		int results = 0;
		try {
		Connection conn = connect.getConnection();
		
		String sql = "delete from student"+
					 " where s_id=?";
		
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1,t.getS_id());
			
			
			results = pstm.executeUpdate();
			conn.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return results;
	}

	@Override
	public ArrayList<student> selectAll() {
		// TODO Auto-generated method stub
		
		ArrayList<student> results = new ArrayList<student>();
		try {
		Connection conn = connect.getConnection();
		
		String sql = "select * from student";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery(sql);
		
		while(rs.next()) {
			String s_id = rs.getString("s_id");
			String s_name = rs.getString("s_name");
			String sex = rs.getString("sex");
			String date_of_birth = rs.getString("date_of_birth");
			String address = rs.getString("address");
			String classes = rs.getString("classes");
			String course = rs.getString("course");
			String majors = rs.getString("majors");
			
			student student = new student(s_id, s_name, sex, date_of_birth, address, classes, course, majors  );
			
			results.add(student);
		}
		conn.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return results;
	}


	@Override
	public student selectByid(student t) {
		// TODO Auto-generated method stub
		student results = null;
		Connection conn = connect.getConnection();
		String sql = "select * from student where s_id=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, t.getS_id());
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				String s_id = rs.getString("s_id");
				String s_name = rs.getString("s_name");
				String sex = rs.getString("sex");
				String date_of_birth = rs.getString("date_of_birth");
				String address = rs.getString("address");
				String classes = rs.getString("classes");
				String course = rs.getString("course");
				String majors = rs.getString("majors");
				
				results = new student(s_id, s_name, sex, date_of_birth, address, classes, course, majors);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return results;
	}
	
}