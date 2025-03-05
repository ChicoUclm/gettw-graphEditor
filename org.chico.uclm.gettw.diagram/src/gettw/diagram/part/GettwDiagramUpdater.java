/*
* 
*/
package gettw.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import gettw.GETTWDiagram;
import gettw.GraphElement;
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

/**
 * @generated
 */
public class GettwDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<GettwNodeDescriptor> getSemanticChildren(View view) {
		switch (GettwVisualIDRegistry.getVisualID(view)) {
		case GETTWDiagramEditPart.VISUAL_ID:
			return getGETTWDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwNodeDescriptor> getGETTWDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GETTWDiagram modelElement = (GETTWDiagram) view.getElement();
		LinkedList<GettwNodeDescriptor> result = new LinkedList<GettwNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			GraphElement childElement = (GraphElement) it.next();
			int visualID = GettwVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SuperscriptEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SubscriptEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextIndexEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RectangleEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RoundedRectangleEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EllipseEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TriangleEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiamondEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TriangleDownEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TriangleLeftEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TriangleRightEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomLinkEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PictureEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomShapeEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getContainedLinks(View view) {
		switch (GettwVisualIDRegistry.getVisualID(view)) {
		case GETTWDiagramEditPart.VISUAL_ID:
			return getGETTWDiagram_1000ContainedLinks(view);
		case SuperscriptEditPart.VISUAL_ID:
			return getSuperscript_2018ContainedLinks(view);
		case SubscriptEditPart.VISUAL_ID:
			return getSubscript_2019ContainedLinks(view);
		case TextIndexEditPart.VISUAL_ID:
			return getTextIndex_2020ContainedLinks(view);
		case RectangleEditPart.VISUAL_ID:
			return getRectangle_2004ContainedLinks(view);
		case RoundedRectangleEditPart.VISUAL_ID:
			return getRoundedRectangle_2005ContainedLinks(view);
		case EllipseEditPart.VISUAL_ID:
			return getEllipse_2010ContainedLinks(view);
		case TriangleEditPart.VISUAL_ID:
			return getTriangle_2011ContainedLinks(view);
		case DiamondEditPart.VISUAL_ID:
			return getDiamond_2012ContainedLinks(view);
		case TriangleDownEditPart.VISUAL_ID:
			return getTriangleDown_2013ContainedLinks(view);
		case TriangleLeftEditPart.VISUAL_ID:
			return getTriangleLeft_2014ContainedLinks(view);
		case TriangleRightEditPart.VISUAL_ID:
			return getTriangleRight_2015ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2016ContainedLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2017ContainedLinks(view);
		case CustomLinkEditPart.VISUAL_ID:
			return getCustomLink_2002ContainedLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_2021ContainedLinks(view);
		case PictureEditPart.VISUAL_ID:
			return getPicture_2003ContainedLinks(view);
		case CustomShapeEditPart.VISUAL_ID:
			return getCustomShape_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getIncomingLinks(View view) {
		switch (GettwVisualIDRegistry.getVisualID(view)) {
		case SuperscriptEditPart.VISUAL_ID:
			return getSuperscript_2018IncomingLinks(view);
		case SubscriptEditPart.VISUAL_ID:
			return getSubscript_2019IncomingLinks(view);
		case TextIndexEditPart.VISUAL_ID:
			return getTextIndex_2020IncomingLinks(view);
		case RectangleEditPart.VISUAL_ID:
			return getRectangle_2004IncomingLinks(view);
		case RoundedRectangleEditPart.VISUAL_ID:
			return getRoundedRectangle_2005IncomingLinks(view);
		case EllipseEditPart.VISUAL_ID:
			return getEllipse_2010IncomingLinks(view);
		case TriangleEditPart.VISUAL_ID:
			return getTriangle_2011IncomingLinks(view);
		case DiamondEditPart.VISUAL_ID:
			return getDiamond_2012IncomingLinks(view);
		case TriangleDownEditPart.VISUAL_ID:
			return getTriangleDown_2013IncomingLinks(view);
		case TriangleLeftEditPart.VISUAL_ID:
			return getTriangleLeft_2014IncomingLinks(view);
		case TriangleRightEditPart.VISUAL_ID:
			return getTriangleRight_2015IncomingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2016IncomingLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2017IncomingLinks(view);
		case CustomLinkEditPart.VISUAL_ID:
			return getCustomLink_2002IncomingLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_2021IncomingLinks(view);
		case PictureEditPart.VISUAL_ID:
			return getPicture_2003IncomingLinks(view);
		case CustomShapeEditPart.VISUAL_ID:
			return getCustomShape_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getOutgoingLinks(View view) {
		switch (GettwVisualIDRegistry.getVisualID(view)) {
		case SuperscriptEditPart.VISUAL_ID:
			return getSuperscript_2018OutgoingLinks(view);
		case SubscriptEditPart.VISUAL_ID:
			return getSubscript_2019OutgoingLinks(view);
		case TextIndexEditPart.VISUAL_ID:
			return getTextIndex_2020OutgoingLinks(view);
		case RectangleEditPart.VISUAL_ID:
			return getRectangle_2004OutgoingLinks(view);
		case RoundedRectangleEditPart.VISUAL_ID:
			return getRoundedRectangle_2005OutgoingLinks(view);
		case EllipseEditPart.VISUAL_ID:
			return getEllipse_2010OutgoingLinks(view);
		case TriangleEditPart.VISUAL_ID:
			return getTriangle_2011OutgoingLinks(view);
		case DiamondEditPart.VISUAL_ID:
			return getDiamond_2012OutgoingLinks(view);
		case TriangleDownEditPart.VISUAL_ID:
			return getTriangleDown_2013OutgoingLinks(view);
		case TriangleLeftEditPart.VISUAL_ID:
			return getTriangleLeft_2014OutgoingLinks(view);
		case TriangleRightEditPart.VISUAL_ID:
			return getTriangleRight_2015OutgoingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2016OutgoingLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2017OutgoingLinks(view);
		case CustomLinkEditPart.VISUAL_ID:
			return getCustomLink_2002OutgoingLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_2021OutgoingLinks(view);
		case PictureEditPart.VISUAL_ID:
			return getPicture_2003OutgoingLinks(view);
		case CustomShapeEditPart.VISUAL_ID:
			return getCustomShape_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getGETTWDiagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getSuperscript_2018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getSubscript_2019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getTextIndex_2020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRectangle_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRoundedRectangle_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getEllipse_2010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangle_2011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getDiamond_2012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleDown_2013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleLeft_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleRight_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getActor_2016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getPackage_2017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomShape_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomLink_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getText_2021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getPicture_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getSuperscript_2018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getSubscript_2019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getTextIndex_2020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRectangle_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRoundedRectangle_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getEllipse_2010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangle_2011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getDiamond_2012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleDown_2013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleLeft_2014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleRight_2015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getActor_2016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getPackage_2017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomShape_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomLink_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getText_2021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getPicture_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getSuperscript_2018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getSubscript_2019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getTextIndex_2020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRectangle_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRoundedRectangle_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getEllipse_2010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangle_2011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getDiamond_2012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleDown_2013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleLeft_2014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleRight_2015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getActor_2016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getPackage_2017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomShape_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomLink_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getText_2021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getPicture_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<GettwNodeDescriptor> getSemanticChildren(View view) {
			return GettwDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GettwLinkDescriptor> getContainedLinks(View view) {
			return GettwDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GettwLinkDescriptor> getIncomingLinks(View view) {
			return GettwDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GettwLinkDescriptor> getOutgoingLinks(View view) {
			return GettwDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
