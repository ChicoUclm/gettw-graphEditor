package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TriangleFigure extends ImageFigure {
	public TriangleFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/triangle64.png").createImage(), 0);
	}

}
