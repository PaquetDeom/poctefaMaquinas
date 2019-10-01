package sol.factory;

import javax.persistence.*;

import fr.paquet.dataBase.Connect;
import sol.Password;

public class PasswordFactory extends Connect {

	public PasswordFactory() {
		super();
	}

	/**
	 * persit un password</br>
	 * 
	 * @param pass
	 */
	public void persitPassword(Password pass) {

		EntityTransaction t = getEm().getTransaction();

		try {
			t.begin();
			getEm().persist(pass);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw (e);
		}
	}

	/**
	 * remove un Password
	 * 
	 * @param pass
	 */
	public void removePassword(Password pass) {
		EntityTransaction t = getEm().getTransaction();
		try {
			t.begin();
			getEm().remove(pass);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw (e);
		}
	}

	/**
	 * 
	 * @param pass
	 * @return le Password "pass" de la DB</br>
	 */
	public String findPasswordByName(String pass) {

		Query query = getEm().createQuery("SELECT Password FROM Password where Password.pass=:pass");
		query.setParameter("pass", pass);

		return (String) query.getSingleResult();

	}

}
