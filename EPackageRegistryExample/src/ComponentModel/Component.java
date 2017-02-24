/**
 */
package ComponentModel;

import ObjectModel.OPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ComponentModel.Component#getName <em>Name</em>}</li>
 *   <li>{@link ComponentModel.Component#getContents <em>Contents</em>}</li>
 *   <li>{@link ComponentModel.Component#getPackageReference <em>Package Reference</em>}</li>
 * </ul>
 *
 * @see ComponentModel.ComponentModelPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
	 * @see ComponentModel.ComponentModelPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ComponentModel.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link ComponentModel.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see ComponentModel.ComponentModelPackage#getComponent_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getContents();

	/**
	 * Returns the value of the '<em><b>Package Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Reference</em>' reference.
	 * @see #setPackageReference(OPackage)
	 * @see ComponentModel.ComponentModelPackage#getComponent_PackageReference()
	 * @model
	 * @generated
	 */
	OPackage getPackageReference();

	/**
	 * Sets the value of the '{@link ComponentModel.Component#getPackageReference <em>Package Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Reference</em>' reference.
	 * @see #getPackageReference()
	 * @generated
	 */
	void setPackageReference(OPackage value);

} // Component
