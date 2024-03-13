/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.Packageba;
import abstracta.Projectba;

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
 * An implementation of the model object '<em><b>Projectba</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.ProjectbaImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstracta.impl.ProjectbaImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstracta.impl.ProjectbaImpl#getIde <em>Ide</em>}</li>
 *   <li>{@link abstracta.impl.ProjectbaImpl#getLstPackages <em>Lst Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectbaImpl extends EObjectImpl implements Projectba {
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
	 * The default value of the '{@link #getIde() <em>Ide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIde()
	 * @generated
	 * @ordered
	 */
	protected static final int IDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIde() <em>Ide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIde()
	 * @generated
	 * @ordered
	 */
	protected int ide = IDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstPackages() <em>Lst Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<Packageba> lstPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectbaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.PROJECTBA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.PROJECTBA__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.PROJECTBA__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIde() {
		return ide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIde(int newIde) {
		int oldIde = ide;
		ide = newIde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.PROJECTBA__IDE, oldIde, ide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Packageba> getLstPackages() {
		if (lstPackages == null) {
			lstPackages = new EObjectContainmentEList<Packageba>(Packageba.class, this, AbstractaPackage.PROJECTBA__LST_PACKAGES);
		}
		return lstPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.PROJECTBA__LST_PACKAGES:
				return ((InternalEList<?>)getLstPackages()).basicRemove(otherEnd, msgs);
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
			case AbstractaPackage.PROJECTBA__NAME:
				return getName();
			case AbstractaPackage.PROJECTBA__PATH:
				return getPath();
			case AbstractaPackage.PROJECTBA__IDE:
				return getIde();
			case AbstractaPackage.PROJECTBA__LST_PACKAGES:
				return getLstPackages();
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
			case AbstractaPackage.PROJECTBA__NAME:
				setName((String)newValue);
				return;
			case AbstractaPackage.PROJECTBA__PATH:
				setPath((String)newValue);
				return;
			case AbstractaPackage.PROJECTBA__IDE:
				setIde((Integer)newValue);
				return;
			case AbstractaPackage.PROJECTBA__LST_PACKAGES:
				getLstPackages().clear();
				getLstPackages().addAll((Collection<? extends Packageba>)newValue);
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
			case AbstractaPackage.PROJECTBA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractaPackage.PROJECTBA__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractaPackage.PROJECTBA__IDE:
				setIde(IDE_EDEFAULT);
				return;
			case AbstractaPackage.PROJECTBA__LST_PACKAGES:
				getLstPackages().clear();
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
			case AbstractaPackage.PROJECTBA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractaPackage.PROJECTBA__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractaPackage.PROJECTBA__IDE:
				return ide != IDE_EDEFAULT;
			case AbstractaPackage.PROJECTBA__LST_PACKAGES:
				return lstPackages != null && !lstPackages.isEmpty();
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
		result.append(", ide: ");
		result.append(ide);
		result.append(')');
		return result.toString();
	}

} //ProjectbaImpl
