package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TextIndexFigure extends ImageFigure {
	public TextIndexFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/textindex64.png").createImage(), 0);
	}

}
