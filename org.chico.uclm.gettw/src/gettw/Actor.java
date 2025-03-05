/**
 */
package gettw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gettw.Actor#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @see gettw.GettwPackage#getActor()
 * @model annotation="gmf.node figure='org.chico.uclm.gettw.figures.ActorFigure' tool.name='Actor' tool.small.bundle='org.chico.uclm.gettw.figures' tool.large.path='images/actor64.png' tool.small.path='images/actor16.png' label='id_' label.icon='false' label.placement='external' resizable='false' size='64,64'"
 * @generated
 */
public interface Actor extends Shape {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The default value is <code>"Actor"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see gettw.GettwPackage#getActor_Shape()
	 * @model default="Actor" changeable="false"
	 * @generated
	 */
	String getShape();

} // Actor
