package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class RoundedBottomRectangleFigure extends ImageFigure {
	public RoundedBottomRectangleFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/rounded_bottom_rectangle64.png").createImage(), 0);
	}

}