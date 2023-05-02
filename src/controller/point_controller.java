package controller;

import java.awt.HeadlessException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAO.pointsDAO;

import Information.points;

import view.pointsJFr;

public class point_controller implements ActionListener{
		private pointsJFr pointsJFr1;

		public point_controller(pointsJFr pointsJFr1) {
			super();
			this.pointsJFr1 = pointsJFr1;
		}
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String acp = e.getActionCommand();
		
		if(acp.equals("Thêm")) {
			
			try {
				String s_id = this.pointsJFr1.getTextField_msv().getText();
				String semester = this.pointsJFr1.getTextField_hocky().getText();
				float gpa = Float.valueOf(this.pointsJFr1.getTextField_gpa().getText());
				
				 
				points points = new points(s_id, semester, gpa );
				
				ArrayList<points> list = pointsDAO.getMethod().selectAll();
				
				
				boolean check = false;
				
				for(points id_check : list) {
					if(id_check.getS_id().compareTo(s_id)== 0) {
						check = true;
					}
				}
				
				if(check == true) {
					JOptionPane.showMessageDialog(pointsJFr1, "Mã sinh viên đã tồn tại",
								"Error",
								JOptionPane.ERROR_MESSAGE
							);
				}
				if(check == false) {
					//studentDAO.getMethod().insert(student);
					this.pointsJFr1.insert_p(points);
					JOptionPane.showMessageDialog(pointsJFr1, "Thêm thành công",
							"",
							JOptionPane.INFORMATION_MESSAGE
							);
				}

				this.pointsJFr1.xoaForm();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(acp.equals("Sửa")) {
			
			try {
				String s_id = this.pointsJFr1.getTextField_msv().getText();
				String semester = this.pointsJFr1.getTextField_hocky().getText();
				float gpa = Float.valueOf(this.pointsJFr1.getTextField_gpa().getText());
				
				 
				points points = new points(s_id, semester, gpa );
				
				ArrayList<points> list = pointsDAO.getMethod().selectAll();
				
				boolean check = false;
				
				for(points point1 : list) {
					if(point1.getS_id().compareTo(s_id)== 0) {
						check = true;
					}
				}
				
				if(check == false) {
					JOptionPane.showMessageDialog(pointsJFr1, "Không tồn tại mã sinh viên đã tồn tại",
								"Error",
								JOptionPane.ERROR_MESSAGE
							);
				}
				if(check == true) {
					pointsDAO.getMethod().update(points);
					//this.pointsJFr1.update_p(points);
					JOptionPane.showMessageDialog(pointsJFr1, "Thêm thành công",
							"",
							JOptionPane.INFORMATION_MESSAGE
							);
					//this.studentJFr1.show_selectedStudent();
				}
			} catch (NumberFormatException | HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			
		}else if(acp.equals("Xoá")) {
			
			try {
				String s_id = this.pointsJFr1.getTextField().getText();
				points p = new points();
				p.setS_id(s_id);
				
				
				ArrayList<points> list = pointsDAO.getMethod().selectAll();
				
				boolean check = false;
				
				for(points point1 : list) {
					if(point1.getS_id().compareTo(s_id)== 0) {
						check = true;
					}
				}
				
				if(check == false) {
					JOptionPane.showMessageDialog(pointsJFr1, "Không tồn tại mã sinh viên ",
								"Error",
								JOptionPane.ERROR_MESSAGE
							);
				}
				else {
					
					pointsDAO.getMethod().delete(p);
					
					JOptionPane.showMessageDialog(pointsJFr1, "Xoá thành công",
							"",
							JOptionPane.INFORMATION_MESSAGE
							);
					
				}
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		}else if(acp.equals("Tìm kiếm")) {
			
			try {
				String s_id = this.pointsJFr1.getTextField().getText();
				points p = new points();
				ArrayList<points> list = pointsDAO.getMethod().selectAll();
				
				boolean check = false;
				
				for(points point1 : list) {
					if(point1.getS_id().equals(s_id)) {
						check = true;
						p = point1;
					}
				}
				
				if(check == true) {
					
					//this.pointsJFr1.selectByid_p(p);
					JOptionPane.showMessageDialog(pointsJFr1,p.toString(),
							"",
							JOptionPane.INFORMATION_MESSAGE
							);
					
				}
				else if(check == false) {
					
					JOptionPane.showMessageDialog(pointsJFr1, "Không tồn tại mã sinh viên ",
							"Error",
							JOptionPane.ERROR_MESSAGE
							);
					

					
				}
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}else if(acp.equals("Xem tất cả")) {
			this.pointsJFr1.sellectAll_p();
		
	}
		
	}

		
}
