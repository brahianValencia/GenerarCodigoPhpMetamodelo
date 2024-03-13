/**
 */
package concreta.impl;

import concreta.AccessModifyba;
import concreta.Attributeba;
import concreta.ConcretaPackage;
import concreta.InterfaceClassba;
import concreta.Operationba;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Classba</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.InterfaceClassbaImpl#getPath <em>Path</em>}</li>
 *   <li>{@link concreta.impl.InterfaceClassbaImpl#getLstAttributesba <em>Lst Attributesba</em>}</li>
 *   <li>{@link concreta.impl.InterfaceClassbaImpl#getLstMethodba <em>Lst Methodba</em>}</li>
 *   <li>{@link concreta.impl.InterfaceClassbaImpl#getAccessModify <em>Access Modify</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceClassbaImpl extends ClasifierImpl implements InterfaceClassba {
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
	 * The cached value of the '{@link #getLstAttributesba() <em>Lst Attributesba</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAttributesba()
	 * @generated
	 * @ordered
	 */
	protected EList<Attributeba> lstAttributesba;

	/**
	 * The cached value of the '{@link #getLstMethodba() <em>Lst Methodba</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMethodba()
	 * @generated
	 * @ordered
	 */
	protected EList<Operationba> lstMethodba;

	/**
	 * The default value of the '{@link #getAccessModify() <em>Access Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModify()
	 * @generated
	 * @ordered
	 */
	protected static final AccessModifyba ACCESS_MODIFY_EDEFAULT = AccessModifyba.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccessModify() <em>Access Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModify()
	 * @generated
	 * @ordered
	 */
	protected AccessModifyba accessModify = ACCESS_MODIFY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceClassbaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.INTERFACE_CLASSBA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.INTERFACE_CLASSBA__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attributeba> getLstAttributesba() {
		if (lstAttributesba == null) {
			lstAttributesba = new EObjectContainmentEList<Attributeba>(Attributeba.class, this, ConcretaPackage.INTERFACE_CLASSBA__LST_ATTRIBUTESBA);
		}
		return lstAttributesba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operationba> getLstMethodba() {
		if (lstMethodba == null) {
			lstMethodba = new EObjectContainmentEList<Operationba>(Operationba.class, this, ConcretaPackage.INTERFACE_CLASSBA__LST_METHODBA);
		}
		return lstMethodba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifyba getAccessModify() {
		return accessModify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessModify(AccessModifyba newAccessModify) {
		AccessModifyba oldAccessModify = accessModify;
		accessModify = newAccessModify == null ? ACCESS_MODIFY_EDEFAULT : newAccessModify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.INTERFACE_CLASSBA__ACCESS_MODIFY, oldAccessModify, accessModify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.INTERFACE_CLASSBA__LST_ATTRIBUTESBA:
				return ((InternalEList<?>)getLstAttributesba()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.INTERFACE_CLASSBA__LST_METHODBA:
				return ((InternalEList<?>)getLstMethodba()).basicRemove(otherEnd, msgs);
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
			case ConcretaPackage.INTERFACE_CLASSBA__PATH:
				return getPath();
			case ConcretaPackage.INTERFACE_CLASSBA__LST_ATTRIBUTESBA:
				return getLstAttributesba();
			case ConcretaPackage.INTERFACE_CLASSBA__LST_METHODBA:
				return getLstMethodba();
			case ConcretaPackage.INTERFACE_CLASSBA__ACCESS_MODIFY:
				return getAccessModify();
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
			case ConcretaPackage.INTERFACE_CLASSBA__PATH:
				setPath((String)newValue);
				return;
			case ConcretaPackage.INTERFACE_CLASSBA__LST_ATTRIBUTESBA:
				getLstAttributesba().clear();
				getLstAttributesba().addAll((Collection<? extends Attributeba>)newValue);
				return;
			case ConcretaPackage.INTERFACE_CLASSBA__LST_METHODBA:
				getLstMethodba().clear();
				getLstMethodba().addAll((Collection<? extends Operationba>)newValue);
				return;
			case ConcretaPackage.INTERFACE_CLASSBA__ACCESS_MODIFY:
				setAccessModify((AccessModifyba)newValue);
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
			case ConcretaPackage.INTERFACE_CLASSBA__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ConcretaPackage.INTERFACE_CLASSBA__LST_ATTRIBUTESBA:
				getLstAttributesba().clear();
				return;
			case ConcretaPackage.INTERFACE_CLASSBA__LST_METHODBA:
				getLstMethodba().clear();
				return;
			case ConcretaPackage.INTERFACE_CLASSBA__ACCESS_MODIFY:
				setAccessModify(ACCESS_MODIFY_EDEFAULT);
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
			case ConcretaPackage.INTERFACE_CLASSBA__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ConcretaPackage.INTERFACE_CLASSBA__LST_ATTRIBUTESBA:
				return lstAttributesba != null && !lstAttributesba.isEmpty();
			case ConcretaPackage.INTERFACE_CLASSBA__LST_METHODBA:
				return lstMethodba != null && !lstMethodba.isEmpty();
			case ConcretaPackage.INTERFACE_CLASSBA__ACCESS_MODIFY:
				return accessModify != ACCESS_MODIFY_EDEFAULT;
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
		result.append(" (path: ");
		result.append(path);
		result.append(", accessModify: ");
		result.append(accessModify);
		result.append(')');
		return result.toString();
	}

} //InterfaceClassbaImpl