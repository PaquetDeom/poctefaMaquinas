package sol.factory;

import java.util.List;

import javax.persistence.Query;

public class PasswordFactory extends GeneralFactory {

	@Override
	public Object findByName(Object object) {

		Query query = getEm().createQuery("SELECT Password FROM Password where Password.pass=:pass");
		query.setParameter("pass", (String) object);

		return (String) query.getSingleResult();
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
