/**
 */
package gettw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gettw.CustomLink#getLinkStrokeColor <em>Link Stroke Color</em>}</li>
 *   <li>{@link gettw.CustomLink#getLinkStrokeWidth <em>Link Stroke Width</em>}</li>
 *   <li>{@link gettw.CustomLink#getFromArrowShape <em>From Arrow Shape</em>}</li>
 *   <li>{@link gettw.CustomLink#getFromArrowColor <em>From Arrow Color</em>}</li>
 *   <li>{@link gettw.CustomLink#getFromArrowStrokeColor <em>From Arrow Stroke Color</em>}</li>
 *   <li>{@link gettw.CustomLink#getFromArrowStrokeWidth <em>From Arrow Stroke Width</em>}</li>
 *   <li>{@link gettw.CustomLink#getToArrowShape <em>To Arrow Shape</em>}</li>
 *   <li>{@link gettw.CustomLink#getToArrowColor <em>To Arrow Color</em>}</li>
 *   <li>{@link gettw.CustomLink#getToArrowStrokeColor <em>To Arrow Stroke Color</em>}</li>
 *   <li>{@link gettw.CustomLink#getToArrowStrokeWidth <em>To Arrow Stroke Width</em>}</li>
 *   <li>{@link gettw.CustomLink#getIsDashed <em>Is Dashed</em>}</li>
 *   <li>{@link gettw.CustomLink#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see gettw.GettwPackage#getCustomLink()
 * @model annotation="gmf.node figure='org.chico.uclm.gettw.figures.LinkFigure' tool.name='Link' tool.small.bundle='org.chico.uclm.gettw.figures' tool.large.path='images/line64.png' tool.small.path='images/line16.png' label='id_' label.icon='false' label.placement='external' resizable='false' size='64,64'"
 * @generated
 */
public interface CustomLink extends Link {
	/**
	 * Returns the value of the '<em><b>Link Stroke Color</b></em>' attribute.
	 * The literals are from the enumeration {@link gettw.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Stroke Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #setLinkStrokeColor(Colors)
	 * @see gettw.GettwPackage#getCustomLink_LinkStrokeColor()
	 * @model required="true"
	 * @generated
	 */
	Colors getLinkStrokeColor();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getLinkStrokeColor <em>Link Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Stroke Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #getLinkStrokeColor()
	 * @generated
	 */
	void setLinkStrokeColor(Colors value);

	/**
	 * Returns the value of the '<em><b>Link Stroke Width</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Stroke Width</em>' attribute.
	 * @see #setLinkStrokeWidth(Integer)
	 * @see gettw.GettwPackage#getCustomLink_LinkStrokeWidth()
	 * @model default="2"
	 * @generated
	 */
	Integer getLinkStrokeWidth();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getLinkStrokeWidth <em>Link Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Stroke Width</em>' attribute.
	 * @see #getLinkStrokeWidth()
	 * @generated
	 */
	void setLinkStrokeWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>From Arrow Shape</b></em>' attribute.
	 * The literals are from the enumeration {@link gettw.ArrowHeads}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Arrow Shape</em>' attribute.
	 * @see gettw.ArrowHeads
	 * @see #setFromArrowShape(ArrowHeads)
	 * @see gettw.GettwPackage#getCustomLink_FromArrowShape()
	 * @model required="true"
	 * @generated
	 */
	ArrowHeads getFromArrowShape();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getFromArrowShape <em>From Arrow Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Arrow Shape</em>' attribute.
	 * @see gettw.ArrowHeads
	 * @see #getFromArrowShape()
	 * @generated
	 */
	void setFromArrowShape(ArrowHeads value);

	/**
	 * Returns the value of the '<em><b>From Arrow Color</b></em>' attribute.
	 * The literals are from the enumeration {@link gettw.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Arrow Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #setFromArrowColor(Colors)
	 * @see gettw.GettwPackage#getCustomLink_FromArrowColor()
	 * @model required="true"
	 * @generated
	 */
	Colors getFromArrowColor();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getFromArrowColor <em>From Arrow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Arrow Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #getFromArrowColor()
	 * @generated
	 */
	void setFromArrowColor(Colors value);

	/**
	 * Returns the value of the '<em><b>From Arrow Stroke Color</b></em>' attribute.
	 * The literals are from the enumeration {@link gettw.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Arrow Stroke Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #setFromArrowStrokeColor(Colors)
	 * @see gettw.GettwPackage#getCustomLink_FromArrowStrokeColor()
	 * @model required="true"
	 * @generated
	 */
	Colors getFromArrowStrokeColor();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getFromArrowStrokeColor <em>From Arrow Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Arrow Stroke Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #getFromArrowStrokeColor()
	 * @generated
	 */
	void setFromArrowStrokeColor(Colors value);

	/**
	 * Returns the value of the '<em><b>From Arrow Stroke Width</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Arrow Stroke Width</em>' attribute.
	 * @see #setFromArrowStrokeWidth(Integer)
	 * @see gettw.GettwPackage#getCustomLink_FromArrowStrokeWidth()
	 * @model default="2"
	 * @generated
	 */
	Integer getFromArrowStrokeWidth();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getFromArrowStrokeWidth <em>From Arrow Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Arrow Stroke Width</em>' attribute.
	 * @see #getFromArrowStrokeWidth()
	 * @generated
	 */
	void setFromArrowStrokeWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>To Arrow Shape</b></em>' attribute.
	 * The literals are from the enumeration {@link gettw.ArrowHeads}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Arrow Shape</em>' attribute.
	 * @see gettw.ArrowHeads
	 * @see #setToArrowShape(ArrowHeads)
	 * @see gettw.GettwPackage#getCustomLink_ToArrowShape()
	 * @model required="true"
	 * @generated
	 */
	ArrowHeads getToArrowShape();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getToArrowShape <em>To Arrow Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Arrow Shape</em>' attribute.
	 * @see gettw.ArrowHeads
	 * @see #getToArrowShape()
	 * @generated
	 */
	void setToArrowShape(ArrowHeads value);

	/**
	 * Returns the value of the '<em><b>To Arrow Color</b></em>' attribute.
	 * The literals are from the enumeration {@link gettw.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Arrow Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #setToArrowColor(Colors)
	 * @see gettw.GettwPackage#getCustomLink_ToArrowColor()
	 * @model required="true"
	 * @generated
	 */
	Colors getToArrowColor();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getToArrowColor <em>To Arrow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Arrow Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #getToArrowColor()
	 * @generated
	 */
	void setToArrowColor(Colors value);

	/**
	 * Returns the value of the '<em><b>To Arrow Stroke Color</b></em>' attribute.
	 * The literals are from the enumeration {@link gettw.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Arrow Stroke Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #setToArrowStrokeColor(Colors)
	 * @see gettw.GettwPackage#getCustomLink_ToArrowStrokeColor()
	 * @model required="true"
	 * @generated
	 */
	Colors getToArrowStrokeColor();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getToArrowStrokeColor <em>To Arrow Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Arrow Stroke Color</em>' attribute.
	 * @see gettw.Colors
	 * @see #getToArrowStrokeColor()
	 * @generated
	 */
	void setToArrowStrokeColor(Colors value);

	/**
	 * Returns the value of the '<em><b>To Arrow Stroke Width</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Arrow Stroke Width</em>' attribute.
	 * @see #setToArrowStrokeWidth(Integer)
	 * @see gettw.GettwPackage#getCustomLink_ToArrowStrokeWidth()
	 * @model default="2"
	 * @generated
	 */
	Integer getToArrowStrokeWidth();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getToArrowStrokeWidth <em>To Arrow Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Arrow Stroke Width</em>' attribute.
	 * @see #getToArrowStrokeWidth()
	 * @generated
	 */
	void setToArrowStrokeWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Dashed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dashed</em>' attribute.
	 * @see #setIsDashed(Boolean)
	 * @see gettw.GettwPackage#getCustomLink_IsDashed()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsDashed();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getIsDashed <em>Is Dashed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dashed</em>' attribute.
	 * @see #getIsDashed()
	 * @generated
	 */
	void setIsDashed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see gettw.GettwPackage#getCustomLink_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link gettw.CustomLink#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // CustomLink
