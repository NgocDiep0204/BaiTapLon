package controller;

import java.awt.HeadlessException;
import Information.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAO.pointsDAO;
import DAO.points_detailDAO;
import Information.points;
import view.pointsJFr;
import view.points_detailJFr;

public class point_detailcontroller implements ActionListener {
	private points_detailJFr points_detailJFr1;

	public point_detailcontroller(points_detailJFr points_detailJFr1) {
		super();
		this.points_detailJFr1 = points_detailJFr1;
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String acpd = e.getActionCommand();
	
	if(acpd.equals("Thêm")) {
		
		try {
			String s_id = this.points_detailJFr1.getTextField_msv().getText();
			String semester = this.points_detailJFr1.getTextField_hocky().getText();
			String subjects = this.points_detailJFr1.getTextField_mon().getText();
			float points = Float.valueOf(this.points_detailJFr1.getTextField_diem().getText());
			int credits = Integer.valueOf(this.points_detailJFr1.getTextField_sotin().getText());
			 
			points_detail pd = new points_detail(s_id, semester, subjects, points, credits );
			
			ArrayList<points_detail> list = points_detailDAO.getMethod().selectAll();
			
			
			boolean check = false;
			
			for(points_detail pd1 : list) {
				if(pd1.getS_id().compareTo(s_id)== 0) {
					check = true;
				}
			}
			
			if(check == true) {
				JOptionPane.showMessageDialog(points_detailJFr1, "Mã sinh viên đã tồn tại",
							"Error",
							JOptionPane.ERROR_MESSAGE
						);
			}
			if(check == false) {
				//points_detailDAO.getMethod().insert(pd);
				this.points_detailJFr1.insert_pd(pd);
				JOptionPane.showMessageDialog(points_detailJFr1, "Thêm thành công",
						"",
						JOptionPane.INFORMATION_MESSAGE
						);
			}

			this.points_detailJFr1.xoaForm();
		}   catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			   e1.printStackTrace();
		}   catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}else if(acpd.equals("Sửa")) {
		
		try {
			String s_id = this.points_detailJFr1.getTextField_msv().getText();
			String semester = this.points_detailJFr1.getTextField_hocky().getText();
			String subjects = this.points_detailJFr1.getTextField_mon().getText();
			float points = Float.valueOf(this.points_detailJFr1.getTextField_diem().getText());
			int credits = Integer.valueOf(this.points_detailJFr1.getTextField_sotin().getText());
			 
			points_detail pd = new points_detail(s_id, semester, subjects, points, credits );
			ArrayList<points_detail> list = points_detailDAO.getMethod().selectAll();
			
			boolean check = false;
			
			for(points_detail pd1 : list) {
				if(pd1.getS_id().compareTo(s_id)== 0) {
					check = true;
				}
			}
			
			if(check == false) {
				JOptionPane.showMessageDialog(points_detailJFr1, "Không tồn tại mã sinh viên đã tồn tại",
							"Error",
							JOptionPane.ERROR_MESSAGE
						);
			}
			if(check == true) {
				
				//this.points_detailJFr1.update_pd(pd);
				points_detailDAO.getMethod().update(pd);
				JOptionPane.showMessageDialog(points_detailJFr1, "Thêm thành công",
						"",
						JOptionPane.INFORMATION_MESSAGE
						);
				//this.studentJFr1.show_selectedStudent();
			}
		} catch (NumberFormatException | HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
	}else if(acpd.equals("Xoá")) {
		
		try {
			String s_id = this.points_detailJFr1.getTextField_timkiem().getText();
			points_detail pd = new points_detail();
			pd.setS_id(s_id);
			
			
			ArrayList<points_detail> list = points_detailDAO.getMethod().selectAll();
			
			boolean check = false;
			
			for(points_detail pd1 : list) {
				if(pd1.getS_id().compareTo(s_id)== 0) {
					check = true;
				}
			}
			
			if(check == false) {
				JOptionPane.showMessageDialog(points_detailJFr1, "Không tồn tại mã sinh viên ",
							"Error",
							JOptionPane.ERROR_MESSAGE
						);
			}
			else {
				
				points_detailDAO.getMethod().delete(pd);
				
				JOptionPane.showMessageDialog(points_detailJFr1, "Xoá thành công",
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
		
		
		
	}else if(acpd.equals("Tìm kiếm")) {
		
		try {
			String s_id = this.points_detailJFr1.getTextField_timkiem().getText();
			points_detail pd = new points_detail();
			ArrayList<points_detail> list = points_detailDAO.getMethod().selectAll();
			
			boolean check = false;
			
			for(points_detail pd1 : list) {
				if(pd1.getS_id().equals(s_id)) {
					check = true;
					pd = pd1;
				}
			}
			
			if(check == true) {
				
				//this.pointsJFr1.selectByid_p(p);
				JOptionPane.showMessageDialog(points_detailJFr1,pd.toString(),
						"",
						JOptionPane.INFORMATION_MESSAGE
						);
				
			}
			else if(check == false) {
				
				JOptionPane.showMessageDialog(points_detailJFr1, "Không tồn tại mã sinh viên ",
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
		
	}else if(acpd.equals("Xem tất cả")) {
		
		this.points_detailJFr1.selectAll_pd();
	
}
	
}

	
}
