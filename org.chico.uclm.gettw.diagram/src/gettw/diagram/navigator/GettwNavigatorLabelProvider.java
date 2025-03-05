/*
* 
*/
package gettw.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import gettw.diagram.edit.parts.ActorEditPart;
import gettw.diagram.edit.parts.ActorId_EditPart;
import gettw.diagram.edit.parts.CustomLinkEditPart;
import gettw.diagram.edit.parts.CustomLinkId_EditPart;
import gettw.diagram.edit.parts.CustomShapeEditPart;
import gettw.diagram.edit.parts.CustomShapeId_EditPart;
import gettw.diagram.edit.parts.DiamondEditPart;
import gettw.diagram.edit.parts.DiamondId_EditPart;
import gettw.diagram.edit.parts.EllipseEditPart;
import gettw.diagram.edit.parts.EllipseId_EditPart;
import gettw.diagram.edit.parts.GETTWDiagramEditPart;
import gettw.diagram.edit.parts.PackageEditPart;
import gettw.diagram.edit.parts.PackageId_EditPart;
import gettw.diagram.edit.parts.PictureEditPart;
import gettw.diagram.edit.parts.PictureId_EditPart;
import gettw.diagram.edit.parts.RectangleEditPart;
import gettw.diagram.edit.parts.RectangleId_EditPart;
import gettw.diagram.edit.parts.RoundedRectangleEditPart;
import gettw.diagram.edit.parts.RoundedRectangleId_EditPart;
import gettw.diagram.edit.parts.SubscriptEditPart;
import gettw.diagram.edit.parts.SubscriptId_EditPart;
import gettw.diagram.edit.parts.SuperscriptEditPart;
import gettw.diagram.edit.parts.SuperscriptId_EditPart;
import gettw.diagram.edit.parts.TextEditPart;
import gettw.diagram.edit.parts.TextId_EditPart;
import gettw.diagram.edit.parts.TextIndexEditPart;
import gettw.diagram.edit.parts.TextIndexId_EditPart;
import gettw.diagram.edit.parts.TriangleDownEditPart;
import gettw.diagram.edit.parts.TriangleDownId_EditPart;
import gettw.diagram.edit.parts.TriangleEditPart;
import gettw.diagram.edit.parts.TriangleId_EditPart;
import gettw.diagram.edit.parts.TriangleLeftEditPart;
import gettw.diagram.edit.parts.TriangleLeftId_EditPart;
import gettw.diagram.edit.parts.TriangleRightEditPart;
import gettw.diagram.edit.parts.TriangleRightId_EditPart;
import gettw.diagram.part.GettwDiagramEditorPlugin;
import gettw.diagram.part.GettwVisualIDRegistry;
import gettw.diagram.providers.GettwElementTypes;
import gettw.diagram.providers.GettwParserProvider;

/**
 * @generated
 */
public class GettwNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		GettwDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		GettwDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GettwNavigatorItem && !isOwnView(((GettwNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof GettwNavigatorGroup) {
			GettwNavigatorGroup group = (GettwNavigatorGroup) element;
			return GettwDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof GettwNavigatorItem) {
			GettwNavigatorItem navigatorItem = (GettwNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (GettwVisualIDRegistry.getVisualID(view)) {
		case GETTWDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?gettw?GETTWDiagram", GettwElementTypes.GETTWDiagram_1000); //$NON-NLS-1$
		case CustomShapeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?CustomShape", GettwElementTypes.CustomShape_2001); //$NON-NLS-1$
		case CustomLinkEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?CustomLink", GettwElementTypes.CustomLink_2002); //$NON-NLS-1$
		case PictureEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?Picture", GettwElementTypes.Picture_2003); //$NON-NLS-1$
		case RectangleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?Rectangle", GettwElementTypes.Rectangle_2004); //$NON-NLS-1$
		case RoundedRectangleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?RoundedRectangle", GettwElementTypes.RoundedRectangle_2005); //$NON-NLS-1$
		case EllipseEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?Ellipse", GettwElementTypes.Ellipse_2010); //$NON-NLS-1$
		case TriangleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?Triangle", GettwElementTypes.Triangle_2011); //$NON-NLS-1$
		case DiamondEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?Diamond", GettwElementTypes.Diamond_2012); //$NON-NLS-1$
		case TriangleDownEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?TriangleDown", GettwElementTypes.TriangleDown_2013); //$NON-NLS-1$
		case TriangleLeftEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?TriangleLeft", GettwElementTypes.TriangleLeft_2014); //$NON-NLS-1$
		case TriangleRightEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?TriangleRight", GettwElementTypes.TriangleRight_2015); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?Actor", GettwElementTypes.Actor_2016); //$NON-NLS-1$
		case PackageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?Package", GettwElementTypes.Package_2017); //$NON-NLS-1$
		case SuperscriptEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?Superscript", GettwElementTypes.Superscript_2018); //$NON-NLS-1$
		case SubscriptEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?Subscript", GettwElementTypes.Subscript_2019); //$NON-NLS-1$
		case TextIndexEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?TextIndex", GettwElementTypes.TextIndex_2020); //$NON-NLS-1$
		case TextEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?gettw?Text", GettwElementTypes.Text_2021); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GettwDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && GettwElementTypes.isKnownElementType(elementType)) {
			image = GettwElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof GettwNavigatorGroup) {
			GettwNavigatorGroup group = (GettwNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GettwNavigatorItem) {
			GettwNavigatorItem navigatorItem = (GettwNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GettwVisualIDRegistry.getVisualID(view)) {
		case GETTWDiagramEditPart.VISUAL_ID:
			return getGETTWDiagram_1000Text(view);
		case CustomShapeEditPart.VISUAL_ID:
			return getCustomShape_2001Text(view);
		case CustomLinkEditPart.VISUAL_ID:
			return getCustomLink_2002Text(view);
		case PictureEditPart.VISUAL_ID:
			return getPicture_2003Text(view);
		case RectangleEditPart.VISUAL_ID:
			return getRectangle_2004Text(view);
		case RoundedRectangleEditPart.VISUAL_ID:
			return getRoundedRectangle_2005Text(view);
		case EllipseEditPart.VISUAL_ID:
			return getEllipse_2010Text(view);
		case TriangleEditPart.VISUAL_ID:
			return getTriangle_2011Text(view);
		case DiamondEditPart.VISUAL_ID:
			return getDiamond_2012Text(view);
		case TriangleDownEditPart.VISUAL_ID:
			return getTriangleDown_2013Text(view);
		case TriangleLeftEditPart.VISUAL_ID:
			return getTriangleLeft_2014Text(view);
		case TriangleRightEditPart.VISUAL_ID:
			return getTriangleRight_2015Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2016Text(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2017Text(view);
		case SuperscriptEditPart.VISUAL_ID:
			return getSuperscript_2018Text(view);
		case SubscriptEditPart.VISUAL_ID:
			return getSubscript_2019Text(view);
		case TextIndexEditPart.VISUAL_ID:
			return getTextIndex_2020Text(view);
		case TextEditPart.VISUAL_ID:
			return getText_2021Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getGETTWDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getCustomShape_2001Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.CustomShape_2001,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(CustomShapeId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCustomLink_2002Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.CustomLink_2002,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(CustomLinkId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPicture_2003Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.Picture_2003,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(PictureId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRectangle_2004Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.Rectangle_2004,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(RectangleId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRoundedRectangle_2005Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.RoundedRectangle_2005,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(RoundedRectangleId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEllipse_2010Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.Ellipse_2010,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(EllipseId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTriangle_2011Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.Triangle_2011,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(TriangleId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDiamond_2012Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.Diamond_2012,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(DiamondId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTriangleDown_2013Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.TriangleDown_2013,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(TriangleDownId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTriangleLeft_2014Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.TriangleLeft_2014,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(TriangleLeftId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTriangleRight_2015Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.TriangleRight_2015,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(TriangleRightId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActor_2016Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.Actor_2016,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(ActorId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPackage_2017Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.Package_2017,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(PackageId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSuperscript_2018Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.Superscript_2018,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(SuperscriptId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSubscript_2019Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.Subscript_2019,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(SubscriptId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextIndex_2020Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.TextIndex_2020,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(TextIndexId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getText_2021Text(View view) {
		IParser parser = GettwParserProvider.getParser(GettwElementTypes.Text_2021,
				view.getElement() != null ? view.getElement() : view,
				GettwVisualIDRegistry.getType(TextId_EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GettwDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return GETTWDiagramEditPart.MODEL_ID.equals(GettwVisualIDRegistry.getModelID(view));
	}

}
