/**
 */
package ComponentModel.impl;

import ComponentModel.Component;
import ComponentModel.ComponentModelPackage;
import ComponentModel.Dependency;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ComponentModel.impl.DependencyImpl#getName <em>Name</em>}</li>
 *   <li>{@link ComponentModel.impl.DependencyImpl#getDependOf <em>Depend Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependOf() <em>Depend Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependOf()
	 * @generated
	 * @ordered
	 */
	protected Component dependOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentModelPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.DEPENDENCY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getDependOf() {
		if (dependOf != null && dependOf.eIsProxy()) {
			InternalEObject oldDependOf = (InternalEObject)dependOf;
			dependOf = (Component)eResolveProxy(oldDependOf);
			if (dependOf != oldDependOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.DEPENDENCY__DEPEND_OF, oldDependOf, dependOf));
			}
		}
		return dependOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetDependOf() {
		return dependOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependOf(Component newDependOf) {
		Component oldDependOf = dependOf;
		dependOf = newDependOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.DEPENDENCY__DEPEND_OF, oldDependOf, dependOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentModelPackage.DEPENDENCY__NAME:
				return getName();
			case ComponentModelPackage.DEPENDENCY__DEPEND_OF:
				if (resolve) return getDependOf();
				return basicGetDependOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentModelPackage.DEPENDENCY__NAME:
				setName((String)newValue);
				return;
			case ComponentModelPackage.DEPENDENCY__DEPEND_OF:
				setDependOf((Component)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentModelPackage.DEPENDENCY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentModelPackage.DEPENDENCY__DEPEND_OF:
				setDependOf((Component)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentModelPackage.DEPENDENCY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentModelPackage.DEPENDENCY__DEPEND_OF:
				return dependOf != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DependencyImpl
