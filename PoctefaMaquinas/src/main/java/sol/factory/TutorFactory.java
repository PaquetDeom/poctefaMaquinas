package sol.factory;

import java.util.List;

import javax.persistence.Query;

public class TutorFactory extends GeneralFactory {

	@Override
	public Object findByName(Object object) {

		Query query = getEm().createQuery("SELECT Tutor FROM Tutor where Tutor.tut=:tut");
		query.setParameter("tut", (String) object);

		return (String) query.getSingleResult();
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
