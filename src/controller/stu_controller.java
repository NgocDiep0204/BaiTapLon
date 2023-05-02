package controller;

import java.awt.event.ActionEvent;


import Information.student;
import java.awt.event.ActionListener;

import view.studentJFr;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAO.studentDAO;

public class stu_controller implements ActionListener{

	private studentJFr studentJFr1;
	
	public stu_controller(studentJFr studentJFr1) {
		this.studentJFr1 = studentJFr1;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String ac = e.getActionCommand();
		
		if(ac.equals("Thêm")) {
			String s_id = this.studentJFr1.getTextField_msv().getText();
			String s_name = this.studentJFr1.getTextField_hoten().getText();
			String sex = this.studentJFr1.getTextField_gtinh().getText();
			String date_of_birth = this.studentJFr1.getTextField_ngsinh().getText();
			String address = this.studentJFr1.getTextField_diachi().getText();
			String classes = this.studentJFr1.getTextField_lop().getText();
			String course = this.studentJFr1.getTextField_khoa().getText();
			String majors = this.studentJFr1.getTextField_nganh().getText();
			 
			student student = new student(s_id, s_name, sex, date_of_birth, address, classes, course, majors );
			
			ArrayList<student> list = new ArrayList<>();
			list = studentDAO.getMethod().selectAll();
			
			boolean check = false;
			
			for(student id_check : list) {
				if(id_check.getS_id().compareTo(s_id)== 0) {
					check = true;
				}
			}
			
			if(check == true) {
				JOptionPane.showMessageDialog(studentJFr1, "Mã sinh viên đã tồn tại",
							"Error",
							JOptionPane.ERROR_MESSAGE
						);
			}
			if(check == false) {
				//studentDAO.getMethod().insert(student);
				this.studentJFr1.insert_st(student);
				this.studentJFr1.xoaForm();
				
				JOptionPane.showMessageDialog(studentJFr1, "Thêm thành công",
						"",
						JOptionPane.INFORMATION_MESSAGE
						);
			}
			
			this.studentJFr1.xoaForm();
			
		}else if(ac.equals("Sửa")) {
			
			String s_id = this.studentJFr1.getTextField_msv().getText();
			String s_name = this.studentJFr1.getTextField_hoten().getText();
			String sex = this.studentJFr1.getTextField_gtinh().getText();
			String date_of_birth = this.studentJFr1.getTextField_ngsinh().getText();
			String address = this.studentJFr1.getTextField_diachi().getText();
			String classes = this.studentJFr1.getTextField_lop().getText();
			String course = this.studentJFr1.getTextField_khoa().getText();
			String majors = this.studentJFr1.getTextField_nganh().getText();
			 
			student student = new student(s_id, s_name, sex, date_of_birth, address, classes, course, majors );
			
			ArrayList<student> list = new ArrayList<>();
			list = studentDAO.getMethod().selectAll();
			
			boolean check = false;
			
			for(student students : list) {
				if(students.getS_id().compareTo(s_id)== 0) {
					check = true;
				}
			}
			
			if(check == false) {
				JOptionPane.showMessageDialog(studentJFr1, "Không tồn tại mã sinh viên đã tồn tại",
							"Error",
							JOptionPane.ERROR_MESSAGE
						);
			}
			if(check == true) {
				//studentDAO.getMethod().update(student);
				studentDAO.getMethod().update(student);
				JOptionPane.showMessageDialog(studentJFr1, "Thêm thành công",
						"",
						JOptionPane.INFORMATION_MESSAGE
						);
				//this.studentJFr1.show_selectedStudent();
			}
		
			
		}else if(ac.equals("Xoá")) {
			
			String s_id = this.studentJFr1.getTextField_timkiem().getText();
			student st= new student();
			st.setS_id(s_id);
			
			ArrayList<student> list = new ArrayList<>();
			list = studentDAO.getMethod().selectAll();
			
			boolean check = false;
			
			for(student students : list) {
				if(students.getS_id().compareTo(s_id)== 0) {
					check = true;
				}
			}
			
			if(check == false) {
				JOptionPane.showMessageDialog(studentJFr1, "Không tồn tại mã sinh viên ",
							"Error",
							JOptionPane.ERROR_MESSAGE
						);
			}
			else {
				
				studentDAO.getMethod().delete(st);
				JOptionPane.showMessageDialog(studentJFr1, "Xoá thành công",
						"",
						JOptionPane.INFORMATION_MESSAGE
						);
				
			}
			
			
			
		}else if(ac.equals("Tìm kiếm")) {
			
			String s_id = this.studentJFr1.getTextField().getText();
			
			
			student st= new student();
			
			ArrayList<student> list = new ArrayList<>();
			list = studentDAO.getMethod().selectAll();
			
			boolean check_msv = false;
			
			for(student students : list) {
				if(students.getS_id().equals(s_id)) {
					check_msv = true;
					st = students;
				} 
			}
			
			if(check_msv == true) {
				
				JOptionPane.showMessageDialog(studentJFr1, st.toString(),
						"",
						JOptionPane.INFORMATION_MESSAGE
						);
			}
			else if(check_msv == false) {
				
				JOptionPane.showMessageDialog(studentJFr1, "Không tồn tại mã sinh viên ",
						"Error",
						JOptionPane.ERROR_MESSAGE
						);
				

				
			}
			
		}else if(ac.equals("Xem tất cả")) {
			this.studentJFr1.sellectAll_st();
		}else {
			
			System.exit(0);
		}
	}
}
	

