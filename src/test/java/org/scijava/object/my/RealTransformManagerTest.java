package org.scijava.object.my;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.scijava.Context;
import org.scijava.plugin.PluginInfo;
import org.scijava.plugin.PluginService;
import org.scijava.plugin.SciJavaPlugin;

import net.imglib2.realtransform.AffineTransform2D;
import net.imglib2.realtransform.AffineTransform3D;

public class RealTransformManagerTest {
	
	private Context context;
	
	@Before
	public void setUp() {
		context = new Context();
	}
	
	@After
	public void tearDown() {
		context.dispose();
	}

	@Test
	public void testRealTransformManager() {
		PluginService pluginService = context.getService(PluginService.class);
		PluginInfo<SciJavaPlugin> info = pluginService.getPlugin(RealTransformManager.class);
		RealTransformManager manager = (RealTransformManager) pluginService.createInstance(info);
		AffineTransform3D t1 = new AffineTransform3D();
		AffineTransform2D t2 = new AffineTransform2D();
		manager.add(t1);
		manager.add(t2);
		assertTrue(manager.getAllItems().contains(t1));
		assertTrue(manager.getAllItems().contains(t2));
	}

}
