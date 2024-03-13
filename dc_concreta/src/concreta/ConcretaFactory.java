/**
 */
package concreta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see concreta.ConcretaPackage
 * @generated
 */
public interface ConcretaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcretaFactory eINSTANCE = concreta.impl.ConcretaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory Concreta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory Concreta</em>'.
	 * @generated
	 */
	ModelFactoryConcreta createModelFactoryConcreta();

	/**
	 * Returns a new object of class '<em>Projectba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projectba</em>'.
	 * @generated
	 */
	Projectba createProjectba();

	/**
	 * Returns a new object of class '<em>Diagram Classba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Classba</em>'.
	 * @generated
	 */
	DiagramClassba createDiagramClassba();

	/**
	 * Returns a new object of class '<em>Packageba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packageba</em>'.
	 * @generated
	 */
	Packageba createPackageba();

	/**
	 * Returns a new object of class '<em>Classba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classba</em>'.
	 * @generated
	 */
	Classba createClassba();

	/**
	 * Returns a new object of class '<em>Interface Classba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Classba</em>'.
	 * @generated
	 */
	InterfaceClassba createInterfaceClassba();

	/**
	 * Returns a new object of class '<em>Absctract Classba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absctract Classba</em>'.
	 * @generated
	 */
	AbsctractClassba createAbsctractClassba();

	/**
	 * Returns a new object of class '<em>Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment</em>'.
	 * @generated
	 */
	Containment createContainment();

	/**
	 * Returns a new object of class '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation</em>'.
	 * @generated
	 */
	Aggregation createAggregation();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization</em>'.
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns a new object of class '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation</em>'.
	 * @generated
	 */
	Implementation createImplementation();

	/**
	 * Returns a new object of class '<em>Clasifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clasifier</em>'.
	 * @generated
	 */
	Clasifier createClasifier();

	/**
	 * Returns a new object of class '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Data Type</em>'.
	 * @generated
	 */
	PrimitiveDataType createPrimitiveDataType();

	/**
	 * Returns a new object of class '<em>Attributeba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributeba</em>'.
	 * @generated
	 */
	Attributeba createAttributeba();

	/**
	 * Returns a new object of class '<em>Methodba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Methodba</em>'.
	 * @generated
	 */
	Methodba createMethodba();

	/**
	 * Returns a new object of class '<em>Operationba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operationba</em>'.
	 * @generated
	 */
	Operationba createOperationba();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConcretaPackage getConcretaPackage();

} //ConcretaFactory
