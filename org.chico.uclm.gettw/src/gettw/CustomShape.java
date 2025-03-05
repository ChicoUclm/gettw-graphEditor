/**
 */
package gettw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gettw.CustomShape#getShape <em>Shape</em>}</li>
 *   <li>{@link gettw.CustomShape#getText <em>Text</em>}</li>
 *   <li>{@link gettw.CustomShape#getColor <em>Color</em>}</li>
 *   <li>{@link gettw.CustomShape#getStroke <em>Stroke</em>}</li>
 *   <li>{@link gettw.CustomShape#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link gettw.CustomShape#getSup_sub_indexes <em>Sup sub indexes</em>}</li>
 *   <li>{@link gettw.CustomShape#getText_subscript <em>Text subscript</em>}</li>
 *   <li>{@link gettw.CustomShape#getText_superscript <em>Text superscript</em>}</li>
 *   <li>{@link gettw.CustomShape#getEditable <em>Editable</em>}</li>
 *   <li>{@link gettw.CustomShape#getTextIsHeader <em>Text Is Header</em>}</li>
 * </ul>
 *
 * @see gettw.GettwPackage#getCustomShape()
 * @model annotation="gmf.node figure='org.chico.uclm.gettw.figures.ShapeFigure' tool.name='Shape' tool.small.bundle='org.chico.uclm.gettw.figures' tool.large.path='images/shape64.png' tool.small.path='images/shape16.png' label='id_' label.icon='false' label.placement='external' resizable='false' size='64,64'"
 * @generated
 */
public interface CustomShape extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The literals are from the enumeration {@link gettw.Shapes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see gettw.Shapes
	 * @see #setShape(Shapes)
	 * @see gettw.GettwPackage#getCustomShape_Shape()
	 * @model required="true"
	 * @generated
	 */
	Shapes getShape();

	/**
	 * Sets the value of the '{@link gettw.CustomShape#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see gettw.Shapes
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shapes value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see gettw.GettwPackage#getCustomShape_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link gettw.CustomShape#getText <em>Text</em>}' attribute.
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
	 * @see gettw.GettwPackage#getCustomShape_Color()
	 * @model required="true"
	 * @generated
	 */
	Colors getColor();

	/**
	 * Sets the value of the '{@link gettw.CustomShape#getColor <em>Color</em>}' attribute.
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
	 * @see gettw.GettwPackage#getCustomShape_Stroke()
	 * @model required="true"
	 * @generated
	 */
	Colors getStroke();

	/**
	 * Sets the value of the '{@link gettw.CustomShape#getStroke <em>Stroke</em>}' attribute.
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
	 * @see gettw.GettwPackage#getCustomShape_StrokeWidth()
	 * @model default="2"
	 * @generated
	 */
	Integer getStrokeWidth();

	/**
	 * Sets the value of the '{@link gettw.CustomShape#getStrokeWidth <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Width</em>' attribute.
	 * @see #getStrokeWidth()
	 * @generated
	 */
	void setStrokeWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Sup sub indexes</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup sub indexes</em>' attribute.
	 * @see #setSup_sub_indexes(Boolean)
	 * @see gettw.GettwPackage#getCustomShape_Sup_sub_indexes()
	 * @model default="false"
	 * @generated
	 */
	Boolean getSup_sub_indexes();

	/**
	 * Sets the value of the '{@link gettw.CustomShape#getSup_sub_indexes <em>Sup sub indexes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sup sub indexes</em>' attribute.
	 * @see #getSup_sub_indexes()
	 * @generated
	 */
	void setSup_sub_indexes(Boolean value);

	/**
	 * Returns the value of the '<em><b>Text subscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text subscript</em>' attribute.
	 * @see #setText_subscript(String)
	 * @see gettw.GettwPackage#getCustomShape_Text_subscript()
	 * @model
	 * @generated
	 */
	String getText_subscript();

	/**
	 * Sets the value of the '{@link gettw.CustomShape#getText_subscript <em>Text subscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text subscript</em>' attribute.
	 * @see #getText_subscript()
	 * @generated
	 */
	void setText_subscript(String value);

	/**
	 * Returns the value of the '<em><b>Text superscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text superscript</em>' attribute.
	 * @see #setText_superscript(String)
	 * @see gettw.GettwPackage#getCustomShape_Text_superscript()
	 * @model
	 * @generated
	 */
	String getText_superscript();

	/**
	 * Sets the value of the '{@link gettw.CustomShape#getText_superscript <em>Text superscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text superscript</em>' attribute.
	 * @see #getText_superscript()
	 * @generated
	 */
	void setText_superscript(String value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(Boolean)
	 * @see gettw.GettwPackage#getCustomShape_Editable()
	 * @model default="false"
	 * @generated
	 */
	Boolean getEditable();

	/**
	 * Sets the value of the '{@link gettw.CustomShape#getEditable <em>Editable</em>}' attribute.
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
	 * @see gettw.GettwPackage#getCustomShape_TextIsHeader()
	 * @model default="false"
	 * @generated
	 */
	Boolean getTextIsHeader();

	/**
	 * Sets the value of the '{@link gettw.CustomShape#getTextIsHeader <em>Text Is Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Is Header</em>' attribute.
	 * @see #getTextIsHeader()
	 * @generated
	 */
	void setTextIsHeader(Boolean value);

} // CustomShape
