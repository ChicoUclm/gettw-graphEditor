/**
 */
package gettw;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gettw.GraphElement#getId_ <em>Id </em>}</li>
 * </ul>
 *
 * @see gettw.GettwPackage#getGraphElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id </em>' attribute.
	 * @see #setId_(String)
	 * @see gettw.GettwPackage#getGraphElement_Id_()
	 * @model
	 * @generated
	 */
	String getId_();

	/**
	 * Sets the value of the '{@link gettw.GraphElement#getId_ <em>Id </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id </em>' attribute.
	 * @see #getId_()
	 * @generated
	 */
	void setId_(String value);

} // GraphElement
