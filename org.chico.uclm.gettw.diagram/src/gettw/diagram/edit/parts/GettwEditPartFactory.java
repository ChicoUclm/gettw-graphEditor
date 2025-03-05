/*
 * 
 */
package gettw.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import gettw.diagram.part.GettwVisualIDRegistry;

/**
 * @generated
 */
public class GettwEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GettwVisualIDRegistry.getVisualID(view)) {

			case GETTWDiagramEditPart.VISUAL_ID:
				return new GETTWDiagramEditPart(view);

			case SuperscriptEditPart.VISUAL_ID:
				return new SuperscriptEditPart(view);

			case SuperscriptId_EditPart.VISUAL_ID:
				return new SuperscriptId_EditPart(view);

			case SubscriptEditPart.VISUAL_ID:
				return new SubscriptEditPart(view);

			case SubscriptId_EditPart.VISUAL_ID:
				return new SubscriptId_EditPart(view);

			case TextIndexEditPart.VISUAL_ID:
				return new TextIndexEditPart(view);

			case TextIndexId_EditPart.VISUAL_ID:
				return new TextIndexId_EditPart(view);

			case RectangleEditPart.VISUAL_ID:
				return new RectangleEditPart(view);

			case RectangleId_EditPart.VISUAL_ID:
				return new RectangleId_EditPart(view);

			case RoundedRectangleEditPart.VISUAL_ID:
				return new RoundedRectangleEditPart(view);

			case RoundedRectangleId_EditPart.VISUAL_ID:
				return new RoundedRectangleId_EditPart(view);

			case EllipseEditPart.VISUAL_ID:
				return new EllipseEditPart(view);

			case EllipseId_EditPart.VISUAL_ID:
				return new EllipseId_EditPart(view);

			case TriangleEditPart.VISUAL_ID:
				return new TriangleEditPart(view);

			case TriangleId_EditPart.VISUAL_ID:
				return new TriangleId_EditPart(view);

			case DiamondEditPart.VISUAL_ID:
				return new DiamondEditPart(view);

			case DiamondId_EditPart.VISUAL_ID:
				return new DiamondId_EditPart(view);

			case TriangleDownEditPart.VISUAL_ID:
				return new TriangleDownEditPart(view);

			case TriangleDownId_EditPart.VISUAL_ID:
				return new TriangleDownId_EditPart(view);

			case TriangleLeftEditPart.VISUAL_ID:
				return new TriangleLeftEditPart(view);

			case TriangleLeftId_EditPart.VISUAL_ID:
				return new TriangleLeftId_EditPart(view);

			case TriangleRightEditPart.VISUAL_ID:
				return new TriangleRightEditPart(view);

			case TriangleRightId_EditPart.VISUAL_ID:
				return new TriangleRightId_EditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorId_EditPart.VISUAL_ID:
				return new ActorId_EditPart(view);

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case PackageId_EditPart.VISUAL_ID:
				return new PackageId_EditPart(view);

			case CustomLinkEditPart.VISUAL_ID:
				return new CustomLinkEditPart(view);

			case CustomLinkId_EditPart.VISUAL_ID:
				return new CustomLinkId_EditPart(view);

			case TextEditPart.VISUAL_ID:
				return new TextEditPart(view);

			case TextId_EditPart.VISUAL_ID:
				return new TextId_EditPart(view);

			case PictureEditPart.VISUAL_ID:
				return new PictureEditPart(view);

			case PictureId_EditPart.VISUAL_ID:
				return new PictureId_EditPart(view);

			case CustomShapeEditPart.VISUAL_ID:
				return new CustomShapeEditPart(view);

			case CustomShapeId_EditPart.VISUAL_ID:
				return new CustomShapeId_EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
