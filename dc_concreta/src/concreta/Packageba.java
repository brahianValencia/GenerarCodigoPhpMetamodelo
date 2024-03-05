/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packageba</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.Packageba#getName <em>Name</em>}</li>
 *   <li>{@link concreta.Packageba#getPath <em>Path</em>}</li>
 *   <li>{@link concreta.Packageba#getListPackages <em>List Packages</em>}</li>
 *   <li>{@link concreta.Packageba#getLstClass <em>Lst Class</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getPackageba()
 * @model annotation="gmf.node label='name' border.style='solid' figure='rectangle' color='201,209,113'"
 * @generated
 */
public interface Packageba extends EObject {
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
	 * @see concreta.ConcretaPackage#getPackageba_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concreta.Packageba#getName <em>Name</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getPackageba_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link concreta.Packageba#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>List Packages</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Packageba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Packages</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getPackageba_ListPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Packageba> getListPackages();

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
	 * @see concreta.ConcretaPackage#getPackageba_LstClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classba> getLstClass();

} // Packageba