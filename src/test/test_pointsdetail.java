package test;

import java.util.ArrayList;

import DAO.pointsDAO;
import DAO.points_detailDAO;
import DAO.studentDAO;
import Information.points;
import Information.points_detail;
import Information.student;

public class test_pointsdetail {
 public static void main(String[] args) {
	points_detail points1 = new points_detail("1222", "jj", "j",2, 1);
	points_detailDAO.getMethod().insert(points1);
	points_detail points2 = new points_detail("211212001", "jjl", "j",2, 1);
	points_detailDAO.getMethod().update(points2);
	ArrayList<points_detail> list;
	list = points_detailDAO.getMethod().selectAll();
	for(points_detail student: list) {
		System.out.println(student.toString());
	}
	points_detail find = new points_detail();
	find.setS_id("21121003");
	points_detail student2 = points_detailDAO.getMethod().selectByid(find);
	System.out.println(student2);
	
	for(int i =0; i<10; i++) {
		points_detail student3 = new points_detail();
		student3.setS_id("1222");
	    points_detailDAO.getMethod().delete(student3);
		
	}
}
}
