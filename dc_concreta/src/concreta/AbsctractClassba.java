/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absctract Classba</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.AbsctractClassba#getPath <em>Path</em>}</li>
 *   <li>{@link concreta.AbsctractClassba#getLstAttributesba <em>Lst Attributesba</em>}</li>
 *   <li>{@link concreta.AbsctractClassba#getLstMethodba <em>Lst Methodba</em>}</li>
 *   <li>{@link concreta.AbsctractClassba#getAccessModify <em>Access Modify</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getAbsctractClassba()
 * @model annotation="gmf.node label='name' border.style='solid' figure='rectangle' color='106,112,230'"
 * @generated
 */
public interface AbsctractClassba extends Clasifier {
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
	 * @see concreta.ConcretaPackage#getAbsctractClassba_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link concreta.AbsctractClassba#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Lst Attributesba</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Attributeba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Attributesba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Attributesba</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getAbsctractClassba_LstAttributesba()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<Attributeba> getLstAttributesba();

	/**
	 * Returns the value of the '<em><b>Lst Methodba</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Methodba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Methodba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Methodba</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getAbsctractClassba_LstMethodba()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<Methodba> getLstMethodba();

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
	 * @see concreta.ConcretaPackage#getAbsctractClassba_AccessModify()
	 * @model
	 * @generated
	 */
	AccessModifyba getAccessModify();

	/**
	 * Sets the value of the '{@link concreta.AbsctractClassba#getAccessModify <em>Access Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modify</em>' attribute.
	 * @see concreta.AccessModifyba
	 * @see #getAccessModify()
	 * @generated
	 */
	void setAccessModify(AccessModifyba value);

} // AbsctractClassba
