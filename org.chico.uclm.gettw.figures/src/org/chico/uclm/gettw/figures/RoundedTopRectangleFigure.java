package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class RoundedTopRectangleFigure extends ImageFigure {
	public RoundedTopRectangleFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/rounded_top_rectangle64.png").createImage(), 0);
	}

}