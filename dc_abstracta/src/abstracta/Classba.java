/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classba</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.Classba#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link abstracta.Classba#getIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link abstracta.Classba#getIsFinalClass <em>Is Final Class</em>}</li>
 *   <li>{@link abstracta.Classba#getModifyAcces <em>Modify Acces</em>}</li>
 *   <li>{@link abstracta.Classba#getPath <em>Path</em>}</li>
 *   <li>{@link abstracta.Classba#getLstRelationshipSourceba <em>Lst Relationship Sourceba</em>}</li>
 *   <li>{@link abstracta.Classba#getLstAttributesba <em>Lst Attributesba</em>}</li>
 *   <li>{@link abstracta.Classba#getLstRelationshipTargetba <em>Lst Relationship Targetba</em>}</li>
 *   <li>{@link abstracta.Classba#getLstMethodba <em>Lst Methodba</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getClassba()
 * @model
 * @generated
 */
public interface Classba extends Clasifier {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see abstracta.AbstractaPackage#getClassba_IsAbstract()
	 * @model
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link abstracta.Classba#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Interface</em>' attribute.
	 * @see #setIsInterface(Boolean)
	 * @see abstracta.AbstractaPackage#getClassba_IsInterface()
	 * @model
	 * @generated
	 */
	Boolean getIsInterface();

	/**
	 * Sets the value of the '{@link abstracta.Classba#getIsInterface <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Interface</em>' attribute.
	 * @see #getIsInterface()
	 * @generated
	 */
	void setIsInterface(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final Class</em>' attribute.
	 * @see #setIsFinalClass(Boolean)
	 * @see abstracta.AbstractaPackage#getClassba_IsFinalClass()
	 * @model
	 * @generated
	 */
	Boolean getIsFinalClass();

	/**
	 * Sets the value of the '{@link abstracta.Classba#getIsFinalClass <em>Is Final Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final Class</em>' attribute.
	 * @see #getIsFinalClass()
	 * @generated
	 */
	void setIsFinalClass(Boolean value);

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
	 * @see abstracta.AbstractaPackage#getClassba_ModifyAcces()
	 * @model
	 * @generated
	 */
	AccessModifyba getModifyAcces();

	/**
	 * Sets the value of the '{@link abstracta.Classba#getModifyAcces <em>Modify Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Acces</em>' attribute.
	 * @see abstracta.AccessModifyba
	 * @see #getModifyAcces()
	 * @generated
	 */
	void setModifyAcces(AccessModifyba value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see abstracta.AbstractaPackage#getClassba_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstracta.Classba#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Lst Relationship Sourceba</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.Relationshipba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Relationship Sourceba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Relationship Sourceba</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getClassba_LstRelationshipSourceba()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationshipba> getLstRelationshipSourceba();

	/**
	 * Returns the value of the '<em><b>Lst Attributesba</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.Attributeba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Attributesba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Attributesba</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getClassba_LstAttributesba()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attributeba> getLstAttributesba();

	/**
	 * Returns the value of the '<em><b>Lst Relationship Targetba</b></em>' reference list.
	 * The list contents are of type {@link abstracta.Relationshipba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Relationship Targetba</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Relationship Targetba</em>' reference list.
	 * @see abstracta.AbstractaPackage#getClassba_LstRelationshipTargetba()
	 * @model
	 * @generated
	 */
	EList<Relationshipba> getLstRelationshipTargetba();

	/**
	 * Returns the value of the '<em><b>Lst Methodba</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.Methodba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Methodba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Methodba</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getClassba_LstMethodba()
	 * @model containment="true"
	 * @generated
	 */
	EList<Methodba> getLstMethodba();

} // Classba