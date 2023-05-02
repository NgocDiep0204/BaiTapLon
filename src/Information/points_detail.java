package Information;

import java.util.Objects;

public class points_detail {
	private String s_id;
	private String semester;
	private String subjects;
	private float points;
	private int credits;
	
	public points_detail() {
		super();
	}
	
	public points_detail(String s_id, String semester, String subjects, float points, int credits) {
		super();
		this.s_id = s_id;
		this.semester = semester;
		this.subjects = subjects;
		this.points = points;
		this.credits = credits;
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

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public float getPoints() {
		return points;
	}

	public void setPoints(float points) {
		this.points = points;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "points_detail [s_id=" + s_id + ", semester=" + semester + ", subjects=" + subjects + ", points="
				+ points + ", credits=" + credits + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(credits, points, s_id, semester, subjects);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		points_detail other = (points_detail) obj;
		return credits == other.credits && Float.floatToIntBits(points) == Float.floatToIntBits(other.points)
				&& Objects.equals(s_id, other.s_id) && Objects.equals(semester, other.semester)
				&& Objects.equals(subjects, other.subjects);
	}
	
	
	
	
}
