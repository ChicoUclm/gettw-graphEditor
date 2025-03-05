package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class DiamondFigure extends ImageFigure {
	public DiamondFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/diamond64.png").createImage(), 0);
	}

}
