/**
 */
package gettw.util;

import gettw.Actor;
import gettw.CustomLink;
import gettw.CustomShape;
import gettw.Diamond;
import gettw.Ellipse;
import gettw.GETTWDiagram;
import gettw.GettwPackage;
import gettw.GraphElement;
import gettw.Link;
import gettw.Picture;
import gettw.Rectangle;
import gettw.RoundedRectangle;
import gettw.Shape;
import gettw.Subscript;
import gettw.Superscript;
import gettw.Text;
import gettw.TextIndex;
import gettw.Triangle;
import gettw.TriangleDown;
import gettw.TriangleLeft;
import gettw.TriangleRight;
import gettw.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gettw.GettwPackage
 * @generated
 */
public class GettwSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GettwPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GettwSwitch() {
		if (modelPackage == null) {
			modelPackage = GettwPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GettwPackage.GETTW_DIAGRAM: {
				GETTWDiagram gettwDiagram = (GETTWDiagram)theEObject;
				T result = caseGETTWDiagram(gettwDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.GRAPH_ELEMENT: {
				GraphElement graphElement = (GraphElement)theEObject;
				T result = caseGraphElement(graphElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseGraphElement(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.SUPERSCRIPT: {
				Superscript superscript = (Superscript)theEObject;
				T result = caseSuperscript(superscript);
				if (result == null) result = caseText(superscript);
				if (result == null) result = caseGraphElement(superscript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.SUBSCRIPT: {
				Subscript subscript = (Subscript)theEObject;
				T result = caseSubscript(subscript);
				if (result == null) result = caseText(subscript);
				if (result == null) result = caseGraphElement(subscript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.TEXT_INDEX: {
				TextIndex textIndex = (TextIndex)theEObject;
				T result = caseTextIndex(textIndex);
				if (result == null) result = caseText(textIndex);
				if (result == null) result = caseGraphElement(textIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = caseGraphElement(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.RECTANGLE: {
				Rectangle rectangle = (Rectangle)theEObject;
				T result = caseRectangle(rectangle);
				if (result == null) result = caseShape(rectangle);
				if (result == null) result = caseGraphElement(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.ROUNDED_RECTANGLE: {
				RoundedRectangle roundedRectangle = (RoundedRectangle)theEObject;
				T result = caseRoundedRectangle(roundedRectangle);
				if (result == null) result = caseShape(roundedRectangle);
				if (result == null) result = caseGraphElement(roundedRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.ELLIPSE: {
				Ellipse ellipse = (Ellipse)theEObject;
				T result = caseEllipse(ellipse);
				if (result == null) result = caseShape(ellipse);
				if (result == null) result = caseGraphElement(ellipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.TRIANGLE: {
				Triangle triangle = (Triangle)theEObject;
				T result = caseTriangle(triangle);
				if (result == null) result = caseShape(triangle);
				if (result == null) result = caseGraphElement(triangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.DIAMOND: {
				Diamond diamond = (Diamond)theEObject;
				T result = caseDiamond(diamond);
				if (result == null) result = caseShape(diamond);
				if (result == null) result = caseGraphElement(diamond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.TRIANGLE_DOWN: {
				TriangleDown triangleDown = (TriangleDown)theEObject;
				T result = caseTriangleDown(triangleDown);
				if (result == null) result = caseShape(triangleDown);
				if (result == null) result = caseGraphElement(triangleDown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.TRIANGLE_LEFT: {
				TriangleLeft triangleLeft = (TriangleLeft)theEObject;
				T result = caseTriangleLeft(triangleLeft);
				if (result == null) result = caseShape(triangleLeft);
				if (result == null) result = caseGraphElement(triangleLeft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.TRIANGLE_RIGHT: {
				TriangleRight triangleRight = (TriangleRight)theEObject;
				T result = caseTriangleRight(triangleRight);
				if (result == null) result = caseShape(triangleRight);
				if (result == null) result = caseGraphElement(triangleRight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseShape(actor);
				if (result == null) result = caseGraphElement(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.PACKAGE: {
				gettw.Package package_ = (gettw.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseShape(package_);
				if (result == null) result = caseGraphElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseGraphElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.PICTURE: {
				Picture picture = (Picture)theEObject;
				T result = casePicture(picture);
				if (result == null) result = caseGraphElement(picture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.CUSTOM_SHAPE: {
				CustomShape customShape = (CustomShape)theEObject;
				T result = caseCustomShape(customShape);
				if (result == null) result = caseGraphElement(customShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GettwPackage.CUSTOM_LINK: {
				CustomLink customLink = (CustomLink)theEObject;
				T result = caseCustomLink(customLink);
				if (result == null) result = caseLink(customLink);
				if (result == null) result = caseGraphElement(customLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GETTW Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GETTW Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGETTWDiagram(GETTWDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphElement(GraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Picture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Picture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePicture(Picture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Superscript</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Superscript</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperscript(Superscript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscript</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscript</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscript(Subscript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextIndex(TextIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangle(Rectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundedRectangle(RoundedRectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipse(Ellipse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriangle(Triangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diamond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diamond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiamond(Diamond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangle Down</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangle Down</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriangleDown(TriangleDown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangle Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangle Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriangleLeft(TriangleLeft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangle Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangle Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriangleRight(TriangleRight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(gettw.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomShape(CustomShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomLink(CustomLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GettwSwitch
