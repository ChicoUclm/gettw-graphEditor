package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class PictureFigure extends ImageFigure {
	public PictureFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/picture64.png").createImage(), 0);
	}

}
