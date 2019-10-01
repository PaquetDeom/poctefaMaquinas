package sol;


public class Student extends Person{
	//Attributes
	Boolean permission = false;
	
	//Constructor
	public Student(int id,String lastName, String name, String code) {
		super(id,lastName, name, code);
		 permission = false;
	}

	//Setters (Getters in Person)
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
	public void setCode(String code) {
		// TODO Auto-generated method stub
		this.code = code;
		
	}

	public Boolean getPermission() {
		return permission;
	}

	public void setPermission(Boolean permission) {
		this.permission = permission;
	}



}
