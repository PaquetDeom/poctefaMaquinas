package sol;


import java.util.Random;

public class Password {
	//Attributes
	private String password = null;
	private int id;
	
	

	public Password() {
		super();
	//Password = 6 numbers and 1 letter 
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
		int num;
		String pass="";
		for(int i=0; i<8; ++i) {
			num = numRandom.nextInt(10);
			pass = pass+numRandom;
		}
			num = numRandom.nextInt(26)+65;
			pass = pass + (char)num;
				
			this.password = pass;
}
	}
	
	

}
