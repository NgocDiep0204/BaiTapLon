package test;

import java.sql.Date;
import java.util.ArrayList;

import DAO.pointsDAO;
import DAO.studentDAO;
import Information.points;
import Information.student;

public class test_student {
	public static void main(String[] args) {
		//String str ="2021/01/02";
		//Date date = Date.valueOf(str);
		//student student1 = new student("211212001","dg","fg", "hhhh","2000/09/01" , "jgjg","dgd", "hdhh");
		//studentDAO.getInstance().insert(student1);
		//studentDAO.getMethod().update(student1);
		//studentDAO.getInstance().delete(student1);
		//pointsDAO.getInstance().selectByid(points1);
		
		ArrayList<student> list;
		list = studentDAO.getMethod().selectAll();
		for(student student:list) {
			System.out.println(student.toString());
		}
		student find = new student();
		find.setS_id("211212001");
		student student2 = studentDAO.getMethod().selectByid(find);
		System.out.println(student2);
		
//		for(int i =0; i<10; i++) {
//			student student3 = new student();
//		    studentDAO.getMethod().delete(student3);
//			
//		}
	}
}
