package testSol;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sol.Teacher;

public class TestTeacher {

	@Test
	public void testName() {

		try {

			String name = "           name";
			Teacher teach = new Teacher(0, "", name, "", "", "");

			assertTrue(teach.getName().equals("PAQUET"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
