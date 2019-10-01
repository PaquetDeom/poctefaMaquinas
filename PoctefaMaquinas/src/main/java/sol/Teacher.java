package sol;

import java.util.Random;

public class Teacher extends Person {
	//Attributes
	private String username;
	private String password;
	
	//Constructor
	public Teacher(int id, String lastName, String name,String code, String username,String password) {
		super(id, lastName, name,code);
		setUsername(lastName, name);
		setPassword(password);
	}

	//Getters and Setters
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
		
	//username = 1 letter of last name and all letters of name
	public void setUsername(String lastName, String name) {
		username = lastName.charAt(0)+name;
		this.username = username.toUpperCase();
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
		
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName = lastName;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}


	
}
