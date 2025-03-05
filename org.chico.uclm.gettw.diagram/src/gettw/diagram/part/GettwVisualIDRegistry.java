/*
* 
*/
package gettw.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import gettw.GETTWDiagram;
import gettw.GettwPackage;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GettwVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.chico.uclm.gettw.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GETTWDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return GETTWDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gettw.diagram.part.GettwVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				GettwDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GettwPackage.eINSTANCE.getGETTWDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((GETTWDiagram) domainElement)) {
			return GETTWDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = gettw.diagram.part.GettwVisualIDRegistry.getModelID(containerView);
		if (!GETTWDiagramEditPart.MODEL_ID.equals(containerModelID) && !"gettw".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (GETTWDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gettw.diagram.part.GettwVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GETTWDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GETTWDiagramEditPart.VISUAL_ID:
			if (GettwPackage.eINSTANCE.getSuperscript().isSuperTypeOf(domainElement.eClass())) {
				return SuperscriptEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getSubscript().isSuperTypeOf(domainElement.eClass())) {
				return SubscriptEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getTextIndex().isSuperTypeOf(domainElement.eClass())) {
				return TextIndexEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getRectangle().isSuperTypeOf(domainElement.eClass())) {
				return RectangleEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getRoundedRectangle().isSuperTypeOf(domainElement.eClass())) {
				return RoundedRectangleEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getEllipse().isSuperTypeOf(domainElement.eClass())) {
				return EllipseEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getTriangle().isSuperTypeOf(domainElement.eClass())) {
				return TriangleEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getDiamond().isSuperTypeOf(domainElement.eClass())) {
				return DiamondEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getTriangleDown().isSuperTypeOf(domainElement.eClass())) {
				return TriangleDownEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getTriangleLeft().isSuperTypeOf(domainElement.eClass())) {
				return TriangleLeftEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getTriangleRight().isSuperTypeOf(domainElement.eClass())) {
				return TriangleRightEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return PackageEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getCustomLink().isSuperTypeOf(domainElement.eClass())) {
				return CustomLinkEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return TextEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getPicture().isSuperTypeOf(domainElement.eClass())) {
				return PictureEditPart.VISUAL_ID;
			}
			if (GettwPackage.eINSTANCE.getCustomShape().isSuperTypeOf(domainElement.eClass())) {
				return CustomShapeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gettw.diagram.part.GettwVisualIDRegistry.getModelID(containerView);
		if (!GETTWDiagramEditPart.MODEL_ID.equals(containerModelID) && !"gettw".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (GETTWDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gettw.diagram.part.GettwVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GETTWDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GETTWDiagramEditPart.VISUAL_ID:
			if (SuperscriptEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubscriptEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextIndexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RectangleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoundedRectangleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EllipseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TriangleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DiamondEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TriangleDownEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TriangleLeftEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TriangleRightEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomLinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PictureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CustomShapeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SuperscriptEditPart.VISUAL_ID:
			if (SuperscriptId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubscriptEditPart.VISUAL_ID:
			if (SubscriptId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextIndexEditPart.VISUAL_ID:
			if (TextIndexId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RectangleEditPart.VISUAL_ID:
			if (RectangleId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoundedRectangleEditPart.VISUAL_ID:
			if (RoundedRectangleId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EllipseEditPart.VISUAL_ID:
			if (EllipseId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TriangleEditPart.VISUAL_ID:
			if (TriangleId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiamondEditPart.VISUAL_ID:
			if (DiamondId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TriangleDownEditPart.VISUAL_ID:
			if (TriangleDownId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TriangleLeftEditPart.VISUAL_ID:
			if (TriangleLeftId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TriangleRightEditPart.VISUAL_ID:
			if (TriangleRightId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (PackageId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomLinkEditPart.VISUAL_ID:
			if (CustomLinkId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextEditPart.VISUAL_ID:
			if (TextId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PictureEditPart.VISUAL_ID:
			if (PictureId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CustomShapeEditPart.VISUAL_ID:
			if (CustomShapeId_EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(GETTWDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case GETTWDiagramEditPart.VISUAL_ID:
			return false;
		case CustomShapeEditPart.VISUAL_ID:
		case CustomLinkEditPart.VISUAL_ID:
		case PictureEditPart.VISUAL_ID:
		case RectangleEditPart.VISUAL_ID:
		case RoundedRectangleEditPart.VISUAL_ID:
		case EllipseEditPart.VISUAL_ID:
		case TriangleEditPart.VISUAL_ID:
		case DiamondEditPart.VISUAL_ID:
		case TriangleDownEditPart.VISUAL_ID:
		case TriangleLeftEditPart.VISUAL_ID:
		case TriangleRightEditPart.VISUAL_ID:
		case ActorEditPart.VISUAL_ID:
		case PackageEditPart.VISUAL_ID:
		case SuperscriptEditPart.VISUAL_ID:
		case SubscriptEditPart.VISUAL_ID:
		case TextIndexEditPart.VISUAL_ID:
		case TextEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return gettw.diagram.part.GettwVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return gettw.diagram.part.GettwVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return gettw.diagram.part.GettwVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return gettw.diagram.part.GettwVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return gettw.diagram.part.GettwVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return gettw.diagram.part.GettwVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
