package sol.pantallas;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

import fr.paquet.framework.ui.PoctefaView;
import sol.Password;
import sol.factory.PasswordFactory;

public abstract class Pantallas extends AbsoluteLayout implements PoctefaView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Pantallas() {
		super();
		buildView();
	}

	public void buildView() {

		setSizeFull();

		removeAllComponents();

		VerticalLayout layout = new VerticalLayout();
		layout.addComponent(getDetail());
		addComponent(layout);
	}
	
	public abstract Component getDetail();

	@Override
	public abstract void enter(ViewChangeEvent event);

	@Override
	public abstract String getName();

	@Override
	public abstract String getCaption();

}
