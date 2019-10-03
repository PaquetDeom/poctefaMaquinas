package fr.paquet.framework;

import java.util.Iterator;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.vaadin.addon.jpacontainer.JPAContainerFactory;

public class PoctefaFactory {
	private static final long serialVersionUID = 1L;

	public static final String PERSISTENCE_UNIT = "poctefa";
	private static EntityManager em;

	// définition du lien avec la base de donnée
	static {
		em = JPAContainerFactory.createEntityManagerForPersistenceUnit(PERSISTENCE_UNIT);
	}

	public static Query getQuery(String query) {
		return em.createQuery(query);
	}

	protected static EntityManager getEntityManager() {
		return em;
	}

	public static boolean checkConstraints(PoctefaItem entity) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<PoctefaItem>> constraintViolations = validator.validate(entity);
		if (constraintViolations.size() > 0) {
			Iterator<ConstraintViolation<PoctefaItem>> iterator = constraintViolations.iterator();
			while (iterator.hasNext()) {
				ConstraintViolation<PoctefaItem> cv = iterator.next();
				System.err
						.println(cv.getRootBeanClass().getName() + "." + cv.getPropertyPath() + " " + cv.getMessage());
				return false;
			}
		}
		return true;
	}

	public static PoctefaItem create(String origin, PoctefaItem entity) {
		if (checkConstraints(entity)) {
			getEntityManager().getTransaction().begin();
			entity.setCreateCoockie(origin);
			entity = getEntityManager().merge(entity);
			getEntityManager().flush();
			getEntityManager().getTransaction().commit();
		}
		return entity;
	}

	public static PoctefaItem update(String origin, PoctefaItem entity) {
		getEntityManager().getTransaction().begin();
		entity.setModifyCoockie(origin);
		entity = getEntityManager().merge(entity);
		getEntityManager().getTransaction().commit();
		return entity;
	}

	public static PoctefaItem softDelete(String origin, PoctefaItem entity) {
		getEntityManager().getTransaction().begin();
		entity.setDeleteCoockie(origin);
		entity = getEntityManager().merge(entity);
		getEntityManager().flush();
		getEntityManager().getTransaction().commit();
		return entity;
	}
	
	public static void flush() {
		getEntityManager().flush();
	}
}
