package institute;

public class Student extends Person{
	private int ID;
	private Subject[] courses;
	
	public Student(String name) {
		super(name);
	}
	public Student(String name, int ID) {
		super(name);
		this.ID = ID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Subject[] getCourses() {
		return courses;
	}
	public void setCourses(Subject[] courses) {
		this.courses = courses;
	}
	public int getTotalGrade() {
		int totalGrade = 0;
		for(Subject s : this.courses) {
			totalGrade += s.getGrade();
		}
		
		return totalGrade;
	}

}
