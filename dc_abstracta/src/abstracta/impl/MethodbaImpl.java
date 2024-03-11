/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.AccessModifyba;
import abstracta.Clasifier;
import abstracta.Classba;
import abstracta.Methodba;
import abstracta.Parameter;

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
 *   <li>{@link abstracta.impl.MethodbaImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstracta.impl.MethodbaImpl#getRetorno <em>Retorno</em>}</li>
 *   <li>{@link abstracta.impl.MethodbaImpl#getClassba <em>Classba</em>}</li>
 *   <li>{@link abstracta.impl.MethodbaImpl#getLstParametersba <em>Lst Parametersba</em>}</li>
 *   <li>{@link abstracta.impl.MethodbaImpl#getModifyAcces <em>Modify Acces</em>}</li>
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
	 * The cached value of the '{@link #getRetorno() <em>Retorno</em>}' reference.
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
	 * The default value of the '{@link #getModifyAcces() <em>Modify Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifyAcces()
	 * @generated
	 * @ordered
	 */
	protected static final AccessModifyba MODIFY_ACCES_EDEFAULT = AccessModifyba.PUBLIC;

	/**
	 * The cached value of the '{@link #getModifyAcces() <em>Modify Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifyAcces()
	 * @generated
	 * @ordered
	 */
	protected AccessModifyba modifyAcces = MODIFY_ACCES_EDEFAULT;

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
		return AbstractaPackage.Literals.METHODBA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.METHODBA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasifier getRetorno() {
		if (retorno != null && retorno.eIsProxy()) {
			InternalEObject oldRetorno = (InternalEObject)retorno;
			retorno = (Clasifier)eResolveProxy(oldRetorno);
			if (retorno != oldRetorno) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.METHODBA__RETORNO, oldRetorno, retorno));
			}
		}
		return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasifier basicGetRetorno() {
		return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetorno(Clasifier newRetorno) {
		Clasifier oldRetorno = retorno;
		retorno = newRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.METHODBA__RETORNO, oldRetorno, retorno));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.METHODBA__CLASSBA, oldClassba, classba));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.METHODBA__CLASSBA, oldClassba, classba));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getLstParametersba() {
		if (lstParametersba == null) {
			lstParametersba = new EObjectContainmentEList<Parameter>(Parameter.class, this, AbstractaPackage.METHODBA__LST_PARAMETERSBA);
		}
		return lstParametersba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifyba getModifyAcces() {
		return modifyAcces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifyAcces(AccessModifyba newModifyAcces) {
		AccessModifyba oldModifyAcces = modifyAcces;
		modifyAcces = newModifyAcces == null ? MODIFY_ACCES_EDEFAULT : newModifyAcces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.METHODBA__MODIFY_ACCES, oldModifyAcces, modifyAcces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.METHODBA__LST_PARAMETERSBA:
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
			case AbstractaPackage.METHODBA__NAME:
				return getName();
			case AbstractaPackage.METHODBA__RETORNO:
				if (resolve) return getRetorno();
				return basicGetRetorno();
			case AbstractaPackage.METHODBA__CLASSBA:
				if (resolve) return getClassba();
				return basicGetClassba();
			case AbstractaPackage.METHODBA__LST_PARAMETERSBA:
				return getLstParametersba();
			case AbstractaPackage.METHODBA__MODIFY_ACCES:
				return getModifyAcces();
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
			case AbstractaPackage.METHODBA__NAME:
				setName((String)newValue);
				return;
			case AbstractaPackage.METHODBA__RETORNO:
				setRetorno((Clasifier)newValue);
				return;
			case AbstractaPackage.METHODBA__CLASSBA:
				setClassba((Classba)newValue);
				return;
			case AbstractaPackage.METHODBA__LST_PARAMETERSBA:
				getLstParametersba().clear();
				getLstParametersba().addAll((Collection<? extends Parameter>)newValue);
				return;
			case AbstractaPackage.METHODBA__MODIFY_ACCES:
				setModifyAcces((AccessModifyba)newValue);
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
			case AbstractaPackage.METHODBA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractaPackage.METHODBA__RETORNO:
				setRetorno((Clasifier)null);
				return;
			case AbstractaPackage.METHODBA__CLASSBA:
				setClassba((Classba)null);
				return;
			case AbstractaPackage.METHODBA__LST_PARAMETERSBA:
				getLstParametersba().clear();
				return;
			case AbstractaPackage.METHODBA__MODIFY_ACCES:
				setModifyAcces(MODIFY_ACCES_EDEFAULT);
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
			case AbstractaPackage.METHODBA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractaPackage.METHODBA__RETORNO:
				return retorno != null;
			case AbstractaPackage.METHODBA__CLASSBA:
				return classba != null;
			case AbstractaPackage.METHODBA__LST_PARAMETERSBA:
				return lstParametersba != null && !lstParametersba.isEmpty();
			case AbstractaPackage.METHODBA__MODIFY_ACCES:
				return modifyAcces != MODIFY_ACCES_EDEFAULT;
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
		result.append(", modifyAcces: ");
		result.append(modifyAcces);
		result.append(')');
		return result.toString();
	}

} //MethodbaImpl
