package org.scijava.object.ui.swing;

import java.util.Collection;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import org.scijava.object.Manager;
import org.scijava.object.ManagerDisplay;
import org.scijava.object.ObjectService;
import org.scijava.object.ui.ManagerDisplayPanel;
import org.scijava.ui.viewer.DisplayWindow;

public class SwingManagerDisplayPanel extends JScrollPane implements ManagerDisplayPanel {

	private DisplayWindow window;
	private ManagerDisplay display;
	private JList<String> objectList;
	@SuppressWarnings("rawtypes")
	Manager manager;
	//private final JEditorPane textArea;
	
	private ObjectService objectService;
	private DefaultListModel<String> listModel;

	public SwingManagerDisplayPanel(final ManagerDisplay display, final DisplayWindow window) {
		display.getContext().inject(this);
		this.display = display;
		this.window = window;
		// TODO setup
		
		manager = display.get(0);
		objectList = new JList<>();
		listModel = new DefaultListModel<>();
		Collection<Object> list = manager.getAllItems();
		for (Object i : list) {
			listModel.addElement(i.toString());
		}
		objectList.setModel(listModel);

		setViewportView(objectList);

		objectService = display.getContext().getService(ObjectService.class);

		/*
		textArea = new JEditorPane();
		textArea.setPreferredSize(new Dimension(600, 500));
		textArea.setEditable(false);
		final Font font = new Font(Font.MONOSPACED, Font.PLAIN, 12);
		textArea.setFont(font);
		setViewportView(textArea);
		*/
		window.setContent(this);
	}

	@Override
	public DisplayWindow getWindow() {
		return window;
	}

	@Override
	public void redoLayout() {
		// Nothing to layout

	}

	@Override
	public void redraw() {
		// TODO Auto-generated method stub
		//textArea.setText("This should display the managed objects.");
		//objectList.setModel(new ListModel<Object>);
		listModel = new DefaultListModel<>();
		for (Object i : manager.getAllItems()) {
			listModel.addElement(i.toString());
		}
		objectList.setModel(listModel);

	}

	@Override
	public void setLabel(String arg0) {
		// Label not shown
	}

	@Override
	public ManagerDisplay getDisplay() {
		return display;
	}

}
