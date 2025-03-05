/**
 */
package gettw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gettw.Shape#getText <em>Text</em>}</li>
 *   <li>{@link gettw.Shape#getColor <em>Color</em>}</li>
 *   <li>{@link gettw.Shape#getStroke <em>Stroke</em>}</li>
 *   <li>{@link gettw.Shape#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link gettw.Shape#getEditable <em>Editable</em>}</li>
 *   <li>{@link gettw.Shape#getTextIsHeader <em>Text Is Header</em>}</li>
 * </ul>
 *
 * @see gettw.GettwPackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see gettw.GettwPackage#getShape_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link gettw.Shape#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link gettw.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #setColor(Colors)
	 * @see gettw.GettwPackage#getShape_Color()
	 * @model required="true"
	 * @generated
	 */
	Colors getColor();

	/**
	 * Sets the value of the '{@link gettw.Shape#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Colors value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' attribute.
	 * The literals are from the enumeration {@link gettw.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' attribute.
	 * @see gettw.Colors
	 * @see #setStroke(Colors)
	 * @see gettw.GettwPackage#getShape_Stroke()
	 * @model required="true"
	 * @generated
	 */
	Colors getStroke();

	/**
	 * Sets the value of the '{@link gettw.Shape#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' attribute.
	 * @see gettw.Colors
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(Colors value);

	/**
	 * Returns the value of the '<em><b>Stroke Width</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Width</em>' attribute.
	 * @see #setStrokeWidth(Integer)
	 * @see gettw.GettwPackage#getShape_StrokeWidth()
	 * @model default="2"
	 * @generated
	 */
	Integer getStrokeWidth();

	/**
	 * Sets the value of the '{@link gettw.Shape#getStrokeWidth <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Width</em>' attribute.
	 * @see #getStrokeWidth()
	 * @generated
	 */
	void setStrokeWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(Boolean)
	 * @see gettw.GettwPackage#getShape_Editable()
	 * @model default="false"
	 * @generated
	 */
	Boolean getEditable();

	/**
	 * Sets the value of the '{@link gettw.Shape#getEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #getEditable()
	 * @generated
	 */
	void setEditable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Text Is Header</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Is Header</em>' attribute.
	 * @see #setTextIsHeader(Boolean)
	 * @see gettw.GettwPackage#getShape_TextIsHeader()
	 * @model default="false"
	 * @generated
	 */
	Boolean getTextIsHeader();

	/**
	 * Sets the value of the '{@link gettw.Shape#getTextIsHeader <em>Text Is Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Is Header</em>' attribute.
	 * @see #getTextIsHeader()
	 * @generated
	 */
	void setTextIsHeader(Boolean value);

} // Shape
