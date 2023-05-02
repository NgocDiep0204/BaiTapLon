package Information;

public class points {
	private String s_id;
	private String semester;
	private float gpa;
	
	public points() {
		super();
	}
	
	public points(String s_id, String semester, float gpa) {
		super();
		this.s_id = s_id;
		this.semester = semester;
		this.gpa = gpa;
	}

	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "points [s_id=" + s_id + ", semester=" + semester + ", gpa=" + gpa + "]";
	}
	
	
	
}
