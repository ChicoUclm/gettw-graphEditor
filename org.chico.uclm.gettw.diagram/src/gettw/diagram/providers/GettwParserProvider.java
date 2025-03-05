/*
 * 
 */
package gettw.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import gettw.GettwPackage;
import gettw.diagram.edit.parts.ActorId_EditPart;
import gettw.diagram.edit.parts.CustomLinkId_EditPart;
import gettw.diagram.edit.parts.CustomShapeId_EditPart;
import gettw.diagram.edit.parts.DiamondId_EditPart;
import gettw.diagram.edit.parts.EllipseId_EditPart;
import gettw.diagram.edit.parts.PackageId_EditPart;
import gettw.diagram.edit.parts.PictureId_EditPart;
import gettw.diagram.edit.parts.RectangleId_EditPart;
import gettw.diagram.edit.parts.RoundedRectangleId_EditPart;
import gettw.diagram.edit.parts.SubscriptId_EditPart;
import gettw.diagram.edit.parts.SuperscriptId_EditPart;
import gettw.diagram.edit.parts.TextId_EditPart;
import gettw.diagram.edit.parts.TextIndexId_EditPart;
import gettw.diagram.edit.parts.TriangleDownId_EditPart;
import gettw.diagram.edit.parts.TriangleId_EditPart;
import gettw.diagram.edit.parts.TriangleLeftId_EditPart;
import gettw.diagram.edit.parts.TriangleRightId_EditPart;
import gettw.diagram.parsers.MessageFormatParser;
import gettw.diagram.part.GettwVisualIDRegistry;

/**
 * @generated
 */
public class GettwParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser superscriptId__5018Parser;

	/**
	* @generated
	*/
	private IParser getSuperscriptId__5018Parser() {
		if (superscriptId__5018Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			superscriptId__5018Parser = parser;
		}
		return superscriptId__5018Parser;
	}

	/**
	* @generated
	*/
	private IParser subscriptId__5019Parser;

	/**
	* @generated
	*/
	private IParser getSubscriptId__5019Parser() {
		if (subscriptId__5019Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			subscriptId__5019Parser = parser;
		}
		return subscriptId__5019Parser;
	}

	/**
	* @generated
	*/
	private IParser textIndexId__5020Parser;

	/**
	* @generated
	*/
	private IParser getTextIndexId__5020Parser() {
		if (textIndexId__5020Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textIndexId__5020Parser = parser;
		}
		return textIndexId__5020Parser;
	}

	/**
	* @generated
	*/
	private IParser rectangleId__5004Parser;

	/**
	* @generated
	*/
	private IParser getRectangleId__5004Parser() {
		if (rectangleId__5004Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rectangleId__5004Parser = parser;
		}
		return rectangleId__5004Parser;
	}

	/**
	* @generated
	*/
	private IParser roundedRectangleId__5005Parser;

	/**
	* @generated
	*/
	private IParser getRoundedRectangleId__5005Parser() {
		if (roundedRectangleId__5005Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roundedRectangleId__5005Parser = parser;
		}
		return roundedRectangleId__5005Parser;
	}

	/**
	* @generated
	*/
	private IParser ellipseId__5010Parser;

	/**
	* @generated
	*/
	private IParser getEllipseId__5010Parser() {
		if (ellipseId__5010Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ellipseId__5010Parser = parser;
		}
		return ellipseId__5010Parser;
	}

	/**
	* @generated
	*/
	private IParser triangleId__5011Parser;

	/**
	* @generated
	*/
	private IParser getTriangleId__5011Parser() {
		if (triangleId__5011Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			triangleId__5011Parser = parser;
		}
		return triangleId__5011Parser;
	}

	/**
	* @generated
	*/
	private IParser diamondId__5012Parser;

	/**
	* @generated
	*/
	private IParser getDiamondId__5012Parser() {
		if (diamondId__5012Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			diamondId__5012Parser = parser;
		}
		return diamondId__5012Parser;
	}

	/**
	* @generated
	*/
	private IParser triangleDownId__5013Parser;

	/**
	* @generated
	*/
	private IParser getTriangleDownId__5013Parser() {
		if (triangleDownId__5013Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			triangleDownId__5013Parser = parser;
		}
		return triangleDownId__5013Parser;
	}

	/**
	* @generated
	*/
	private IParser triangleLeftId__5014Parser;

	/**
	* @generated
	*/
	private IParser getTriangleLeftId__5014Parser() {
		if (triangleLeftId__5014Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			triangleLeftId__5014Parser = parser;
		}
		return triangleLeftId__5014Parser;
	}

	/**
	* @generated
	*/
	private IParser triangleRightId__5015Parser;

	/**
	* @generated
	*/
	private IParser getTriangleRightId__5015Parser() {
		if (triangleRightId__5015Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			triangleRightId__5015Parser = parser;
		}
		return triangleRightId__5015Parser;
	}

	/**
	* @generated
	*/
	private IParser actorId__5016Parser;

	/**
	* @generated
	*/
	private IParser getActorId__5016Parser() {
		if (actorId__5016Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorId__5016Parser = parser;
		}
		return actorId__5016Parser;
	}

	/**
	* @generated
	*/
	private IParser packageId__5017Parser;

	/**
	* @generated
	*/
	private IParser getPackageId__5017Parser() {
		if (packageId__5017Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageId__5017Parser = parser;
		}
		return packageId__5017Parser;
	}

	/**
	* @generated
	*/
	private IParser customShapeId__5001Parser;

	/**
	* @generated
	*/
	private IParser getCustomShapeId__5001Parser() {
		if (customShapeId__5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customShapeId__5001Parser = parser;
		}
		return customShapeId__5001Parser;
	}

	/**
	* @generated
	*/
	private IParser customLinkId__5002Parser;

	/**
	* @generated
	*/
	private IParser getCustomLinkId__5002Parser() {
		if (customLinkId__5002Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customLinkId__5002Parser = parser;
		}
		return customLinkId__5002Parser;
	}

	/**
	* @generated
	*/
	private IParser textId__5021Parser;

	/**
	* @generated
	*/
	private IParser getTextId__5021Parser() {
		if (textId__5021Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textId__5021Parser = parser;
		}
		return textId__5021Parser;
	}

	/**
	* @generated
	*/
	private IParser pictureId__5003Parser;

	/**
	* @generated
	*/
	private IParser getPictureId__5003Parser() {
		if (pictureId__5003Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pictureId__5003Parser = parser;
		}
		return pictureId__5003Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SuperscriptId_EditPart.VISUAL_ID:
			return getSuperscriptId__5018Parser();
		case SubscriptId_EditPart.VISUAL_ID:
			return getSubscriptId__5019Parser();
		case TextIndexId_EditPart.VISUAL_ID:
			return getTextIndexId__5020Parser();
		case RectangleId_EditPart.VISUAL_ID:
			return getRectangleId__5004Parser();
		case RoundedRectangleId_EditPart.VISUAL_ID:
			return getRoundedRectangleId__5005Parser();
		case EllipseId_EditPart.VISUAL_ID:
			return getEllipseId__5010Parser();
		case TriangleId_EditPart.VISUAL_ID:
			return getTriangleId__5011Parser();
		case DiamondId_EditPart.VISUAL_ID:
			return getDiamondId__5012Parser();
		case TriangleDownId_EditPart.VISUAL_ID:
			return getTriangleDownId__5013Parser();
		case TriangleLeftId_EditPart.VISUAL_ID:
			return getTriangleLeftId__5014Parser();
		case TriangleRightId_EditPart.VISUAL_ID:
			return getTriangleRightId__5015Parser();
		case ActorId_EditPart.VISUAL_ID:
			return getActorId__5016Parser();
		case PackageId_EditPart.VISUAL_ID:
			return getPackageId__5017Parser();
		case CustomLinkId_EditPart.VISUAL_ID:
			return getCustomLinkId__5002Parser();
		case TextId_EditPart.VISUAL_ID:
			return getTextId__5021Parser();
		case PictureId_EditPart.VISUAL_ID:
			return getPictureId__5003Parser();
		case CustomShapeId_EditPart.VISUAL_ID:
			return getCustomShapeId__5001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GettwVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GettwVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GettwElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
