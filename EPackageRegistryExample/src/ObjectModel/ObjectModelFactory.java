/**
 */
package ObjectModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ObjectModel.ObjectModelPackage
 * @generated
 */
public interface ObjectModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectModelFactory eINSTANCE = ObjectModel.impl.ObjectModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Main System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main System</em>'.
	 * @generated
	 */
	MainSystem createMainSystem();

	/**
	 * Returns a new object of class '<em>OPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OPackage</em>'.
	 * @generated
	 */
	OPackage createOPackage();

	/**
	 * Returns a new object of class '<em>OClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OClass</em>'.
	 * @generated
	 */
	OClass createOClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ObjectModelPackage getObjectModelPackage();

} //ObjectModelFactory
