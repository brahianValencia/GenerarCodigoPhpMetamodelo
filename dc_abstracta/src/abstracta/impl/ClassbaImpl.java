/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.AccessModifyba;
import abstracta.Attributeba;
import abstracta.Classba;
import abstracta.Methodba;
import abstracta.Relationshipba;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classba</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.ClassbaImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link abstracta.impl.ClassbaImpl#getIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link abstracta.impl.ClassbaImpl#getModifyAcces <em>Modify Acces</em>}</li>
 *   <li>{@link abstracta.impl.ClassbaImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstracta.impl.ClassbaImpl#getLstRelationshipSourceba <em>Lst Relationship Sourceba</em>}</li>
 *   <li>{@link abstracta.impl.ClassbaImpl#getLstAttributesba <em>Lst Attributesba</em>}</li>
 *   <li>{@link abstracta.impl.ClassbaImpl#getLstRelationshipTargetba <em>Lst Relationship Targetba</em>}</li>
 *   <li>{@link abstracta.impl.ClassbaImpl#getLstMethodba <em>Lst Methodba</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassbaImpl extends ClasifierImpl implements Classba {
	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsInterface() <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInterface()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsInterface() <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInterface()
	 * @generated
	 * @ordered
	 */
	protected Boolean isInterface = IS_INTERFACE_EDEFAULT;

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
	 * The cached value of the '{@link #getLstRelationshipSourceba() <em>Lst Relationship Sourceba</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRelationshipSourceba()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationshipba> lstRelationshipSourceba;

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
	 * The cached value of the '{@link #getLstRelationshipTargetba() <em>Lst Relationship Targetba</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRelationshipTargetba()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationshipba> lstRelationshipTargetba;

	/**
	 * The cached value of the '{@link #getLstMethodba() <em>Lst Methodba</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMethodba()
	 * @generated
	 * @ordered
	 */
	protected EList<Methodba> lstMethodba;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassbaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.CLASSBA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.CLASSBA__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsInterface() {
		return isInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInterface(Boolean newIsInterface) {
		Boolean oldIsInterface = isInterface;
		isInterface = newIsInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.CLASSBA__IS_INTERFACE, oldIsInterface, isInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.CLASSBA__MODIFY_ACCES, oldModifyAcces, modifyAcces));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.CLASSBA__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationshipba> getLstRelationshipSourceba() {
		if (lstRelationshipSourceba == null) {
			lstRelationshipSourceba = new EObjectContainmentEList<Relationshipba>(Relationshipba.class, this, AbstractaPackage.CLASSBA__LST_RELATIONSHIP_SOURCEBA);
		}
		return lstRelationshipSourceba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attributeba> getLstAttributesba() {
		if (lstAttributesba == null) {
			lstAttributesba = new EObjectContainmentEList<Attributeba>(Attributeba.class, this, AbstractaPackage.CLASSBA__LST_ATTRIBUTESBA);
		}
		return lstAttributesba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationshipba> getLstRelationshipTargetba() {
		if (lstRelationshipTargetba == null) {
			lstRelationshipTargetba = new EObjectResolvingEList<Relationshipba>(Relationshipba.class, this, AbstractaPackage.CLASSBA__LST_RELATIONSHIP_TARGETBA);
		}
		return lstRelationshipTargetba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Methodba> getLstMethodba() {
		if (lstMethodba == null) {
			lstMethodba = new EObjectContainmentEList<Methodba>(Methodba.class, this, AbstractaPackage.CLASSBA__LST_METHODBA);
		}
		return lstMethodba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.CLASSBA__LST_RELATIONSHIP_SOURCEBA:
				return ((InternalEList<?>)getLstRelationshipSourceba()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.CLASSBA__LST_ATTRIBUTESBA:
				return ((InternalEList<?>)getLstAttributesba()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.CLASSBA__LST_METHODBA:
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
			case AbstractaPackage.CLASSBA__IS_ABSTRACT:
				return getIsAbstract();
			case AbstractaPackage.CLASSBA__IS_INTERFACE:
				return getIsInterface();
			case AbstractaPackage.CLASSBA__MODIFY_ACCES:
				return getModifyAcces();
			case AbstractaPackage.CLASSBA__PATH:
				return getPath();
			case AbstractaPackage.CLASSBA__LST_RELATIONSHIP_SOURCEBA:
				return getLstRelationshipSourceba();
			case AbstractaPackage.CLASSBA__LST_ATTRIBUTESBA:
				return getLstAttributesba();
			case AbstractaPackage.CLASSBA__LST_RELATIONSHIP_TARGETBA:
				return getLstRelationshipTargetba();
			case AbstractaPackage.CLASSBA__LST_METHODBA:
				return getLstMethodba();
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
			case AbstractaPackage.CLASSBA__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case AbstractaPackage.CLASSBA__IS_INTERFACE:
				setIsInterface((Boolean)newValue);
				return;
			case AbstractaPackage.CLASSBA__MODIFY_ACCES:
				setModifyAcces((AccessModifyba)newValue);
				return;
			case AbstractaPackage.CLASSBA__PATH:
				setPath((String)newValue);
				return;
			case AbstractaPackage.CLASSBA__LST_RELATIONSHIP_SOURCEBA:
				getLstRelationshipSourceba().clear();
				getLstRelationshipSourceba().addAll((Collection<? extends Relationshipba>)newValue);
				return;
			case AbstractaPackage.CLASSBA__LST_ATTRIBUTESBA:
				getLstAttributesba().clear();
				getLstAttributesba().addAll((Collection<? extends Attributeba>)newValue);
				return;
			case AbstractaPackage.CLASSBA__LST_RELATIONSHIP_TARGETBA:
				getLstRelationshipTargetba().clear();
				getLstRelationshipTargetba().addAll((Collection<? extends Relationshipba>)newValue);
				return;
			case AbstractaPackage.CLASSBA__LST_METHODBA:
				getLstMethodba().clear();
				getLstMethodba().addAll((Collection<? extends Methodba>)newValue);
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
			case AbstractaPackage.CLASSBA__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case AbstractaPackage.CLASSBA__IS_INTERFACE:
				setIsInterface(IS_INTERFACE_EDEFAULT);
				return;
			case AbstractaPackage.CLASSBA__MODIFY_ACCES:
				setModifyAcces(MODIFY_ACCES_EDEFAULT);
				return;
			case AbstractaPackage.CLASSBA__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractaPackage.CLASSBA__LST_RELATIONSHIP_SOURCEBA:
				getLstRelationshipSourceba().clear();
				return;
			case AbstractaPackage.CLASSBA__LST_ATTRIBUTESBA:
				getLstAttributesba().clear();
				return;
			case AbstractaPackage.CLASSBA__LST_RELATIONSHIP_TARGETBA:
				getLstRelationshipTargetba().clear();
				return;
			case AbstractaPackage.CLASSBA__LST_METHODBA:
				getLstMethodba().clear();
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
			case AbstractaPackage.CLASSBA__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case AbstractaPackage.CLASSBA__IS_INTERFACE:
				return IS_INTERFACE_EDEFAULT == null ? isInterface != null : !IS_INTERFACE_EDEFAULT.equals(isInterface);
			case AbstractaPackage.CLASSBA__MODIFY_ACCES:
				return modifyAcces != MODIFY_ACCES_EDEFAULT;
			case AbstractaPackage.CLASSBA__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractaPackage.CLASSBA__LST_RELATIONSHIP_SOURCEBA:
				return lstRelationshipSourceba != null && !lstRelationshipSourceba.isEmpty();
			case AbstractaPackage.CLASSBA__LST_ATTRIBUTESBA:
				return lstAttributesba != null && !lstAttributesba.isEmpty();
			case AbstractaPackage.CLASSBA__LST_RELATIONSHIP_TARGETBA:
				return lstRelationshipTargetba != null && !lstRelationshipTargetba.isEmpty();
			case AbstractaPackage.CLASSBA__LST_METHODBA:
				return lstMethodba != null && !lstMethodba.isEmpty();
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isInterface: ");
		result.append(isInterface);
		result.append(", modifyAcces: ");
		result.append(modifyAcces);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //ClassbaImpl
