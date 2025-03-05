package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TriangleLeftFigure extends ImageFigure {
	public TriangleLeftFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/triangle_left64.png").createImage(), 0);
	}

}