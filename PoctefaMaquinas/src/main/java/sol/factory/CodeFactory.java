package sol.factory;


import java.util.List;
import javax.persistence.Query;

public class CodeFactory extends GeneralFactory {
	
	@Override
	public Object findByName(Object object) {

		Query query = getEm().createQuery("SELECT Code FROM Code where Code.code=:code");
		query.setParameter("code", (String) object);
		
		return(String) query.getSingleResult();
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	