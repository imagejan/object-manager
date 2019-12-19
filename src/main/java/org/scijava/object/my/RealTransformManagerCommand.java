package org.scijava.object.my;

import org.scijava.ItemIO;
import org.scijava.command.Command;
import org.scijava.command.ContextCommand;
import org.scijava.object.Manager;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;
import org.scijava.plugin.PluginInfo;
import org.scijava.plugin.PluginService;

@Plugin(type=Command.class, menuPath="Dev>Show Manager (RealTransform)")
public class RealTransformManagerCommand extends ContextCommand {
	@Parameter
	private PluginService pluginService;

	@SuppressWarnings("rawtypes")
	@Parameter(type=ItemIO.OUTPUT)
	private Manager manager;

	@SuppressWarnings("rawtypes")
	@Override
	public void run() {
		PluginInfo<?> info = PluginInfo.create(RealTransformManager.class);
		manager = (Manager) pluginService.createInstance(info);
	}
}
