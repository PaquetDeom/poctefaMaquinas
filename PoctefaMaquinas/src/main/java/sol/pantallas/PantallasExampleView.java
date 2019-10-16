package sol.pantallas;

import java.util.ArrayList;

import java.util.List;


import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.*;

import sol.*;


public class PantallasExampleView extends Pantallas {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PantallasExampleView() {
		super();
	}

	@Override
	public Component getDetail() {

		Panel panel = new Panel();
		panel.setCaption("Authorisation sur les machines");

		HorizontalLayout Hlayout = new HorizontalLayout();
		VerticalLayout Vlayout = new VerticalLayout();
		List<Maquina> maquinas = new ArrayList<Maquina>();
		List<Student> students = new ArrayList<Student>();
		CheckBox sample = new CheckBox("", false);

		for (int i = 0; i < maquinas.size(); ++i) {
			for (int j = 0; j < students.size(); ++j) {
				Label labelH = new Label(maquinas.get(i).getName());
				Hlayout.addComponent(labelH);
				Label labelV = new Label(students.get(j).toString());
				Vlayout.addComponent(labelV);
				
			
			}
		}

		return panel;

	}


	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {

		return "Pantalla1";
	}

	@Override
	public String getCaption() {

		return "Pantalla1";
	}

}
