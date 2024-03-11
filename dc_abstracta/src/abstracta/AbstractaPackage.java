/**
 */
package abstracta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://abstracta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstracta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaPackage eINSTANCE = abstracta.impl.AbstractaPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstracta.impl.ModelFactoryAbstractaImpl <em>Model Factory Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ModelFactoryAbstractaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getModelFactoryAbstracta()
	 * @generated
	 */
	int MODEL_FACTORY_ABSTRACTA = 0;

	/**
	 * The feature id for the '<em><b>Lst Projectba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACTA__LST_PROJECTBA = 0;

	/**
	 * The feature id for the '<em><b>Lst Clasifierba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACTA__LST_CLASIFIERBA = 1;

	/**
	 * The number of structural features of the '<em>Model Factory Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACTA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstracta.impl.ProjectbaImpl <em>Projectba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ProjectbaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getProjectba()
	 * @generated
	 */
	int PROJECTBA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTBA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTBA__PATH = 1;

	/**
	 * The feature id for the '<em><b>Lst Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTBA__LST_PACKAGES = 2;

	/**
	 * The number of structural features of the '<em>Projectba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTBA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link abstracta.impl.PackagebaImpl <em>Packageba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.PackagebaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getPackageba()
	 * @generated
	 */
	int PACKAGEBA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEBA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEBA__PATH = 1;

	/**
	 * The feature id for the '<em><b>List Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEBA__LIST_PACKAGES = 2;

	/**
	 * The feature id for the '<em><b>Lst Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEBA__LST_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Packageba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEBA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstracta.impl.ClasifierImpl <em>Clasifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ClasifierImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getClasifier()
	 * @generated
	 */
	int CLASIFIER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFIER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lst Attributeba C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFIER__LST_ATTRIBUTEBA_C = 1;

	/**
	 * The number of structural features of the '<em>Clasifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFIER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstracta.impl.ClassbaImpl <em>Classba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ClassbaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getClassba()
	 * @generated
	 */
	int CLASSBA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__NAME = CLASIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Lst Attributeba C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__LST_ATTRIBUTEBA_C = CLASIFIER__LST_ATTRIBUTEBA_C;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__IS_ABSTRACT = CLASIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__IS_INTERFACE = CLASIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modify Acces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__MODIFY_ACCES = CLASIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__PATH = CLASIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lst Relationship Sourceba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__LST_RELATIONSHIP_SOURCEBA = CLASIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lst Attributesba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__LST_ATTRIBUTESBA = CLASIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lst Relationship Targetba</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__LST_RELATIONSHIP_TARGETBA = CLASIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lst Methodba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__LST_METHODBA = CLASIFIER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Classba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA_FEATURE_COUNT = CLASIFIER_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link abstracta.impl.RelationshipbaImpl <em>Relationshipba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.RelationshipbaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getRelationshipba()
	 * @generated
	 */
	int RELATIONSHIPBA = 4;

	/**
	 * The feature id for the '<em><b>Ide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__IDE = 0;

	/**
	 * The feature id for the '<em><b>Is Agregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__IS_AGREGATION = 1;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__IS_CONTAINMENT = 2;

	/**
	 * The feature id for the '<em><b>Is Generalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__IS_GENERALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Is Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__IS_ASSOCIATION = 4;

	/**
	 * The feature id for the '<em><b>Is Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__IS_IMPLEMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Mult S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__MULT_S = 6;

	/**
	 * The feature id for the '<em><b>Mult T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__MULT_T = 7;

	/**
	 * The feature id for the '<em><b>Rol S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__ROL_S = 8;

	/**
	 * The feature id for the '<em><b>Rol T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__ROL_T = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__TARGET = 11;

	/**
	 * The number of structural features of the '<em>Relationshipba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link abstracta.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.PrimitiveDataTypeImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NAME = CLASIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Lst Attributeba C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__LST_ATTRIBUTEBA_C = CLASIFIER__LST_ATTRIBUTEBA_C;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = CLASIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.AttributebaImpl <em>Attributeba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.AttributebaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getAttributeba()
	 * @generated
	 */
	int ATTRIBUTEBA = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEBA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEBA__DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Classba</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEBA__CLASSBA = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEBA__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Modify Acces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEBA__MODIFY_ACCES = 4;

	/**
	 * The number of structural features of the '<em>Attributeba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEBA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstracta.impl.MethodbaImpl <em>Methodba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MethodbaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMethodba()
	 * @generated
	 */
	int METHODBA = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Retorno</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA__RETORNO = 1;

	/**
	 * The feature id for the '<em><b>Classba</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA__CLASSBA = 2;

	/**
	 * The feature id for the '<em><b>Lst Parametersba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA__LST_PARAMETERSBA = 3;

	/**
	 * The feature id for the '<em><b>Modify Acces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA__MODIFY_ACCES = 4;

	/**
	 * The number of structural features of the '<em>Methodba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstracta.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ParameterImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Methodba</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__METHODBA = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link abstracta.AccessModifyba <em>Access Modifyba</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.AccessModifyba
	 * @see abstracta.impl.AbstractaPackageImpl#getAccessModifyba()
	 * @generated
	 */
	int ACCESS_MODIFYBA = 10;


	/**
	 * Returns the meta object for class '{@link abstracta.ModelFactoryAbstracta <em>Model Factory Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Abstracta</em>'.
	 * @see abstracta.ModelFactoryAbstracta
	 * @generated
	 */
	EClass getModelFactoryAbstracta();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ModelFactoryAbstracta#getLstProjectba <em>Lst Projectba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Projectba</em>'.
	 * @see abstracta.ModelFactoryAbstracta#getLstProjectba()
	 * @see #getModelFactoryAbstracta()
	 * @generated
	 */
	EReference getModelFactoryAbstracta_LstProjectba();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ModelFactoryAbstracta#getLstClasifierba <em>Lst Clasifierba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Clasifierba</em>'.
	 * @see abstracta.ModelFactoryAbstracta#getLstClasifierba()
	 * @see #getModelFactoryAbstracta()
	 * @generated
	 */
	EReference getModelFactoryAbstracta_LstClasifierba();

	/**
	 * Returns the meta object for class '{@link abstracta.Projectba <em>Projectba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projectba</em>'.
	 * @see abstracta.Projectba
	 * @generated
	 */
	EClass getProjectba();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Projectba#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta.Projectba#getName()
	 * @see #getProjectba()
	 * @generated
	 */
	EAttribute getProjectba_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Projectba#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstracta.Projectba#getPath()
	 * @see #getProjectba()
	 * @generated
	 */
	EAttribute getProjectba_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.Projectba#getLstPackages <em>Lst Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Packages</em>'.
	 * @see abstracta.Projectba#getLstPackages()
	 * @see #getProjectba()
	 * @generated
	 */
	EReference getProjectba_LstPackages();

	/**
	 * Returns the meta object for class '{@link abstracta.Packageba <em>Packageba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packageba</em>'.
	 * @see abstracta.Packageba
	 * @generated
	 */
	EClass getPackageba();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Packageba#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta.Packageba#getName()
	 * @see #getPackageba()
	 * @generated
	 */
	EAttribute getPackageba_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Packageba#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstracta.Packageba#getPath()
	 * @see #getPackageba()
	 * @generated
	 */
	EAttribute getPackageba_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.Packageba#getListPackages <em>List Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Packages</em>'.
	 * @see abstracta.Packageba#getListPackages()
	 * @see #getPackageba()
	 * @generated
	 */
	EReference getPackageba_ListPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.Packageba#getLstClass <em>Lst Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Class</em>'.
	 * @see abstracta.Packageba#getLstClass()
	 * @see #getPackageba()
	 * @generated
	 */
	EReference getPackageba_LstClass();

	/**
	 * Returns the meta object for class '{@link abstracta.Classba <em>Classba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classba</em>'.
	 * @see abstracta.Classba
	 * @generated
	 */
	EClass getClassba();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Classba#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see abstracta.Classba#getIsAbstract()
	 * @see #getClassba()
	 * @generated
	 */
	EAttribute getClassba_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Classba#getIsInterface <em>Is Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Interface</em>'.
	 * @see abstracta.Classba#getIsInterface()
	 * @see #getClassba()
	 * @generated
	 */
	EAttribute getClassba_IsInterface();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Classba#getModifyAcces <em>Modify Acces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modify Acces</em>'.
	 * @see abstracta.Classba#getModifyAcces()
	 * @see #getClassba()
	 * @generated
	 */
	EAttribute getClassba_ModifyAcces();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Classba#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstracta.Classba#getPath()
	 * @see #getClassba()
	 * @generated
	 */
	EAttribute getClassba_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.Classba#getLstRelationshipSourceba <em>Lst Relationship Sourceba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Relationship Sourceba</em>'.
	 * @see abstracta.Classba#getLstRelationshipSourceba()
	 * @see #getClassba()
	 * @generated
	 */
	EReference getClassba_LstRelationshipSourceba();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.Classba#getLstAttributesba <em>Lst Attributesba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attributesba</em>'.
	 * @see abstracta.Classba#getLstAttributesba()
	 * @see #getClassba()
	 * @generated
	 */
	EReference getClassba_LstAttributesba();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.Classba#getLstRelationshipTargetba <em>Lst Relationship Targetba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Relationship Targetba</em>'.
	 * @see abstracta.Classba#getLstRelationshipTargetba()
	 * @see #getClassba()
	 * @generated
	 */
	EReference getClassba_LstRelationshipTargetba();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.Classba#getLstMethodba <em>Lst Methodba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Methodba</em>'.
	 * @see abstracta.Classba#getLstMethodba()
	 * @see #getClassba()
	 * @generated
	 */
	EReference getClassba_LstMethodba();

	/**
	 * Returns the meta object for class '{@link abstracta.Relationshipba <em>Relationshipba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationshipba</em>'.
	 * @see abstracta.Relationshipba
	 * @generated
	 */
	EClass getRelationshipba();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Relationshipba#getIde <em>Ide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ide</em>'.
	 * @see abstracta.Relationshipba#getIde()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_Ide();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Relationshipba#getIsAgregation <em>Is Agregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Agregation</em>'.
	 * @see abstracta.Relationshipba#getIsAgregation()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_IsAgregation();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Relationshipba#getIsContainment <em>Is Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Containment</em>'.
	 * @see abstracta.Relationshipba#getIsContainment()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_IsContainment();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Relationshipba#getIsGeneralization <em>Is Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Generalization</em>'.
	 * @see abstracta.Relationshipba#getIsGeneralization()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_IsGeneralization();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Relationshipba#getIsAssociation <em>Is Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Association</em>'.
	 * @see abstracta.Relationshipba#getIsAssociation()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_IsAssociation();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Relationshipba#getIsImplementation <em>Is Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Implementation</em>'.
	 * @see abstracta.Relationshipba#getIsImplementation()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_IsImplementation();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Relationshipba#getMultS <em>Mult S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult S</em>'.
	 * @see abstracta.Relationshipba#getMultS()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_MultS();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Relationshipba#getMultT <em>Mult T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult T</em>'.
	 * @see abstracta.Relationshipba#getMultT()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_MultT();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Relationshipba#getRolS <em>Rol S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol S</em>'.
	 * @see abstracta.Relationshipba#getRolS()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_RolS();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Relationshipba#getRolT <em>Rol T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol T</em>'.
	 * @see abstracta.Relationshipba#getRolT()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_RolT();

	/**
	 * Returns the meta object for the reference '{@link abstracta.Relationshipba#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracta.Relationshipba#getSource()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EReference getRelationshipba_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracta.Relationshipba#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracta.Relationshipba#getTarget()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EReference getRelationshipba_Target();

	/**
	 * Returns the meta object for class '{@link abstracta.Clasifier <em>Clasifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clasifier</em>'.
	 * @see abstracta.Clasifier
	 * @generated
	 */
	EClass getClasifier();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Clasifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta.Clasifier#getName()
	 * @see #getClasifier()
	 * @generated
	 */
	EAttribute getClasifier_Name();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.Clasifier#getLstAttributebaC <em>Lst Attributeba C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Attributeba C</em>'.
	 * @see abstracta.Clasifier#getLstAttributebaC()
	 * @see #getClasifier()
	 * @generated
	 */
	EReference getClasifier_LstAttributebaC();

	/**
	 * Returns the meta object for class '{@link abstracta.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see abstracta.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link abstracta.Attributeba <em>Attributeba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributeba</em>'.
	 * @see abstracta.Attributeba
	 * @generated
	 */
	EClass getAttributeba();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Attributeba#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta.Attributeba#getName()
	 * @see #getAttributeba()
	 * @generated
	 */
	EAttribute getAttributeba_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Attributeba#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see abstracta.Attributeba#getDefaultValue()
	 * @see #getAttributeba()
	 * @generated
	 */
	EAttribute getAttributeba_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link abstracta.Attributeba#getClassba <em>Classba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classba</em>'.
	 * @see abstracta.Attributeba#getClassba()
	 * @see #getAttributeba()
	 * @generated
	 */
	EReference getAttributeba_Classba();

	/**
	 * Returns the meta object for the reference '{@link abstracta.Attributeba#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see abstracta.Attributeba#getType()
	 * @see #getAttributeba()
	 * @generated
	 */
	EReference getAttributeba_Type();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Attributeba#getModifyAcces <em>Modify Acces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modify Acces</em>'.
	 * @see abstracta.Attributeba#getModifyAcces()
	 * @see #getAttributeba()
	 * @generated
	 */
	EAttribute getAttributeba_ModifyAcces();

	/**
	 * Returns the meta object for class '{@link abstracta.Methodba <em>Methodba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methodba</em>'.
	 * @see abstracta.Methodba
	 * @generated
	 */
	EClass getMethodba();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Methodba#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta.Methodba#getName()
	 * @see #getMethodba()
	 * @generated
	 */
	EAttribute getMethodba_Name();

	/**
	 * Returns the meta object for the reference '{@link abstracta.Methodba#getRetorno <em>Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Retorno</em>'.
	 * @see abstracta.Methodba#getRetorno()
	 * @see #getMethodba()
	 * @generated
	 */
	EReference getMethodba_Retorno();

	/**
	 * Returns the meta object for the reference '{@link abstracta.Methodba#getClassba <em>Classba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classba</em>'.
	 * @see abstracta.Methodba#getClassba()
	 * @see #getMethodba()
	 * @generated
	 */
	EReference getMethodba_Classba();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.Methodba#getLstParametersba <em>Lst Parametersba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Parametersba</em>'.
	 * @see abstracta.Methodba#getLstParametersba()
	 * @see #getMethodba()
	 * @generated
	 */
	EReference getMethodba_LstParametersba();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Methodba#getModifyAcces <em>Modify Acces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modify Acces</em>'.
	 * @see abstracta.Methodba#getModifyAcces()
	 * @see #getMethodba()
	 * @generated
	 */
	EAttribute getMethodba_ModifyAcces();

	/**
	 * Returns the meta object for class '{@link abstracta.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see abstracta.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link abstracta.Parameter#getMethodba <em>Methodba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Methodba</em>'.
	 * @see abstracta.Parameter#getMethodba()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Methodba();

	/**
	 * Returns the meta object for the reference '{@link abstracta.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see abstracta.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for enum '{@link abstracta.AccessModifyba <em>Access Modifyba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Modifyba</em>'.
	 * @see abstracta.AccessModifyba
	 * @generated
	 */
	EEnum getAccessModifyba();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractaFactory getAbstractaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link abstracta.impl.ModelFactoryAbstractaImpl <em>Model Factory Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ModelFactoryAbstractaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getModelFactoryAbstracta()
		 * @generated
		 */
		EClass MODEL_FACTORY_ABSTRACTA = eINSTANCE.getModelFactoryAbstracta();

		/**
		 * The meta object literal for the '<em><b>Lst Projectba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_ABSTRACTA__LST_PROJECTBA = eINSTANCE.getModelFactoryAbstracta_LstProjectba();

		/**
		 * The meta object literal for the '<em><b>Lst Clasifierba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_ABSTRACTA__LST_CLASIFIERBA = eINSTANCE.getModelFactoryAbstracta_LstClasifierba();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ProjectbaImpl <em>Projectba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ProjectbaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getProjectba()
		 * @generated
		 */
		EClass PROJECTBA = eINSTANCE.getProjectba();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTBA__NAME = eINSTANCE.getProjectba_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTBA__PATH = eINSTANCE.getProjectba_Path();

		/**
		 * The meta object literal for the '<em><b>Lst Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTBA__LST_PACKAGES = eINSTANCE.getProjectba_LstPackages();

		/**
		 * The meta object literal for the '{@link abstracta.impl.PackagebaImpl <em>Packageba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.PackagebaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getPackageba()
		 * @generated
		 */
		EClass PACKAGEBA = eINSTANCE.getPackageba();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGEBA__NAME = eINSTANCE.getPackageba_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGEBA__PATH = eINSTANCE.getPackageba_Path();

		/**
		 * The meta object literal for the '<em><b>List Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGEBA__LIST_PACKAGES = eINSTANCE.getPackageba_ListPackages();

		/**
		 * The meta object literal for the '<em><b>Lst Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGEBA__LST_CLASS = eINSTANCE.getPackageba_LstClass();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ClassbaImpl <em>Classba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ClassbaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getClassba()
		 * @generated
		 */
		EClass CLASSBA = eINSTANCE.getClassba();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSBA__IS_ABSTRACT = eINSTANCE.getClassba_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSBA__IS_INTERFACE = eINSTANCE.getClassba_IsInterface();

		/**
		 * The meta object literal for the '<em><b>Modify Acces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSBA__MODIFY_ACCES = eINSTANCE.getClassba_ModifyAcces();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSBA__PATH = eINSTANCE.getClassba_Path();

		/**
		 * The meta object literal for the '<em><b>Lst Relationship Sourceba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSBA__LST_RELATIONSHIP_SOURCEBA = eINSTANCE.getClassba_LstRelationshipSourceba();

		/**
		 * The meta object literal for the '<em><b>Lst Attributesba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSBA__LST_ATTRIBUTESBA = eINSTANCE.getClassba_LstAttributesba();

		/**
		 * The meta object literal for the '<em><b>Lst Relationship Targetba</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSBA__LST_RELATIONSHIP_TARGETBA = eINSTANCE.getClassba_LstRelationshipTargetba();

		/**
		 * The meta object literal for the '<em><b>Lst Methodba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSBA__LST_METHODBA = eINSTANCE.getClassba_LstMethodba();

		/**
		 * The meta object literal for the '{@link abstracta.impl.RelationshipbaImpl <em>Relationshipba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.RelationshipbaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getRelationshipba()
		 * @generated
		 */
		EClass RELATIONSHIPBA = eINSTANCE.getRelationshipba();

		/**
		 * The meta object literal for the '<em><b>Ide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__IDE = eINSTANCE.getRelationshipba_Ide();

		/**
		 * The meta object literal for the '<em><b>Is Agregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__IS_AGREGATION = eINSTANCE.getRelationshipba_IsAgregation();

		/**
		 * The meta object literal for the '<em><b>Is Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__IS_CONTAINMENT = eINSTANCE.getRelationshipba_IsContainment();

		/**
		 * The meta object literal for the '<em><b>Is Generalization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__IS_GENERALIZATION = eINSTANCE.getRelationshipba_IsGeneralization();

		/**
		 * The meta object literal for the '<em><b>Is Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__IS_ASSOCIATION = eINSTANCE.getRelationshipba_IsAssociation();

		/**
		 * The meta object literal for the '<em><b>Is Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__IS_IMPLEMENTATION = eINSTANCE.getRelationshipba_IsImplementation();

		/**
		 * The meta object literal for the '<em><b>Mult S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__MULT_S = eINSTANCE.getRelationshipba_MultS();

		/**
		 * The meta object literal for the '<em><b>Mult T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__MULT_T = eINSTANCE.getRelationshipba_MultT();

		/**
		 * The meta object literal for the '<em><b>Rol S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__ROL_S = eINSTANCE.getRelationshipba_RolS();

		/**
		 * The meta object literal for the '<em><b>Rol T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__ROL_T = eINSTANCE.getRelationshipba_RolT();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPBA__SOURCE = eINSTANCE.getRelationshipba_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPBA__TARGET = eINSTANCE.getRelationshipba_Target();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ClasifierImpl <em>Clasifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ClasifierImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getClasifier()
		 * @generated
		 */
		EClass CLASIFIER = eINSTANCE.getClasifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASIFIER__NAME = eINSTANCE.getClasifier_Name();

		/**
		 * The meta object literal for the '<em><b>Lst Attributeba C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASIFIER__LST_ATTRIBUTEBA_C = eINSTANCE.getClasifier_LstAttributebaC();

		/**
		 * The meta object literal for the '{@link abstracta.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.PrimitiveDataTypeImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '{@link abstracta.impl.AttributebaImpl <em>Attributeba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.AttributebaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getAttributeba()
		 * @generated
		 */
		EClass ATTRIBUTEBA = eINSTANCE.getAttributeba();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEBA__NAME = eINSTANCE.getAttributeba_Name();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEBA__DEFAULT_VALUE = eINSTANCE.getAttributeba_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Classba</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEBA__CLASSBA = eINSTANCE.getAttributeba_Classba();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEBA__TYPE = eINSTANCE.getAttributeba_Type();

		/**
		 * The meta object literal for the '<em><b>Modify Acces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEBA__MODIFY_ACCES = eINSTANCE.getAttributeba_ModifyAcces();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MethodbaImpl <em>Methodba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MethodbaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMethodba()
		 * @generated
		 */
		EClass METHODBA = eINSTANCE.getMethodba();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODBA__NAME = eINSTANCE.getMethodba_Name();

		/**
		 * The meta object literal for the '<em><b>Retorno</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODBA__RETORNO = eINSTANCE.getMethodba_Retorno();

		/**
		 * The meta object literal for the '<em><b>Classba</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODBA__CLASSBA = eINSTANCE.getMethodba_Classba();

		/**
		 * The meta object literal for the '<em><b>Lst Parametersba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODBA__LST_PARAMETERSBA = eINSTANCE.getMethodba_LstParametersba();

		/**
		 * The meta object literal for the '<em><b>Modify Acces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODBA__MODIFY_ACCES = eINSTANCE.getMethodba_ModifyAcces();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ParameterImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Methodba</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__METHODBA = eINSTANCE.getParameter_Methodba();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link abstracta.AccessModifyba <em>Access Modifyba</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.AccessModifyba
		 * @see abstracta.impl.AbstractaPackageImpl#getAccessModifyba()
		 * @generated
		 */
		EEnum ACCESS_MODIFYBA = eINSTANCE.getAccessModifyba();

	}

} //AbstractaPackage
