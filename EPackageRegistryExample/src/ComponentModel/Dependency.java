/**
 */
package ComponentModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ComponentModel.Dependency#getName <em>Name</em>}</li>
 *   <li>{@link ComponentModel.Dependency#getDependOf <em>Depend Of</em>}</li>
 * </ul>
 *
 * @see ComponentModel.ComponentModelPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
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
	 * @see ComponentModel.ComponentModelPackage#getDependency_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ComponentModel.Dependency#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Depend Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depend Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depend Of</em>' reference.
	 * @see #setDependOf(Component)
	 * @see ComponentModel.ComponentModelPackage#getDependency_DependOf()
	 * @model
	 * @generated
	 */
	Component getDependOf();

	/**
	 * Sets the value of the '{@link ComponentModel.Dependency#getDependOf <em>Depend Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depend Of</em>' reference.
	 * @see #getDependOf()
	 * @generated
	 */
	void setDependOf(Component value);

} // Dependency
