package sol;

public abstract class Person {
	// Attributes
	protected int id;
	protected String lastName;
	protected String name;
	protected String code;
	

	//constructor
	public Person() {
		super();
	}
	public Person(int id,String lastName, String name, String code) {
		this.id = id;
		this.lastName = lastName;
		this.name = name;
		this.code = code;
	}
	// Getters and Setters
	public int getId() {
		return this.id;
	}

	public abstract void setId(int id);

	public String getLastName() {
		return this.lastName;
	}

	public abstract void setLastName(String lastName);

	public String getName(){
		return this.name;
	}

	public abstract void setName(String name);
	
	public String getCode() {
		return this.code;
		
	}
	
	public abstract void setCode(String code);

}
