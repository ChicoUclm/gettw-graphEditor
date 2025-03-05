/*
 * 
 */
package gettw.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import gettw.diagram.providers.GettwElementTypes;
import gettw.diagram.providers.GettwModelingAssistantProvider;

/**
 * @generated
 */
public class GettwModelingAssistantProviderOfGETTWDiagramEditPart extends GettwModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(17);
		types.add(GettwElementTypes.Superscript_2018);
		types.add(GettwElementTypes.Subscript_2019);
		types.add(GettwElementTypes.TextIndex_2020);
		types.add(GettwElementTypes.Rectangle_2004);
		types.add(GettwElementTypes.RoundedRectangle_2005);
		types.add(GettwElementTypes.Ellipse_2010);
		types.add(GettwElementTypes.Triangle_2011);
		types.add(GettwElementTypes.Diamond_2012);
		types.add(GettwElementTypes.TriangleDown_2013);
		types.add(GettwElementTypes.TriangleLeft_2014);
		types.add(GettwElementTypes.TriangleRight_2015);
		types.add(GettwElementTypes.Actor_2016);
		types.add(GettwElementTypes.Package_2017);
		types.add(GettwElementTypes.CustomLink_2002);
		types.add(GettwElementTypes.Text_2021);
		types.add(GettwElementTypes.Picture_2003);
		types.add(GettwElementTypes.CustomShape_2001);
		return types;
	}

}
