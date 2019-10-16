package sol.pantallas;

import java.io.ObjectInputFilter.Status;

import com.google.gwt.user.client.ui.Grid;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid.SelectionMode;

public final class TablePermission {
	private Status status;
	private boolean changed = false;
	private String description;
 
 	
	public TablePermission(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean changed) {
		this.changed = changed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private static final String NO_STATUS_CHANGE = "-- keep status --";

	public Component getComponentUsedByPropertyEditor() {
		return null;
	}

		

}