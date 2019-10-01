package sol;

public class Teacher extends Person implements APassword{
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
	public String getUsername() {
		return username;
	}

	public void setUsername(String lastName, String name) {
		username = name.charAt(0)+name;
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

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public void setPassword(String pass) {
		this.password = pass;
		
	}

}
