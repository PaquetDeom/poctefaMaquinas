package testSol;
import javax.validation.constraints.AssertTrue;

import sol.Teacher;

public class TestTeacher {

	@Test

	public void testName() {
		try {
			String name = "   paquet";
			Teacher teach = new Teacher(0, "", name, "", "", "");

			AssertTrue(name.equals("PAQUET"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
