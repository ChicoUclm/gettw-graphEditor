/**
 */
package gettw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gettw.TextIndex#getSubscript <em>Subscript</em>}</li>
 *   <li>{@link gettw.TextIndex#getSuperscript <em>Superscript</em>}</li>
 * </ul>
 *
 * @see gettw.GettwPackage#getTextIndex()
 * @model annotation="gmf.node figure='org.chico.uclm.gettw.figures.TextIndexFigure' tool.name='Text w Indexes' tool.small.bundle='org.chico.uclm.gettw.figures' tool.large.path='images/textindex64.png' tool.small.path='images/textindex16.png' label='id_' label.icon='false' label.placement='external' resizable='false' size='64,64'"
 * @generated
 */
public interface TextIndex extends Text {
	/**
	 * Returns the value of the '<em><b>Subscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscript</em>' attribute.
	 * @see #setSubscript(String)
	 * @see gettw.GettwPackage#getTextIndex_Subscript()
	 * @model
	 * @generated
	 */
	String getSubscript();

	/**
	 * Sets the value of the '{@link gettw.TextIndex#getSubscript <em>Subscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscript</em>' attribute.
	 * @see #getSubscript()
	 * @generated
	 */
	void setSubscript(String value);

	/**
	 * Returns the value of the '<em><b>Superscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superscript</em>' attribute.
	 * @see #setSuperscript(String)
	 * @see gettw.GettwPackage#getTextIndex_Superscript()
	 * @model
	 * @generated
	 */
	String getSuperscript();

	/**
	 * Sets the value of the '{@link gettw.TextIndex#getSuperscript <em>Superscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superscript</em>' attribute.
	 * @see #getSuperscript()
	 * @generated
	 */
	void setSuperscript(String value);

} // TextIndex
