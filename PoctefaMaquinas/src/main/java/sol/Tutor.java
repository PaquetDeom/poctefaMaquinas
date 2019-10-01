package sol;

public class Tutor extends Teacher implements APassword {
	//Attributes
	String password;
	
	//Constructor
	public Tutor(int id, String lastName, String name, String code, String username, String password) {
		super(id, lastName, name, code, username);
		setPassword(password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}
	
	
}
