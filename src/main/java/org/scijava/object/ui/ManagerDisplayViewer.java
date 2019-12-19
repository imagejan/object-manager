package org.scijava.object.ui;

import org.scijava.display.Display;
import org.scijava.object.Manager;
import org.scijava.object.ManagerDisplay;
import org.scijava.ui.viewer.DisplayViewer;

public interface ManagerDisplayViewer extends DisplayViewer<Manager> {

	@Override
	ManagerDisplay getDisplay();

	// -- DisplayViewer methods --

	@Override
	default boolean canView(final Display<?> d) {
		return d instanceof ManagerDisplay;
	}

}
