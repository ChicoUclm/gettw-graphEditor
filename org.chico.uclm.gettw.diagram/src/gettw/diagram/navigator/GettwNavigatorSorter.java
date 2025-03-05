/*
* 
*/
package gettw.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import gettw.diagram.part.GettwVisualIDRegistry;

/**
 * @generated
 */
public class GettwNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 2023;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 2022;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof GettwNavigatorItem) {
			GettwNavigatorItem item = (GettwNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return GettwVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
