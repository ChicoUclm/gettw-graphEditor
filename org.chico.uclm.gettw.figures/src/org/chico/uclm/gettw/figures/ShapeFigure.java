package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class ShapeFigure extends ImageFigure {
	public ShapeFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/shape64.png").createImage(), 0);
	}

}
