package testSol;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import sol.Password;

public class TestPassword {
	
	@Test
	public void Test() {
		
		try {
			Password pass = new Password();
			assertTrue(pass.getPassword().length()==8);
			for(int i=0;i<7;++i) {
				assertTrue(pass.getPassword().charAt(i)<=57 && pass.getPassword().charAt(i)>=48);
			}
			assertTrue(pass.getPassword().charAt(7)<=65 && pass.getPassword().charAt(7)>=90);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
