package sol;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
	// Attributes

	@Id
	@Column(name = "ID", length = 20)
	protected int id;

	@Column(name = "LASTNAME", length = 30)
	protected String lastName = null;

	@Column(name = "NAME", length = 30)
	protected String name = null;

	@Column(name = "CODE", length = 4)
	protected String code = null;

	// constructor
	public Person() {
		super();
	}

	public Person(String lastName, String name) {
		super();

		setLastName(lastName);
		setName(name);

	}

	// Getters and Setters
	public int getId() {
		return this.id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return this.lastName;
	}

	public abstract void setLastName(String lastName);

	public String getName() {
		return this.name;
	}

	public abstract void setName(String name);

	public String getCode() {
		return this.code;

	}

	public abstract void setCode(String code);

}
