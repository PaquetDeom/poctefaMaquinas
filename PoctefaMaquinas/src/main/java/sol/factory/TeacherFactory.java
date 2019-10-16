package sol.factory;

import java.util.List;

import javax.persistence.Query;

import sol.Clas;
import sol.Student;
import sol.Teacher; 

public class TeacherFactory extends GeneralFactory {

	@Override
	public Object findByName(Object object) {
		Query query = getEm().createQuery("SELECT Teacher FROM Teacher where Teacher.teacher=:teacher");
		query.setParameter("teacher", (String) object);
	

		return (String) query.getSingleResult();
	}
	@SuppressWarnings("unchecked")
	public List<Teacher> findTeacherByClasAndStudent(Clas clas,Student student ){
			
			Query query = getEm().createQuery("SELECT Teacher FROM Teacher where Teacher.student=:student and Teacher.clas=:clas");
			query.setParameter("student", student);
			query.setParameter("clas",  clas);
	
			return (List<Teacher>)  query.getResultList();
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
