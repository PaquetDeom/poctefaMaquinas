package sol.factory;

import java.util.List;

import javax.persistence.Query;

import sol.Clas;
import sol.Maquina;
import sol.Student;
import sol.Teacher;

public class ClasFactory extends GeneralFactory {

	@Override
	public Object findByName(Object object) {

		Query query = getEm().createQuery("SELECT Clas FROM Clas where  Clas.clas=:clas");
		query.setParameter("clas", (String) object);

		return (String) query.getSingleResult();
	}
	public List<Maquina> findMaquina(Maquina maquina){
		
		Query query = getEm().createQuery("SELECT Clas FROM Clas where Clas.maquina=:maquina");
		query.setParameter("maquina", maquina);

		return (List<Maquina>)  query.getResultList();
}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
