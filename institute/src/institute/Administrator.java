package institute;

public class Administrator extends Person{
	private String contact;
	private String role;
	
	public Administrator(String name) {
		super(name);
	}
	public Administrator(String name, String contact, String role) {
		super(name);
		this.contact = contact;
		this.role = role ;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
