package sol;

import java.util.Random;
import javax.persistence.*;
import sol.factory.PasswordFactory;

@Entity
@Table(name="PASSWORD")
public class Password {
	// Attributes
	@Column
	private String password = null;
	@Id
	@GeneratedValue
	@Column
	private int id = 0;
	

	public Password() {
		super();
		// Password = 6 numbers and 1 letter
		setPassword();
	}

	public String getPassword() {
		return password;
	}

	public void setPasswordManually(String password) {
		this.password = password;
	}

	public void setPassword() {

		Random numRandom = new Random();
		int num = 0;
		String pass = "";
		for (int i = 0; i < 8; ++i) {
			num = numRandom.nextInt(10);
			pass = pass + num;
		}
		num = numRandom.nextInt(26) + 65;
		pass = pass + (char) num;

		PasswordFactory passwordFactory = new PasswordFactory();
		String passFactory = (String) passwordFactory.findByName(pass);

		if (!pass.equals(passFactory))
			this.password = pass;
		else
			new Password();
	}
}
