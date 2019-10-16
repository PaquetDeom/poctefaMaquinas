package sol.pantallas;

import java.io.ObjectInputFilter.Status;
import java.util.HashSet;
import java.util.Set;

import com.vaadin.annotations.StyleSheet;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Grid.SelectionMode;


@StyleSheet("itemhighlight.css")
	public class EditorTablePermission extends VerticalLayout implements MultiSelectionListener<TablePermission> {
	
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private final ComboBox statusSelect;
	    private final Button updateButton;
	
	    private Set<TablePermission> previouslyEdited;
	    private Set<TablePermission> currentlyEditing;
	
		
		
	    public EditorTablePermission(Grid<TablePermission> grid) {
	
	        previouslyEdited = new HashSet<>();
	        currentlyEditing = new HashSet<>();
	      
	        statusSelect = new ComboBox<>();
	        statusSelect.setCaption("Set status");
	        statusSelect.setEmptySelectionCaption(NO_STATUS_CHANGE);
	        statusSelect.setTextInputAllowed(false);
	        statusSelect.setItems(Status.valueOf("Permission"), Status.valueOf("Not permission"));
	        statusSelect.clear();
	        statusSelect.setWidth(100, Unit.PERCENTAGE);
	
	        updateButton = new Button("Update");
	        updateButton.addClickListener(event -> {
	            for (TablePermission tablePermission : currentlyEditing) {
	                if (!statusSelect.isEmpty()) {
	                    tablePermission.setStatus(statusSelect.getValue());
	                }
	                tablePermission.setChanged(true);
	                grid.getDataProvider().refreshItem(tablePermission);
	            }
	
	            Set<TablePermission> removeChanged = new HashSet<>(previouslyEdited);
	            removeChanged.removeAll(currentlyEditing);
	            for (TablePermission tablePermission : removeChanged) {
	                tablePermission.setChanged(false);
	                grid.getDataProvider().refreshItem(tablePermission);
	            }
	
	            previouslyEdited = currentlyEditing;
	            statusSelect.clear();
	            grid.deselectAll();
	        });
	        
	        updateButton.setWidth(100, Unit.PERCENTAGE);
	
	        addComponents(statusSelect, updateButton);
	        setWidth(100, Unit.PERCENTAGE);
	        setEnabled(false);
	        
	        grid.setDataProvider(createDataProvider());

		    grid.removeColumn("changed");

		    grid.setSelectionMode(SelectionMode.MULTI);

		    grid.setStyleGenerator(ablePermission -> {
		    	boolean closed = TablePermission.getStatus() == Status.CLOSED;
			    boolean changed = TablePermission.isChanged();
			        if (closed) {
			            if (changed) {
			                // Combined style
			                return "changed closed";
			            }
			            // Closed style
			            return "closed";
			        } else if (changed) {
			            // Modified style
			            return "changed";
			        }
			        // No style
			        return null;
			    });
			    
			    EditorTablePermission editor = new EditorTablePermission(grid);
			    grid.asMultiSelect().addSelectionListener(editor);
	    }
	
	    @Override
	    public void selectionChange(MultiSelectionEvent<TablePermission> event) {
	        currentlyEditing = event.getAllSelectedItems();
	        setEnabled(!event.getAllSelectedItems().isEmpty());
	    }

	
	   
}