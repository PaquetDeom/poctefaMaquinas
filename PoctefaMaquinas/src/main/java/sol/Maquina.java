package sol;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table("MAQUINE")
public class Maquina {

	@Id
	@GeneratedValue
	@Column
	private int id = 0;

	@Column(length = 50)
	private String name = null;

	@Column(length = 50)
	private String code = null;

	public Maquina() {
		super();
	}

	public Maquina(String name) {
		super();
		setName(name);
	}

	public Maquina(String name, String code) {
		this(name);
		setCode(code);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		name = name.trim().toUpperCase();
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	private void setCode(String code) {
		this.code = code;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

}
