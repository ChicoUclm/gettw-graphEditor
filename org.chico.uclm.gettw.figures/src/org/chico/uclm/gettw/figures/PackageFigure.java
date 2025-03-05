package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class PackageFigure extends ImageFigure {
	public PackageFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/package64.png").createImage(), 0);
	}

}
