/**
 */
package ComponentModel;

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
 * @see ComponentModel.ComponentModelFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComponentModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ComponentMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentModelPackage eINSTANCE = ComponentModel.impl.ComponentModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ComponentModel.impl.SystemModelImpl <em>System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComponentModel.impl.SystemModelImpl
	 * @see ComponentModel.impl.ComponentModelPackageImpl#getSystemModel()
	 * @generated
	 */
	int SYSTEM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ComponentModel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComponentModel.impl.ComponentImpl
	 * @see ComponentModel.impl.ComponentModelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTENTS = 1;

	/**
	 * The feature id for the '<em><b>Package Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PACKAGE_REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ComponentModel.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComponentModel.impl.DependencyImpl
	 * @see ComponentModel.impl.ComponentModelPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Depend Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPEND_OF = 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ComponentModel.SystemModel <em>System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Model</em>'.
	 * @see ComponentModel.SystemModel
	 * @generated
	 */
	EClass getSystemModel();

	/**
	 * Returns the meta object for the attribute '{@link ComponentModel.SystemModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ComponentModel.SystemModel#getName()
	 * @see #getSystemModel()
	 * @generated
	 */
	EAttribute getSystemModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ComponentModel.SystemModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see ComponentModel.SystemModel#getComponents()
	 * @see #getSystemModel()
	 * @generated
	 */
	EReference getSystemModel_Components();

	/**
	 * Returns the meta object for class '{@link ComponentModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see ComponentModel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link ComponentModel.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ComponentModel.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ComponentModel.Component#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see ComponentModel.Component#getContents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Contents();

	/**
	 * Returns the meta object for the reference '{@link ComponentModel.Component#getPackageReference <em>Package Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package Reference</em>'.
	 * @see ComponentModel.Component#getPackageReference()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_PackageReference();

	/**
	 * Returns the meta object for class '{@link ComponentModel.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see ComponentModel.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link ComponentModel.Dependency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ComponentModel.Dependency#getName()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Name();

	/**
	 * Returns the meta object for the reference '{@link ComponentModel.Dependency#getDependOf <em>Depend Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depend Of</em>'.
	 * @see ComponentModel.Dependency#getDependOf()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_DependOf();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentModelFactory getComponentModelFactory();

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
		 * The meta object literal for the '{@link ComponentModel.impl.SystemModelImpl <em>System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComponentModel.impl.SystemModelImpl
		 * @see ComponentModel.impl.ComponentModelPackageImpl#getSystemModel()
		 * @generated
		 */
		EClass SYSTEM_MODEL = eINSTANCE.getSystemModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_MODEL__NAME = eINSTANCE.getSystemModel_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODEL__COMPONENTS = eINSTANCE.getSystemModel_Components();

		/**
		 * The meta object literal for the '{@link ComponentModel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComponentModel.impl.ComponentImpl
		 * @see ComponentModel.impl.ComponentModelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONTENTS = eINSTANCE.getComponent_Contents();

		/**
		 * The meta object literal for the '<em><b>Package Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PACKAGE_REFERENCE = eINSTANCE.getComponent_PackageReference();

		/**
		 * The meta object literal for the '{@link ComponentModel.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComponentModel.impl.DependencyImpl
		 * @see ComponentModel.impl.ComponentModelPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__NAME = eINSTANCE.getDependency_Name();

		/**
		 * The meta object literal for the '<em><b>Depend Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPEND_OF = eINSTANCE.getDependency_DependOf();

	}

} //ComponentModelPackage
