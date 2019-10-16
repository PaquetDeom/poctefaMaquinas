package sol;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "CLASS")
public class Clas {
	// Attributes
	@Column(length = 50)
	String nameClass = null;

	@Column(length = 50)
	String nameSchool = null;

	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	private List<Student> students = null;

	@Id
	@Column
	@GeneratedValue
	private int id = 0;

	public Clas() {
		super();
	}

	public Clas(String nameClass, String nameSchool) {
		this(nameClass);
		setNameSchool(nameSchool);
	}

	public Clas(String name) {
		super();
		setNameClass(name);
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		nameClass = nameClass.trim().toUpperCase();
		this.nameClass = nameClass;
	}

	public String getNameSchool() {
		return nameSchool;
	}

	public void setNameSchool(String nameSchool) {
		nameSchool = nameSchool.trim().toUpperCase();
		this.nameSchool = nameSchool;
	}

	public List<Student> getStudents() {
		if (students == null)
			students = new ArrayList<Student>();
		return students;
	}

	public void addStudent(Student student) {
		getStudents().add(student);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
}
