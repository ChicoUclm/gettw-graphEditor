/**
 */
package gettw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gettw.Text#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see gettw.GettwPackage#getText()
 * @model annotation="gmf.node figure='org.chico.uclm.gettw.figures.TextFigure' tool.name='Text' tool.small.bundle='org.chico.uclm.gettw.figures' tool.large.path='images/text64.png' tool.small.path='images/text16.png' label='id_' label.icon='false' label.placement='external' resizable='false' size='64,64'"
 * @generated
 */
public interface Text extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see gettw.GettwPackage#getText_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link gettw.Text#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Text
