package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TriangleDownFigure extends ImageFigure {
	public TriangleDownFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/triangle_down64.png").createImage(), 0);
	}

}
