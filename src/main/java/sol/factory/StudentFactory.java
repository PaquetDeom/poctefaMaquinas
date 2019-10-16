package sol.factory;

import java.util.List;

import javax.persistence.Query;

import sol.Clas;
import sol.Student;
import sol.Teacher;

public class StudentFactory extends GeneralFactory {

	@Override
	public Object findByName(Object object) {

		Query query = getEm().createQuery("SELECT Student FROM Student where Student.stu=:stu");
		query.setParameter("stu", (String) object);

		return (String) query.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Student> findStudentByClasAndTeacher(Clas clas,Teacher teacher ){
		
		Query query = getEm().createQuery("SELECT Student FROM Student where Student.teacher=:teacher and Student.clas=:clas");
		query.setParameter("teacher", teacher);
		query.setParameter("clas",  clas);

		return (List<Student>)  query.getResultList();
		
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
