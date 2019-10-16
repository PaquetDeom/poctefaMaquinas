package sol;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "ID", length = 20)),
		@AttributeOverride(name = "lastName", column = @Column(name = "LASTNAME", length = 30)),
		@AttributeOverride(name = "name", column = @Column(name = "NAME", length = 30)),
		@AttributeOverride(name = "code", column = @Column(name = "CODE", length = 4)) })
public class Teacher extends Person {
	// Attributes
	
	@Id
	@GeneratedValue
	@Column
	private int id = 0;
	
	@Column(name = "USERNAME", length = 50)
	private String username = null;
	
	@Column(name = "PASSWORD", length = 50)
	private Password password = null;

	@ManyToMany
	private List<Maquina> maquinas = null;
	
	@ManyToMany
	private List<Student> students = null;

	
	public List<Maquina> getMaquinas() {
		if (maquinas == null)
			maquinas = new ArrayList<Maquina>();
		return maquinas;
	}

	public void addMaquinas(Maquina maquina) {
		getMaquinas().add(maquina);
	}

	public List<Student> getStudents() {
		if (students == null)
			students = new ArrayList<Student>();
		return students;
	}

	public void addStudent(Student student) {
		getStudents().add(student);
	}

	// Constructor
	public Teacher() {
		super();
	}

	public Teacher(String lastName, String name) {
		super(lastName, name);
		setUsername(lastName, name);
		password.setPassword();
	}

	// Getters and Setters

	public String getUsername() {
		return username;
	}

	// username = 1 letter of last name and all letters of name
	private void setUsername(String lastName, String name) {
		username = name.trim().charAt(0) + lastName.trim().replaceAll(" ","");
		this.username = username.toUpperCase();
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public boolean givePermission() {
		return false;
	}

}
