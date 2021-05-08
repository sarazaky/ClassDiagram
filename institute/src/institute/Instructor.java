package institute;

import java.sql.Time;
import java.util.Arrays;

public class Instructor extends Person{
	private Time officeHours;
	private Subject[] courses;
	
	public Instructor(String name) {
		super(name);
	}
	public Instructor(String name, Time officeHours) {
		super(name);
		this.officeHours = officeHours;
	}
	public Time getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(Time officeHours) {
		this.officeHours = officeHours;
	}
	public Subject[] getCourses() {
		return courses;
	}
	public void setCourses(Subject[] courses) {
		this.courses = courses;
	}
	public void displayInfo() {
		System.out.println("Instructor name: " + super.name +"\nOffice Hours:" + this.officeHours 
				+ "\nList of Subjects: "+ Arrays.toString(this.courses));
	}

}
