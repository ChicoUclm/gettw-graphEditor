/*
 * 
 */
package gettw.diagram.providers;

import gettw.diagram.part.GettwDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GettwDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			GettwDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
