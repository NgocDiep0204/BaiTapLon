package Information;

import java.sql.Date;

public class student {
	
	private String s_id;
	private String s_name;
	private String sex;
	private String date_of_birth;
	private String address;
	private String classes;
	private String course;
	private String majors;
	
	public student() {
		super();
	}
	
	public student(String s_id, String s_name, String sex, String date_of_birth, String address, String classes,
			String course, String majors) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.sex = sex;
		this.date_of_birth = date_of_birth;
		this.address = address;
		this.classes = classes;
		this.course = course;
		this.majors = majors;
	}

	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = adress;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	@Override
	public String toString() {
		return "student [s_id=" + s_id + ", s_name=" + s_name + ", sex=" + sex + ", date_of_birth=" + date_of_birth
				+ ", address=" + address + ", classes=" + classes + ", course=" + course + ", majors=" + majors + "]";
	}

	
	
	
	
}
