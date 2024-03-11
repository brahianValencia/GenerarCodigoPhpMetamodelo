/**
 */
package concreta.impl;

import concreta.Classba;
import concreta.ConcretaPackage;
import concreta.Relationshipba;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationshipba</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.RelationshipbaImpl#getIde <em>Ide</em>}</li>
 *   <li>{@link concreta.impl.RelationshipbaImpl#getMultS <em>Mult S</em>}</li>
 *   <li>{@link concreta.impl.RelationshipbaImpl#getMultT <em>Mult T</em>}</li>
 *   <li>{@link concreta.impl.RelationshipbaImpl#getRolS <em>Rol S</em>}</li>
 *   <li>{@link concreta.impl.RelationshipbaImpl#getRolT <em>Rol T</em>}</li>
 *   <li>{@link concreta.impl.RelationshipbaImpl#getSource <em>Source</em>}</li>
 *   <li>{@link concreta.impl.RelationshipbaImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationshipbaImpl extends EObjectImpl implements Relationshipba {
	/**
	 * The default value of the '{@link #getIde() <em>Ide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIde()
	 * @generated
	 * @ordered
	 */
	protected static final String IDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIde() <em>Ide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIde()
	 * @generated
	 * @ordered
	 */
	protected String ide = IDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultS() <em>Mult S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultS()
	 * @generated
	 * @ordered
	 */
	protected static final String MULT_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultS() <em>Mult S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultS()
	 * @generated
	 * @ordered
	 */
	protected String multS = MULT_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultT() <em>Mult T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultT()
	 * @generated
	 * @ordered
	 */
	protected static final String MULT_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultT() <em>Mult T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultT()
	 * @generated
	 * @ordered
	 */
	protected String multT = MULT_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getRolS() <em>Rol S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolS()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolS() <em>Rol S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolS()
	 * @generated
	 * @ordered
	 */
	protected String rolS = ROL_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getRolT() <em>Rol T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolT()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolT() <em>Rol T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolT()
	 * @generated
	 * @ordered
	 */
	protected String rolT = ROL_T_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Classba source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Classba target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipbaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.RELATIONSHIPBA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIde() {
		return ide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIde(String newIde) {
		String oldIde = ide;
		ide = newIde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELATIONSHIPBA__IDE, oldIde, ide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultS() {
		return multS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultS(String newMultS) {
		String oldMultS = multS;
		multS = newMultS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELATIONSHIPBA__MULT_S, oldMultS, multS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultT() {
		return multT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultT(String newMultT) {
		String oldMultT = multT;
		multT = newMultT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELATIONSHIPBA__MULT_T, oldMultT, multT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRolS() {
		return rolS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolS(String newRolS) {
		String oldRolS = rolS;
		rolS = newRolS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELATIONSHIPBA__ROL_S, oldRolS, rolS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRolT() {
		return rolT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolT(String newRolT) {
		String oldRolT = rolT;
		rolT = newRolT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELATIONSHIPBA__ROL_T, oldRolT, rolT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classba getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Classba)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretaPackage.RELATIONSHIPBA__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classba basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Classba newSource) {
		Classba oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELATIONSHIPBA__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classba getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Classba)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretaPackage.RELATIONSHIPBA__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classba basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Classba newTarget) {
		Classba oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELATIONSHIPBA__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretaPackage.RELATIONSHIPBA__IDE:
				return getIde();
			case ConcretaPackage.RELATIONSHIPBA__MULT_S:
				return getMultS();
			case ConcretaPackage.RELATIONSHIPBA__MULT_T:
				return getMultT();
			case ConcretaPackage.RELATIONSHIPBA__ROL_S:
				return getRolS();
			case ConcretaPackage.RELATIONSHIPBA__ROL_T:
				return getRolT();
			case ConcretaPackage.RELATIONSHIPBA__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ConcretaPackage.RELATIONSHIPBA__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case ConcretaPackage.RELATIONSHIPBA__IDE:
				setIde((String)newValue);
				return;
			case ConcretaPackage.RELATIONSHIPBA__MULT_S:
				setMultS((String)newValue);
				return;
			case ConcretaPackage.RELATIONSHIPBA__MULT_T:
				setMultT((String)newValue);
				return;
			case ConcretaPackage.RELATIONSHIPBA__ROL_S:
				setRolS((String)newValue);
				return;
			case ConcretaPackage.RELATIONSHIPBA__ROL_T:
				setRolT((String)newValue);
				return;
			case ConcretaPackage.RELATIONSHIPBA__SOURCE:
				setSource((Classba)newValue);
				return;
			case ConcretaPackage.RELATIONSHIPBA__TARGET:
				setTarget((Classba)newValue);
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
			case ConcretaPackage.RELATIONSHIPBA__IDE:
				setIde(IDE_EDEFAULT);
				return;
			case ConcretaPackage.RELATIONSHIPBA__MULT_S:
				setMultS(MULT_S_EDEFAULT);
				return;
			case ConcretaPackage.RELATIONSHIPBA__MULT_T:
				setMultT(MULT_T_EDEFAULT);
				return;
			case ConcretaPackage.RELATIONSHIPBA__ROL_S:
				setRolS(ROL_S_EDEFAULT);
				return;
			case ConcretaPackage.RELATIONSHIPBA__ROL_T:
				setRolT(ROL_T_EDEFAULT);
				return;
			case ConcretaPackage.RELATIONSHIPBA__SOURCE:
				setSource((Classba)null);
				return;
			case ConcretaPackage.RELATIONSHIPBA__TARGET:
				setTarget((Classba)null);
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
			case ConcretaPackage.RELATIONSHIPBA__IDE:
				return IDE_EDEFAULT == null ? ide != null : !IDE_EDEFAULT.equals(ide);
			case ConcretaPackage.RELATIONSHIPBA__MULT_S:
				return MULT_S_EDEFAULT == null ? multS != null : !MULT_S_EDEFAULT.equals(multS);
			case ConcretaPackage.RELATIONSHIPBA__MULT_T:
				return MULT_T_EDEFAULT == null ? multT != null : !MULT_T_EDEFAULT.equals(multT);
			case ConcretaPackage.RELATIONSHIPBA__ROL_S:
				return ROL_S_EDEFAULT == null ? rolS != null : !ROL_S_EDEFAULT.equals(rolS);
			case ConcretaPackage.RELATIONSHIPBA__ROL_T:
				return ROL_T_EDEFAULT == null ? rolT != null : !ROL_T_EDEFAULT.equals(rolT);
			case ConcretaPackage.RELATIONSHIPBA__SOURCE:
				return source != null;
			case ConcretaPackage.RELATIONSHIPBA__TARGET:
				return target != null;
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
		result.append(" (ide: ");
		result.append(ide);
		result.append(", multS: ");
		result.append(multS);
		result.append(", multT: ");
		result.append(multT);
		result.append(", rolS: ");
		result.append(rolS);
		result.append(", rolT: ");
		result.append(rolT);
		result.append(')');
		return result.toString();
	}

} //RelationshipbaImpl
