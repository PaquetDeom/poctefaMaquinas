package sol.factory;

import java.util.List;

import javax.persistence.Query;

public class PersonFactory extends GeneralFactory {

	@Override
	public Object findByName(Object object) {

		Query query = getEm().createQuery("SELECT Person FROM Person where Person.per=:per");
		query.setParameter("per", (String) object);

		return (String) query.getSingleResult();
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
