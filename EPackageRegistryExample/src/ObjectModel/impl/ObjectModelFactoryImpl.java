/**
 */
package ObjectModel.impl;

import ObjectModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectModelFactoryImpl extends EFactoryImpl implements ObjectModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectModelFactory init() {
		try {
			ObjectModelFactory theObjectModelFactory = (ObjectModelFactory)EPackage.Registry.INSTANCE.getEFactory(ObjectModelPackage.eNS_URI);
			if (theObjectModelFactory != null) {
				return theObjectModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObjectModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ObjectModelPackage.MAIN_SYSTEM: return createMainSystem();
			case ObjectModelPackage.OPACKAGE: return createOPackage();
			case ObjectModelPackage.OCLASS: return createOClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainSystem createMainSystem() {
		MainSystemImpl mainSystem = new MainSystemImpl();
		return mainSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPackage createOPackage() {
		OPackageImpl oPackage = new OPackageImpl();
		return oPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OClass createOClass() {
		OClassImpl oClass = new OClassImpl();
		return oClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectModelPackage getObjectModelPackage() {
		return (ObjectModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObjectModelPackage getPackage() {
		return ObjectModelPackage.eINSTANCE;
	}

} //ObjectModelFactoryImpl
