package org.scijava.object;

import org.scijava.display.AbstractDisplay;
import org.scijava.display.Display;
import org.scijava.plugin.Plugin;

@Plugin(type = Display.class)
public class DefaultManagerDisplay extends AbstractDisplay<Manager> implements ManagerDisplay {

	public DefaultManagerDisplay() {
		super(Manager.class);
	}
}
