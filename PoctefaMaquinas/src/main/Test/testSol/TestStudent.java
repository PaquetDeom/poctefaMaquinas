package testSol;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sol.Student;
import sol.Student;

public class TestStudent {
		
		@Test
		public void TestName() {
			String name="Jane";
			for (int i = 0; i < 7; i++) {
				switch (i) {
					case 0:{
						Student t= new Student("", "   Jane");
						assertTrue(name.equals(t.getName()));
					}break;
					
					case 1:{
						Student t= new Student("", "Jane    ");
						assertTrue(name.equals(t.getName()));
					}break;
					
					case 2:{
						Student t= new Student( "", "JANE");
						assertTrue(name.equals(t.getName()));				
					}break;
					
					case 3:{
						Student t= new Student("", "jane");
						assertTrue(name.equals(t.getName()));
					}break;
					
					case 4:{
						Student t= new Student( "", "Janie");
						assertTrue(name.equals(t.getName()));
					}break;
					
					case 5:{
						Student t= new Student( "", "jaNe");
						assertTrue(name.equals(t.getName()));
					}break;
					
					case 6:{
						Student t= new Student( "", "Jane");
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
						Student t= new Student( "   SMITH", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;
					
					case 1:{
						Student t= new Student( "SMITH   ", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;
					
					case 2:{
						Student t= new Student( "Smith", "");
						assertTrue(lastName.equals(t.getLastName()));				
					}break;
					
					case 3:{
						Student t= new Student("SMItH", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;
					
					case 4:{
						Student t= new Student("smith", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;
					
					case 5:{
						Student t= new Student( "SMETH", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;
					
					case 6:{
						Student t= new Student("SMITH", "");
						assertTrue(lastName.equals(t.getLastName()));
					}break;			
				}
			}
		}
		@Test
		public void TestCode() {
			Student t= new Student("", "1111");
			assertTrue(t.getCode().length()==4);
			for (int i = 0; i < 4; i++) {
				assertTrue(t.getCode().charAt(i)<=90 && t.getCode().charAt(i)>=65 );
			}
		}
}
