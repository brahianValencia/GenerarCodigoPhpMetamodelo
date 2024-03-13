/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projectba</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.Projectba#getName <em>Name</em>}</li>
 *   <li>{@link abstracta.Projectba#getPath <em>Path</em>}</li>
 *   <li>{@link abstracta.Projectba#getIde <em>Ide</em>}</li>
 *   <li>{@link abstracta.Projectba#getLstPackages <em>Lst Packages</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getProjectba()
 * @model
 * @generated
 */
public interface Projectba extends EObject {
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
	 * @see abstracta.AbstractaPackage#getProjectba_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracta.Projectba#getName <em>Name</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getProjectba_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstracta.Projectba#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Ide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ide</em>' attribute.
	 * @see #setIde(int)
	 * @see abstracta.AbstractaPackage#getProjectba_Ide()
	 * @model
	 * @generated
	 */
	int getIde();

	/**
	 * Sets the value of the '{@link abstracta.Projectba#getIde <em>Ide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ide</em>' attribute.
	 * @see #getIde()
	 * @generated
	 */
	void setIde(int value);

	/**
	 * Returns the value of the '<em><b>Lst Packages</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.Packageba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Packages</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getProjectba_LstPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Packageba> getLstPackages();

} // Projectba
