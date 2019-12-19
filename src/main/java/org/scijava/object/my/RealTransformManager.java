
package org.scijava.object.my;

import org.scijava.object.AbstractManager;
import org.scijava.plugin.Plugin;
import org.scijava.plugin.SciJavaPlugin;

import net.imglib2.realtransform.RealTransform;

// Doesn't really fall into any of the categories below SciJavaPlugin
@Plugin(type = SciJavaPlugin.class)
public class RealTransformManager extends AbstractManager<RealTransform> {
	
	// --- Typed methods ---

	@Override
	public Class<RealTransform> getType() {
		return RealTransform.class;
	}

}
