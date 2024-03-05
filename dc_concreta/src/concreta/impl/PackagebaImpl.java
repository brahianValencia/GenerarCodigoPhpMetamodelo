/**
 */
package concreta.impl;

import concreta.Classba;
import concreta.ConcretaPackage;
import concreta.Packageba;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packageba</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.PackagebaImpl#getName <em>Name</em>}</li>
 *   <li>{@link concreta.impl.PackagebaImpl#getPath <em>Path</em>}</li>
 *   <li>{@link concreta.impl.PackagebaImpl#getListPackages <em>List Packages</em>}</li>
 *   <li>{@link concreta.impl.PackagebaImpl#getLstClass <em>Lst Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackagebaImpl extends EObjectImpl implements Packageba {
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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListPackages() <em>List Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<Packageba> listPackages;

	/**
	 * The cached value of the '{@link #getLstClass() <em>Lst Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Classba> lstClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackagebaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.PACKAGEBA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.PACKAGEBA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.PACKAGEBA__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Packageba> getListPackages() {
		if (listPackages == null) {
			listPackages = new EObjectContainmentEList<Packageba>(Packageba.class, this, ConcretaPackage.PACKAGEBA__LIST_PACKAGES);
		}
		return listPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classba> getLstClass() {
		if (lstClass == null) {
			lstClass = new EObjectContainmentEList<Classba>(Classba.class, this, ConcretaPackage.PACKAGEBA__LST_CLASS);
		}
		return lstClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.PACKAGEBA__LIST_PACKAGES:
				return ((InternalEList<?>)getListPackages()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.PACKAGEBA__LST_CLASS:
				return ((InternalEList<?>)getLstClass()).basicRemove(otherEnd, msgs);
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
			case ConcretaPackage.PACKAGEBA__NAME:
				return getName();
			case ConcretaPackage.PACKAGEBA__PATH:
				return getPath();
			case ConcretaPackage.PACKAGEBA__LIST_PACKAGES:
				return getListPackages();
			case ConcretaPackage.PACKAGEBA__LST_CLASS:
				return getLstClass();
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
			case ConcretaPackage.PACKAGEBA__NAME:
				setName((String)newValue);
				return;
			case ConcretaPackage.PACKAGEBA__PATH:
				setPath((String)newValue);
				return;
			case ConcretaPackage.PACKAGEBA__LIST_PACKAGES:
				getListPackages().clear();
				getListPackages().addAll((Collection<? extends Packageba>)newValue);
				return;
			case ConcretaPackage.PACKAGEBA__LST_CLASS:
				getLstClass().clear();
				getLstClass().addAll((Collection<? extends Classba>)newValue);
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
			case ConcretaPackage.PACKAGEBA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretaPackage.PACKAGEBA__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ConcretaPackage.PACKAGEBA__LIST_PACKAGES:
				getListPackages().clear();
				return;
			case ConcretaPackage.PACKAGEBA__LST_CLASS:
				getLstClass().clear();
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
			case ConcretaPackage.PACKAGEBA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretaPackage.PACKAGEBA__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ConcretaPackage.PACKAGEBA__LIST_PACKAGES:
				return listPackages != null && !listPackages.isEmpty();
			case ConcretaPackage.PACKAGEBA__LST_CLASS:
				return lstClass != null && !lstClass.isEmpty();
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
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //PackagebaImpl
