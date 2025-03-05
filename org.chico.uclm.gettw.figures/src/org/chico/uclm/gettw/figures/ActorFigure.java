package org.chico.uclm.gettw.figures;

import org.eclipse.draw2d.ImageFigure;

public class ActorFigure extends ImageFigure {
	public ActorFigure() {
		super(Activator.imageDescriptorFromPlugin(org.chico.uclm.gettw.figures.Activator.PLUGIN_ID,
			"images/actor64.png").createImage(), 0);
	}

}
