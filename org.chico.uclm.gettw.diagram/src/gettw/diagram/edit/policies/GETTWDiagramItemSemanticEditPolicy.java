/*
* 
*/
package gettw.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import gettw.diagram.edit.commands.ActorCreateCommand;
import gettw.diagram.edit.commands.CustomLinkCreateCommand;
import gettw.diagram.edit.commands.CustomShapeCreateCommand;
import gettw.diagram.edit.commands.DiamondCreateCommand;
import gettw.diagram.edit.commands.EllipseCreateCommand;
import gettw.diagram.edit.commands.PackageCreateCommand;
import gettw.diagram.edit.commands.PictureCreateCommand;
import gettw.diagram.edit.commands.RectangleCreateCommand;
import gettw.diagram.edit.commands.RoundedRectangleCreateCommand;
import gettw.diagram.edit.commands.SubscriptCreateCommand;
import gettw.diagram.edit.commands.SuperscriptCreateCommand;
import gettw.diagram.edit.commands.TextCreateCommand;
import gettw.diagram.edit.commands.TextIndexCreateCommand;
import gettw.diagram.edit.commands.TriangleCreateCommand;
import gettw.diagram.edit.commands.TriangleDownCreateCommand;
import gettw.diagram.edit.commands.TriangleLeftCreateCommand;
import gettw.diagram.edit.commands.TriangleRightCreateCommand;
import gettw.diagram.providers.GettwElementTypes;

/**
 * @generated
 */
public class GETTWDiagramItemSemanticEditPolicy extends GettwBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GETTWDiagramItemSemanticEditPolicy() {
		super(GettwElementTypes.GETTWDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GettwElementTypes.Superscript_2018 == req.getElementType()) {
			return getGEFWrapper(new SuperscriptCreateCommand(req));
		}
		if (GettwElementTypes.Subscript_2019 == req.getElementType()) {
			return getGEFWrapper(new SubscriptCreateCommand(req));
		}
		if (GettwElementTypes.TextIndex_2020 == req.getElementType()) {
			return getGEFWrapper(new TextIndexCreateCommand(req));
		}
		if (GettwElementTypes.Rectangle_2004 == req.getElementType()) {
			return getGEFWrapper(new RectangleCreateCommand(req));
		}
		if (GettwElementTypes.RoundedRectangle_2005 == req.getElementType()) {
			return getGEFWrapper(new RoundedRectangleCreateCommand(req));
		}
		if (GettwElementTypes.Ellipse_2010 == req.getElementType()) {
			return getGEFWrapper(new EllipseCreateCommand(req));
		}
		if (GettwElementTypes.Triangle_2011 == req.getElementType()) {
			return getGEFWrapper(new TriangleCreateCommand(req));
		}
		if (GettwElementTypes.Diamond_2012 == req.getElementType()) {
			return getGEFWrapper(new DiamondCreateCommand(req));
		}
		if (GettwElementTypes.TriangleDown_2013 == req.getElementType()) {
			return getGEFWrapper(new TriangleDownCreateCommand(req));
		}
		if (GettwElementTypes.TriangleLeft_2014 == req.getElementType()) {
			return getGEFWrapper(new TriangleLeftCreateCommand(req));
		}
		if (GettwElementTypes.TriangleRight_2015 == req.getElementType()) {
			return getGEFWrapper(new TriangleRightCreateCommand(req));
		}
		if (GettwElementTypes.Actor_2016 == req.getElementType()) {
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		if (GettwElementTypes.Package_2017 == req.getElementType()) {
			return getGEFWrapper(new PackageCreateCommand(req));
		}
		if (GettwElementTypes.CustomLink_2002 == req.getElementType()) {
			return getGEFWrapper(new CustomLinkCreateCommand(req));
		}
		if (GettwElementTypes.Text_2021 == req.getElementType()) {
			return getGEFWrapper(new TextCreateCommand(req));
		}
		if (GettwElementTypes.Picture_2003 == req.getElementType()) {
			return getGEFWrapper(new PictureCreateCommand(req));
		}
		if (GettwElementTypes.CustomShape_2001 == req.getElementType()) {
			return getGEFWrapper(new CustomShapeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
