/**
 */
package concreta.util;

import concreta.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see concreta.ConcretaPackage
 * @generated
 */
public class ConcretaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConcretaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaSwitch() {
		if (modelPackage == null) {
			modelPackage = ConcretaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConcretaPackage.MODEL_FACTORY_CONCRETA: {
				ModelFactoryConcreta modelFactoryConcreta = (ModelFactoryConcreta)theEObject;
				T result = caseModelFactoryConcreta(modelFactoryConcreta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.PROJECTBA: {
				Projectba projectba = (Projectba)theEObject;
				T result = caseProjectba(projectba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.DIAGRAM_CLASSBA: {
				DiagramClassba diagramClassba = (DiagramClassba)theEObject;
				T result = caseDiagramClassba(diagramClassba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.PACKAGEBA: {
				Packageba packageba = (Packageba)theEObject;
				T result = casePackageba(packageba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.CLASSBA: {
				Classba classba = (Classba)theEObject;
				T result = caseClassba(classba);
				if (result == null) result = caseClasifier(classba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.INTERFACE_CLASSBA: {
				InterfaceClassba interfaceClassba = (InterfaceClassba)theEObject;
				T result = caseInterfaceClassba(interfaceClassba);
				if (result == null) result = caseClasifier(interfaceClassba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.ABSCTRACT_CLASSBA: {
				AbsctractClassba absctractClassba = (AbsctractClassba)theEObject;
				T result = caseAbsctractClassba(absctractClassba);
				if (result == null) result = caseClasifier(absctractClassba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.RELATIONSHIPBA: {
				Relationshipba relationshipba = (Relationshipba)theEObject;
				T result = caseRelationshipba(relationshipba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.CONTAINMENT: {
				Containment containment = (Containment)theEObject;
				T result = caseContainment(containment);
				if (result == null) result = caseRelationshipba(containment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.AGGREGATION: {
				Aggregation aggregation = (Aggregation)theEObject;
				T result = caseAggregation(aggregation);
				if (result == null) result = caseRelationshipba(aggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseRelationshipba(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseRelationshipba(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.IMPLEMENTATION: {
				Implementation implementation = (Implementation)theEObject;
				T result = caseImplementation(implementation);
				if (result == null) result = caseRelationshipba(implementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.CLASIFIER: {
				Clasifier clasifier = (Clasifier)theEObject;
				T result = caseClasifier(clasifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.PRIMITIVE_DATA_TYPE: {
				PrimitiveDataType primitiveDataType = (PrimitiveDataType)theEObject;
				T result = casePrimitiveDataType(primitiveDataType);
				if (result == null) result = caseClasifier(primitiveDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.ATTRIBUTEBA: {
				Attributeba attributeba = (Attributeba)theEObject;
				T result = caseAttributeba(attributeba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.METHODBA: {
				Methodba methodba = (Methodba)theEObject;
				T result = caseMethodba(methodba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.OPERATIONBA: {
				Operationba operationba = (Operationba)theEObject;
				T result = caseOperationba(operationba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretaPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory Concreta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory Concreta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactoryConcreta(ModelFactoryConcreta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projectba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projectba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectba(Projectba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Classba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Classba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramClassba(DiagramClassba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageba(Packageba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassba(Classba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Classba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Classba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClassba(InterfaceClassba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absctract Classba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absctract Classba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsctractClassba(AbsctractClassba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationshipba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationshipba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipba(Relationshipba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainment(Containment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementation(Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clasifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clasifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClasifier(Clasifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveDataType(PrimitiveDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributeba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributeba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeba(Attributeba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Methodba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Methodba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodba(Methodba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operationba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operationba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationba(Operationba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConcretaSwitch
