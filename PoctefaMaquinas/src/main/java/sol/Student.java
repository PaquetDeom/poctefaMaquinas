package sol;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "ID", length = 20)),
		@AttributeOverride(name = "lastName", column = @Column(name = "LASTNAME", length = 30)),
		@AttributeOverride(name = "name", column = @Column(name = "NAME", length = 30)),
		@AttributeOverride(name = "code", column = @Column(name = "CODE", length = 4)) })
public class Student extends Person {

	@OneToMany
	private List<Maquina> maquinas = null;

	@ManyToMany
	private List<Teacher> teachers = null;

	@ManyToOne
	private Clas clas = null;

	
	public List<Maquina> getMaquinas() {
		if (maquinas == null)
			maquinas = new ArrayList<Maquina>();
		return maquinas;
	}

	public void addMaquinas(Maquina maquina) {
		getMaquinas().add(maquina);
	}

	public List<Teacher> getTeachers() {
		if (teachers == null)
			teachers = new ArrayList<Teacher>();
		return teachers;
	}

	public void addTeachers(Teacher teacher) {
		getTeachers().add(teacher);
	}

	// Constructor
	public Student(String lastName, String name) {
		super(lastName, name);
	}

	public Student(String lastName, String name, Clas clas) {
		this(lastName, name);
		setClas(clas);
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", lastName=" + lastName + ", name=" + name + ", code=" + code + "]";
	}

	public Clas getClas() {
		return clas;
	}

	private void setClas(Clas clas) {
		this.clas = clas;
	}

}
