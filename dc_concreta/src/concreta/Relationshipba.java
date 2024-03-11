/**
 */
package concreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationshipba</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.Relationshipba#getIde <em>Ide</em>}</li>
 *   <li>{@link concreta.Relationshipba#getMultS <em>Mult S</em>}</li>
 *   <li>{@link concreta.Relationshipba#getMultT <em>Mult T</em>}</li>
 *   <li>{@link concreta.Relationshipba#getRolS <em>Rol S</em>}</li>
 *   <li>{@link concreta.Relationshipba#getRolT <em>Rol T</em>}</li>
 *   <li>{@link concreta.Relationshipba#getSource <em>Source</em>}</li>
 *   <li>{@link concreta.Relationshipba#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getRelationshipba()
 * @model abstract="true"
 * @generated
 */
public interface Relationshipba extends EObject {
	/**
	 * Returns the value of the '<em><b>Ide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ide</em>' attribute.
	 * @see #setIde(String)
	 * @see concreta.ConcretaPackage#getRelationshipba_Ide()
	 * @model
	 * @generated
	 */
	String getIde();

	/**
	 * Sets the value of the '{@link concreta.Relationshipba#getIde <em>Ide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ide</em>' attribute.
	 * @see #getIde()
	 * @generated
	 */
	void setIde(String value);

	/**
	 * Returns the value of the '<em><b>Mult S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mult S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult S</em>' attribute.
	 * @see #setMultS(String)
	 * @see concreta.ConcretaPackage#getRelationshipba_MultS()
	 * @model
	 * @generated
	 */
	String getMultS();

	/**
	 * Sets the value of the '{@link concreta.Relationshipba#getMultS <em>Mult S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult S</em>' attribute.
	 * @see #getMultS()
	 * @generated
	 */
	void setMultS(String value);

	/**
	 * Returns the value of the '<em><b>Mult T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mult T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult T</em>' attribute.
	 * @see #setMultT(String)
	 * @see concreta.ConcretaPackage#getRelationshipba_MultT()
	 * @model
	 * @generated
	 */
	String getMultT();

	/**
	 * Sets the value of the '{@link concreta.Relationshipba#getMultT <em>Mult T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult T</em>' attribute.
	 * @see #getMultT()
	 * @generated
	 */
	void setMultT(String value);

	/**
	 * Returns the value of the '<em><b>Rol S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol S</em>' attribute.
	 * @see #setRolS(String)
	 * @see concreta.ConcretaPackage#getRelationshipba_RolS()
	 * @model
	 * @generated
	 */
	String getRolS();

	/**
	 * Sets the value of the '{@link concreta.Relationshipba#getRolS <em>Rol S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol S</em>' attribute.
	 * @see #getRolS()
	 * @generated
	 */
	void setRolS(String value);

	/**
	 * Returns the value of the '<em><b>Rol T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol T</em>' attribute.
	 * @see #setRolT(String)
	 * @see concreta.ConcretaPackage#getRelationshipba_RolT()
	 * @model
	 * @generated
	 */
	String getRolT();

	/**
	 * Sets the value of the '{@link concreta.Relationshipba#getRolT <em>Rol T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol T</em>' attribute.
	 * @see #getRolT()
	 * @generated
	 */
	void setRolT(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Classba)
	 * @see concreta.ConcretaPackage#getRelationshipba_Source()
	 * @model
	 * @generated
	 */
	Classba getSource();

	/**
	 * Sets the value of the '{@link concreta.Relationshipba#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Classba value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Classba)
	 * @see concreta.ConcretaPackage#getRelationshipba_Target()
	 * @model
	 * @generated
	 */
	Classba getTarget();

	/**
	 * Sets the value of the '{@link concreta.Relationshipba#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Classba value);

} // Relationshipba
