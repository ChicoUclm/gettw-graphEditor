/**
 */
package gettw.impl;

import gettw.Actor;
import gettw.ArrowHeads;
import gettw.Colors;
import gettw.CustomLink;
import gettw.CustomShape;
import gettw.Diamond;
import gettw.Ellipse;
import gettw.GETTWDiagram;
import gettw.GettwFactory;
import gettw.GettwPackage;
import gettw.Link;
import gettw.Picture;
import gettw.Rectangle;
import gettw.RoundedRectangle;
import gettw.Shape;
import gettw.Shapes;
import gettw.Subscript;
import gettw.Superscript;
import gettw.Text;
import gettw.TextIndex;
import gettw.Triangle;
import gettw.TriangleDown;
import gettw.TriangleLeft;
import gettw.TriangleRight;
import gettw.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GettwFactoryImpl extends EFactoryImpl implements GettwFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GettwFactory init() {
		try {
			GettwFactory theGettwFactory = (GettwFactory)EPackage.Registry.INSTANCE.getEFactory(GettwPackage.eNS_URI);
			if (theGettwFactory != null) {
				return theGettwFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GettwFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GettwFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GettwPackage.GETTW_DIAGRAM: return createGETTWDiagram();
			case GettwPackage.TEXT: return createText();
			case GettwPackage.SUPERSCRIPT: return createSuperscript();
			case GettwPackage.SUBSCRIPT: return createSubscript();
			case GettwPackage.TEXT_INDEX: return createTextIndex();
			case GettwPackage.SHAPE: return createShape();
			case GettwPackage.RECTANGLE: return createRectangle();
			case GettwPackage.ROUNDED_RECTANGLE: return createRoundedRectangle();
			case GettwPackage.ELLIPSE: return createEllipse();
			case GettwPackage.TRIANGLE: return createTriangle();
			case GettwPackage.DIAMOND: return createDiamond();
			case GettwPackage.TRIANGLE_DOWN: return createTriangleDown();
			case GettwPackage.TRIANGLE_LEFT: return createTriangleLeft();
			case GettwPackage.TRIANGLE_RIGHT: return createTriangleRight();
			case GettwPackage.ACTOR: return createActor();
			case GettwPackage.PACKAGE: return createPackage();
			case GettwPackage.LINK: return createLink();
			case GettwPackage.PICTURE: return createPicture();
			case GettwPackage.CUSTOM_SHAPE: return createCustomShape();
			case GettwPackage.CUSTOM_LINK: return createCustomLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GettwPackage.SHAPES:
				return createShapesFromString(eDataType, initialValue);
			case GettwPackage.ARROW_HEADS:
				return createArrowHeadsFromString(eDataType, initialValue);
			case GettwPackage.COLORS:
				return createColorsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GettwPackage.SHAPES:
				return convertShapesToString(eDataType, instanceValue);
			case GettwPackage.ARROW_HEADS:
				return convertArrowHeadsToString(eDataType, instanceValue);
			case GettwPackage.COLORS:
				return convertColorsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GETTWDiagram createGETTWDiagram() {
		GETTWDiagramImpl gettwDiagram = new GETTWDiagramImpl();
		return gettwDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Picture createPicture() {
		PictureImpl picture = new PictureImpl();
		return picture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Superscript createSuperscript() {
		SuperscriptImpl superscript = new SuperscriptImpl();
		return superscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscript createSubscript() {
		SubscriptImpl subscript = new SubscriptImpl();
		return subscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextIndex createTextIndex() {
		TextIndexImpl textIndex = new TextIndexImpl();
		return textIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shape createShape() {
		ShapeImpl shape = new ShapeImpl();
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoundedRectangle createRoundedRectangle() {
		RoundedRectangleImpl roundedRectangle = new RoundedRectangleImpl();
		return roundedRectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ellipse createEllipse() {
		EllipseImpl ellipse = new EllipseImpl();
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Triangle createTriangle() {
		TriangleImpl triangle = new TriangleImpl();
		return triangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Diamond createDiamond() {
		DiamondImpl diamond = new DiamondImpl();
		return diamond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriangleDown createTriangleDown() {
		TriangleDownImpl triangleDown = new TriangleDownImpl();
		return triangleDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriangleLeft createTriangleLeft() {
		TriangleLeftImpl triangleLeft = new TriangleLeftImpl();
		return triangleLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriangleRight createTriangleRight() {
		TriangleRightImpl triangleRight = new TriangleRightImpl();
		return triangleRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public gettw.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomShape createCustomShape() {
		CustomShapeImpl customShape = new CustomShapeImpl();
		return customShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomLink createCustomLink() {
		CustomLinkImpl customLink = new CustomLinkImpl();
		return customLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shapes createShapesFromString(EDataType eDataType, String initialValue) {
		Shapes result = Shapes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowHeads createArrowHeadsFromString(EDataType eDataType, String initialValue) {
		ArrowHeads result = ArrowHeads.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrowHeadsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colors createColorsFromString(EDataType eDataType, String initialValue) {
		Colors result = Colors.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GettwPackage getGettwPackage() {
		return (GettwPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GettwPackage getPackage() {
		return GettwPackage.eINSTANCE;
	}

} //GettwFactoryImpl
