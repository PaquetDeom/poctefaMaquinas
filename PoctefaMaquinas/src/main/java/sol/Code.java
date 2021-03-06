package sol;


import java.util.Random;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column; 

@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name = "ID", length = 20))
})
public class Code {
	//Attributes
	private String code = null;

	public String getCode() {
		return this.code;
	}
	//code = 4 numbers (int)
	public void setCode() {
		Random numRandom = new Random();
		int num;
		
		if(code.length()>4 || code.length()<4) {
			for(int i=0; i <4; ++i) {
				num = numRandom.nextInt(10);
				code = code+num;
			}
		}
		
		this.code = code;
	}
	
	
	
	

}
