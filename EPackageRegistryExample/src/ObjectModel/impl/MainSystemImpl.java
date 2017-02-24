/**
 */
package ObjectModel.impl;

import ObjectModel.MainSystem;
import ObjectModel.OPackage;
import ObjectModel.ObjectModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ObjectModel.impl.MainSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link ObjectModel.impl.MainSystemImpl#getSystemPackages <em>System Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainSystemImpl extends MinimalEObjectImpl.Container implements MainSystem {
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
	 * The cached value of the '{@link #getSystemPackages() <em>System Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<OPackage> systemPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectModelPackage.Literals.MAIN_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectModelPackage.MAIN_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPackage> getSystemPackages() {
		if (systemPackages == null) {
			systemPackages = new EObjectContainmentEList<OPackage>(OPackage.class, this, ObjectModelPackage.MAIN_SYSTEM__SYSTEM_PACKAGES);
		}
		return systemPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectModelPackage.MAIN_SYSTEM__SYSTEM_PACKAGES:
				return ((InternalEList<?>)getSystemPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjectModelPackage.MAIN_SYSTEM__NAME:
				return getName();
			case ObjectModelPackage.MAIN_SYSTEM__SYSTEM_PACKAGES:
				return getSystemPackages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ObjectModelPackage.MAIN_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case ObjectModelPackage.MAIN_SYSTEM__SYSTEM_PACKAGES:
				getSystemPackages().clear();
				getSystemPackages().addAll((Collection<? extends OPackage>)newValue);
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
			case ObjectModelPackage.MAIN_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ObjectModelPackage.MAIN_SYSTEM__SYSTEM_PACKAGES:
				getSystemPackages().clear();
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
			case ObjectModelPackage.MAIN_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ObjectModelPackage.MAIN_SYSTEM__SYSTEM_PACKAGES:
				return systemPackages != null && !systemPackages.isEmpty();
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

} //MainSystemImpl
