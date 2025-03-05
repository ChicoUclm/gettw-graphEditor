/**
 */
package gettw;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gettw.GettwFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface GettwPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gettw";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "gettw";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GettwPackage eINSTANCE = gettw.impl.GettwPackageImpl.init();

	/**
	 * The meta object id for the '{@link gettw.impl.GETTWDiagramImpl <em>GETTW Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.GETTWDiagramImpl
	 * @see gettw.impl.GettwPackageImpl#getGETTWDiagram()
	 * @generated
	 */
	int GETTW_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTW_DIAGRAM__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>GETTW Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTW_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gettw.impl.GraphElementImpl <em>Graph Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.GraphElementImpl
	 * @see gettw.impl.GettwPackageImpl#getGraphElement()
	 * @generated
	 */
	int GRAPH_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__ID_ = 0;

	/**
	 * The number of structural features of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gettw.impl.PictureImpl <em>Picture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.PictureImpl
	 * @see gettw.impl.GettwPackageImpl#getPicture()
	 * @generated
	 */
	int PICTURE = 18;

	/**
	 * The meta object id for the '{@link gettw.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.TextImpl
	 * @see gettw.impl.GettwPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 2;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID_ = GRAPH_ELEMENT__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.SuperscriptImpl <em>Superscript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.SuperscriptImpl
	 * @see gettw.impl.GettwPackageImpl#getSuperscript()
	 * @generated
	 */
	int SUPERSCRIPT = 3;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSCRIPT__ID_ = TEXT__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSCRIPT__TEXT = TEXT__TEXT;

	/**
	 * The feature id for the '<em><b>Superscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSCRIPT__SUPERSCRIPT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Superscript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSCRIPT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.SubscriptImpl <em>Subscript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.SubscriptImpl
	 * @see gettw.impl.GettwPackageImpl#getSubscript()
	 * @generated
	 */
	int SUBSCRIPT = 4;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__ID_ = TEXT__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__TEXT = TEXT__TEXT;

	/**
	 * The feature id for the '<em><b>Subscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__SUBSCRIPT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subscript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.TextIndexImpl <em>Text Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.TextIndexImpl
	 * @see gettw.impl.GettwPackageImpl#getTextIndex()
	 * @generated
	 */
	int TEXT_INDEX = 5;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INDEX__ID_ = TEXT__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INDEX__TEXT = TEXT__TEXT;

	/**
	 * The feature id for the '<em><b>Subscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INDEX__SUBSCRIPT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Superscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INDEX__SUPERSCRIPT = TEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INDEX_FEATURE_COUNT = TEXT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gettw.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.ShapeImpl
	 * @see gettw.impl.GettwPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 6;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ID_ = GRAPH_ELEMENT__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TEXT = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__COLOR = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STROKE_WIDTH = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__EDITABLE = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TEXT_IS_HEADER = GRAPH_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link gettw.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.RectangleImpl
	 * @see gettw.impl.GettwPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 7;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ID_ = SHAPE__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__EDITABLE = SHAPE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__TEXT_IS_HEADER = SHAPE__TEXT_IS_HEADER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__SHAPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.RoundedRectangleImpl
	 * @see gettw.impl.GettwPackageImpl#getRoundedRectangle()
	 * @generated
	 */
	int ROUNDED_RECTANGLE = 8;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__ID_ = SHAPE__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__EDITABLE = SHAPE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__TEXT_IS_HEADER = SHAPE__TEXT_IS_HEADER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__SHAPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rounded Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.EllipseImpl <em>Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.EllipseImpl
	 * @see gettw.impl.GettwPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 9;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__ID_ = SHAPE__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__EDITABLE = SHAPE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__TEXT_IS_HEADER = SHAPE__TEXT_IS_HEADER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__SHAPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.TriangleImpl <em>Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.TriangleImpl
	 * @see gettw.impl.GettwPackageImpl#getTriangle()
	 * @generated
	 */
	int TRIANGLE = 10;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__ID_ = SHAPE__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__EDITABLE = SHAPE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__TEXT_IS_HEADER = SHAPE__TEXT_IS_HEADER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__SHAPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.DiamondImpl <em>Diamond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.DiamondImpl
	 * @see gettw.impl.GettwPackageImpl#getDiamond()
	 * @generated
	 */
	int DIAMOND = 11;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__ID_ = SHAPE__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__EDITABLE = SHAPE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__TEXT_IS_HEADER = SHAPE__TEXT_IS_HEADER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND__SHAPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diamond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAMOND_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.TriangleDownImpl <em>Triangle Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.TriangleDownImpl
	 * @see gettw.impl.GettwPackageImpl#getTriangleDown()
	 * @generated
	 */
	int TRIANGLE_DOWN = 12;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_DOWN__ID_ = SHAPE__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_DOWN__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_DOWN__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_DOWN__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_DOWN__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_DOWN__EDITABLE = SHAPE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_DOWN__TEXT_IS_HEADER = SHAPE__TEXT_IS_HEADER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_DOWN__SHAPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Triangle Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_DOWN_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.TriangleLeftImpl <em>Triangle Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.TriangleLeftImpl
	 * @see gettw.impl.GettwPackageImpl#getTriangleLeft()
	 * @generated
	 */
	int TRIANGLE_LEFT = 13;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_LEFT__ID_ = SHAPE__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_LEFT__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_LEFT__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_LEFT__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_LEFT__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_LEFT__EDITABLE = SHAPE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_LEFT__TEXT_IS_HEADER = SHAPE__TEXT_IS_HEADER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_LEFT__SHAPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Triangle Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_LEFT_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.TriangleRightImpl <em>Triangle Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.TriangleRightImpl
	 * @see gettw.impl.GettwPackageImpl#getTriangleRight()
	 * @generated
	 */
	int TRIANGLE_RIGHT = 14;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_RIGHT__ID_ = SHAPE__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_RIGHT__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_RIGHT__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_RIGHT__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_RIGHT__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_RIGHT__EDITABLE = SHAPE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_RIGHT__TEXT_IS_HEADER = SHAPE__TEXT_IS_HEADER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_RIGHT__SHAPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Triangle Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_RIGHT_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.ActorImpl
	 * @see gettw.impl.GettwPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 15;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID_ = SHAPE__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EDITABLE = SHAPE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TEXT_IS_HEADER = SHAPE__TEXT_IS_HEADER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SHAPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.PackageImpl
	 * @see gettw.impl.GettwPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 16;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID_ = SHAPE__ID_;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TEXT = SHAPE__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__STROKE = SHAPE__STROKE;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__STROKE_WIDTH = SHAPE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EDITABLE = SHAPE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TEXT_IS_HEADER = SHAPE__TEXT_IS_HEADER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SHAPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gettw.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.LinkImpl
	 * @see gettw.impl.GettwPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 17;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID_ = GRAPH_ELEMENT__ID_;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__ID_ = GRAPH_ELEMENT__ID_;

	/**
	 * The feature id for the '<em><b>Source url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__SOURCE_URL = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__WIDTH = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__HEIGHT = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__TEXT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gettw.impl.CustomShapeImpl <em>Custom Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.CustomShapeImpl
	 * @see gettw.impl.GettwPackageImpl#getCustomShape()
	 * @generated
	 */
	int CUSTOM_SHAPE = 19;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__ID_ = GRAPH_ELEMENT__ID_;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__SHAPE = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__TEXT = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__COLOR = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__STROKE = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__STROKE_WIDTH = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sup sub indexes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__SUP_SUB_INDEXES = GRAPH_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text subscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__TEXT_SUBSCRIPT = GRAPH_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Text superscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__TEXT_SUPERSCRIPT = GRAPH_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__EDITABLE = GRAPH_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text Is Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE__TEXT_IS_HEADER = GRAPH_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Custom Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SHAPE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link gettw.impl.CustomLinkImpl <em>Custom Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.impl.CustomLinkImpl
	 * @see gettw.impl.GettwPackageImpl#getCustomLink()
	 * @generated
	 */
	int CUSTOM_LINK = 20;

	/**
	 * The feature id for the '<em><b>Id </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__ID_ = LINK__ID_;

	/**
	 * The feature id for the '<em><b>Link Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__LINK_STROKE_COLOR = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__LINK_STROKE_WIDTH = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Arrow Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__FROM_ARROW_SHAPE = LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Arrow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__FROM_ARROW_COLOR = LINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From Arrow Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__FROM_ARROW_STROKE_COLOR = LINK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Arrow Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__FROM_ARROW_STROKE_WIDTH = LINK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>To Arrow Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__TO_ARROW_SHAPE = LINK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>To Arrow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__TO_ARROW_COLOR = LINK_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>To Arrow Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__TO_ARROW_STROKE_COLOR = LINK_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>To Arrow Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__TO_ARROW_STROKE_WIDTH = LINK_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Dashed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__IS_DASHED = LINK_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK__TEXT = LINK_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Custom Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link gettw.Shapes <em>Shapes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.Shapes
	 * @see gettw.impl.GettwPackageImpl#getShapes()
	 * @generated
	 */
	int SHAPES = 21;

	/**
	 * The meta object id for the '{@link gettw.ArrowHeads <em>Arrow Heads</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.ArrowHeads
	 * @see gettw.impl.GettwPackageImpl#getArrowHeads()
	 * @generated
	 */
	int ARROW_HEADS = 22;

	/**
	 * The meta object id for the '{@link gettw.Colors <em>Colors</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gettw.Colors
	 * @see gettw.impl.GettwPackageImpl#getColors()
	 * @generated
	 */
	int COLORS = 23;


	/**
	 * Returns the meta object for class '{@link gettw.GETTWDiagram <em>GETTW Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GETTW Diagram</em>'.
	 * @see gettw.GETTWDiagram
	 * @generated
	 */
	EClass getGETTWDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link gettw.GETTWDiagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see gettw.GETTWDiagram#getElements()
	 * @see #getGETTWDiagram()
	 * @generated
	 */
	EReference getGETTWDiagram_Elements();

	/**
	 * Returns the meta object for class '{@link gettw.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Element</em>'.
	 * @see gettw.GraphElement
	 * @generated
	 */
	EClass getGraphElement();

	/**
	 * Returns the meta object for the attribute '{@link gettw.GraphElement#getId_ <em>Id </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id </em>'.
	 * @see gettw.GraphElement#getId_()
	 * @see #getGraphElement()
	 * @generated
	 */
	EAttribute getGraphElement_Id_();

	/**
	 * Returns the meta object for class '{@link gettw.Picture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture</em>'.
	 * @see gettw.Picture
	 * @generated
	 */
	EClass getPicture();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Picture#getSource_url <em>Source url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source url</em>'.
	 * @see gettw.Picture#getSource_url()
	 * @see #getPicture()
	 * @generated
	 */
	EAttribute getPicture_Source_url();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Picture#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see gettw.Picture#getWidth()
	 * @see #getPicture()
	 * @generated
	 */
	EAttribute getPicture_Width();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Picture#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see gettw.Picture#getHeight()
	 * @see #getPicture()
	 * @generated
	 */
	EAttribute getPicture_Height();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Picture#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gettw.Picture#getText()
	 * @see #getPicture()
	 * @generated
	 */
	EAttribute getPicture_Text();

	/**
	 * Returns the meta object for class '{@link gettw.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see gettw.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gettw.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link gettw.Superscript <em>Superscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Superscript</em>'.
	 * @see gettw.Superscript
	 * @generated
	 */
	EClass getSuperscript();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Superscript#getSuperscript <em>Superscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Superscript</em>'.
	 * @see gettw.Superscript#getSuperscript()
	 * @see #getSuperscript()
	 * @generated
	 */
	EAttribute getSuperscript_Superscript();

	/**
	 * Returns the meta object for class '{@link gettw.Subscript <em>Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscript</em>'.
	 * @see gettw.Subscript
	 * @generated
	 */
	EClass getSubscript();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Subscript#getSubscript <em>Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscript</em>'.
	 * @see gettw.Subscript#getSubscript()
	 * @see #getSubscript()
	 * @generated
	 */
	EAttribute getSubscript_Subscript();

	/**
	 * Returns the meta object for class '{@link gettw.TextIndex <em>Text Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Index</em>'.
	 * @see gettw.TextIndex
	 * @generated
	 */
	EClass getTextIndex();

	/**
	 * Returns the meta object for the attribute '{@link gettw.TextIndex#getSubscript <em>Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscript</em>'.
	 * @see gettw.TextIndex#getSubscript()
	 * @see #getTextIndex()
	 * @generated
	 */
	EAttribute getTextIndex_Subscript();

	/**
	 * Returns the meta object for the attribute '{@link gettw.TextIndex#getSuperscript <em>Superscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Superscript</em>'.
	 * @see gettw.TextIndex#getSuperscript()
	 * @see #getTextIndex()
	 * @generated
	 */
	EAttribute getTextIndex_Superscript();

	/**
	 * Returns the meta object for class '{@link gettw.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see gettw.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Shape#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gettw.Shape#getText()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Text();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Shape#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see gettw.Shape#getColor()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Color();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Shape#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see gettw.Shape#getStroke()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Shape#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see gettw.Shape#getStrokeWidth()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Shape#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see gettw.Shape#getEditable()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Editable();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Shape#getTextIsHeader <em>Text Is Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Is Header</em>'.
	 * @see gettw.Shape#getTextIsHeader()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_TextIsHeader();

	/**
	 * Returns the meta object for class '{@link gettw.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see gettw.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Rectangle#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.Rectangle#getShape()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Shape();

	/**
	 * Returns the meta object for class '{@link gettw.RoundedRectangle <em>Rounded Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rounded Rectangle</em>'.
	 * @see gettw.RoundedRectangle
	 * @generated
	 */
	EClass getRoundedRectangle();

	/**
	 * Returns the meta object for the attribute '{@link gettw.RoundedRectangle#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.RoundedRectangle#getShape()
	 * @see #getRoundedRectangle()
	 * @generated
	 */
	EAttribute getRoundedRectangle_Shape();

	/**
	 * Returns the meta object for class '{@link gettw.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see gettw.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Ellipse#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.Ellipse#getShape()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Shape();

	/**
	 * Returns the meta object for class '{@link gettw.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle</em>'.
	 * @see gettw.Triangle
	 * @generated
	 */
	EClass getTriangle();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Triangle#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.Triangle#getShape()
	 * @see #getTriangle()
	 * @generated
	 */
	EAttribute getTriangle_Shape();

	/**
	 * Returns the meta object for class '{@link gettw.Diamond <em>Diamond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diamond</em>'.
	 * @see gettw.Diamond
	 * @generated
	 */
	EClass getDiamond();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Diamond#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.Diamond#getShape()
	 * @see #getDiamond()
	 * @generated
	 */
	EAttribute getDiamond_Shape();

	/**
	 * Returns the meta object for class '{@link gettw.TriangleDown <em>Triangle Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle Down</em>'.
	 * @see gettw.TriangleDown
	 * @generated
	 */
	EClass getTriangleDown();

	/**
	 * Returns the meta object for the attribute '{@link gettw.TriangleDown#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.TriangleDown#getShape()
	 * @see #getTriangleDown()
	 * @generated
	 */
	EAttribute getTriangleDown_Shape();

	/**
	 * Returns the meta object for class '{@link gettw.TriangleLeft <em>Triangle Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle Left</em>'.
	 * @see gettw.TriangleLeft
	 * @generated
	 */
	EClass getTriangleLeft();

	/**
	 * Returns the meta object for the attribute '{@link gettw.TriangleLeft#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.TriangleLeft#getShape()
	 * @see #getTriangleLeft()
	 * @generated
	 */
	EAttribute getTriangleLeft_Shape();

	/**
	 * Returns the meta object for class '{@link gettw.TriangleRight <em>Triangle Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle Right</em>'.
	 * @see gettw.TriangleRight
	 * @generated
	 */
	EClass getTriangleRight();

	/**
	 * Returns the meta object for the attribute '{@link gettw.TriangleRight#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.TriangleRight#getShape()
	 * @see #getTriangleRight()
	 * @generated
	 */
	EAttribute getTriangleRight_Shape();

	/**
	 * Returns the meta object for class '{@link gettw.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see gettw.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Actor#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.Actor#getShape()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Shape();

	/**
	 * Returns the meta object for class '{@link gettw.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see gettw.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link gettw.Package#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.Package#getShape()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Shape();

	/**
	 * Returns the meta object for class '{@link gettw.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see gettw.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link gettw.CustomShape <em>Custom Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Shape</em>'.
	 * @see gettw.CustomShape
	 * @generated
	 */
	EClass getCustomShape();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomShape#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see gettw.CustomShape#getShape()
	 * @see #getCustomShape()
	 * @generated
	 */
	EAttribute getCustomShape_Shape();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomShape#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gettw.CustomShape#getText()
	 * @see #getCustomShape()
	 * @generated
	 */
	EAttribute getCustomShape_Text();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomShape#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see gettw.CustomShape#getColor()
	 * @see #getCustomShape()
	 * @generated
	 */
	EAttribute getCustomShape_Color();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomShape#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see gettw.CustomShape#getStroke()
	 * @see #getCustomShape()
	 * @generated
	 */
	EAttribute getCustomShape_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomShape#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see gettw.CustomShape#getStrokeWidth()
	 * @see #getCustomShape()
	 * @generated
	 */
	EAttribute getCustomShape_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomShape#getSup_sub_indexes <em>Sup sub indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sup sub indexes</em>'.
	 * @see gettw.CustomShape#getSup_sub_indexes()
	 * @see #getCustomShape()
	 * @generated
	 */
	EAttribute getCustomShape_Sup_sub_indexes();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomShape#getText_subscript <em>Text subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text subscript</em>'.
	 * @see gettw.CustomShape#getText_subscript()
	 * @see #getCustomShape()
	 * @generated
	 */
	EAttribute getCustomShape_Text_subscript();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomShape#getText_superscript <em>Text superscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text superscript</em>'.
	 * @see gettw.CustomShape#getText_superscript()
	 * @see #getCustomShape()
	 * @generated
	 */
	EAttribute getCustomShape_Text_superscript();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomShape#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see gettw.CustomShape#getEditable()
	 * @see #getCustomShape()
	 * @generated
	 */
	EAttribute getCustomShape_Editable();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomShape#getTextIsHeader <em>Text Is Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Is Header</em>'.
	 * @see gettw.CustomShape#getTextIsHeader()
	 * @see #getCustomShape()
	 * @generated
	 */
	EAttribute getCustomShape_TextIsHeader();

	/**
	 * Returns the meta object for class '{@link gettw.CustomLink <em>Custom Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Link</em>'.
	 * @see gettw.CustomLink
	 * @generated
	 */
	EClass getCustomLink();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getLinkStrokeColor <em>Link Stroke Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Stroke Color</em>'.
	 * @see gettw.CustomLink#getLinkStrokeColor()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_LinkStrokeColor();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getLinkStrokeWidth <em>Link Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Stroke Width</em>'.
	 * @see gettw.CustomLink#getLinkStrokeWidth()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_LinkStrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getFromArrowShape <em>From Arrow Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Arrow Shape</em>'.
	 * @see gettw.CustomLink#getFromArrowShape()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_FromArrowShape();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getFromArrowColor <em>From Arrow Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Arrow Color</em>'.
	 * @see gettw.CustomLink#getFromArrowColor()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_FromArrowColor();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getFromArrowStrokeColor <em>From Arrow Stroke Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Arrow Stroke Color</em>'.
	 * @see gettw.CustomLink#getFromArrowStrokeColor()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_FromArrowStrokeColor();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getFromArrowStrokeWidth <em>From Arrow Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Arrow Stroke Width</em>'.
	 * @see gettw.CustomLink#getFromArrowStrokeWidth()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_FromArrowStrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getToArrowShape <em>To Arrow Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Arrow Shape</em>'.
	 * @see gettw.CustomLink#getToArrowShape()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_ToArrowShape();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getToArrowColor <em>To Arrow Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Arrow Color</em>'.
	 * @see gettw.CustomLink#getToArrowColor()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_ToArrowColor();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getToArrowStrokeColor <em>To Arrow Stroke Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Arrow Stroke Color</em>'.
	 * @see gettw.CustomLink#getToArrowStrokeColor()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_ToArrowStrokeColor();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getToArrowStrokeWidth <em>To Arrow Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Arrow Stroke Width</em>'.
	 * @see gettw.CustomLink#getToArrowStrokeWidth()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_ToArrowStrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getIsDashed <em>Is Dashed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dashed</em>'.
	 * @see gettw.CustomLink#getIsDashed()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_IsDashed();

	/**
	 * Returns the meta object for the attribute '{@link gettw.CustomLink#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see gettw.CustomLink#getText()
	 * @see #getCustomLink()
	 * @generated
	 */
	EAttribute getCustomLink_Text();

	/**
	 * Returns the meta object for enum '{@link gettw.Shapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shapes</em>'.
	 * @see gettw.Shapes
	 * @generated
	 */
	EEnum getShapes();

	/**
	 * Returns the meta object for enum '{@link gettw.ArrowHeads <em>Arrow Heads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arrow Heads</em>'.
	 * @see gettw.ArrowHeads
	 * @generated
	 */
	EEnum getArrowHeads();

	/**
	 * Returns the meta object for enum '{@link gettw.Colors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colors</em>'.
	 * @see gettw.Colors
	 * @generated
	 */
	EEnum getColors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GettwFactory getGettwFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gettw.impl.GETTWDiagramImpl <em>GETTW Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.GETTWDiagramImpl
		 * @see gettw.impl.GettwPackageImpl#getGETTWDiagram()
		 * @generated
		 */
		EClass GETTW_DIAGRAM = eINSTANCE.getGETTWDiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GETTW_DIAGRAM__ELEMENTS = eINSTANCE.getGETTWDiagram_Elements();

		/**
		 * The meta object literal for the '{@link gettw.impl.GraphElementImpl <em>Graph Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.GraphElementImpl
		 * @see gettw.impl.GettwPackageImpl#getGraphElement()
		 * @generated
		 */
		EClass GRAPH_ELEMENT = eINSTANCE.getGraphElement();

		/**
		 * The meta object literal for the '<em><b>Id </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ELEMENT__ID_ = eINSTANCE.getGraphElement_Id_();

		/**
		 * The meta object literal for the '{@link gettw.impl.PictureImpl <em>Picture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.PictureImpl
		 * @see gettw.impl.GettwPackageImpl#getPicture()
		 * @generated
		 */
		EClass PICTURE = eINSTANCE.getPicture();

		/**
		 * The meta object literal for the '<em><b>Source url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICTURE__SOURCE_URL = eINSTANCE.getPicture_Source_url();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICTURE__WIDTH = eINSTANCE.getPicture_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICTURE__HEIGHT = eINSTANCE.getPicture_Height();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICTURE__TEXT = eINSTANCE.getPicture_Text();

		/**
		 * The meta object literal for the '{@link gettw.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.TextImpl
		 * @see gettw.impl.GettwPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link gettw.impl.SuperscriptImpl <em>Superscript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.SuperscriptImpl
		 * @see gettw.impl.GettwPackageImpl#getSuperscript()
		 * @generated
		 */
		EClass SUPERSCRIPT = eINSTANCE.getSuperscript();

		/**
		 * The meta object literal for the '<em><b>Superscript</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPERSCRIPT__SUPERSCRIPT = eINSTANCE.getSuperscript_Superscript();

		/**
		 * The meta object literal for the '{@link gettw.impl.SubscriptImpl <em>Subscript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.SubscriptImpl
		 * @see gettw.impl.GettwPackageImpl#getSubscript()
		 * @generated
		 */
		EClass SUBSCRIPT = eINSTANCE.getSubscript();

		/**
		 * The meta object literal for the '<em><b>Subscript</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPT__SUBSCRIPT = eINSTANCE.getSubscript_Subscript();

		/**
		 * The meta object literal for the '{@link gettw.impl.TextIndexImpl <em>Text Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.TextIndexImpl
		 * @see gettw.impl.GettwPackageImpl#getTextIndex()
		 * @generated
		 */
		EClass TEXT_INDEX = eINSTANCE.getTextIndex();

		/**
		 * The meta object literal for the '<em><b>Subscript</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INDEX__SUBSCRIPT = eINSTANCE.getTextIndex_Subscript();

		/**
		 * The meta object literal for the '<em><b>Superscript</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INDEX__SUPERSCRIPT = eINSTANCE.getTextIndex_Superscript();

		/**
		 * The meta object literal for the '{@link gettw.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.ShapeImpl
		 * @see gettw.impl.GettwPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__TEXT = eINSTANCE.getShape_Text();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__COLOR = eINSTANCE.getShape_Color();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__STROKE = eINSTANCE.getShape_Stroke();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__STROKE_WIDTH = eINSTANCE.getShape_StrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__EDITABLE = eINSTANCE.getShape_Editable();

		/**
		 * The meta object literal for the '<em><b>Text Is Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__TEXT_IS_HEADER = eINSTANCE.getShape_TextIsHeader();

		/**
		 * The meta object literal for the '{@link gettw.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.RectangleImpl
		 * @see gettw.impl.GettwPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__SHAPE = eINSTANCE.getRectangle_Shape();

		/**
		 * The meta object literal for the '{@link gettw.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.RoundedRectangleImpl
		 * @see gettw.impl.GettwPackageImpl#getRoundedRectangle()
		 * @generated
		 */
		EClass ROUNDED_RECTANGLE = eINSTANCE.getRoundedRectangle();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUNDED_RECTANGLE__SHAPE = eINSTANCE.getRoundedRectangle_Shape();

		/**
		 * The meta object literal for the '{@link gettw.impl.EllipseImpl <em>Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.EllipseImpl
		 * @see gettw.impl.GettwPackageImpl#getEllipse()
		 * @generated
		 */
		EClass ELLIPSE = eINSTANCE.getEllipse();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__SHAPE = eINSTANCE.getEllipse_Shape();

		/**
		 * The meta object literal for the '{@link gettw.impl.TriangleImpl <em>Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.TriangleImpl
		 * @see gettw.impl.GettwPackageImpl#getTriangle()
		 * @generated
		 */
		EClass TRIANGLE = eINSTANCE.getTriangle();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE__SHAPE = eINSTANCE.getTriangle_Shape();

		/**
		 * The meta object literal for the '{@link gettw.impl.DiamondImpl <em>Diamond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.DiamondImpl
		 * @see gettw.impl.GettwPackageImpl#getDiamond()
		 * @generated
		 */
		EClass DIAMOND = eINSTANCE.getDiamond();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAMOND__SHAPE = eINSTANCE.getDiamond_Shape();

		/**
		 * The meta object literal for the '{@link gettw.impl.TriangleDownImpl <em>Triangle Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.TriangleDownImpl
		 * @see gettw.impl.GettwPackageImpl#getTriangleDown()
		 * @generated
		 */
		EClass TRIANGLE_DOWN = eINSTANCE.getTriangleDown();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE_DOWN__SHAPE = eINSTANCE.getTriangleDown_Shape();

		/**
		 * The meta object literal for the '{@link gettw.impl.TriangleLeftImpl <em>Triangle Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.TriangleLeftImpl
		 * @see gettw.impl.GettwPackageImpl#getTriangleLeft()
		 * @generated
		 */
		EClass TRIANGLE_LEFT = eINSTANCE.getTriangleLeft();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE_LEFT__SHAPE = eINSTANCE.getTriangleLeft_Shape();

		/**
		 * The meta object literal for the '{@link gettw.impl.TriangleRightImpl <em>Triangle Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.TriangleRightImpl
		 * @see gettw.impl.GettwPackageImpl#getTriangleRight()
		 * @generated
		 */
		EClass TRIANGLE_RIGHT = eINSTANCE.getTriangleRight();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE_RIGHT__SHAPE = eINSTANCE.getTriangleRight_Shape();

		/**
		 * The meta object literal for the '{@link gettw.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.ActorImpl
		 * @see gettw.impl.GettwPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__SHAPE = eINSTANCE.getActor_Shape();

		/**
		 * The meta object literal for the '{@link gettw.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.PackageImpl
		 * @see gettw.impl.GettwPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__SHAPE = eINSTANCE.getPackage_Shape();

		/**
		 * The meta object literal for the '{@link gettw.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.LinkImpl
		 * @see gettw.impl.GettwPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link gettw.impl.CustomShapeImpl <em>Custom Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.CustomShapeImpl
		 * @see gettw.impl.GettwPackageImpl#getCustomShape()
		 * @generated
		 */
		EClass CUSTOM_SHAPE = eINSTANCE.getCustomShape();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SHAPE__SHAPE = eINSTANCE.getCustomShape_Shape();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SHAPE__TEXT = eINSTANCE.getCustomShape_Text();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SHAPE__COLOR = eINSTANCE.getCustomShape_Color();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SHAPE__STROKE = eINSTANCE.getCustomShape_Stroke();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SHAPE__STROKE_WIDTH = eINSTANCE.getCustomShape_StrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Sup sub indexes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SHAPE__SUP_SUB_INDEXES = eINSTANCE.getCustomShape_Sup_sub_indexes();

		/**
		 * The meta object literal for the '<em><b>Text subscript</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SHAPE__TEXT_SUBSCRIPT = eINSTANCE.getCustomShape_Text_subscript();

		/**
		 * The meta object literal for the '<em><b>Text superscript</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SHAPE__TEXT_SUPERSCRIPT = eINSTANCE.getCustomShape_Text_superscript();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SHAPE__EDITABLE = eINSTANCE.getCustomShape_Editable();

		/**
		 * The meta object literal for the '<em><b>Text Is Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SHAPE__TEXT_IS_HEADER = eINSTANCE.getCustomShape_TextIsHeader();

		/**
		 * The meta object literal for the '{@link gettw.impl.CustomLinkImpl <em>Custom Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.impl.CustomLinkImpl
		 * @see gettw.impl.GettwPackageImpl#getCustomLink()
		 * @generated
		 */
		EClass CUSTOM_LINK = eINSTANCE.getCustomLink();

		/**
		 * The meta object literal for the '<em><b>Link Stroke Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__LINK_STROKE_COLOR = eINSTANCE.getCustomLink_LinkStrokeColor();

		/**
		 * The meta object literal for the '<em><b>Link Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__LINK_STROKE_WIDTH = eINSTANCE.getCustomLink_LinkStrokeWidth();

		/**
		 * The meta object literal for the '<em><b>From Arrow Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__FROM_ARROW_SHAPE = eINSTANCE.getCustomLink_FromArrowShape();

		/**
		 * The meta object literal for the '<em><b>From Arrow Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__FROM_ARROW_COLOR = eINSTANCE.getCustomLink_FromArrowColor();

		/**
		 * The meta object literal for the '<em><b>From Arrow Stroke Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__FROM_ARROW_STROKE_COLOR = eINSTANCE.getCustomLink_FromArrowStrokeColor();

		/**
		 * The meta object literal for the '<em><b>From Arrow Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__FROM_ARROW_STROKE_WIDTH = eINSTANCE.getCustomLink_FromArrowStrokeWidth();

		/**
		 * The meta object literal for the '<em><b>To Arrow Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__TO_ARROW_SHAPE = eINSTANCE.getCustomLink_ToArrowShape();

		/**
		 * The meta object literal for the '<em><b>To Arrow Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__TO_ARROW_COLOR = eINSTANCE.getCustomLink_ToArrowColor();

		/**
		 * The meta object literal for the '<em><b>To Arrow Stroke Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__TO_ARROW_STROKE_COLOR = eINSTANCE.getCustomLink_ToArrowStrokeColor();

		/**
		 * The meta object literal for the '<em><b>To Arrow Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__TO_ARROW_STROKE_WIDTH = eINSTANCE.getCustomLink_ToArrowStrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Is Dashed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__IS_DASHED = eINSTANCE.getCustomLink_IsDashed();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LINK__TEXT = eINSTANCE.getCustomLink_Text();

		/**
		 * The meta object literal for the '{@link gettw.Shapes <em>Shapes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.Shapes
		 * @see gettw.impl.GettwPackageImpl#getShapes()
		 * @generated
		 */
		EEnum SHAPES = eINSTANCE.getShapes();

		/**
		 * The meta object literal for the '{@link gettw.ArrowHeads <em>Arrow Heads</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.ArrowHeads
		 * @see gettw.impl.GettwPackageImpl#getArrowHeads()
		 * @generated
		 */
		EEnum ARROW_HEADS = eINSTANCE.getArrowHeads();

		/**
		 * The meta object literal for the '{@link gettw.Colors <em>Colors</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gettw.Colors
		 * @see gettw.impl.GettwPackageImpl#getColors()
		 * @generated
		 */
		EEnum COLORS = eINSTANCE.getColors();

	}

} //GettwPackage
