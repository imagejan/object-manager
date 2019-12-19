package org.scijava.object.ui.swing;

import org.scijava.display.Display;
import org.scijava.object.ui.AbstractManagerDisplayViewer;
import org.scijava.plugin.Plugin;
import org.scijava.ui.UserInterface;
import org.scijava.ui.swing.SwingUI;
import org.scijava.ui.viewer.DisplayViewer;
import org.scijava.ui.viewer.DisplayWindow;

@Plugin(type = DisplayViewer.class)
public class SwingManagerDisplayViewer extends AbstractManagerDisplayViewer {

	@Override
	public boolean isCompatible(final UserInterface ui) {
		return ui instanceof SwingUI;
	}

	@Override
	public void view(final DisplayWindow w, final Display<?> d) {
		super.view(w, d);
		setPanel(new SwingManagerDisplayPanel(getDisplay(), w));
	}

}
