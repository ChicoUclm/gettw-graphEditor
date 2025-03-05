package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class EllipseFigure extends ImageFigure {
	public EllipseFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/ellipse64.png").createImage(), 0);
	}

}