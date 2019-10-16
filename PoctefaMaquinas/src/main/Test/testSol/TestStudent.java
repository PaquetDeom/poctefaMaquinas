package testSol;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sol.Student;
import sol.Student;

public class TestStudent {
		@Test
		public void TestId() {
			try {
				Student t= new Student(12345, "", "", "");
				assertTrue(t.getId()>0);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		@Test
		public void TestName() {
			String name="Jane";
			for (int i = 0; i < 7; i++) {
				switch (i) {
					case 0:{
						Student t= new Student(0, "", "   Jane", "");
						assertTrue(name.equals(t.getName()));
					}break;
					
					case 1:{
						Student t= new Student(0, "", "Jane    ", "");
						assertTrue(name.equals(t.getName()));
					}break;
					
					case 2:{
						Student t= new Student(0, "", "JANE","");
						assertTrue(name.equals(t.getName()));				
					}break;
					
					case 3:{
						Student t= new Student(0, "", "jane","");
						assertTrue(name.equals(t.getName()));
					}break;
					
					case 4:{
						Student t= new Student(0, "", "Janie","");
						assertTrue(name.equals(t.getName()));
					}break;
					
					case 5:{
						Student t= new Student(0, "", "jaNe","");
						assertTrue(name.equals(t.getName()));
					}break;
					
					case 6:{
						Student t= new Student(0, "", "Jane","");
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
						Student t= new Student(0, "   SMITH", "", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;
					
					case 1:{
						Student t= new Student(0, "SMITH   ", "","");
						assertTrue(lastName.equals(t.getLastName()));
					}break;
					
					case 2:{
						Student t= new Student(0, "Smith", "", "");
						assertTrue(lastName.equals(t.getLastName()));				
					}break;
					
					case 3:{
						Student t= new Student(0, "SMItH", "", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;
					
					case 4:{
						Student t= new Student(0, "smith", "", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;
					
					case 5:{
						Student t= new Student(0, "SMETH", "", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;
					
					case 6:{
						Student t= new Student(0, "SMITH", "", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;			
				}
			}
		}
		@Test
		public void TestCode() {
			Student t= new Student(0, "", "", "1111");
			assertTrue(t.getCode().length()==4);
			for (int i = 0; i < 4; i++) {
				assertTrue(t.getCode().charAt(i)<=90 && t.getCode().charAt(i)>=65 );
			}
		}
}
