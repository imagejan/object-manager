package org.scijava.object;

import java.util.Collection;

import org.scijava.plugin.AbstractHandlerPlugin;

public abstract class AbstractManager<O> extends AbstractHandlerPlugin<O> implements Manager<O> {

	@Override
	public Collection<O> getAllItems() {
		return context().getService(ObjectService.class).getObjects(getType());
	}

	@Override
	public Collection<O> getSelectedItems() {
		throw new RuntimeException("Not implemented.");
	}

	@Override
	public int[] getSelectedIndices() {
		throw new RuntimeException("Not implemented.");
	}

	@Override
	public void add(O object) {
		context().getService(ObjectService.class).addObject(object);
	}

	@Override
	public void removeSelectedObjects(O... objects) {
		for (O obj : objects) {
			context().getService(ObjectService.class).removeObject(obj);
		}
	}
}
