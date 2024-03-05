/**
 */
package abstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributeba</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.Attributeba#getName <em>Name</em>}</li>
 *   <li>{@link abstracta.Attributeba#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link abstracta.Attributeba#getClassba <em>Classba</em>}</li>
 *   <li>{@link abstracta.Attributeba#getType <em>Type</em>}</li>
 *   <li>{@link abstracta.Attributeba#getModifyAcces <em>Modify Acces</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getAttributeba()
 * @model
 * @generated
 */
public interface Attributeba extends EObject {
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
	 * @see abstracta.AbstractaPackage#getAttributeba_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracta.Attributeba#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see abstracta.AbstractaPackage#getAttributeba_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link abstracta.Attributeba#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

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
	 * @see abstracta.AbstractaPackage#getAttributeba_Classba()
	 * @model
	 * @generated
	 */
	Classba getClassba();

	/**
	 * Sets the value of the '{@link abstracta.Attributeba#getClassba <em>Classba</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classba</em>' reference.
	 * @see #getClassba()
	 * @generated
	 */
	void setClassba(Classba value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Clasifier)
	 * @see abstracta.AbstractaPackage#getAttributeba_Type()
	 * @model
	 * @generated
	 */
	Clasifier getType();

	/**
	 * Sets the value of the '{@link abstracta.Attributeba#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Clasifier value);

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
	 * @see abstracta.AbstractaPackage#getAttributeba_ModifyAcces()
	 * @model
	 * @generated
	 */
	AccessModifyba getModifyAcces();

	/**
	 * Sets the value of the '{@link abstracta.Attributeba#getModifyAcces <em>Modify Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Acces</em>' attribute.
	 * @see abstracta.AccessModifyba
	 * @see #getModifyAcces()
	 * @generated
	 */
	void setModifyAcces(AccessModifyba value);

} // Attributeba
