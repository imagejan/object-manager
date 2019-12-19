package org.scijava.object.ui;

import org.scijava.object.ManagerDisplay;
import org.scijava.ui.viewer.DisplayPanel;

public interface ManagerDisplayPanel extends DisplayPanel {

	// TODO add Manager-specific methods if required

	@Override
	ManagerDisplay getDisplay();

}
