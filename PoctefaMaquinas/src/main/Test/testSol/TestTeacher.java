package testSol;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import sol.Teacher;


public class TestTeacher {
	@Test
	public void TestPassword() {
		Teacher t = new Teacher(0,"","","","1234567A");
		assertTrue(t.getPassword().length()==8);
		for(int i=0;i<7;++i) {
			assertTrue(t.getPassword().charAt(i)<=57 && t.getPassword().charAt(i)>=48);
		}
		assertTrue(t.getPassword().charAt(7)<=65 && t.getPassword().charAt(7)>=90);

	}
	@Test
	public void TestUsername() {
		Teacher t= new Teacher(0,"Maylinch Girona","Jordi","","");
		String user="JMaylinchGirona";
		assertTrue(t.getUsername().equals(user));
	}
	@Test
	public void TestId() {
		Teacher t= new Teacher(12345,"","","","");
		assertTrue(t.getId()>0);
	}
	@Test
	public void TestName() {
		String name="Jane";
		for (int i = 0; i < 7; i++) {
			switch (i) {
				case 0:{
					Teacher t= new Teacher(0, "", "   Jane", "","");
					assertTrue(name.equals(t.getName()));
				}break;
				
				case 1:{
					Teacher t= new Teacher(0, "", "Jane    ", "","");
					assertTrue(name.equals(t.getName()));
				}break;
				
				case 2:{
					Teacher t= new Teacher(0, "", "JANE", "","");
					assertTrue(name.equals(t.getName()));				
				}break;
				
				case 3:{
					Teacher t= new Teacher(0, "", "jane", "","");
					assertTrue(name.equals(t.getName()));
				}break;
				
				case 4:{
					Teacher t= new Teacher(0, "", "Janie", "","");
					assertTrue(name.equals(t.getName()));
				}break;
				
				case 5:{
					Teacher t= new Teacher(0, "", "jaNe", "","");
					assertTrue(name.equals(t.getName()));
				}break;
				
				case 6:{
					Teacher t= new Teacher(0, "", "Jane", "","");
					assertTrue(name.equals(t.getName()));
				}break;			
			}
		}
	}
	@Test
	public void TestLastName() {
		String lastName="SMITH";
		for (int i = 0; i < 7; i++) {
			switch (i) {
				case 0:{
					Teacher t= new Teacher(0, "   SMITH", "", "","");
					assertTrue(lastName.equals(t.getLastName()));
				}break;
				
				case 1:{
					Teacher t= new Teacher(0, "SMITH   ", "", "","");
					assertTrue(lastName.equals(t.getLastName()));
				}break;
				
				case 2:{
					Teacher t= new Teacher(0, "Smith", "", "","");
					assertTrue(lastName.equals(t.getLastName()));				
				}break;
				
				case 3:{
					Teacher t= new Teacher(0, "SMItH", "", "","");
					assertTrue(lastName.equals(t.getLastName()));
				}break;
				
				case 4:{
					Teacher t= new Teacher(0, "smith", "", "","");
					assertTrue(lastName.equals(t.getLastName()));
				}break;
				
				case 5:{
					Teacher t= new Teacher(0, "SMETH", "", "","");
					assertTrue(lastName.equals(t.getLastName()));
				}break;
				
				case 6:{
					Teacher t= new Teacher(0, "SMITH", "", "","");
					assertTrue(lastName.equals(t.getLastName()));
				}break;			
			}
		}
	}
	@Test
	public void TestCode() {
		Teacher t= new Teacher(0, "", "", "1111", "");
		assertTrue(t.getCode().length()==4);
		for (int i = 0; i < 4; i++) {
			assertTrue(t.getCode().charAt(i)<=90 && t.getCode().charAt(i)>=65 );
		}
	}
}