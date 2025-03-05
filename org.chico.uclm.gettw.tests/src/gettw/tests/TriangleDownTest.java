/**
 */
package gettw.tests;

import gettw.GettwFactory;
import gettw.TriangleDown;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Triangle Down</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriangleDownTest extends ShapeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TriangleDownTest.class);
	}

	/**
	 * Constructs a new Triangle Down test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangleDownTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Triangle Down test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TriangleDown getFixture() {
		return (TriangleDown)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GettwFactory.eINSTANCE.createTriangleDown());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TriangleDownTest
