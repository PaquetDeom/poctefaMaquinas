package sol;
import java.util.ArrayList;

public class Permission {
	//Attributes
	private ArrayList<String> codes;
	private boolean coincide;
	

	//Getters and Setters
	public boolean isPermission(Student student) {
		for(int i = codes.size();i>0; --i) {
			if(codes.get(i).equals(student.code)) {
				return student.getPermission();
			}
			
		}
		
		return false;
		
	}

	public void setPermission(Student student) {
		boolean coincide = false; 
		
		for(int i = codes.size(); !coincide && i>0; --i) {
			if(codes.get(i).equals(student.code)) {
				coincide = true;
				student.setPermission(true);
			}else student.setPermission(false);
		}
		
			
	}
	
	

}
