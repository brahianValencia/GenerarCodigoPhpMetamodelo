/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methodba</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.Methodba#getName <em>Name</em>}</li>
 *   <li>{@link abstracta.Methodba#getRetorno <em>Retorno</em>}</li>
 *   <li>{@link abstracta.Methodba#getClassba <em>Classba</em>}</li>
 *   <li>{@link abstracta.Methodba#getLstParametersba <em>Lst Parametersba</em>}</li>
 *   <li>{@link abstracta.Methodba#getModifyAcces <em>Modify Acces</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getMethodba()
 * @model
 * @generated
 */
public interface Methodba extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstracta.AbstractaPackage#getMethodba_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracta.Methodba#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Retorno</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retorno</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retorno</em>' reference.
	 * @see #setRetorno(Clasifier)
	 * @see abstracta.AbstractaPackage#getMethodba_Retorno()
	 * @model
	 * @generated
	 */
	Clasifier getRetorno();

	/**
	 * Sets the value of the '{@link abstracta.Methodba#getRetorno <em>Retorno</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retorno</em>' reference.
	 * @see #getRetorno()
	 * @generated
	 */
	void setRetorno(Clasifier value);

	/**
	 * Returns the value of the '<em><b>Classba</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classba</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classba</em>' reference.
	 * @see #setClassba(Classba)
	 * @see abstracta.AbstractaPackage#getMethodba_Classba()
	 * @model
	 * @generated
	 */
	Classba getClassba();

	/**
	 * Sets the value of the '{@link abstracta.Methodba#getClassba <em>Classba</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classba</em>' reference.
	 * @see #getClassba()
	 * @generated
	 */
	void setClassba(Classba value);

	/**
	 * Returns the value of the '<em><b>Lst Parametersba</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Parametersba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Parametersba</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMethodba_LstParametersba()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getLstParametersba();

	/**
	 * Returns the value of the '<em><b>Modify Acces</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta.AccessModifyba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Acces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Acces</em>' attribute.
	 * @see abstracta.AccessModifyba
	 * @see #setModifyAcces(AccessModifyba)
	 * @see abstracta.AbstractaPackage#getMethodba_ModifyAcces()
	 * @model
	 * @generated
	 */
	AccessModifyba getModifyAcces();

	/**
	 * Sets the value of the '{@link abstracta.Methodba#getModifyAcces <em>Modify Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Acces</em>' attribute.
	 * @see abstracta.AccessModifyba
	 * @see #getModifyAcces()
	 * @generated
	 */
	void setModifyAcces(AccessModifyba value);

} // Methodba
