/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.Classba;
import abstracta.Relationshipba;

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
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getIde <em>Ide</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getIsAgregation <em>Is Agregation</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getIsContainment <em>Is Containment</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getIsGeneralization <em>Is Generalization</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getIsAssociation <em>Is Association</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getIsImplementation <em>Is Implementation</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getMultS <em>Mult S</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getMultT <em>Mult T</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getRolS <em>Rol S</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getRolT <em>Rol T</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getSource <em>Source</em>}</li>
 *   <li>{@link abstracta.impl.RelationshipbaImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipbaImpl extends EObjectImpl implements Relationshipba {
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
	 * The default value of the '{@link #getIsAgregation() <em>Is Agregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAgregation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_AGREGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAgregation() <em>Is Agregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAgregation()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAgregation = IS_AGREGATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsContainment()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONTAINMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsContainment()
	 * @generated
	 * @ordered
	 */
	protected Boolean isContainment = IS_CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsGeneralization() <em>Is Generalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGeneralization()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_GENERALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsGeneralization() <em>Is Generalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGeneralization()
	 * @generated
	 * @ordered
	 */
	protected Boolean isGeneralization = IS_GENERALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsAssociation() <em>Is Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAssociation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ASSOCIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAssociation() <em>Is Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAssociation()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAssociation = IS_ASSOCIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsImplementation() <em>Is Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsImplementation() <em>Is Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsImplementation()
	 * @generated
	 * @ordered
	 */
	protected Boolean isImplementation = IS_IMPLEMENTATION_EDEFAULT;

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
		return AbstractaPackage.Literals.RELATIONSHIPBA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__IDE, oldIde, ide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAgregation() {
		return isAgregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAgregation(Boolean newIsAgregation) {
		Boolean oldIsAgregation = isAgregation;
		isAgregation = newIsAgregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__IS_AGREGATION, oldIsAgregation, isAgregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsContainment() {
		return isContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContainment(Boolean newIsContainment) {
		Boolean oldIsContainment = isContainment;
		isContainment = newIsContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__IS_CONTAINMENT, oldIsContainment, isContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsGeneralization() {
		return isGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGeneralization(Boolean newIsGeneralization) {
		Boolean oldIsGeneralization = isGeneralization;
		isGeneralization = newIsGeneralization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__IS_GENERALIZATION, oldIsGeneralization, isGeneralization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAssociation() {
		return isAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssociation(Boolean newIsAssociation) {
		Boolean oldIsAssociation = isAssociation;
		isAssociation = newIsAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__IS_ASSOCIATION, oldIsAssociation, isAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsImplementation() {
		return isImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImplementation(Boolean newIsImplementation) {
		Boolean oldIsImplementation = isImplementation;
		isImplementation = newIsImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__IS_IMPLEMENTATION, oldIsImplementation, isImplementation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__MULT_S, oldMultS, multS));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__MULT_T, oldMultT, multT));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__ROL_S, oldRolS, rolS));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__ROL_T, oldRolT, rolT));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.RELATIONSHIPBA__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.RELATIONSHIPBA__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELATIONSHIPBA__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.RELATIONSHIPBA__IDE:
				return getIde();
			case AbstractaPackage.RELATIONSHIPBA__IS_AGREGATION:
				return getIsAgregation();
			case AbstractaPackage.RELATIONSHIPBA__IS_CONTAINMENT:
				return getIsContainment();
			case AbstractaPackage.RELATIONSHIPBA__IS_GENERALIZATION:
				return getIsGeneralization();
			case AbstractaPackage.RELATIONSHIPBA__IS_ASSOCIATION:
				return getIsAssociation();
			case AbstractaPackage.RELATIONSHIPBA__IS_IMPLEMENTATION:
				return getIsImplementation();
			case AbstractaPackage.RELATIONSHIPBA__MULT_S:
				return getMultS();
			case AbstractaPackage.RELATIONSHIPBA__MULT_T:
				return getMultT();
			case AbstractaPackage.RELATIONSHIPBA__ROL_S:
				return getRolS();
			case AbstractaPackage.RELATIONSHIPBA__ROL_T:
				return getRolT();
			case AbstractaPackage.RELATIONSHIPBA__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AbstractaPackage.RELATIONSHIPBA__TARGET:
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
			case AbstractaPackage.RELATIONSHIPBA__IDE:
				setIde((String)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__IS_AGREGATION:
				setIsAgregation((Boolean)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__IS_CONTAINMENT:
				setIsContainment((Boolean)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__IS_GENERALIZATION:
				setIsGeneralization((Boolean)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__IS_ASSOCIATION:
				setIsAssociation((Boolean)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__IS_IMPLEMENTATION:
				setIsImplementation((Boolean)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__MULT_S:
				setMultS((String)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__MULT_T:
				setMultT((String)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__ROL_S:
				setRolS((String)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__ROL_T:
				setRolT((String)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__SOURCE:
				setSource((Classba)newValue);
				return;
			case AbstractaPackage.RELATIONSHIPBA__TARGET:
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
			case AbstractaPackage.RELATIONSHIPBA__IDE:
				setIde(IDE_EDEFAULT);
				return;
			case AbstractaPackage.RELATIONSHIPBA__IS_AGREGATION:
				setIsAgregation(IS_AGREGATION_EDEFAULT);
				return;
			case AbstractaPackage.RELATIONSHIPBA__IS_CONTAINMENT:
				setIsContainment(IS_CONTAINMENT_EDEFAULT);
				return;
			case AbstractaPackage.RELATIONSHIPBA__IS_GENERALIZATION:
				setIsGeneralization(IS_GENERALIZATION_EDEFAULT);
				return;
			case AbstractaPackage.RELATIONSHIPBA__IS_ASSOCIATION:
				setIsAssociation(IS_ASSOCIATION_EDEFAULT);
				return;
			case AbstractaPackage.RELATIONSHIPBA__IS_IMPLEMENTATION:
				setIsImplementation(IS_IMPLEMENTATION_EDEFAULT);
				return;
			case AbstractaPackage.RELATIONSHIPBA__MULT_S:
				setMultS(MULT_S_EDEFAULT);
				return;
			case AbstractaPackage.RELATIONSHIPBA__MULT_T:
				setMultT(MULT_T_EDEFAULT);
				return;
			case AbstractaPackage.RELATIONSHIPBA__ROL_S:
				setRolS(ROL_S_EDEFAULT);
				return;
			case AbstractaPackage.RELATIONSHIPBA__ROL_T:
				setRolT(ROL_T_EDEFAULT);
				return;
			case AbstractaPackage.RELATIONSHIPBA__SOURCE:
				setSource((Classba)null);
				return;
			case AbstractaPackage.RELATIONSHIPBA__TARGET:
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
			case AbstractaPackage.RELATIONSHIPBA__IDE:
				return IDE_EDEFAULT == null ? ide != null : !IDE_EDEFAULT.equals(ide);
			case AbstractaPackage.RELATIONSHIPBA__IS_AGREGATION:
				return IS_AGREGATION_EDEFAULT == null ? isAgregation != null : !IS_AGREGATION_EDEFAULT.equals(isAgregation);
			case AbstractaPackage.RELATIONSHIPBA__IS_CONTAINMENT:
				return IS_CONTAINMENT_EDEFAULT == null ? isContainment != null : !IS_CONTAINMENT_EDEFAULT.equals(isContainment);
			case AbstractaPackage.RELATIONSHIPBA__IS_GENERALIZATION:
				return IS_GENERALIZATION_EDEFAULT == null ? isGeneralization != null : !IS_GENERALIZATION_EDEFAULT.equals(isGeneralization);
			case AbstractaPackage.RELATIONSHIPBA__IS_ASSOCIATION:
				return IS_ASSOCIATION_EDEFAULT == null ? isAssociation != null : !IS_ASSOCIATION_EDEFAULT.equals(isAssociation);
			case AbstractaPackage.RELATIONSHIPBA__IS_IMPLEMENTATION:
				return IS_IMPLEMENTATION_EDEFAULT == null ? isImplementation != null : !IS_IMPLEMENTATION_EDEFAULT.equals(isImplementation);
			case AbstractaPackage.RELATIONSHIPBA__MULT_S:
				return MULT_S_EDEFAULT == null ? multS != null : !MULT_S_EDEFAULT.equals(multS);
			case AbstractaPackage.RELATIONSHIPBA__MULT_T:
				return MULT_T_EDEFAULT == null ? multT != null : !MULT_T_EDEFAULT.equals(multT);
			case AbstractaPackage.RELATIONSHIPBA__ROL_S:
				return ROL_S_EDEFAULT == null ? rolS != null : !ROL_S_EDEFAULT.equals(rolS);
			case AbstractaPackage.RELATIONSHIPBA__ROL_T:
				return ROL_T_EDEFAULT == null ? rolT != null : !ROL_T_EDEFAULT.equals(rolT);
			case AbstractaPackage.RELATIONSHIPBA__SOURCE:
				return source != null;
			case AbstractaPackage.RELATIONSHIPBA__TARGET:
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
		result.append(", isAgregation: ");
		result.append(isAgregation);
		result.append(", isContainment: ");
		result.append(isContainment);
		result.append(", isGeneralization: ");
		result.append(isGeneralization);
		result.append(", isAssociation: ");
		result.append(isAssociation);
		result.append(", isImplementation: ");
		result.append(isImplementation);
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
