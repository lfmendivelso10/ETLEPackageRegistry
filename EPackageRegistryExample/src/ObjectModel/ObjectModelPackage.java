/**
 */
package ObjectModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ObjectModel.ObjectModelFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ObjectModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/OOMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectModelPackage eINSTANCE = ObjectModel.impl.ObjectModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ObjectModel.impl.MainSystemImpl <em>Main System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObjectModel.impl.MainSystemImpl
	 * @see ObjectModel.impl.ObjectModelPackageImpl#getMainSystem()
	 * @generated
	 */
	int MAIN_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>System Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM__SYSTEM_PACKAGES = 1;

	/**
	 * The number of structural features of the '<em>Main System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Main System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObjectModel.impl.OPackageImpl <em>OPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObjectModel.impl.OPackageImpl
	 * @see ObjectModel.impl.ObjectModelPackageImpl#getOPackage()
	 * @generated
	 */
	int OPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE__CONTENTS = 2;

	/**
	 * The number of structural features of the '<em>OPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>OPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ObjectModel.impl.OClassImpl <em>OClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ObjectModel.impl.OClassImpl
	 * @see ObjectModel.impl.ObjectModelPackageImpl#getOClass()
	 * @generated
	 */
	int OCLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS__NAME = 0;

	/**
	 * The number of structural features of the '<em>OClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ObjectModel.MainSystem <em>Main System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main System</em>'.
	 * @see ObjectModel.MainSystem
	 * @generated
	 */
	EClass getMainSystem();

	/**
	 * Returns the meta object for the attribute '{@link ObjectModel.MainSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ObjectModel.MainSystem#getName()
	 * @see #getMainSystem()
	 * @generated
	 */
	EAttribute getMainSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ObjectModel.MainSystem#getSystemPackages <em>System Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Packages</em>'.
	 * @see ObjectModel.MainSystem#getSystemPackages()
	 * @see #getMainSystem()
	 * @generated
	 */
	EReference getMainSystem_SystemPackages();

	/**
	 * Returns the meta object for class '{@link ObjectModel.OPackage <em>OPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPackage</em>'.
	 * @see ObjectModel.OPackage
	 * @generated
	 */
	EClass getOPackage();

	/**
	 * Returns the meta object for the attribute '{@link ObjectModel.OPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ObjectModel.OPackage#getName()
	 * @see #getOPackage()
	 * @generated
	 */
	EAttribute getOPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link ObjectModel.OPackage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ObjectModel.OPackage#getPath()
	 * @see #getOPackage()
	 * @generated
	 */
	EAttribute getOPackage_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link ObjectModel.OPackage#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see ObjectModel.OPackage#getContents()
	 * @see #getOPackage()
	 * @generated
	 */
	EReference getOPackage_Contents();

	/**
	 * Returns the meta object for class '{@link ObjectModel.OClass <em>OClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OClass</em>'.
	 * @see ObjectModel.OClass
	 * @generated
	 */
	EClass getOClass();

	/**
	 * Returns the meta object for the attribute '{@link ObjectModel.OClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ObjectModel.OClass#getName()
	 * @see #getOClass()
	 * @generated
	 */
	EAttribute getOClass_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjectModelFactory getObjectModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ObjectModel.impl.MainSystemImpl <em>Main System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObjectModel.impl.MainSystemImpl
		 * @see ObjectModel.impl.ObjectModelPackageImpl#getMainSystem()
		 * @generated
		 */
		EClass MAIN_SYSTEM = eINSTANCE.getMainSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_SYSTEM__NAME = eINSTANCE.getMainSystem_Name();

		/**
		 * The meta object literal for the '<em><b>System Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_SYSTEM__SYSTEM_PACKAGES = eINSTANCE.getMainSystem_SystemPackages();

		/**
		 * The meta object literal for the '{@link ObjectModel.impl.OPackageImpl <em>OPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObjectModel.impl.OPackageImpl
		 * @see ObjectModel.impl.ObjectModelPackageImpl#getOPackage()
		 * @generated
		 */
		EClass OPACKAGE = eINSTANCE.getOPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPACKAGE__NAME = eINSTANCE.getOPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPACKAGE__PATH = eINSTANCE.getOPackage_Path();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPACKAGE__CONTENTS = eINSTANCE.getOPackage_Contents();

		/**
		 * The meta object literal for the '{@link ObjectModel.impl.OClassImpl <em>OClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ObjectModel.impl.OClassImpl
		 * @see ObjectModel.impl.ObjectModelPackageImpl#getOClass()
		 * @generated
		 */
		EClass OCLASS = eINSTANCE.getOClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCLASS__NAME = eINSTANCE.getOClass_Name();

	}

} //ObjectModelPackage
