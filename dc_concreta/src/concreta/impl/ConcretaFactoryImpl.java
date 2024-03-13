/**
 */
package concreta.impl;

import concreta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcretaFactoryImpl extends EFactoryImpl implements ConcretaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcretaFactory init() {
		try {
			ConcretaFactory theConcretaFactory = (ConcretaFactory)EPackage.Registry.INSTANCE.getEFactory(ConcretaPackage.eNS_URI);
			if (theConcretaFactory != null) {
				return theConcretaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcretaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConcretaPackage.MODEL_FACTORY_CONCRETA: return createModelFactoryConcreta();
			case ConcretaPackage.PROJECTBA: return createProjectba();
			case ConcretaPackage.DIAGRAM_CLASSBA: return createDiagramClassba();
			case ConcretaPackage.PACKAGEBA: return createPackageba();
			case ConcretaPackage.CLASSBA: return createClassba();
			case ConcretaPackage.INTERFACE_CLASSBA: return createInterfaceClassba();
			case ConcretaPackage.ABSCTRACT_CLASSBA: return createAbsctractClassba();
			case ConcretaPackage.CONTAINMENT: return createContainment();
			case ConcretaPackage.AGGREGATION: return createAggregation();
			case ConcretaPackage.ASSOCIATION: return createAssociation();
			case ConcretaPackage.GENERALIZATION: return createGeneralization();
			case ConcretaPackage.IMPLEMENTATION: return createImplementation();
			case ConcretaPackage.CLASIFIER: return createClasifier();
			case ConcretaPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
			case ConcretaPackage.ATTRIBUTEBA: return createAttributeba();
			case ConcretaPackage.METHODBA: return createMethodba();
			case ConcretaPackage.OPERATIONBA: return createOperationba();
			case ConcretaPackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConcretaPackage.ACCESS_MODIFYBA:
				return createAccessModifybaFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConcretaPackage.ACCESS_MODIFYBA:
				return convertAccessModifybaToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryConcreta createModelFactoryConcreta() {
		ModelFactoryConcretaImpl modelFactoryConcreta = new ModelFactoryConcretaImpl();
		return modelFactoryConcreta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projectba createProjectba() {
		ProjectbaImpl projectba = new ProjectbaImpl();
		return projectba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramClassba createDiagramClassba() {
		DiagramClassbaImpl diagramClassba = new DiagramClassbaImpl();
		return diagramClassba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Packageba createPackageba() {
		PackagebaImpl packageba = new PackagebaImpl();
		return packageba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classba createClassba() {
		ClassbaImpl classba = new ClassbaImpl();
		return classba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClassba createInterfaceClassba() {
		InterfaceClassbaImpl interfaceClassba = new InterfaceClassbaImpl();
		return interfaceClassba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsctractClassba createAbsctractClassba() {
		AbsctractClassbaImpl absctractClassba = new AbsctractClassbaImpl();
		return absctractClassba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Containment createContainment() {
		ContainmentImpl containment = new ContainmentImpl();
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasifier createClasifier() {
		ClasifierImpl clasifier = new ClasifierImpl();
		return clasifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType createPrimitiveDataType() {
		PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributeba createAttributeba() {
		AttributebaImpl attributeba = new AttributebaImpl();
		return attributeba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Methodba createMethodba() {
		MethodbaImpl methodba = new MethodbaImpl();
		return methodba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operationba createOperationba() {
		OperationbaImpl operationba = new OperationbaImpl();
		return operationba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifyba createAccessModifybaFromString(EDataType eDataType, String initialValue) {
		AccessModifyba result = AccessModifyba.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModifybaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaPackage getConcretaPackage() {
		return (ConcretaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConcretaPackage getPackage() {
		return ConcretaPackage.eINSTANCE;
	}

} //ConcretaFactoryImpl
