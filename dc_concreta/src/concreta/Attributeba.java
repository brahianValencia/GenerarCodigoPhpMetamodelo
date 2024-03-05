/**
 */
package concreta;

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
 *   <li>{@link concreta.Attributeba#getName <em>Name</em>}</li>
 *   <li>{@link concreta.Attributeba#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link concreta.Attributeba#getClassba <em>Classba</em>}</li>
 *   <li>{@link concreta.Attributeba#getType <em>Type</em>}</li>
 *   <li>{@link concreta.Attributeba#getAccessModify <em>Access Modify</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getAttributeba()
 * @model annotation="gmf.node label='name' border.style='solid' figure='rectangle' color='201,209,113'"
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
	 * @see concreta.ConcretaPackage#getAttributeba_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concreta.Attributeba#getName <em>Name</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getAttributeba_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link concreta.Attributeba#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getAttributeba_Classba()
	 * @model
	 * @generated
	 */
	Classba getClassba();

	/**
	 * Sets the value of the '{@link concreta.Attributeba#getClassba <em>Classba</em>}' reference.
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
	 * @see concreta.ConcretaPackage#getAttributeba_Type()
	 * @model
	 * @generated
	 */
	Clasifier getType();

	/**
	 * Sets the value of the '{@link concreta.Attributeba#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Clasifier value);

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
	 * @see concreta.ConcretaPackage#getAttributeba_AccessModify()
	 * @model
	 * @generated
	 */
	AccessModifyba getAccessModify();

	/**
	 * Sets the value of the '{@link concreta.Attributeba#getAccessModify <em>Access Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modify</em>' attribute.
	 * @see concreta.AccessModifyba
	 * @see #getAccessModify()
	 * @generated
	 */
	void setAccessModify(AccessModifyba value);

} // Attributeba
