/**
 */
package gettw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gettw.Picture#getSource_url <em>Source url</em>}</li>
 *   <li>{@link gettw.Picture#getWidth <em>Width</em>}</li>
 *   <li>{@link gettw.Picture#getHeight <em>Height</em>}</li>
 *   <li>{@link gettw.Picture#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see gettw.GettwPackage#getPicture()
 * @model annotation="gmf.node figure='org.chico.uclm.gettw.figures.PictureFigure' tool.name='Picture' tool.small.bundle='org.chico.uclm.gettw.figures' tool.large.path='images/picture64.png' tool.small.path='images/picture16.png' label='id_' label.icon='false' label.placement='external' resizable='false' size='64,64'"
 * @generated
 */
public interface Picture extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Source url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source url</em>' attribute.
	 * @see #setSource_url(String)
	 * @see gettw.GettwPackage#getPicture_Source_url()
	 * @model
	 * @generated
	 */
	String getSource_url();

	/**
	 * Sets the value of the '{@link gettw.Picture#getSource_url <em>Source url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source url</em>' attribute.
	 * @see #getSource_url()
	 * @generated
	 */
	void setSource_url(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Integer)
	 * @see gettw.GettwPackage#getPicture_Width()
	 * @model
	 * @generated
	 */
	Integer getWidth();

	/**
	 * Sets the value of the '{@link gettw.Picture#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Integer)
	 * @see gettw.GettwPackage#getPicture_Height()
	 * @model
	 * @generated
	 */
	Integer getHeight();

	/**
	 * Sets the value of the '{@link gettw.Picture#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see gettw.GettwPackage#getPicture_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link gettw.Picture#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Picture
