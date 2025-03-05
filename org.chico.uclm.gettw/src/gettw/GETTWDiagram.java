/**
 */
package gettw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GETTW Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gettw.GETTWDiagram#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see gettw.GettwPackage#getGETTWDiagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface GETTWDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link gettw.GraphElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see gettw.GettwPackage#getGETTWDiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphElement> getElements();

} // GETTWDiagram
