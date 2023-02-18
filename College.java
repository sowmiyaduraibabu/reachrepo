package ArrayList;

public class College {
	
	private String studentName;
	private String subject;
	private int age;
	private boolean isMale;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public College(String studentName, String subject, int age, boolean isMale) {
		super();
		this.studentName = studentName;
		this.subject = subject;
		this.age = age;
		this.isMale = isMale;
	}
	
	public String toString() {
		return "College studentName=" + studentName + ", subject=" + subject + ", age=" + age + ", isMale=" + isMale;
	}
	
	

}
