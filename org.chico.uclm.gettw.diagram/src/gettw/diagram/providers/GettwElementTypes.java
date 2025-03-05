/*
 * 
 */
package gettw.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import gettw.GettwPackage;
import gettw.diagram.edit.parts.ActorEditPart;
import gettw.diagram.edit.parts.CustomLinkEditPart;
import gettw.diagram.edit.parts.CustomShapeEditPart;
import gettw.diagram.edit.parts.DiamondEditPart;
import gettw.diagram.edit.parts.EllipseEditPart;
import gettw.diagram.edit.parts.GETTWDiagramEditPart;
import gettw.diagram.edit.parts.PackageEditPart;
import gettw.diagram.edit.parts.PictureEditPart;
import gettw.diagram.edit.parts.RectangleEditPart;
import gettw.diagram.edit.parts.RoundedRectangleEditPart;
import gettw.diagram.edit.parts.SubscriptEditPart;
import gettw.diagram.edit.parts.SuperscriptEditPart;
import gettw.diagram.edit.parts.TextEditPart;
import gettw.diagram.edit.parts.TextIndexEditPart;
import gettw.diagram.edit.parts.TriangleDownEditPart;
import gettw.diagram.edit.parts.TriangleEditPart;
import gettw.diagram.edit.parts.TriangleLeftEditPart;
import gettw.diagram.edit.parts.TriangleRightEditPart;
import gettw.diagram.part.GettwDiagramEditorPlugin;

/**
 * @generated
 */
public class GettwElementTypes {

	/**
	* @generated
	*/
	private GettwElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			GettwDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType GETTWDiagram_1000 = getElementType(
			"org.chico.uclm.gettw.diagram.GETTWDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Superscript_2018 = getElementType("org.chico.uclm.gettw.diagram.Superscript_2018"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Subscript_2019 = getElementType("org.chico.uclm.gettw.diagram.Subscript_2019"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType TextIndex_2020 = getElementType("org.chico.uclm.gettw.diagram.TextIndex_2020"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Rectangle_2004 = getElementType("org.chico.uclm.gettw.diagram.Rectangle_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RoundedRectangle_2005 = getElementType(
			"org.chico.uclm.gettw.diagram.RoundedRectangle_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ellipse_2010 = getElementType("org.chico.uclm.gettw.diagram.Ellipse_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Triangle_2011 = getElementType("org.chico.uclm.gettw.diagram.Triangle_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Diamond_2012 = getElementType("org.chico.uclm.gettw.diagram.Diamond_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TriangleDown_2013 = getElementType(
			"org.chico.uclm.gettw.diagram.TriangleDown_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TriangleLeft_2014 = getElementType(
			"org.chico.uclm.gettw.diagram.TriangleLeft_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TriangleRight_2015 = getElementType(
			"org.chico.uclm.gettw.diagram.TriangleRight_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_2016 = getElementType("org.chico.uclm.gettw.diagram.Actor_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Package_2017 = getElementType("org.chico.uclm.gettw.diagram.Package_2017"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CustomShape_2001 = getElementType("org.chico.uclm.gettw.diagram.CustomShape_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CustomLink_2002 = getElementType("org.chico.uclm.gettw.diagram.CustomLink_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Text_2021 = getElementType("org.chico.uclm.gettw.diagram.Text_2021"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Picture_2003 = getElementType("org.chico.uclm.gettw.diagram.Picture_2003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(GETTWDiagram_1000, GettwPackage.eINSTANCE.getGETTWDiagram());

			elements.put(Superscript_2018, GettwPackage.eINSTANCE.getSuperscript());

			elements.put(Subscript_2019, GettwPackage.eINSTANCE.getSubscript());

			elements.put(TextIndex_2020, GettwPackage.eINSTANCE.getTextIndex());

			elements.put(Rectangle_2004, GettwPackage.eINSTANCE.getRectangle());

			elements.put(RoundedRectangle_2005, GettwPackage.eINSTANCE.getRoundedRectangle());

			elements.put(Ellipse_2010, GettwPackage.eINSTANCE.getEllipse());

			elements.put(Triangle_2011, GettwPackage.eINSTANCE.getTriangle());

			elements.put(Diamond_2012, GettwPackage.eINSTANCE.getDiamond());

			elements.put(TriangleDown_2013, GettwPackage.eINSTANCE.getTriangleDown());

			elements.put(TriangleLeft_2014, GettwPackage.eINSTANCE.getTriangleLeft());

			elements.put(TriangleRight_2015, GettwPackage.eINSTANCE.getTriangleRight());

			elements.put(Actor_2016, GettwPackage.eINSTANCE.getActor());

			elements.put(Package_2017, GettwPackage.eINSTANCE.getPackage());

			elements.put(CustomLink_2002, GettwPackage.eINSTANCE.getCustomLink());

			elements.put(Text_2021, GettwPackage.eINSTANCE.getText());

			elements.put(Picture_2003, GettwPackage.eINSTANCE.getPicture());

			elements.put(CustomShape_2001, GettwPackage.eINSTANCE.getCustomShape());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(GETTWDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Superscript_2018);
			KNOWN_ELEMENT_TYPES.add(Subscript_2019);
			KNOWN_ELEMENT_TYPES.add(TextIndex_2020);
			KNOWN_ELEMENT_TYPES.add(Rectangle_2004);
			KNOWN_ELEMENT_TYPES.add(RoundedRectangle_2005);
			KNOWN_ELEMENT_TYPES.add(Ellipse_2010);
			KNOWN_ELEMENT_TYPES.add(Triangle_2011);
			KNOWN_ELEMENT_TYPES.add(Diamond_2012);
			KNOWN_ELEMENT_TYPES.add(TriangleDown_2013);
			KNOWN_ELEMENT_TYPES.add(TriangleLeft_2014);
			KNOWN_ELEMENT_TYPES.add(TriangleRight_2015);
			KNOWN_ELEMENT_TYPES.add(Actor_2016);
			KNOWN_ELEMENT_TYPES.add(Package_2017);
			KNOWN_ELEMENT_TYPES.add(CustomLink_2002);
			KNOWN_ELEMENT_TYPES.add(Text_2021);
			KNOWN_ELEMENT_TYPES.add(Picture_2003);
			KNOWN_ELEMENT_TYPES.add(CustomShape_2001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GETTWDiagramEditPart.VISUAL_ID:
			return GETTWDiagram_1000;
		case SuperscriptEditPart.VISUAL_ID:
			return Superscript_2018;
		case SubscriptEditPart.VISUAL_ID:
			return Subscript_2019;
		case TextIndexEditPart.VISUAL_ID:
			return TextIndex_2020;
		case RectangleEditPart.VISUAL_ID:
			return Rectangle_2004;
		case RoundedRectangleEditPart.VISUAL_ID:
			return RoundedRectangle_2005;
		case EllipseEditPart.VISUAL_ID:
			return Ellipse_2010;
		case TriangleEditPart.VISUAL_ID:
			return Triangle_2011;
		case DiamondEditPart.VISUAL_ID:
			return Diamond_2012;
		case TriangleDownEditPart.VISUAL_ID:
			return TriangleDown_2013;
		case TriangleLeftEditPart.VISUAL_ID:
			return TriangleLeft_2014;
		case TriangleRightEditPart.VISUAL_ID:
			return TriangleRight_2015;
		case ActorEditPart.VISUAL_ID:
			return Actor_2016;
		case PackageEditPart.VISUAL_ID:
			return Package_2017;
		case CustomLinkEditPart.VISUAL_ID:
			return CustomLink_2002;
		case TextEditPart.VISUAL_ID:
			return Text_2021;
		case PictureEditPart.VISUAL_ID:
			return Picture_2003;
		case CustomShapeEditPart.VISUAL_ID:
			return CustomShape_2001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return gettw.diagram.providers.GettwElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return gettw.diagram.providers.GettwElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return gettw.diagram.providers.GettwElementTypes.getElement(elementTypeAdapter);
		}
	};

}
