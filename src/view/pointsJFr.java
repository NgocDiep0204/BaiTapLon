package view;

import java.awt.EventQueue;
import controller.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.pointsDAO;
import DAO.studentDAO;
import Information.points;
import Information.student;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class pointsJFr extends JFrame {

	private JPanel contentPane;
	private JTextField textField_msv;
	private JTextField textField_hocky;
	private JTextField textField_gpa;
	private JTable table;
	private JTextField textField_timkiem;

	public JTextField getTextField_msv() {
		return textField_msv;
	}

	public void setTextField_msv(JTextField textField_msv) {
		this.textField_msv = textField_msv;
	}

	public JTextField getTextField_hocky() {
		return textField_hocky;
	}

	public void setTextField_hocky(JTextField textField_hocky) {
		this.textField_hocky = textField_hocky;
	}

	public JTextField getTextField_gpa() {
		return textField_gpa;
	}

	public void setTextField_gpa(JTextField textField_gpa) {
		this.textField_gpa = textField_gpa;
	}

	public JTextField getTextField() {
		return textField_timkiem;
	}

	public void setTextField(JTextField textField) {
		this.textField_timkiem = textField;
	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pointsJFr frame = new pointsJFr();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pointsJFr() {
		
		point_controller action = new point_controller(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1211, 668);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		menu.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JMenuItem menu_diem = new JMenuItem("Điểm sinh viên");
		menu_diem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu.add(menu_diem);
		
		JMenuItem menu_ctiet = new JMenuItem("Chi tiết điểm sinh viên");
		menu_ctiet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu.add(menu_ctiet);
		
		JMenuItem menu_dssv = new JMenuItem("Danh sách sinh viên");
		menu_dssv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu.add(menu_dssv);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản lý sinh viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setBounds(497, 11, 276, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_msv = new JLabel("Msv");
		lblNewLabel_msv.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_msv.setBounds(105, 67, 76, 52);
		contentPane.add(lblNewLabel_msv);
		
		JLabel lblNewLabel_hocky = new JLabel("Học kỳ");
		lblNewLabel_hocky.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_hocky.setBounds(507, 67, 96, 52);
		contentPane.add(lblNewLabel_hocky);
		
		JLabel lblNewLabel_gpa = new JLabel("GPA");
		lblNewLabel_gpa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_gpa.setBounds(894, 67, 76, 52);
		contentPane.add(lblNewLabel_gpa);
		
		textField_msv = new JTextField();
		textField_msv.setBounds(179, 82, 192, 34);
		contentPane.add(textField_msv);
		textField_msv.setColumns(10);
		
		textField_hocky = new JTextField();
		textField_hocky.setColumns(10);
		textField_hocky.setBounds(613, 82, 192, 34);
		contentPane.add(textField_hocky);
		
		textField_gpa = new JTextField();
		textField_gpa.setColumns(10);
		textField_gpa.setBounds(980, 82, 192, 34);
		contentPane.add(textField_gpa);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(105, 130, 1119, 20);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1_3 = new JLabel("Bảng điểm sinh viên");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(145, 146, 238, 45);
		contentPane.add(lblNewLabel_1_3);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Msv", "H\u1ECDc k\u1EF3", "GPA"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(36);
		table.getColumnModel().getColumn(1).setPreferredWidth(72);
		table.getColumnModel().getColumn(2).setPreferredWidth(32);
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		table.setBounds(35, 238, 1201, 270);
//		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(167, 202, 920, 247);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel_timkim = new JLabel("Msv");
		lblNewLabel_timkim.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_timkim.setBounds(365, 460, 76, 34);
		contentPane.add(lblNewLabel_timkim);
		
		textField_timkiem = new JTextField();
		textField_timkiem.setBounds(472, 460, 131, 33);
		contentPane.add(textField_timkiem);
		textField_timkiem.setColumns(10);
		
		JButton btnNewButton_timkiem = new JButton("Tìm kiếm");
		btnNewButton_timkiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_timkiem.addActionListener(action);
		btnNewButton_timkiem.setBounds(636, 467, 117, 42);
		contentPane.add(btnNewButton_timkiem);
		
		JButton btnNewButton_them = new JButton("Thêm");
		btnNewButton_them.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_them.setBounds(214, 534, 139, 40);
		btnNewButton_them.addActionListener(action);
		contentPane.add(btnNewButton_them);
		
		JButton btnNewButton_sua = new JButton("Sửa");
		btnNewButton_sua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_sua.setBounds(410, 534, 139, 40);
		btnNewButton_sua.addActionListener(action);
		contentPane.add(btnNewButton_sua);
		
		JButton btnNewButton_xoa = new JButton("Xoá");
		btnNewButton_xoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_xoa.setBounds(614, 534, 139, 40);
		btnNewButton_xoa.addActionListener(action);
		contentPane.add(btnNewButton_xoa);
		
		JButton btnNewButton_xemall = new JButton("Xem tất cả");
		btnNewButton_xemall.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_xemall.setBounds(819, 545, 139, 40);
		btnNewButton_xemall.addActionListener(action);
		contentPane.add(btnNewButton_xemall);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(127, 557, 998, -9);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(190, 520, 897, 34);
		contentPane.add(separator_2);
		
		
		this.setVisible(true);
	}

	public void insert_p(points p) {
		
			  pointsDAO.getMethod().insert(p);
			  DefaultTableModel model = (DefaultTableModel) table.getModel();
			  //model.setRowCount(0);
			  model.addRow(new Object[] {p.getS_id(),
					  					 p.getSemester(),
					  					 p.getGpa()
					  					 });
			     
		  }
	
	public void update_p(points p) {
		// TODO Auto-generated method stub
			  pointsDAO.getMethod().update(p);
			  DefaultTableModel model = (DefaultTableModel) table.getModel();
			  //model.setRowCount(0);
			  model.addRow(new Object[] {p.getS_id(),
					  					 p.getSemester(),
					  					 p.getGpa()
					  					 });
			     
		  }
	
	public void delete_p(points p) {
		// TODO Auto-generated method stub
			  pointsDAO.getMethod().delete(p);
			  DefaultTableModel model = (DefaultTableModel) table.getModel();
			 // model.setRowCount(0);
			  model.addRow(new Object[] {p.getS_id(),
					  					 p.getSemester(),
					  					 p.getGpa()
					  					 });
			     
		  }
	public void selectByid_p(points st) {
		  pointsDAO.getMethod().selectByid(st);
		  DefaultTableModel model = (DefaultTableModel) table.getModel();
		 // model.setRowCount(0);
		  model.addRow(new Object[] {st.getS_id(),
				  					 st.getSemester(),
				  					 st.getGpa()
		  });
	}
	
	 
	  public void sellectAll_p() {
		 
		  ArrayList<points> list = pointsDAO.getMethod().selectAll();
		 
		  DefaultTableModel model = (DefaultTableModel) table.getModel();
		  model.setRowCount(0);
		  
		 for(points t:list) {
			  model.addRow(new Object[] {
				  t.getS_id(),
				  t.getSemester(),
				  t.getGpa(),
			  });
		 }
}

	public void xoaForm() {
		// TODO Auto-generated method stub
		  textField_msv.setText("");
		  textField_hocky.setText("");
		  textField_gpa.setText("");
	}
	 
	public static void bangdiem() {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pointsJFr ct = new pointsJFr();
					ct.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
	}
	
}
	

	
	

