package view;

import java.awt.EventQueue;
import DAO.studentDAO;
import controller.stu_controller;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;
import java.util.function.Consumer;
import java.util.*;
import Information.*;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Connect_sql.connect;
import Information.student;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentJFr extends JFrame {

	private JPanel contentPane;
	private JTextField textField_msv;
	private JTextField textField_hoten;
	private JTextField textField_gtinh;
	private JTextField textField_ngsinh;
	private JTextField textField_lop;
	private JTextField textField_khoa;
	private JTextField textField_nganh;
	private JTextField textField_diachi;
	private JTable table;
	private JTextField textField_timkiem;

	public JTextField getTextField_timkiem() {
		return textField_timkiem;
	}

	public void setTextField_timkiem(JTextField textField_timkiem) {
		this.textField_timkiem = textField_timkiem;
	}

	public JTextField getTextField_msv() {
		return textField_msv;
	}

	public void setTextField_msv(JTextField textField_msv) {
		this.textField_msv = textField_msv;
	}

	public JTextField getTextField_hoten() {
		return textField_hoten;
	}

	public void setTextField_hoten(JTextField textField_hoten) {
		this.textField_hoten = textField_hoten;
	}

	public JTextField getTextField_gtinh() {
		return textField_gtinh;
	}

	public void setTextField_gtinh(JTextField textField_gtinh) {
		this.textField_gtinh = textField_gtinh;
	}

	public JTextField getTextField_ngsinh() {
		return textField_ngsinh;
	}

	public void setTextField_ngsinh(JTextField textField_ngsinh) {
		this.textField_ngsinh = textField_ngsinh;
	}

	public JTextField getTextField_lop() {
		return textField_lop;
	}

	public void setTextField_lop(JTextField textField_lop) {
		this.textField_lop = textField_lop;
	}

	public JTextField getTextField_khoa() {
		return textField_khoa;
	}

	public void setTextField_khoa(JTextField textField_khoa) {
		this.textField_khoa = textField_khoa;
	}

	public JTextField getTextField_nganh() {
		return textField_nganh;
	}

	public void setTextField_nganh(JTextField textField_nganh) {
		this.textField_nganh = textField_nganh;
	}

	public JTextField getTextField_diachi() {
		return textField_diachi;
	}

	public void setTextField_diachi(JTextField textField_diachi) {
		this.textField_diachi = textField_diachi;
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
					studentJFr frame = new studentJFr();
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
	public studentJFr() {
		stu_controller action = new stu_controller(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1207, 668);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		menu.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JMenuItem menu_ctiet = new JMenuItem("Chi tiết điểm sinh viên");
		menu_ctiet.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				points_detailJFr.chitiet();
				//pd.chitiet();
			}
		});

		menu_ctiet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu.add(menu_ctiet);

		JMenuItem menu_bangdiem = new JMenuItem("Điểm sinh viên");
		menu_bangdiem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//pointsJFr p = new pointsJFr();
				pointsJFr.bangdiem();
			}
		});

		// menu_bangdiem.addActionListener(action);
		menu_bangdiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu.add(menu_bangdiem);

		JMenuItem menu_dssv = new JMenuItem("Danh sách sinh viên");
		menu_dssv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				studentJFr.dssv();
			}
		});
		menu_dssv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menu.add(menu_dssv);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Quản lý sinh viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(410, -6, 365, 41);
		contentPane.add(lblNewLabel);

		JLabel label_msv = new JLabel("Msv\r\n");
		label_msv.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_msv.setBounds(89, 63, 94, 29);
		contentPane.add(label_msv);

		JLabel label_hoten = new JLabel("Họ tên");
		label_hoten.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_hoten.setBounds(89, 103, 94, 29);
		contentPane.add(label_hoten);

		JLabel label_gtinh = new JLabel("Giới tính");
		label_gtinh.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_gtinh.setBounds(89, 143, 106, 31);
		contentPane.add(label_gtinh);

		JLabel label_ngsinh = new JLabel("Ngày sinh");
		label_ngsinh.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_ngsinh.setBounds(89, 185, 125, 31);
		contentPane.add(label_ngsinh);

		JLabel label_diachi = new JLabel("Địa chỉ");
		label_diachi.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_diachi.setBounds(675, 63, 106, 29);
		contentPane.add(label_diachi);

		JLabel label_lop = new JLabel("Lớp");
		label_lop.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_lop.setBounds(675, 102, 125, 29);
		contentPane.add(label_lop);

		JLabel label_khoa = new JLabel("Khoá");
		label_khoa.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_khoa.setBounds(675, 143, 100, 31);
		contentPane.add(label_khoa);

		JLabel label_nganh = new JLabel("Ngành học");
		label_nganh.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_nganh.setBounds(675, 185, 125, 31);
		contentPane.add(label_nganh);

		textField_msv = new JTextField();
		textField_msv.setBounds(224, 63, 288, 29);
		contentPane.add(textField_msv);
		textField_msv.setColumns(10);

		textField_hoten = new JTextField();
		textField_hoten.setColumns(10);
		textField_hoten.setBounds(224, 108, 288, 29);
		contentPane.add(textField_hoten);

		textField_gtinh = new JTextField();
		textField_gtinh.setColumns(10);
		textField_gtinh.setBounds(224, 149, 288, 29);
		contentPane.add(textField_gtinh);

		textField_ngsinh = new JTextField();
		textField_ngsinh.setColumns(10);
		textField_ngsinh.setBounds(224, 192, 288, 29);
		contentPane.add(textField_ngsinh);

		textField_lop = new JTextField();
		textField_lop.setColumns(10);
		textField_lop.setBounds(880, 111, 288, 31);
		contentPane.add(textField_lop);

		textField_khoa = new JTextField();
		textField_khoa.setColumns(10);
		textField_khoa.setBounds(880, 153, 288, 29);
		contentPane.add(textField_khoa);

		textField_nganh = new JTextField();
		textField_nganh.setColumns(10);
		textField_nganh.setBounds(880, 192, 288, 29);
		contentPane.add(textField_nganh);

		textField_diachi = new JTextField();
		textField_diachi.setColumns(10);
		textField_diachi.setBounds(880, 69, 288, 29);
		contentPane.add(textField_diachi);

		JLabel lblNewLabel_1 = new JLabel("Msv");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(353, 467, 60, 31);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton_timkiem = new JButton("Tìm kiếm");
		btnNewButton_timkiem.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_timkiem.setBounds(675, 467, 157, 31);
		btnNewButton_timkiem.addActionListener(action);
		contentPane.add(btnNewButton_timkiem);

		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(10, 22, 1249, -9);
		contentPane.add(horizontalStrut_1);

		JButton btnNewButton_them = new JButton("Thêm");
		btnNewButton_them.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_them.setBounds(253, 528, 139, 40);
		btnNewButton_them.addActionListener(action);
		contentPane.add(btnNewButton_them);

		JButton btnNewButton_sua = new JButton("Sửa");
		btnNewButton_sua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_sua.setBounds(465, 528, 139, 40);
		btnNewButton_sua.addActionListener(action);
		contentPane.add(btnNewButton_sua);

		JButton btnNewButton_xoa = new JButton("Xoá");
		btnNewButton_xoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_xoa.setBounds(661, 528, 139, 40);
		btnNewButton_xoa.addActionListener(action);
		contentPane.add(btnNewButton_xoa);

		JButton btnNewButton_xemall = new JButton("Xem tất cả");
		btnNewButton_xemall.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_xemall.setBounds(854, 528, 144, 40);
		btnNewButton_xemall.addActionListener(action);
		contentPane.add(btnNewButton_xemall);

		JSeparator separator = new JSeparator();
		separator.setBounds(41, 227, 1179, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(41, 66, 1, 199);
		contentPane.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(78, 574, 157, -9);
		contentPane.add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(155, 515, 989, 2);
		contentPane.add(separator_3);

		JLabel label_msv_1 = new JLabel("Danh sách sinh viên");
		label_msv_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_msv_1.setBounds(89, 227, 247, 31);
		contentPane.add(label_msv_1);

		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Msv", "H\u1ECD t\u00EAn", "Gi\u1EDBi t\u00EDnh", "Ng\u00E0y sinh",
						"\u0110\u1ECBa ch\u1EC9", "L\u1EDBp", "Kho\u00E1", "Ng\u00E0nh h\u1ECDc" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(38);
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(88);
		table.getColumnModel().getColumn(2).setPreferredWidth(51);
		table.getColumnModel().getColumn(3).setPreferredWidth(62);
		table.getColumnModel().getColumn(4).setPreferredWidth(96);
		table.getColumnModel().getColumn(5).setPreferredWidth(49);
		table.getColumnModel().getColumn(6).setPreferredWidth(43);
		table.getColumnModel().getColumn(7).setPreferredWidth(88);
//		table.setBounds(66, 318, 1179, 252);
//		contentPane.add(table);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(99, 257, 1019, 199);
		contentPane.add(scrollPane);

		textField_timkiem = new JTextField();
		textField_timkiem.setBounds(471, 473, 165, 31);
		contentPane.add(textField_timkiem);
		textField_timkiem.setColumns(10);
		
		JButton btnNewButton_thoat = new JButton("Thoát");
		btnNewButton_thoat.addActionListener(action);
		btnNewButton_thoat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_thoat.setBounds(41, 528, 139, 40);
		contentPane.add(btnNewButton_thoat);

		// sellectAll_st();
		// insert_st(connect.getConnection());
		this.setVisible(true);
	}

	public void xoaForm() {
		// TODO Auto-generated method stub
		textField_msv.setText("");
		textField_hoten.setText("");
		textField_gtinh.setText("");
		textField_ngsinh.setText("");
		textField_diachi.setText("");
		textField_lop.setText("");
		textField_khoa.setText("");
		textField_nganh.setText("");
	}

	public void insert_st(student st) {

		studentDAO.getMethod().insert(st);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		// model.setRowCount(0);
		model.addRow(new Object[] { st.getS_id(), st.getS_name(), st.getSex(), st.getDate_of_birth(), st.getAddress(),
				st.getClasses(), st.getCourse(), st.getMajors() });

	}

//	  public student show_selectedStudent() {
//		  DefaultTableModel model = (DefaultTableModel) table.getModel();
//		  int i_row = table.getSelectedRow();
//		  
//		  String s_id = model.getValueAt(i_row, 0)+"";
//		  String s_name = model.getValueAt(i_row, 1)+"";
//		  String sex = model.getValueAt(i_row, 2)+"";
//		  String date_of_birth = model.getValueAt(i_row, 3)+"";
//		  String address = model.getValueAt(i_row, 4)+"";
//		  String classes =model.getValueAt(i_row, 5)+"";
//		  String course = model.getValueAt(i_row, 6)+"";
//		  String majors = model.getValueAt(i_row, 7)+"";
//		  
//		 student st = new student();
//		 return st;

//		 this.textField_msv.setText(s_id+"");
//		 this.textField_hoten.setText(s_name+"");
//		 this.textField_gtinh.setText(sex+"");
//		 this.textField_ngsinh.setText(date_of_birth+"");
//		 this.textField_diachi.setText(address+"");
//		 this.textField_lop.setText(classes+"");
//		 this.textField_khoa.setText(course+"");
//		 this.textField_nganh.setText(majors+""); 
	// }
	public void update_st(student st) {
		studentDAO.getMethod().update(st);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		// model.setRowCount(0);
		model.addRow(new Object[] { st.getS_id(), st.getS_name(), st.getSex(), st.getDate_of_birth(), st.getAddress(),
				st.getClasses(), st.getCourse(), st.getMajors() });

	}

	public void delete_st(student st) {
		studentDAO.getMethod().delete(st);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		model.addRow(new Object[] { st.getS_id(), st.getS_name(), st.getSex(), st.getDate_of_birth(), st.getAddress(),
				st.getClasses(), st.getCourse(), st.getMajors() });

	}

	public void selectByid_st(student st) {
		studentDAO.getMethod().selectByid(st);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		model.addRow(new Object[] { st.getS_id(), st.getS_name(), st.getSex(), st.getDate_of_birth(), st.getAddress(),
				st.getClasses(), st.getCourse(), st.getMajors() });

	}

	public void sellectAll_st() {

		ArrayList<student> list = studentDAO.getMethod().selectAll();

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);

		for (student t : list) {
			model.addRow(new Object[] { t.getS_id(), t.getS_name(), t.getSex(), t.getDate_of_birth(), t.getAddress(),
					t.getClasses(), t.getCourse(), t.getMajors() });
		}

	}
	
	public static void dssv() {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					studentJFr sv = new studentJFr();
					sv.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
	}
}
