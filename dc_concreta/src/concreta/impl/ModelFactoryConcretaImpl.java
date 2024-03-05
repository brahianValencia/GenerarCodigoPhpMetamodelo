/**
 */
package concreta.impl;

import concreta.Clasifier;
import concreta.ConcretaPackage;
import concreta.ModelFactoryConcreta;
import concreta.Projectba;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory Concreta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.ModelFactoryConcretaImpl#getLstProjectba <em>Lst Projectba</em>}</li>
 *   <li>{@link concreta.impl.ModelFactoryConcretaImpl#getLstClasifierba <em>Lst Clasifierba</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryConcretaImpl extends EObjectImpl implements ModelFactoryConcreta {
	/**
	 * The cached value of the '{@link #getLstProjectba() <em>Lst Projectba</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstProjectba()
	 * @generated
	 * @ordered
	 */
	protected EList<Projectba> lstProjectba;

	/**
	 * The cached value of the '{@link #getLstClasifierba() <em>Lst Clasifierba</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstClasifierba()
	 * @generated
	 * @ordered
	 */
	protected EList<Clasifier> lstClasifierba;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryConcretaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.MODEL_FACTORY_CONCRETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Projectba> getLstProjectba() {
		if (lstProjectba == null) {
			lstProjectba = new EObjectContainmentEList<Projectba>(Projectba.class, this, ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_PROJECTBA);
		}
		return lstProjectba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clasifier> getLstClasifierba() {
		if (lstClasifierba == null) {
			lstClasifierba = new EObjectContainmentEList<Clasifier>(Clasifier.class, this, ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_CLASIFIERBA);
		}
		return lstClasifierba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_PROJECTBA:
				return ((InternalEList<?>)getLstProjectba()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_CLASIFIERBA:
				return ((InternalEList<?>)getLstClasifierba()).basicRemove(otherEnd, msgs);
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
			case ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_PROJECTBA:
				return getLstProjectba();
			case ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_CLASIFIERBA:
				return getLstClasifierba();
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
			case ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_PROJECTBA:
				getLstProjectba().clear();
				getLstProjectba().addAll((Collection<? extends Projectba>)newValue);
				return;
			case ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_CLASIFIERBA:
				getLstClasifierba().clear();
				getLstClasifierba().addAll((Collection<? extends Clasifier>)newValue);
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
			case ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_PROJECTBA:
				getLstProjectba().clear();
				return;
			case ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_CLASIFIERBA:
				getLstClasifierba().clear();
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
			case ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_PROJECTBA:
				return lstProjectba != null && !lstProjectba.isEmpty();
			case ConcretaPackage.MODEL_FACTORY_CONCRETA__LST_CLASIFIERBA:
				return lstClasifierba != null && !lstClasifierba.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelFactoryConcretaImpl
