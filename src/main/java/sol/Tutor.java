package sol;

import javax.persistence.*;;
@Entity
@Table(name = "TUTOR")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "ID", length = 20)),
	@AttributeOverride(name = "lastName", column = @Column(name = "LASTNAME", length = 30)),
	@AttributeOverride(name = "name", column = @Column(name = "NAME", length = 30)),
	@AttributeOverride(name = "code", column = @Column(name = "CODE", length = 4)) })
public class Tutor extends Teacher {
	
	//Constructor
	public Tutor() {
		super();
	}
	
	public Tutor(String lastName,String name) {
		super(lastName, name);
	}	
}
