/**
 */
package abstracta.impl;

import abstracta.*;

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
public class AbstractaFactoryImpl extends EFactoryImpl implements AbstractaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractaFactory init() {
		try {
			AbstractaFactory theAbstractaFactory = (AbstractaFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractaPackage.eNS_URI);
			if (theAbstractaFactory != null) {
				return theAbstractaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaFactoryImpl() {
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
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA: return createModelFactoryAbstracta();
			case AbstractaPackage.PROJECTBA: return createProjectba();
			case AbstractaPackage.PACKAGEBA: return createPackageba();
			case AbstractaPackage.CLASSBA: return createClassba();
			case AbstractaPackage.RELATIONSHIPBA: return createRelationshipba();
			case AbstractaPackage.CLASIFIER: return createClasifier();
			case AbstractaPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
			case AbstractaPackage.ATTRIBUTEBA: return createAttributeba();
			case AbstractaPackage.METHODBA: return createMethodba();
			case AbstractaPackage.PARAMETER: return createParameter();
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
			case AbstractaPackage.ACCESS_MODIFYBA:
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
			case AbstractaPackage.ACCESS_MODIFYBA:
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
	public ModelFactoryAbstracta createModelFactoryAbstracta() {
		ModelFactoryAbstractaImpl modelFactoryAbstracta = new ModelFactoryAbstractaImpl();
		return modelFactoryAbstracta;
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
	public Relationshipba createRelationshipba() {
		RelationshipbaImpl relationshipba = new RelationshipbaImpl();
		return relationshipba;
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
	public AbstractaPackage getAbstractaPackage() {
		return (AbstractaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractaPackage getPackage() {
		return AbstractaPackage.eINSTANCE;
	}

} //AbstractaFactoryImpl
