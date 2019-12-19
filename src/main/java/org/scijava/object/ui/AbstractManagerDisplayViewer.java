package org.scijava.object.ui;

import org.scijava.object.Manager;
import org.scijava.object.ManagerDisplay;
import org.scijava.ui.viewer.AbstractDisplayViewer;

public abstract class AbstractManagerDisplayViewer extends AbstractDisplayViewer<Manager> implements ManagerDisplayViewer {

	@Override
	public ManagerDisplay getDisplay() {
		return (ManagerDisplay) super.getDisplay();
	}
}
