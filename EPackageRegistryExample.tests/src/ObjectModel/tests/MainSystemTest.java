/**
 */
package ObjectModel.tests;

import ObjectModel.MainSystem;
import ObjectModel.ObjectModelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Main System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainSystemTest extends TestCase {

	/**
	 * The fixture for this Main System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MainSystemTest.class);
	}

	/**
	 * Constructs a new Main System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Main System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MainSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Main System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainSystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ObjectModelFactory.eINSTANCE.createMainSystem());
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

} //MainSystemTest
