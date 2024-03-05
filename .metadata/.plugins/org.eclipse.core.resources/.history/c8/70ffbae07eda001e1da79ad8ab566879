/**
 */
package concreta.impl;

import concreta.AccessModifyba;
import concreta.Clasifier;
import concreta.Classba;
import concreta.ConcretaPackage;
import concreta.Methodba;
import concreta.Parameter;

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
 * An implementation of the model object '<em><b>Methodba</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.MethodbaImpl#getName <em>Name</em>}</li>
 *   <li>{@link concreta.impl.MethodbaImpl#getAccessModify <em>Access Modify</em>}</li>
 *   <li>{@link concreta.impl.MethodbaImpl#getRetorno <em>Retorno</em>}</li>
 *   <li>{@link concreta.impl.MethodbaImpl#getClassba <em>Classba</em>}</li>
 *   <li>{@link concreta.impl.MethodbaImpl#getLstParametersba <em>Lst Parametersba</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodbaImpl extends EObjectImpl implements Methodba {
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
	 * The cached value of the '{@link #getRetorno() <em>Retorno</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetorno()
	 * @generated
	 * @ordered
	 */
	protected Clasifier retorno;

	/**
	 * The cached value of the '{@link #getClassba() <em>Classba</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassba()
	 * @generated
	 * @ordered
	 */
	protected Classba classba;

	/**
	 * The cached value of the '{@link #getLstParametersba() <em>Lst Parametersba</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstParametersba()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> lstParametersba;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodbaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.METHODBA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.METHODBA__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.METHODBA__ACCESS_MODIFY, oldAccessModify, accessModify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasifier getRetorno() {
		return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetorno(Clasifier newRetorno, NotificationChain msgs) {
		Clasifier oldRetorno = retorno;
		retorno = newRetorno;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConcretaPackage.METHODBA__RETORNO, oldRetorno, newRetorno);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetorno(Clasifier newRetorno) {
		if (newRetorno != retorno) {
			NotificationChain msgs = null;
			if (retorno != null)
				msgs = ((InternalEObject)retorno).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConcretaPackage.METHODBA__RETORNO, null, msgs);
			if (newRetorno != null)
				msgs = ((InternalEObject)newRetorno).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConcretaPackage.METHODBA__RETORNO, null, msgs);
			msgs = basicSetRetorno(newRetorno, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.METHODBA__RETORNO, newRetorno, newRetorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classba getClassba() {
		if (classba != null && classba.eIsProxy()) {
			InternalEObject oldClassba = (InternalEObject)classba;
			classba = (Classba)eResolveProxy(oldClassba);
			if (classba != oldClassba) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretaPackage.METHODBA__CLASSBA, oldClassba, classba));
			}
		}
		return classba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classba basicGetClassba() {
		return classba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassba(Classba newClassba) {
		Classba oldClassba = classba;
		classba = newClassba;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.METHODBA__CLASSBA, oldClassba, classba));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getLstParametersba() {
		if (lstParametersba == null) {
			lstParametersba = new EObjectContainmentEList<Parameter>(Parameter.class, this, ConcretaPackage.METHODBA__LST_PARAMETERSBA);
		}
		return lstParametersba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.METHODBA__RETORNO:
				return basicSetRetorno(null, msgs);
			case ConcretaPackage.METHODBA__LST_PARAMETERSBA:
				return ((InternalEList<?>)getLstParametersba()).basicRemove(otherEnd, msgs);
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
			case ConcretaPackage.METHODBA__NAME:
				return getName();
			case ConcretaPackage.METHODBA__ACCESS_MODIFY:
				return getAccessModify();
			case ConcretaPackage.METHODBA__RETORNO:
				return getRetorno();
			case ConcretaPackage.METHODBA__CLASSBA:
				if (resolve) return getClassba();
				return basicGetClassba();
			case ConcretaPackage.METHODBA__LST_PARAMETERSBA:
				return getLstParametersba();
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
			case ConcretaPackage.METHODBA__NAME:
				setName((String)newValue);
				return;
			case ConcretaPackage.METHODBA__ACCESS_MODIFY:
				setAccessModify((AccessModifyba)newValue);
				return;
			case ConcretaPackage.METHODBA__RETORNO:
				setRetorno((Clasifier)newValue);
				return;
			case ConcretaPackage.METHODBA__CLASSBA:
				setClassba((Classba)newValue);
				return;
			case ConcretaPackage.METHODBA__LST_PARAMETERSBA:
				getLstParametersba().clear();
				getLstParametersba().addAll((Collection<? extends Parameter>)newValue);
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
			case ConcretaPackage.METHODBA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretaPackage.METHODBA__ACCESS_MODIFY:
				setAccessModify(ACCESS_MODIFY_EDEFAULT);
				return;
			case ConcretaPackage.METHODBA__RETORNO:
				setRetorno((Clasifier)null);
				return;
			case ConcretaPackage.METHODBA__CLASSBA:
				setClassba((Classba)null);
				return;
			case ConcretaPackage.METHODBA__LST_PARAMETERSBA:
				getLstParametersba().clear();
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
			case ConcretaPackage.METHODBA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretaPackage.METHODBA__ACCESS_MODIFY:
				return accessModify != ACCESS_MODIFY_EDEFAULT;
			case ConcretaPackage.METHODBA__RETORNO:
				return retorno != null;
			case ConcretaPackage.METHODBA__CLASSBA:
				return classba != null;
			case ConcretaPackage.METHODBA__LST_PARAMETERSBA:
				return lstParametersba != null && !lstParametersba.isEmpty();
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
		result.append(", accessModify: ");
		result.append(accessModify);
		result.append(')');
		return result.toString();
	}

} //MethodbaImpl
