/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Classba</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.DiagramClassba#getName <em>Name</em>}</li>
 *   <li>{@link concreta.DiagramClassba#getPath <em>Path</em>}</li>
 *   <li>{@link concreta.DiagramClassba#getLstClass <em>Lst Class</em>}</li>
 *   <li>{@link concreta.DiagramClassba#getLstAbstractaClassba <em>Lst Abstracta Classba</em>}</li>
 *   <li>{@link concreta.DiagramClassba#getLstInterfaceClassba <em>Lst Interface Classba</em>}</li>
 *   <li>{@link concreta.DiagramClassba#getLstPackageba <em>Lst Packageba</em>}</li>
 *   <li>{@link concreta.DiagramClassba#getLstRelationshipba <em>Lst Relationshipba</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getDiagramClassba()
 * @model
 * @generated
 */
public interface DiagramClassba extends EObject {
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
	 * @see concreta.ConcretaPackage#getDiagramClassba_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concreta.DiagramClassba#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see concreta.ConcretaPackage#getDiagramClassba_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link concreta.DiagramClassba#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Lst Class</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Classba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Class</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getDiagramClassba_LstClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classba> getLstClass();

	/**
	 * Returns the value of the '<em><b>Lst Abstracta Classba</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.AbsctractClassba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Abstracta Classba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Abstracta Classba</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getDiagramClassba_LstAbstractaClassba()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbsctractClassba> getLstAbstractaClassba();

	/**
	 * Returns the value of the '<em><b>Lst Interface Classba</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.InterfaceClassba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Interface Classba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Interface Classba</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getDiagramClassba_LstInterfaceClassba()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClassba> getLstInterfaceClassba();

	/**
	 * Returns the value of the '<em><b>Lst Packageba</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Packageba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Packageba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Packageba</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getDiagramClassba_LstPackageba()
	 * @model containment="true"
	 * @generated
	 */
	EList<Packageba> getLstPackageba();

	/**
	 * Returns the value of the '<em><b>Lst Relationshipba</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Relationshipba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Relationshipba</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Relationshipba</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getDiagramClassba_LstRelationshipba()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationshipba> getLstRelationshipba();

} // DiagramClassba
