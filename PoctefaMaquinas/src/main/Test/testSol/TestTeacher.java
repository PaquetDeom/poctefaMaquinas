package testSol;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import sol.Teacher;


public class TestTeacher {
	
	
	@Test
	public void TestUsername() {
		Teacher t= new Teacher("Jordi","");
		String user="JMaylinchGirona";
		assertTrue(t.getUsername().equals(user));
	}
	@Test
	public void TestId() {
		Teacher t= new Teacher("","");
		assertTrue(t.getId()>0);
	}
	@Test
	public void TestName() {
		String name="Jane";
		for (int i = 0; i < 7; i++) {
			switch (i) {
				case 0:{
					Teacher t= new Teacher("   Jane", "");
					assertTrue(name.equals(t.getName()));
				}break;
				
				case 1:{
					Teacher t= new Teacher( "Jane    ", "");
					assertTrue(name.equals(t.getName()));
				}break;
				
				case 2:{
					Teacher t= new Teacher( "JANE","");
					assertTrue(name.equals(t.getName()));				
				}break;
				
				case 3:{
					Teacher t= new Teacher("jane","");
					assertTrue(name.equals(t.getName()));
				}break;
				
				case 4:{
					Teacher t= new Teacher("Janie", "");
					assertTrue(name.equals(t.getName()));
				}break;
				
				case 5:{
					Teacher t= new Teacher("jaNe", "");
					assertTrue(name.equals(t.getName()));
				}break;
				
				case 6:{
					Teacher t= new Teacher("Jane","");
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
					Teacher t= new Teacher("   SMITH","");
					assertTrue(lastName.equals(t.getLastName()));
				}break;
				
				case 1:{
					Teacher t= new Teacher("SMITH   ",  "");
					assertTrue(lastName.equals(t.getLastName()));
				}break;
				
				case 2:{
					Teacher t= new Teacher( "Smith", "");
					assertTrue(lastName.equals(t.getLastName()));				
				}break;
				
				case 3:{
					Teacher t= new Teacher( "SMItH", "");
					assertTrue(lastName.equals(t.getLastName()));
				}break;
				
				case 4:{
					Teacher t= new Teacher( "smith", "");
					assertTrue(lastName.equals(t.getLastName()));
				}break;
				
				case 5:{
					Teacher t= new Teacher( "SMETH", "");
					assertTrue(lastName.equals(t.getLastName()));
				}break;
				
				case 6:{
					Teacher t= new Teacher( "SMITH", "");
					assertTrue(lastName.equals(t.getLastName()));
				}break;			
			}
		}
	}
	@Test
	public void TestCode() {
		Teacher t= new Teacher(  "1111", "");
		assertTrue(t.getCode().length()==4);
		for (int i = 0; i < 4; i++) {
			assertTrue(t.getCode().charAt(i)<=90 && t.getCode().charAt(i)>=65 );
		}
	}
}