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
import gettw.GraphElement;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GettwPackageImpl extends EPackageImpl implements GettwPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gettwDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pictureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superscriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundedRectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diamondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangleDownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangleLeftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangleRightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shapesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arrowHeadsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gettw.GettwPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GettwPackageImpl() {
		super(eNS_URI, GettwFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GettwPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GettwPackage init() {
		if (isInited) return (GettwPackage)EPackage.Registry.INSTANCE.getEPackage(GettwPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGettwPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GettwPackageImpl theGettwPackage = registeredGettwPackage instanceof GettwPackageImpl ? (GettwPackageImpl)registeredGettwPackage : new GettwPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGettwPackage.createPackageContents();

		// Initialize created meta-data
		theGettwPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGettwPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GettwPackage.eNS_URI, theGettwPackage);
		return theGettwPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGETTWDiagram() {
		return gettwDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGETTWDiagram_Elements() {
		return (EReference)gettwDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphElement() {
		return graphElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphElement_Id_() {
		return (EAttribute)graphElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPicture() {
		return pictureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPicture_Source_url() {
		return (EAttribute)pictureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPicture_Width() {
		return (EAttribute)pictureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPicture_Height() {
		return (EAttribute)pictureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPicture_Text() {
		return (EAttribute)pictureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Text() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperscript() {
		return superscriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuperscript_Superscript() {
		return (EAttribute)superscriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscript() {
		return subscriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscript_Subscript() {
		return (EAttribute)subscriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextIndex() {
		return textIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextIndex_Subscript() {
		return (EAttribute)textIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextIndex_Superscript() {
		return (EAttribute)textIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_Text() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_Color() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_Stroke() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_StrokeWidth() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_Editable() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_TextIsHeader() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRectangle() {
		return rectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangle_Shape() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoundedRectangle() {
		return roundedRectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoundedRectangle_Shape() {
		return (EAttribute)roundedRectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEllipse() {
		return ellipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEllipse_Shape() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriangle() {
		return triangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriangle_Shape() {
		return (EAttribute)triangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiamond() {
		return diamondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiamond_Shape() {
		return (EAttribute)diamondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriangleDown() {
		return triangleDownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriangleDown_Shape() {
		return (EAttribute)triangleDownEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriangleLeft() {
		return triangleLeftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriangleLeft_Shape() {
		return (EAttribute)triangleLeftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriangleRight() {
		return triangleRightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriangleRight_Shape() {
		return (EAttribute)triangleRightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_Shape() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Shape() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomShape() {
		return customShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomShape_Shape() {
		return (EAttribute)customShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomShape_Text() {
		return (EAttribute)customShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomShape_Color() {
		return (EAttribute)customShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomShape_Stroke() {
		return (EAttribute)customShapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomShape_StrokeWidth() {
		return (EAttribute)customShapeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomShape_Sup_sub_indexes() {
		return (EAttribute)customShapeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomShape_Text_subscript() {
		return (EAttribute)customShapeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomShape_Text_superscript() {
		return (EAttribute)customShapeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomShape_Editable() {
		return (EAttribute)customShapeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomShape_TextIsHeader() {
		return (EAttribute)customShapeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomLink() {
		return customLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_LinkStrokeColor() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_LinkStrokeWidth() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_FromArrowShape() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_FromArrowColor() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_FromArrowStrokeColor() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_FromArrowStrokeWidth() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_ToArrowShape() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_ToArrowColor() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_ToArrowStrokeColor() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_ToArrowStrokeWidth() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_IsDashed() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLink_Text() {
		return (EAttribute)customLinkEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getShapes() {
		return shapesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArrowHeads() {
		return arrowHeadsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getColors() {
		return colorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GettwFactory getGettwFactory() {
		return (GettwFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gettwDiagramEClass = createEClass(GETTW_DIAGRAM);
		createEReference(gettwDiagramEClass, GETTW_DIAGRAM__ELEMENTS);

		graphElementEClass = createEClass(GRAPH_ELEMENT);
		createEAttribute(graphElementEClass, GRAPH_ELEMENT__ID_);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT);

		superscriptEClass = createEClass(SUPERSCRIPT);
		createEAttribute(superscriptEClass, SUPERSCRIPT__SUPERSCRIPT);

		subscriptEClass = createEClass(SUBSCRIPT);
		createEAttribute(subscriptEClass, SUBSCRIPT__SUBSCRIPT);

		textIndexEClass = createEClass(TEXT_INDEX);
		createEAttribute(textIndexEClass, TEXT_INDEX__SUBSCRIPT);
		createEAttribute(textIndexEClass, TEXT_INDEX__SUPERSCRIPT);

		shapeEClass = createEClass(SHAPE);
		createEAttribute(shapeEClass, SHAPE__TEXT);
		createEAttribute(shapeEClass, SHAPE__COLOR);
		createEAttribute(shapeEClass, SHAPE__STROKE);
		createEAttribute(shapeEClass, SHAPE__STROKE_WIDTH);
		createEAttribute(shapeEClass, SHAPE__EDITABLE);
		createEAttribute(shapeEClass, SHAPE__TEXT_IS_HEADER);

		rectangleEClass = createEClass(RECTANGLE);
		createEAttribute(rectangleEClass, RECTANGLE__SHAPE);

		roundedRectangleEClass = createEClass(ROUNDED_RECTANGLE);
		createEAttribute(roundedRectangleEClass, ROUNDED_RECTANGLE__SHAPE);

		ellipseEClass = createEClass(ELLIPSE);
		createEAttribute(ellipseEClass, ELLIPSE__SHAPE);

		triangleEClass = createEClass(TRIANGLE);
		createEAttribute(triangleEClass, TRIANGLE__SHAPE);

		diamondEClass = createEClass(DIAMOND);
		createEAttribute(diamondEClass, DIAMOND__SHAPE);

		triangleDownEClass = createEClass(TRIANGLE_DOWN);
		createEAttribute(triangleDownEClass, TRIANGLE_DOWN__SHAPE);

		triangleLeftEClass = createEClass(TRIANGLE_LEFT);
		createEAttribute(triangleLeftEClass, TRIANGLE_LEFT__SHAPE);

		triangleRightEClass = createEClass(TRIANGLE_RIGHT);
		createEAttribute(triangleRightEClass, TRIANGLE_RIGHT__SHAPE);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__SHAPE);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__SHAPE);

		linkEClass = createEClass(LINK);

		pictureEClass = createEClass(PICTURE);
		createEAttribute(pictureEClass, PICTURE__SOURCE_URL);
		createEAttribute(pictureEClass, PICTURE__WIDTH);
		createEAttribute(pictureEClass, PICTURE__HEIGHT);
		createEAttribute(pictureEClass, PICTURE__TEXT);

		customShapeEClass = createEClass(CUSTOM_SHAPE);
		createEAttribute(customShapeEClass, CUSTOM_SHAPE__SHAPE);
		createEAttribute(customShapeEClass, CUSTOM_SHAPE__TEXT);
		createEAttribute(customShapeEClass, CUSTOM_SHAPE__COLOR);
		createEAttribute(customShapeEClass, CUSTOM_SHAPE__STROKE);
		createEAttribute(customShapeEClass, CUSTOM_SHAPE__STROKE_WIDTH);
		createEAttribute(customShapeEClass, CUSTOM_SHAPE__SUP_SUB_INDEXES);
		createEAttribute(customShapeEClass, CUSTOM_SHAPE__TEXT_SUBSCRIPT);
		createEAttribute(customShapeEClass, CUSTOM_SHAPE__TEXT_SUPERSCRIPT);
		createEAttribute(customShapeEClass, CUSTOM_SHAPE__EDITABLE);
		createEAttribute(customShapeEClass, CUSTOM_SHAPE__TEXT_IS_HEADER);

		customLinkEClass = createEClass(CUSTOM_LINK);
		createEAttribute(customLinkEClass, CUSTOM_LINK__LINK_STROKE_COLOR);
		createEAttribute(customLinkEClass, CUSTOM_LINK__LINK_STROKE_WIDTH);
		createEAttribute(customLinkEClass, CUSTOM_LINK__FROM_ARROW_SHAPE);
		createEAttribute(customLinkEClass, CUSTOM_LINK__FROM_ARROW_COLOR);
		createEAttribute(customLinkEClass, CUSTOM_LINK__FROM_ARROW_STROKE_COLOR);
		createEAttribute(customLinkEClass, CUSTOM_LINK__FROM_ARROW_STROKE_WIDTH);
		createEAttribute(customLinkEClass, CUSTOM_LINK__TO_ARROW_SHAPE);
		createEAttribute(customLinkEClass, CUSTOM_LINK__TO_ARROW_COLOR);
		createEAttribute(customLinkEClass, CUSTOM_LINK__TO_ARROW_STROKE_COLOR);
		createEAttribute(customLinkEClass, CUSTOM_LINK__TO_ARROW_STROKE_WIDTH);
		createEAttribute(customLinkEClass, CUSTOM_LINK__IS_DASHED);
		createEAttribute(customLinkEClass, CUSTOM_LINK__TEXT);

		// Create enums
		shapesEEnum = createEEnum(SHAPES);
		arrowHeadsEEnum = createEEnum(ARROW_HEADS);
		colorsEEnum = createEEnum(COLORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textEClass.getESuperTypes().add(this.getGraphElement());
		superscriptEClass.getESuperTypes().add(this.getText());
		subscriptEClass.getESuperTypes().add(this.getText());
		textIndexEClass.getESuperTypes().add(this.getText());
		shapeEClass.getESuperTypes().add(this.getGraphElement());
		rectangleEClass.getESuperTypes().add(this.getShape());
		roundedRectangleEClass.getESuperTypes().add(this.getShape());
		ellipseEClass.getESuperTypes().add(this.getShape());
		triangleEClass.getESuperTypes().add(this.getShape());
		diamondEClass.getESuperTypes().add(this.getShape());
		triangleDownEClass.getESuperTypes().add(this.getShape());
		triangleLeftEClass.getESuperTypes().add(this.getShape());
		triangleRightEClass.getESuperTypes().add(this.getShape());
		actorEClass.getESuperTypes().add(this.getShape());
		packageEClass.getESuperTypes().add(this.getShape());
		linkEClass.getESuperTypes().add(this.getGraphElement());
		pictureEClass.getESuperTypes().add(this.getGraphElement());
		customShapeEClass.getESuperTypes().add(this.getGraphElement());
		customLinkEClass.getESuperTypes().add(this.getLink());

		// Initialize classes and features; add operations and parameters
		initEClass(gettwDiagramEClass, GETTWDiagram.class, "GETTWDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGETTWDiagram_Elements(), this.getGraphElement(), null, "elements", null, 0, -1, GETTWDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphElementEClass, GraphElement.class, "GraphElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphElement_Id_(), ecorePackage.getEString(), "id_", null, 0, 1, GraphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superscriptEClass, Superscript.class, "Superscript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperscript_Superscript(), ecorePackage.getEString(), "superscript", null, 0, 1, Superscript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptEClass, Subscript.class, "Subscript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscript_Subscript(), ecorePackage.getEString(), "subscript", null, 0, 1, Subscript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textIndexEClass, TextIndex.class, "TextIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextIndex_Subscript(), ecorePackage.getEString(), "subscript", null, 0, 1, TextIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextIndex_Superscript(), ecorePackage.getEString(), "superscript", null, 0, 1, TextIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShape_Text(), ecorePackage.getEString(), "text", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_Color(), this.getColors(), "color", null, 1, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_Stroke(), this.getColors(), "stroke", null, 1, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_StrokeWidth(), ecorePackage.getEIntegerObject(), "strokeWidth", "2", 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_Editable(), ecorePackage.getEBooleanObject(), "editable", "false", 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_TextIsHeader(), ecorePackage.getEBooleanObject(), "textIsHeader", "false", 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangle_Shape(), ecorePackage.getEString(), "shape", "Rectangle", 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roundedRectangleEClass, RoundedRectangle.class, "RoundedRectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoundedRectangle_Shape(), ecorePackage.getEString(), "shape", "RoundedRectangle", 0, 1, RoundedRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEllipse_Shape(), ecorePackage.getEString(), "shape", "Ellipse", 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triangleEClass, Triangle.class, "Triangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriangle_Shape(), ecorePackage.getEString(), "shape", "Triangle", 0, 1, Triangle.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diamondEClass, Diamond.class, "Diamond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiamond_Shape(), ecorePackage.getEString(), "shape", "Diamond", 0, 1, Diamond.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triangleDownEClass, TriangleDown.class, "TriangleDown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriangleDown_Shape(), ecorePackage.getEString(), "shape", "TriangleDown", 0, 1, TriangleDown.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triangleLeftEClass, TriangleLeft.class, "TriangleLeft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriangleLeft_Shape(), ecorePackage.getEString(), "shape", "TriangleLeft", 0, 1, TriangleLeft.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triangleRightEClass, TriangleRight.class, "TriangleRight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriangleRight_Shape(), ecorePackage.getEString(), "shape", "TriangleRight", 0, 1, TriangleRight.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Shape(), ecorePackage.getEString(), "shape", "Actor", 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, gettw.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Shape(), ecorePackage.getEString(), "shape", "Package", 0, 1, gettw.Package.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pictureEClass, Picture.class, "Picture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPicture_Source_url(), ecorePackage.getEString(), "source_url", null, 0, 1, Picture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPicture_Width(), ecorePackage.getEIntegerObject(), "width", null, 0, 1, Picture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPicture_Height(), ecorePackage.getEIntegerObject(), "height", null, 0, 1, Picture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPicture_Text(), ecorePackage.getEString(), "text", null, 0, 1, Picture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customShapeEClass, CustomShape.class, "CustomShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomShape_Shape(), this.getShapes(), "shape", null, 1, 1, CustomShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomShape_Text(), ecorePackage.getEString(), "text", null, 0, 1, CustomShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomShape_Color(), this.getColors(), "color", null, 1, 1, CustomShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomShape_Stroke(), this.getColors(), "stroke", null, 1, 1, CustomShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomShape_StrokeWidth(), ecorePackage.getEIntegerObject(), "strokeWidth", "2", 0, 1, CustomShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomShape_Sup_sub_indexes(), ecorePackage.getEBooleanObject(), "sup_sub_indexes", "false", 0, 1, CustomShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomShape_Text_subscript(), ecorePackage.getEString(), "text_subscript", null, 0, 1, CustomShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomShape_Text_superscript(), ecorePackage.getEString(), "text_superscript", null, 0, 1, CustomShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomShape_Editable(), ecorePackage.getEBooleanObject(), "editable", "false", 0, 1, CustomShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomShape_TextIsHeader(), ecorePackage.getEBooleanObject(), "textIsHeader", "false", 0, 1, CustomShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customLinkEClass, CustomLink.class, "CustomLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomLink_LinkStrokeColor(), this.getColors(), "linkStrokeColor", null, 1, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_LinkStrokeWidth(), ecorePackage.getEIntegerObject(), "linkStrokeWidth", "2", 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_FromArrowShape(), this.getArrowHeads(), "fromArrowShape", null, 1, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_FromArrowColor(), this.getColors(), "fromArrowColor", null, 1, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_FromArrowStrokeColor(), this.getColors(), "fromArrowStrokeColor", null, 1, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_FromArrowStrokeWidth(), ecorePackage.getEIntegerObject(), "fromArrowStrokeWidth", "2", 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_ToArrowShape(), this.getArrowHeads(), "toArrowShape", null, 1, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_ToArrowColor(), this.getColors(), "toArrowColor", null, 1, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_ToArrowStrokeColor(), this.getColors(), "toArrowStrokeColor", null, 1, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_ToArrowStrokeWidth(), ecorePackage.getEIntegerObject(), "toArrowStrokeWidth", "2", 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_IsDashed(), ecorePackage.getEBooleanObject(), "isDashed", "false", 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLink_Text(), ecorePackage.getEString(), "text", null, 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(shapesEEnum, Shapes.class, "Shapes");
		addEEnumLiteral(shapesEEnum, Shapes.NONE);
		addEEnumLiteral(shapesEEnum, Shapes.ELLIPSE);
		addEEnumLiteral(shapesEEnum, Shapes.RECTANGLE);
		addEEnumLiteral(shapesEEnum, Shapes.SQUARE);
		addEEnumLiteral(shapesEEnum, Shapes.TRIANGLE);
		addEEnumLiteral(shapesEEnum, Shapes.ACTOR);
		addEEnumLiteral(shapesEEnum, Shapes.ACVOLTAGE_SOURCE);
		addEEnumLiteral(shapesEEnum, Shapes.AND_GATE);
		addEEnumLiteral(shapesEEnum, Shapes.ARROW);
		addEEnumLiteral(shapesEEnum, Shapes.ASTERISK_LINE);
		addEEnumLiteral(shapesEEnum, Shapes.BAR_H);
		addEEnumLiteral(shapesEEnum, Shapes.BAR_V);
		addEEnumLiteral(shapesEEnum, Shapes.BORDER);
		addEEnumLiteral(shapesEEnum, Shapes.BUFFER);
		addEEnumLiteral(shapesEEnum, Shapes.CAPACITOR);
		addEEnumLiteral(shapesEEnum, Shapes.CARD);
		addEEnumLiteral(shapesEEnum, Shapes.CHEVRON);
		addEEnumLiteral(shapesEEnum, Shapes.CIRCLE);
		addEEnumLiteral(shapesEEnum, Shapes.CIRCLE_LINE);
		addEEnumLiteral(shapesEEnum, Shapes.CLOCK);
		addEEnumLiteral(shapesEEnum, Shapes.CLOUD);
		addEEnumLiteral(shapesEEnum, Shapes.CLUB);
		addEEnumLiteral(shapesEEnum, Shapes.CONE1);
		addEEnumLiteral(shapesEEnum, Shapes.CONE2);
		addEEnumLiteral(shapesEEnum, Shapes.CREATE_REQUEST);
		addEEnumLiteral(shapesEEnum, Shapes.CUBE1);
		addEEnumLiteral(shapesEEnum, Shapes.CUBE2);
		addEEnumLiteral(shapesEEnum, Shapes.CURVE1);
		addEEnumLiteral(shapesEEnum, Shapes.CURVE2);
		addEEnumLiteral(shapesEEnum, Shapes.CURVE3);
		addEEnumLiteral(shapesEEnum, Shapes.CURVE4);
		addEEnumLiteral(shapesEEnum, Shapes.CYLINDER1);
		addEEnumLiteral(shapesEEnum, Shapes.CYLINDER2);
		addEEnumLiteral(shapesEEnum, Shapes.CYLINDER3);
		addEEnumLiteral(shapesEEnum, Shapes.CYLINDER4);
		addEEnumLiteral(shapesEEnum, Shapes.DATABASE);
		addEEnumLiteral(shapesEEnum, Shapes.DATA_STORAGE);
		addEEnumLiteral(shapesEEnum, Shapes.DCVOLTAGE_SOURCE);
		addEEnumLiteral(shapesEEnum, Shapes.DECAGON);
		addEEnumLiteral(shapesEEnum, Shapes.DIAMOND);
		addEEnumLiteral(shapesEEnum, Shapes.DIODE);
		addEEnumLiteral(shapesEEnum, Shapes.DISK_STORAGE);
		addEEnumLiteral(shapesEEnum, Shapes.DISPLAY);
		addEEnumLiteral(shapesEEnum, Shapes.DIVIDED_EVENT);
		addEEnumLiteral(shapesEEnum, Shapes.DIVIDED_PROCESS);
		addEEnumLiteral(shapesEEnum, Shapes.DOCUMENT);
		addEEnumLiteral(shapesEEnum, Shapes.DODECAGON);
		addEEnumLiteral(shapesEEnum, Shapes.DOUBLE_ARROW);
		addEEnumLiteral(shapesEEnum, Shapes.DOUBLE_END_ARROW);
		addEEnumLiteral(shapesEEnum, Shapes.EXTERNAL_ORGANIZATION);
		addEEnumLiteral(shapesEEnum, Shapes.EXTERNAL_PROCESS);
		addEEnumLiteral(shapesEEnum, Shapes.EIGHT_POINTED_STAR);
		addEEnumLiteral(shapesEEnum, Shapes.EIGHT_POINTED_BURST);
		addEEnumLiteral(shapesEEnum, Shapes.FILE);
		addEEnumLiteral(shapesEEnum, Shapes.FIVE_POINTED_BURST);
		addEEnumLiteral(shapesEEnum, Shapes.FIVE_POINTED_STAR);
		addEEnumLiteral(shapesEEnum, Shapes.FRAGILE);
		addEEnumLiteral(shapesEEnum, Shapes.FRAMED_RECTANGLE);
		addEEnumLiteral(shapesEEnum, Shapes.GENDER_MALE);
		addEEnumLiteral(shapesEEnum, Shapes.GENDER_FEMALE);
		addEEnumLiteral(shapesEEnum, Shapes.GROUND);
		addEEnumLiteral(shapesEEnum, Shapes.HEART);
		addEEnumLiteral(shapesEEnum, Shapes.HEXAGON);
		addEEnumLiteral(shapesEEnum, Shapes.HEPTAGON);
		addEEnumLiteral(shapesEEnum, Shapes.HOUR_GLASS);
		addEEnumLiteral(shapesEEnum, Shapes.IBEAM_ARROW);
		addEEnumLiteral(shapesEEnum, Shapes.INDUCTOR);
		addEEnumLiteral(shapesEEnum, Shapes.INTERNAL_STORAGE);
		addEEnumLiteral(shapesEEnum, Shapes.INTERRUPT);
		addEEnumLiteral(shapesEEnum, Shapes.INVERTER);
		addEEnumLiteral(shapesEEnum, Shapes.JUNCTION);
		addEEnumLiteral(shapesEEnum, Shapes.LIGHTNING);
		addEEnumLiteral(shapesEEnum, Shapes.LINE1);
		addEEnumLiteral(shapesEEnum, Shapes.LINE2);
		addEEnumLiteral(shapesEEnum, Shapes.LINED_DOCUMENT);
		addEEnumLiteral(shapesEEnum, Shapes.LINE_H);
		addEEnumLiteral(shapesEEnum, Shapes.LINE_V);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_AND);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_FALSITY);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_FOR_ALL);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_IFF);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_IMPLIES);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_INTERSECT);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_IS_DEFINED_AS);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_NOT);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_OR);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_THERE_EXISTS);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_TRUTH);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_UNION);
		addEEnumLiteral(shapesEEnum, Shapes.LOGIC_XOR);
		addEEnumLiteral(shapesEEnum, Shapes.MINUS_LINE);
		addEEnumLiteral(shapesEEnum, Shapes.MULTI_DOCUMENT);
		addEEnumLiteral(shapesEEnum, Shapes.MULTI_PROCESS);
		addEEnumLiteral(shapesEEnum, Shapes.NAND_GATE);
		addEEnumLiteral(shapesEEnum, Shapes.NINE_POINTED_BURST);
		addEEnumLiteral(shapesEEnum, Shapes.NINE_POINTED_STAR);
		addEEnumLiteral(shapesEEnum, Shapes.NONAGON);
		addEEnumLiteral(shapesEEnum, Shapes.NOR_GATE);
		addEEnumLiteral(shapesEEnum, Shapes.NOT_ALLOWED);
		addEEnumLiteral(shapesEEnum, Shapes.OCTAGON);
		addEEnumLiteral(shapesEEnum, Shapes.OR_GATE);
		addEEnumLiteral(shapesEEnum, Shapes.PARALLELOGRAM);
		addEEnumLiteral(shapesEEnum, Shapes.PEACE);
		addEEnumLiteral(shapesEEnum, Shapes.PENTAGON);
		addEEnumLiteral(shapesEEnum, Shapes.PIE);
		addEEnumLiteral(shapesEEnum, Shapes.PIE_PIECE);
		addEEnumLiteral(shapesEEnum, Shapes.PLUS_LINE);
		addEEnumLiteral(shapesEEnum, Shapes.POINTER);
		addEEnumLiteral(shapesEEnum, Shapes.PRISM1);
		addEEnumLiteral(shapesEEnum, Shapes.PRISM2);
		addEEnumLiteral(shapesEEnum, Shapes.PROCEDURE);
		addEEnumLiteral(shapesEEnum, Shapes.PROCESS);
		addEEnumLiteral(shapesEEnum, Shapes.PYRAMID1);
		addEEnumLiteral(shapesEEnum, Shapes.PYRAMID2);
		addEEnumLiteral(shapesEEnum, Shapes.RESISTOR);
		addEEnumLiteral(shapesEEnum, Shapes.RING);
		addEEnumLiteral(shapesEEnum, Shapes.ROUNDED_POINTER);
		addEEnumLiteral(shapesEEnum, Shapes.ROUNDED_RECTANGLE);
		addEEnumLiteral(shapesEEnum, Shapes.SEVEN_POINTED_BURST);
		addEEnumLiteral(shapesEEnum, Shapes.SEVEN_POINTED_STAR);
		addEEnumLiteral(shapesEEnum, Shapes.SIX_POINTED_BURST);
		addEEnumLiteral(shapesEEnum, Shapes.SIX_POINTED_STAR);
		addEEnumLiteral(shapesEEnum, Shapes.SPADE);
		addEEnumLiteral(shapesEEnum, Shapes.SPLIT_END_ARROW);
		addEEnumLiteral(shapesEEnum, Shapes.STOP_SIGN);
		addEEnumLiteral(shapesEEnum, Shapes.SQUARE_ARROW);
		addEEnumLiteral(shapesEEnum, Shapes.TEN_POINTED_BURST);
		addEEnumLiteral(shapesEEnum, Shapes.TEN_POINTED_STAR);
		addEEnumLiteral(shapesEEnum, Shapes.THICK_CROSS);
		addEEnumLiteral(shapesEEnum, Shapes.THICK_X);
		addEEnumLiteral(shapesEEnum, Shapes.THIN_CROSS);
		addEEnumLiteral(shapesEEnum, Shapes.THIN_X);
		addEEnumLiteral(shapesEEnum, Shapes.TRIANGLE_RIGHT);
		addEEnumLiteral(shapesEEnum, Shapes.TRIANGLE_DOWN);
		addEEnumLiteral(shapesEEnum, Shapes.TRIANGLE_LEFT);
		addEEnumLiteral(shapesEEnum, Shapes.TRAPEZOID);
		addEEnumLiteral(shapesEEnum, Shapes.YIN_YANG);
		addEEnumLiteral(shapesEEnum, Shapes.XLINE);
		addEEnumLiteral(shapesEEnum, Shapes.XNOR_GATE);
		addEEnumLiteral(shapesEEnum, Shapes.XOR_GATE);

		initEEnum(arrowHeadsEEnum, ArrowHeads.class, "ArrowHeads");
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.NONE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.STANDARD);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.ACCELERATION_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACK_SLASH);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_BOOMERANG);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_CIRCLE_FORK);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_CIRCLE_LINE_FORK);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_DOUBLE_FEATHERS);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_FEATHER);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_FORK);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_HALF_TRIANGLE_BOTTOM);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_HALF_TRIANGLE_TOP);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_LINE_FORK);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_OPEN_TRIANGLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_OPPEN_TRIANGLE_BOTTOM);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_OPEN_TRIANGLE_LINE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_OPEN_TRIANGLE_TOP);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_SEMI_CIRCLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_TRIANGLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_TRIPLE_FEATHERS);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BACKWARD_V);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BIG_END_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BLOCK);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BOOMERANG);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.BOX_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.CHEVRON);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.CIRCLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.CIRCLE_ENDED_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.CIRCLE_FORK);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.CIRCLE_LINE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.CIRCLE_LINE_FORK);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.CONCAVE_TAIL_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.DIAMOND);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.DIAMOND_CIRCLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.DOUBLE_BACK_SLASH);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.DOUBLE_FEATHERS);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.DOUBLE_FORWARD_SLASH);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.DOUBLE_LINE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.DOUBLE_LINE_CIRCLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.DOUBLE_TRIANGLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.DYNAMIC_WIDTH_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.EQUILIBRIUM_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.FAST_FORWARD);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.FEATHER);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.FORK);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.FORWARD_SEMI_CIRCLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.FORWARD_SLACK);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.HALF_ARROW_TOP);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.HALF_ARROW_BOTTOM);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.HALF_TRIANGLE_BOTTOM);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.HALF_TRIANGLE_TOP);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.KITE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.LINE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.LINE_CIRCLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.LINE_FORK);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.NORMAL_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.OPEN_RIGHT_TRIANGLE_TOP);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.OPEN_RIGHT_TRIANGLE_BOTTOM);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.OPEN_TRIANGLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.OPEN_TRIANGLE_LINE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.OPEN_TRIANGLE_TOP);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.OPEN_TRIANGLE_BOTTOM);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.OPPOSING_DIRECTION_DOUBLE_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.PARTIAL_DOUBLE_TRIANGLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.PENTAGON_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.PLUS_CIRCLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.ROUNDED_TRIANGLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.SIDEWAYS_V);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.SIMPLE_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.STRETCHED_DIAMOND);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.STRETCHED_CHEVRON);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.TAILED_NORMAL_ARROW);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.TRIANGLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.TRIANGLE_LINE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.TRIPLE_BACK_SLASH);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.TRIPLE_FEATHERS);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.TRIPLE_FORWARD_SLASH);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.TRIPLE_LINE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.TRIPLE_LINE_CIRCLE);
		addEEnumLiteral(arrowHeadsEEnum, ArrowHeads.X);

		initEEnum(colorsEEnum, Colors.class, "Colors");
		addEEnumLiteral(colorsEEnum, Colors.BLACK);
		addEEnumLiteral(colorsEEnum, Colors.BLUE);
		addEEnumLiteral(colorsEEnum, Colors.LIGHTBLUE);
		addEEnumLiteral(colorsEEnum, Colors.DARKBLUE);
		addEEnumLiteral(colorsEEnum, Colors.GRAY);
		addEEnumLiteral(colorsEEnum, Colors.LIGHTGRAY);
		addEEnumLiteral(colorsEEnum, Colors.DARKGRAY);
		addEEnumLiteral(colorsEEnum, Colors.GREEN);
		addEEnumLiteral(colorsEEnum, Colors.LIGHTGREEN);
		addEEnumLiteral(colorsEEnum, Colors.DARKGREEN);
		addEEnumLiteral(colorsEEnum, Colors.ORANGE);
		addEEnumLiteral(colorsEEnum, Colors.LIGHTORANGE);
		addEEnumLiteral(colorsEEnum, Colors.DARKORANGE);
		addEEnumLiteral(colorsEEnum, Colors.PINK);
		addEEnumLiteral(colorsEEnum, Colors.PURPLE);
		addEEnumLiteral(colorsEEnum, Colors.RED);
		addEEnumLiteral(colorsEEnum, Colors.LIGHTRED);
		addEEnumLiteral(colorsEEnum, Colors.DARKRED);
		addEEnumLiteral(colorsEEnum, Colors.TRANSPARENT);
		addEEnumLiteral(colorsEEnum, Colors.YELLOW);
		addEEnumLiteral(colorsEEnum, Colors.LIGHTYELLOW);
		addEEnumLiteral(colorsEEnum, Colors.DARKYELLOW);
		addEEnumLiteral(colorsEEnum, Colors.WHITE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (gettwDiagramEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (textEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.TextFigure",
			   "tool.name", "Text",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/text64.png",
			   "tool.small.path", "images/text16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (superscriptEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.SuperscriptFigure",
			   "tool.name", "Text w Superscript",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/superscript64.png",
			   "tool.small.path", "images/superscript16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (subscriptEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.SubscriptFigure",
			   "tool.name", "Text w Subscript",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/subscript64.png",
			   "tool.small.path", "images/subscript16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (textIndexEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.TextIndexFigure",
			   "tool.name", "Text w Indexes",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/textindex64.png",
			   "tool.small.path", "images/textindex16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (rectangleEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.RectangleFigure",
			   "tool.name", "Rectangle",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/rectangle64.png",
			   "tool.small.path", "images/rectangle16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (roundedRectangleEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.RoundedRectangleFigure",
			   "tool.name", "Rounded Rectangle",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/rounded_rectangle64.png",
			   "tool.small.path", "images/rounded_rectangle16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (ellipseEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.EllipseFigure",
			   "tool.name", "Ellipse",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/ellipse64.png",
			   "tool.small.path", "images/ellipse16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (triangleEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.TriangleFigure",
			   "tool.name", "Triangle",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/triangle64.png",
			   "tool.small.path", "images/triangle16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (diamondEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.DiamondFigure",
			   "tool.name", "Diamond",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/diamond64.png",
			   "tool.small.path", "images/diamond16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (triangleDownEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.TriangleDownFigure",
			   "tool.name", "Triangle Down",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/triangle_down64.png",
			   "tool.small.path", "images/triangle_down16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (triangleLeftEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.TriangleLeftFigure",
			   "tool.name", "Triangle Left",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/triangle_left64.png",
			   "tool.small.path", "images/triangle_left16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (triangleRightEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.TriangleRightFigure",
			   "tool.name", "Triangle Right",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/triangle_right64.png",
			   "tool.small.path", "images/triangle_right16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (actorEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.ActorFigure",
			   "tool.name", "Actor",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/actor64.png",
			   "tool.small.path", "images/actor16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (packageEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.PackageFigure",
			   "tool.name", "Package",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/package64.png",
			   "tool.small.path", "images/package16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (pictureEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.PictureFigure",
			   "tool.name", "Picture",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/picture64.png",
			   "tool.small.path", "images/picture16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (customShapeEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.ShapeFigure",
			   "tool.name", "Shape",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/shape64.png",
			   "tool.small.path", "images/shape16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (customLinkEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.gettw.figures.LinkFigure",
			   "tool.name", "Link",
			   "tool.small.bundle", "org.chico.uclm.gettw.figures",
			   "tool.large.path", "images/line64.png",
			   "tool.small.path", "images/line16.png",
			   "label", "id_",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "64,64"
		   });
	}

} //GettwPackageImpl
