package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class LinkFigure extends ImageFigure {
	public LinkFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/line64.png").createImage(), 0);
	}

}
