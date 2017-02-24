/**
 */
package ObjectModel.impl;

import ComponentModel.ComponentModelPackage;

import ComponentModel.impl.ComponentModelPackageImpl;

import ObjectModel.MainSystem;
import ObjectModel.OClass;
import ObjectModel.OPackage;
import ObjectModel.ObjectModelFactory;
import ObjectModel.ObjectModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectModelPackageImpl extends EPackageImpl implements ObjectModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oClassEClass = null;

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
	 * @see ObjectModel.ObjectModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ObjectModelPackageImpl() {
		super(eNS_URI, ObjectModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ObjectModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ObjectModelPackage init() {
		if (isInited) return (ObjectModelPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectModelPackage.eNS_URI);

		// Obtain or create and register package
		ObjectModelPackageImpl theObjectModelPackage = (ObjectModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ObjectModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ObjectModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ComponentModelPackageImpl theComponentModelPackage = (ComponentModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentModelPackage.eNS_URI) instanceof ComponentModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentModelPackage.eNS_URI) : ComponentModelPackage.eINSTANCE);

		// Create package meta-data objects
		theObjectModelPackage.createPackageContents();
		theComponentModelPackage.createPackageContents();

		// Initialize created meta-data
		theObjectModelPackage.initializePackageContents();
		theComponentModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theObjectModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ObjectModelPackage.eNS_URI, theObjectModelPackage);
		return theObjectModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainSystem() {
		return mainSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainSystem_Name() {
		return (EAttribute)mainSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainSystem_SystemPackages() {
		return (EReference)mainSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPackage() {
		return oPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPackage_Name() {
		return (EAttribute)oPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPackage_Path() {
		return (EAttribute)oPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPackage_Contents() {
		return (EReference)oPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOClass() {
		return oClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOClass_Name() {
		return (EAttribute)oClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectModelFactory getObjectModelFactory() {
		return (ObjectModelFactory)getEFactoryInstance();
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
		mainSystemEClass = createEClass(MAIN_SYSTEM);
		createEAttribute(mainSystemEClass, MAIN_SYSTEM__NAME);
		createEReference(mainSystemEClass, MAIN_SYSTEM__SYSTEM_PACKAGES);

		oPackageEClass = createEClass(OPACKAGE);
		createEAttribute(oPackageEClass, OPACKAGE__NAME);
		createEAttribute(oPackageEClass, OPACKAGE__PATH);
		createEReference(oPackageEClass, OPACKAGE__CONTENTS);

		oClassEClass = createEClass(OCLASS);
		createEAttribute(oClassEClass, OCLASS__NAME);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(mainSystemEClass, MainSystem.class, "MainSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMainSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, MainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainSystem_SystemPackages(), this.getOPackage(), null, "systemPackages", null, 0, -1, MainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oPackageEClass, OPackage.class, "OPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, OPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPackage_Path(), ecorePackage.getEString(), "path", null, 0, 1, OPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPackage_Contents(), this.getOClass(), null, "contents", null, 0, -1, OPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oClassEClass, OClass.class, "OClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ObjectModelPackageImpl
