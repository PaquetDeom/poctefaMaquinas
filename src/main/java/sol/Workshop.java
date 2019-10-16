package sol;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.vaadin.annotations.AutoGenerated;

@Entity
@Table(name = "WORKSHOP")
public class Workshop {

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Maquina> maquinas = null;

	@Id
	@Column
	@AutoGenerated
	private int id = 0;

	@Column(length = 50)
	private String name = null;

	@ManyToOne
	private HighSchool highSchool = null;
	

	// constructor
	public Workshop() {
		super();
	}

	public Workshop(String name, HighSchool highSchool) {
		super();
		setName(name);
		setHighSchool(highSchool);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {

		name = name.trim().toUpperCase();
		this.name = name;
	}

	public HighSchool getHighSchool() {
		return highSchool;
	}

	private void setHighSchool(HighSchool highSchool) {
		this.highSchool = highSchool;
	}

	public List<Maquina> getMaquinas() {
		if(maquinas == null)
			maquinas = new ArrayList<Maquina>();
		return maquinas;
	}

	public void setMaquinas(List<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
}
