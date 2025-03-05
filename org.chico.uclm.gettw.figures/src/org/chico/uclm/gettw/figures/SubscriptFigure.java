package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class SubscriptFigure extends ImageFigure {
	public SubscriptFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/subscript64.png").createImage(), 0);
	}

}