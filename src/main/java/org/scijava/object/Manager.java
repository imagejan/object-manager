
package org.scijava.object;

import java.util.Collection;

import org.scijava.plugin.HandlerPlugin;

// TODO should this really be HandlerPlugin?
public interface Manager<O> extends HandlerPlugin<O> {

	public Collection<O> getAllItems();

	public Collection<O> getSelectedItems();

	public int[] getSelectedIndices();

	public void add(O object);

	public void removeSelectedObjects(O... objects);

}
