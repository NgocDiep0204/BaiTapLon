package test;

import java.util.ArrayList;

import DAO.pointsDAO;
import Information.points;

public class test_points {
public static void main(String[] args) {
	points points1 = new points("hhd","dg", 2);
	//pointsDAO.getMethod().insert(points1);
	//pointsDAO.getMethod().update(points1);
	//pointsDAO.getMethod().delete(points1);
	//pointsDAO.getInstance().selectByid(points1);
	
	ArrayList<points> list;
	list = pointsDAO.getMethod().selectAll();
	for(points points:list) {
		System.out.println(points.toString());
	}
	points find = new points();
	find.setS_id("211212010");
	//points points2 = pointsDAO.getMethod().selectByid(find);
	//System.out.println(points2);
	
	for(int i =0; i<20; i++) {
		points points3 = new points();
		points3.setS_id("211212001");
		pointsDAO.getMethod().delete(points3);
		
	}
}
}

