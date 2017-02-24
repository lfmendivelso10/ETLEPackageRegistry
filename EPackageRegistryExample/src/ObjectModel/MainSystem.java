/**
 */
package ObjectModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ObjectModel.MainSystem#getName <em>Name</em>}</li>
 *   <li>{@link ObjectModel.MainSystem#getSystemPackages <em>System Packages</em>}</li>
 * </ul>
 *
 * @see ObjectModel.ObjectModelPackage#getMainSystem()
 * @model
 * @generated
 */
public interface MainSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ObjectModel.ObjectModelPackage#getMainSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ObjectModel.MainSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>System Packages</b></em>' containment reference list.
	 * The list contents are of type {@link ObjectModel.OPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Packages</em>' containment reference list.
	 * @see ObjectModel.ObjectModelPackage#getMainSystem_SystemPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<OPackage> getSystemPackages();

} // MainSystem
