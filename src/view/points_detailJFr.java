package view;

import java.awt.EventQueue;
import DAO.*;

import controller.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import DAO.points_detailDAO;

import Information.*;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class points_detailJFr extends JFrame {

	private JPanel contentPane;
	private JTextField textField_msv;
	private JTextField textField_hocky;
	private JTextField textField_mon;
	private JTextField textField_diem;
	private JTextField textField_sotin;
	private JTextField textField_timkiem;
	private JTable table;
	//private JTable table_1;

	public JTextField getTextField() {
		return textField_msv;
	}

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

	public JTextField getTextField_mon() {
		return textField_mon;
	}

	public void setTextField_mon(JTextField textField_mon) {
		this.textField_mon = textField_mon;
	}

	public JTextField getTextField_diem() {
		return textField_diem;
	}

	public void setTextField_diem(JTextField textField_diem) {
		this.textField_diem = textField_diem;
	}

	public JTextField getTextField_sotin() {
		return textField_sotin;
	}

	public void setTextField_sotin(JTextField textField_sotin) {
		this.textField_sotin = textField_sotin;
	}

	public JTextField getTextField_timkiem() {
		return textField_timkiem;
	}

	public void setTextField_timkiem(JTextField textField_timkiem) {
		this.textField_timkiem = textField_timkiem;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					points_detailJFr frame = new points_detailJFr();
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
	public points_detailJFr() {
		point_detailcontroller action = new  point_detailcontroller(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1261, 672);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Menu");
		menuBar.add(Menu);
		Menu.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JMenuItem menu_ctiet = new JMenuItem("Chi tiết điểm sinh viên");

		menu_ctiet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Menu.add(menu_ctiet);
		
		JMenuItem menu_diem = new JMenuItem("Điểm sinh viên");

		menu_diem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Menu.add(menu_diem);
		
		JMenuItem menu_dssv = new JMenuItem("Danh sách sinh viên");

		menu_dssv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Menu.add(menu_dssv);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản lý sinh viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setBounds(478, 11, 276, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_msv = new JLabel("Msv");
		lblNewLabel_msv.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_msv.setBounds(162, 63, 92, 31);
		contentPane.add(lblNewLabel_msv);
		
		JLabel lblNewLabel_hocky = new JLabel("Học kỳ");
		lblNewLabel_hocky.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_hocky.setBounds(162, 105, 92, 40);
		contentPane.add(lblNewLabel_hocky);
		
		JLabel lblNewLabel_mon = new JLabel("Môn");
		lblNewLabel_mon.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_mon.setBounds(162, 156, 92, 31);
		contentPane.add(lblNewLabel_mon);
		
		JLabel lblNewLabel_diem = new JLabel("Điểm môn");
		lblNewLabel_diem.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_diem.setBounds(638, 54, 116, 40);
		contentPane.add(lblNewLabel_diem);
		
		JLabel lblNewLabel_sotin = new JLabel("Số tín");
		lblNewLabel_sotin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_sotin.setBounds(638, 110, 85, 31);
		contentPane.add(lblNewLabel_sotin);
		
		textField_msv = new JTextField();
		textField_msv.setColumns(10);
		textField_msv.setBounds(266, 67, 257, 31);
		contentPane.add(textField_msv);
		
		textField_hocky = new JTextField();
		textField_hocky.setColumns(10);
		textField_hocky.setBounds(266, 116, 257, 31);
		contentPane.add(textField_hocky);
		
		textField_mon = new JTextField();
		textField_mon.setColumns(10);
		textField_mon.setBounds(264, 162, 257, 31);
		contentPane.add(textField_mon);
		
		textField_diem = new JTextField();
		textField_diem.setColumns(10);
		textField_diem.setBounds(815, 69, 257, 31);
		contentPane.add(textField_diem);
		
		textField_sotin = new JTextField();
		textField_sotin.setColumns(10);
		textField_sotin.setBounds(815, 116, 257, 31);
		contentPane.add(textField_sotin);
		
		JLabel lblNewLabel_timkiem = new JLabel("Msv");
		
		lblNewLabel_timkiem.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_timkiem.setBounds(638, 149, 92, 45);
		contentPane.add(lblNewLabel_timkiem);
		
		textField_timkiem = new JTextField();
		textField_timkiem.setColumns(10);
		textField_timkiem.setBounds(736, 162, 127, 31);
		contentPane.add(textField_timkiem);
		
		JButton btnNewButton_timkiem = new JButton("Tìm kiếm");
		btnNewButton_timkiem.addActionListener(action);
		btnNewButton_timkiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_timkiem.setBounds(923, 152, 117, 42);
		contentPane.add(btnNewButton_timkiem);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(156, 277, 970, 221);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Msv", "H\u1ECDc k\u1EF3", "M\u00F4n", "\u0110i\u1EC3m m\u00F4n", "S\u1ED1 t\u00EDn"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(41);
		table.getColumnModel().getColumn(0).setMinWidth(35);
		table.getColumnModel().getColumn(1).setPreferredWidth(66);
		table.getColumnModel().getColumn(1).setMinWidth(35);
		table.getColumnModel().getColumn(2).setPreferredWidth(107);
		table.getColumnModel().getColumn(2).setMinWidth(35);
		table.getColumnModel().getColumn(3).setMinWidth(35);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(4).setMinWidth(35);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scrollPane.setViewportView(table);
		
		JSeparator separator = new JSeparator();
		scrollPane.setColumnHeaderView(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(69, 222, 1127, 31);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_msv_6 = new JLabel("Chi tiết bảng điểm sinh viên");
		lblNewLabel_msv_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_msv_6.setBounds(124, 235, 314, 31);
		contentPane.add(lblNewLabel_msv_6);
		
		JButton btnNewButton_them = new JButton("Thêm");
		btnNewButton_them.addActionListener(action);
		btnNewButton_them.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_them.setBounds(187, 537, 139, 40);
		contentPane.add(btnNewButton_them);
		
		JButton btnNewButton_sua = new JButton("Sửa");
		btnNewButton_sua.addActionListener(action);
		btnNewButton_sua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_sua.setBounds(384, 537, 139, 40);
		contentPane.add(btnNewButton_sua);
		
		JButton btnNewButton_xoa = new JButton("Xoá");
		btnNewButton_xoa.addActionListener(action);
		btnNewButton_xoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_xoa.setBounds(625, 537, 139, 40);
		contentPane.add(btnNewButton_xoa);
		
		JButton btnNewButton_xemall = new JButton("Xem tất cả");
		btnNewButton_xemall.addActionListener(action);
		btnNewButton_xemall.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_xemall.setBounds(835, 537, 139, 40);
		contentPane.add(btnNewButton_xemall);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(201, 509, 872, 31);
		contentPane.add(separator_2);
	}
	
	
	public void insert_pd(points_detail pd) {
		  points_detailDAO.getMethod().insert(pd);
		  DefaultTableModel model = (DefaultTableModel) table.getModel();
		  //model.setRowCount(0);
		  model.addRow(new Object[] {pd.getS_id(),
				  					 pd.getSemester(),
				  					 pd.getSubjects(),
				  					 pd.getPoints(),
				  					 pd.getCredits()
				  					 
				  					 });
	}
	
	public void update_pd(points_detail pd) {
		  points_detailDAO.getMethod().update(pd);
		  DefaultTableModel model = (DefaultTableModel) table.getModel();
		  //model.setRowCount(0);
		  model.addRow(new Object[] {pd.getS_id(),
				  					 pd.getSemester(),
				  					 pd.getSubjects(),
				  					 pd.getPoints(),
				  					 pd.getCredits()
				  					 
				  					 });
	}
	
	public void delete_pd(points_detail pd) {
		  points_detailDAO.getMethod().insert(pd);
		  DefaultTableModel model = (DefaultTableModel) table.getModel();
		  //model.setRowCount(0);
		  model.addRow(new Object[] {pd.getS_id(),
				  					 pd.getSemester(),
				  					 pd.getSubjects(),
				  					 pd.getPoints(),
				  					 pd.getCredits()
				  					 
				  					 });
	}
	public void selectAll_pd() {
		  ArrayList<points_detail> list = points_detailDAO.getMethod().selectAll();
		  DefaultTableModel model = (DefaultTableModel) table.getModel();
		  model.setRowCount(0);
		  for(points_detail pd : list) {
		  model.addRow(new Object[] {pd.getS_id(),
				  					 pd.getSemester(),
				  					 pd.getSubjects(),
				  					 pd.getPoints(),
				  					 pd.getCredits()
				  					 
				  					 });
		  }
		  
	}
	
	public void selectByid_pd(points_detail pd) {
		  points_detailDAO.getMethod().selectByid(pd);
		  DefaultTableModel model = (DefaultTableModel) table.getModel();
		  //model.setRowCount(0);
		  model.addRow(new Object[] {pd.getS_id(),
				  					 pd.getSemester(),
				  					 pd.getSubjects(),
				  					 pd.getPoints(),
				  					 pd.getCredits()
				  					 
				  					 });
	}
	
	public void xoaForm() {
		// TODO Auto-generated method stub
		  textField_msv.setText("");
		  textField_hocky.setText("");
		  textField_mon.setText("");
		  textField_diem.setText("");
		  textField_sotin.setText("");
	}
	
		public static void chitiet() {
			EventQueue.invokeLater(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						points_detailJFr ct = new points_detailJFr();
						ct.setVisible(true);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			
			});
		}
		
	
}
