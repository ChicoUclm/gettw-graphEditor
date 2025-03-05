/*
 * 
 */
package gettw.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import gettw.diagram.edit.parts.GETTWDiagramEditPart;
import gettw.diagram.edit.parts.GettwEditPartFactory;
import gettw.diagram.part.GettwVisualIDRegistry;

/**
 * @generated
 */
public class GettwEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public GettwEditPartProvider() {
		super(new GettwEditPartFactory(), GettwVisualIDRegistry.TYPED_INSTANCE, GETTWDiagramEditPart.MODEL_ID);
	}

}
