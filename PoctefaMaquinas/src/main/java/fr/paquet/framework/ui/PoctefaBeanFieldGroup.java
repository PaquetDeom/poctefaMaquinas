package fr.paquet.framework.ui;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import fr.paquet.framework.*;

public class PoctefaBeanFieldGroup extends BeanFieldGroup<PoctefaItem> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PoctefaBeanFieldGroup(Class<? extends PoctefaItem> beanType) {
		super((Class<PoctefaItem>) beanType);
		setFieldFactory(new PoctefaFieldGroupFieldFactory());
	}
}
