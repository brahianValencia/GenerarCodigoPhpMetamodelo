/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operationba</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.Operationba#getName <em>Name</em>}</li>
 *   <li>{@link concreta.Operationba#getAccessModify <em>Access Modify</em>}</li>
 *   <li>{@link concreta.Operationba#getRetorno <em>Retorno</em>}</li>
 *   <li>{@link concreta.Operationba#getClassba <em>Classba</em>}</li>
 *   <li>{@link concreta.Operationba#getLstParametersba <em>Lst Parametersba</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getOperationba()
 * @model annotation="gmf.node label='name' border.style='solid' figure='rectangle' color='106,112,230'"
 * @generated
 */
public interface Operationba extends EObject {
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
	 * @see concreta.ConcretaPackage#getOperationba_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concreta.Operationba#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Access Modify</b></em>' attribute.
	 * The literals are from the enumeration {@link concreta.AccessModifyba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Modify</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Modify</em>' attribute.
	 * @see concreta.AccessModifyba
	 * @see #setAccessModify(AccessModifyba)
	 * @see concreta.ConcretaPackage#getOperationba_AccessModify()
	 * @model
	 * @generated
	 */
	AccessModifyba getAccessModify();

	/**
	 * Sets the value of the '{@link concreta.Operationba#getAccessModify <em>Access Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modify</em>' attribute.
	 * @see concreta.AccessModifyba
	 * @see #getAccessModify()
	 * @generated
	 */
	void setAccessModify(AccessModifyba value);

	/**
	 * Returns the value of the '<em><b>Retorno</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retorno</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retorno</em>' reference.
	 * @see #setRetorno(Clasifier)
	 * @see concreta.ConcretaPackage#getOperationba_Retorno()
	 * @model
	 * @generated
	 */
	Clasifier getRetorno();

	/**
	 * Sets the value of the '{@link concreta.Operationba#getRetorno <em>Retorno</em>}' reference.
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
	 * @see concreta.ConcretaPackage#getOperationba_Classba()
	 * @model
	 * @generated
	 */
	Classba getClassba();

	/**
	 * Sets the value of the '{@link concreta.Operationba#getClassba <em>Classba</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classba</em>' reference.
	 * @see #getClassba()
	 * @generated
	 */
	void setClassba(Classba value);

	/**
	 * Returns the value of the '<em><b>Lst Parametersba</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Parametersba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Parametersba</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getOperationba_LstParametersba()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<Parameter> getLstParametersba();

} // Operationba