/**
 */
package ComponentModel.impl;

import ComponentModel.Component;
import ComponentModel.ComponentModelPackage;
import ComponentModel.Dependency;

import ObjectModel.OPackage;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ComponentModel.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ComponentModel.impl.ComponentImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link ComponentModel.impl.ComponentImpl#getPackageReference <em>Package Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> contents;

	/**
	 * The cached value of the '{@link #getPackageReference() <em>Package Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageReference()
	 * @generated
	 * @ordered
	 */
	protected OPackage packageReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentModelPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<Dependency>(Dependency.class, this, ComponentModelPackage.COMPONENT__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPackage getPackageReference() {
		if (packageReference != null && packageReference.eIsProxy()) {
			InternalEObject oldPackageReference = (InternalEObject)packageReference;
			packageReference = (OPackage)eResolveProxy(oldPackageReference);
			if (packageReference != oldPackageReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentModelPackage.COMPONENT__PACKAGE_REFERENCE, oldPackageReference, packageReference));
			}
		}
		return packageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPackage basicGetPackageReference() {
		return packageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageReference(OPackage newPackageReference) {
		OPackage oldPackageReference = packageReference;
		packageReference = newPackageReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentModelPackage.COMPONENT__PACKAGE_REFERENCE, oldPackageReference, packageReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentModelPackage.COMPONENT__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case ComponentModelPackage.COMPONENT__NAME:
				return getName();
			case ComponentModelPackage.COMPONENT__CONTENTS:
				return getContents();
			case ComponentModelPackage.COMPONENT__PACKAGE_REFERENCE:
				if (resolve) return getPackageReference();
				return basicGetPackageReference();
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
			case ComponentModelPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ComponentModelPackage.COMPONENT__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends Dependency>)newValue);
				return;
			case ComponentModelPackage.COMPONENT__PACKAGE_REFERENCE:
				setPackageReference((OPackage)newValue);
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
			case ComponentModelPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentModelPackage.COMPONENT__CONTENTS:
				getContents().clear();
				return;
			case ComponentModelPackage.COMPONENT__PACKAGE_REFERENCE:
				setPackageReference((OPackage)null);
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
			case ComponentModelPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentModelPackage.COMPONENT__CONTENTS:
				return contents != null && !contents.isEmpty();
			case ComponentModelPackage.COMPONENT__PACKAGE_REFERENCE:
				return packageReference != null;
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

} //ComponentImpl
