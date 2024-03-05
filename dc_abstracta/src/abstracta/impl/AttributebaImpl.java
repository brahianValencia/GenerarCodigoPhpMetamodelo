/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.AccessModifyba;
import abstracta.Attributeba;
import abstracta.Clasifier;
import abstracta.Classba;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributeba</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.AttributebaImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstracta.impl.AttributebaImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link abstracta.impl.AttributebaImpl#getClassba <em>Classba</em>}</li>
 *   <li>{@link abstracta.impl.AttributebaImpl#getType <em>Type</em>}</li>
 *   <li>{@link abstracta.impl.AttributebaImpl#getModifyAcces <em>Modify Acces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributebaImpl extends EObjectImpl implements Attributeba {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Clasifier type;

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
	protected AttributebaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.ATTRIBUTEBA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.ATTRIBUTEBA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.ATTRIBUTEBA__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.ATTRIBUTEBA__CLASSBA, oldClassba, classba));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.ATTRIBUTEBA__CLASSBA, oldClassba, classba));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasifier getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Clasifier)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.ATTRIBUTEBA__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasifier basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Clasifier newType) {
		Clasifier oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.ATTRIBUTEBA__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.ATTRIBUTEBA__MODIFY_ACCES, oldModifyAcces, modifyAcces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.ATTRIBUTEBA__NAME:
				return getName();
			case AbstractaPackage.ATTRIBUTEBA__DEFAULT_VALUE:
				return getDefaultValue();
			case AbstractaPackage.ATTRIBUTEBA__CLASSBA:
				if (resolve) return getClassba();
				return basicGetClassba();
			case AbstractaPackage.ATTRIBUTEBA__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AbstractaPackage.ATTRIBUTEBA__MODIFY_ACCES:
				return getModifyAcces();
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
			case AbstractaPackage.ATTRIBUTEBA__NAME:
				setName((String)newValue);
				return;
			case AbstractaPackage.ATTRIBUTEBA__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case AbstractaPackage.ATTRIBUTEBA__CLASSBA:
				setClassba((Classba)newValue);
				return;
			case AbstractaPackage.ATTRIBUTEBA__TYPE:
				setType((Clasifier)newValue);
				return;
			case AbstractaPackage.ATTRIBUTEBA__MODIFY_ACCES:
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
			case AbstractaPackage.ATTRIBUTEBA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractaPackage.ATTRIBUTEBA__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case AbstractaPackage.ATTRIBUTEBA__CLASSBA:
				setClassba((Classba)null);
				return;
			case AbstractaPackage.ATTRIBUTEBA__TYPE:
				setType((Clasifier)null);
				return;
			case AbstractaPackage.ATTRIBUTEBA__MODIFY_ACCES:
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
			case AbstractaPackage.ATTRIBUTEBA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractaPackage.ATTRIBUTEBA__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case AbstractaPackage.ATTRIBUTEBA__CLASSBA:
				return classba != null;
			case AbstractaPackage.ATTRIBUTEBA__TYPE:
				return type != null;
			case AbstractaPackage.ATTRIBUTEBA__MODIFY_ACCES:
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
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", modifyAcces: ");
		result.append(modifyAcces);
		result.append(')');
		return result.toString();
	}

} //AttributebaImpl
