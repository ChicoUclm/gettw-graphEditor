package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TriangleRightFigure extends ImageFigure {
	public TriangleRightFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/triangle_right64.png").createImage(), 0);
	}

}
