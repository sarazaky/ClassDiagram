package institute;

public class EducationalInstitute {
	
	private String name;
	private Person[] students;
	private Person[] instructors;
	private Person[] admins;
	
	public EducationalInstitute(String name, Person[] students, Person[] instructors, Person[] admins) {
		this.name = name;
		this.students = students;
		this.instructors = instructors;
		this.admins = admins;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person[] getStudents() {
		return students;
	}

	public void setStudents(Person[] students) {
		this.students = students;
	}

	public Person[] getInstructors() {
		return instructors;
	}

	public void setInstructors(Person[] instructors) {
		this.instructors = instructors;
	}

	public Person[] getAdmins() {
		return admins;
	}

	public void setAdmins(Person[] admins) {
		this.admins = admins;
	}

}
