/**
 */
package abstracta;

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
 *   <li>{@link abstracta.Packageba#getName <em>Name</em>}</li>
 *   <li>{@link abstracta.Packageba#getPath <em>Path</em>}</li>
 *   <li>{@link abstracta.Packageba#getListPackages <em>List Packages</em>}</li>
 *   <li>{@link abstracta.Packageba#getLstClass <em>Lst Class</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getPackageba()
 * @model
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
	 * @see abstracta.AbstractaPackage#getPackageba_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracta.Packageba#getName <em>Name</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getPackageba_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstracta.Packageba#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>List Packages</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.Packageba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Packages</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getPackageba_ListPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Packageba> getListPackages();

	/**
	 * Returns the value of the '<em><b>Lst Class</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.Classba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Class</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getPackageba_LstClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classba> getLstClass();

} // Packageba
