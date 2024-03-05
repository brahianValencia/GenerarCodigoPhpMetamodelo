/**
 */
package concreta.impl;

import concreta.Classba;
import concreta.ConcretaPackage;
import concreta.DiagramClassba;
import concreta.Packageba;
import concreta.Relationshipba;

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
 * An implementation of the model object '<em><b>Diagram Classba</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.DiagramClassbaImpl#getName <em>Name</em>}</li>
 *   <li>{@link concreta.impl.DiagramClassbaImpl#getPath <em>Path</em>}</li>
 *   <li>{@link concreta.impl.DiagramClassbaImpl#getLstClass <em>Lst Class</em>}</li>
 *   <li>{@link concreta.impl.DiagramClassbaImpl#getLstPackageba <em>Lst Packageba</em>}</li>
 *   <li>{@link concreta.impl.DiagramClassbaImpl#getLstRelationshipba <em>Lst Relationshipba</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramClassbaImpl extends EObjectImpl implements DiagramClassba {
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
	 * The cached value of the '{@link #getLstClass() <em>Lst Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Classba> lstClass;

	/**
	 * The cached value of the '{@link #getLstPackageba() <em>Lst Packageba</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPackageba()
	 * @generated
	 * @ordered
	 */
	protected EList<Packageba> lstPackageba;

	/**
	 * The cached value of the '{@link #getLstRelationshipba() <em>Lst Relationshipba</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRelationshipba()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationshipba> lstRelationshipba;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramClassbaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.DIAGRAM_CLASSBA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.DIAGRAM_CLASSBA__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.DIAGRAM_CLASSBA__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classba> getLstClass() {
		if (lstClass == null) {
			lstClass = new EObjectContainmentEList<Classba>(Classba.class, this, ConcretaPackage.DIAGRAM_CLASSBA__LST_CLASS);
		}
		return lstClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Packageba> getLstPackageba() {
		if (lstPackageba == null) {
			lstPackageba = new EObjectContainmentEList<Packageba>(Packageba.class, this, ConcretaPackage.DIAGRAM_CLASSBA__LST_PACKAGEBA);
		}
		return lstPackageba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationshipba> getLstRelationshipba() {
		if (lstRelationshipba == null) {
			lstRelationshipba = new EObjectContainmentEList<Relationshipba>(Relationshipba.class, this, ConcretaPackage.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA);
		}
		return lstRelationshipba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_CLASS:
				return ((InternalEList<?>)getLstClass()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_PACKAGEBA:
				return ((InternalEList<?>)getLstPackageba()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA:
				return ((InternalEList<?>)getLstRelationshipba()).basicRemove(otherEnd, msgs);
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
			case ConcretaPackage.DIAGRAM_CLASSBA__NAME:
				return getName();
			case ConcretaPackage.DIAGRAM_CLASSBA__PATH:
				return getPath();
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_CLASS:
				return getLstClass();
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_PACKAGEBA:
				return getLstPackageba();
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA:
				return getLstRelationshipba();
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
			case ConcretaPackage.DIAGRAM_CLASSBA__NAME:
				setName((String)newValue);
				return;
			case ConcretaPackage.DIAGRAM_CLASSBA__PATH:
				setPath((String)newValue);
				return;
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_CLASS:
				getLstClass().clear();
				getLstClass().addAll((Collection<? extends Classba>)newValue);
				return;
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_PACKAGEBA:
				getLstPackageba().clear();
				getLstPackageba().addAll((Collection<? extends Packageba>)newValue);
				return;
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA:
				getLstRelationshipba().clear();
				getLstRelationshipba().addAll((Collection<? extends Relationshipba>)newValue);
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
			case ConcretaPackage.DIAGRAM_CLASSBA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretaPackage.DIAGRAM_CLASSBA__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_CLASS:
				getLstClass().clear();
				return;
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_PACKAGEBA:
				getLstPackageba().clear();
				return;
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA:
				getLstRelationshipba().clear();
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
			case ConcretaPackage.DIAGRAM_CLASSBA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretaPackage.DIAGRAM_CLASSBA__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_CLASS:
				return lstClass != null && !lstClass.isEmpty();
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_PACKAGEBA:
				return lstPackageba != null && !lstPackageba.isEmpty();
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA:
				return lstRelationshipba != null && !lstRelationshipba.isEmpty();
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

} //DiagramClassbaImpl
