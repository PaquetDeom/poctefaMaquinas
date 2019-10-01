package sol;

import java.util.Random;

import sol.factory.PasswordFactory;

public class Password {
	// Attributes
	private String password = null;
	private int id;

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
		String passFactory = passwordFactory.findPasswordByName(pass);

		if (!pass.equals(passFactory))
			this.password = pass;
		else
			new Password();
	}
}
