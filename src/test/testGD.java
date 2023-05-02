package test;


import javax.swing.UIManager;


import view.studentJFr;

public class testGD {
	public static void main(String[] args) {
		try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new studentJFr();
	}catch(Exception e) {
		e.printStackTrace();
	}
}}
