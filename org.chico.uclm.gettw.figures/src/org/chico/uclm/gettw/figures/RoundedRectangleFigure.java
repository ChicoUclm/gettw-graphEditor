package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class RoundedRectangleFigure extends ImageFigure {
	public RoundedRectangleFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/rounded_rectangle64.png").createImage(), 0);
	}

}