package sol.factory;

import java.util.List;

import javax.persistence.EntityTransaction;

import fr.paquet.dataBase.Connect;

public abstract class GeneralFactory extends Connect{
	
	public GeneralFactory() {
		super();
	}
	
	public void persist(Object object) {

		EntityTransaction t = getEm().getTransaction();

		try {
			t.begin();
			getEm().persist(object);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw (e);
		}
		
	}
	
	public void remove(Object object) {

		EntityTransaction t = getEm().getTransaction();

		try {
			t.begin();
			getEm().remove(object);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw (e);
		}
		
	}
	
	public abstract Object findByName(Object object);
	
	public abstract List<Object> findAll();

}
