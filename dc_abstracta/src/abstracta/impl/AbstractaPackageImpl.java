/**
 */
package abstracta.impl;

import abstracta.AbstractaFactory;
import abstracta.AbstractaPackage;
import abstracta.AccessModifyba;
import abstracta.Attributeba;
import abstracta.Clasifier;
import abstracta.Classba;
import abstracta.Methodba;
import abstracta.ModelFactoryAbstracta;
import abstracta.Packageba;
import abstracta.Parameter;
import abstracta.PrimitiveDataType;
import abstracta.Projectba;
import abstracta.Relationshipba;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractaPackageImpl extends EPackageImpl implements AbstractaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectbaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packagebaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classbaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipbaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clasifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributebaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodbaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModifybaEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see abstracta.AbstractaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbstractaPackageImpl() {
		super(eNS_URI, AbstractaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AbstractaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AbstractaPackage init() {
		if (isInited) return (AbstractaPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractaPackage.eNS_URI);

		// Obtain or create and register package
		AbstractaPackageImpl theAbstractaPackage = (AbstractaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AbstractaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AbstractaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAbstractaPackage.createPackageContents();

		// Initialize created meta-data
		theAbstractaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbstractaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AbstractaPackage.eNS_URI, theAbstractaPackage);
		return theAbstractaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactoryAbstracta() {
		return modelFactoryAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryAbstracta_LstProjectba() {
		return (EReference)modelFactoryAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryAbstracta_LstClasifierba() {
		return (EReference)modelFactoryAbstractaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectba() {
		return projectbaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectba_Name() {
		return (EAttribute)projectbaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectba_Path() {
		return (EAttribute)projectbaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectba_LstPackages() {
		return (EReference)projectbaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageba() {
		return packagebaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageba_Name() {
		return (EAttribute)packagebaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageba_Path() {
		return (EAttribute)packagebaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageba_ListPackages() {
		return (EReference)packagebaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageba_LstClass() {
		return (EReference)packagebaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassba() {
		return classbaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassba_IsAbstract() {
		return (EAttribute)classbaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassba_IsInterface() {
		return (EAttribute)classbaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassba_ModifyAcces() {
		return (EAttribute)classbaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassba_Path() {
		return (EAttribute)classbaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassba_LstRelationshipSourceba() {
		return (EReference)classbaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassba_LstAttributesba() {
		return (EReference)classbaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassba_LstRelationshipTargetba() {
		return (EReference)classbaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassba_LstMethodba() {
		return (EReference)classbaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipba() {
		return relationshipbaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_Ide() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_IsAgregation() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_IsContainment() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_IsGeneralization() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_IsAssociation() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_IsImplementation() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_MultS() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_MultT() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_RolS() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_RolT() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipba_Source() {
		return (EReference)relationshipbaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipba_Target() {
		return (EReference)relationshipbaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClasifier() {
		return clasifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClasifier_Name() {
		return (EAttribute)clasifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClasifier_LstAttributebaC() {
		return (EReference)clasifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDataType() {
		return primitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeba() {
		return attributebaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeba_Name() {
		return (EAttribute)attributebaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeba_DefaultValue() {
		return (EAttribute)attributebaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeba_Classba() {
		return (EReference)attributebaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeba_Type() {
		return (EReference)attributebaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeba_ModifyAcces() {
		return (EAttribute)attributebaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodba() {
		return methodbaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodba_Name() {
		return (EAttribute)methodbaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodba_Retorno() {
		return (EReference)methodbaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodba_Classba() {
		return (EReference)methodbaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodba_LstParametersba() {
		return (EReference)methodbaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodba_ModifyAcces() {
		return (EAttribute)methodbaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Methodba() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessModifyba() {
		return accessModifybaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaFactory getAbstractaFactory() {
		return (AbstractaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryAbstractaEClass = createEClass(MODEL_FACTORY_ABSTRACTA);
		createEReference(modelFactoryAbstractaEClass, MODEL_FACTORY_ABSTRACTA__LST_PROJECTBA);
		createEReference(modelFactoryAbstractaEClass, MODEL_FACTORY_ABSTRACTA__LST_CLASIFIERBA);

		projectbaEClass = createEClass(PROJECTBA);
		createEAttribute(projectbaEClass, PROJECTBA__NAME);
		createEAttribute(projectbaEClass, PROJECTBA__PATH);
		createEReference(projectbaEClass, PROJECTBA__LST_PACKAGES);

		packagebaEClass = createEClass(PACKAGEBA);
		createEAttribute(packagebaEClass, PACKAGEBA__NAME);
		createEAttribute(packagebaEClass, PACKAGEBA__PATH);
		createEReference(packagebaEClass, PACKAGEBA__LIST_PACKAGES);
		createEReference(packagebaEClass, PACKAGEBA__LST_CLASS);

		classbaEClass = createEClass(CLASSBA);
		createEAttribute(classbaEClass, CLASSBA__IS_ABSTRACT);
		createEAttribute(classbaEClass, CLASSBA__IS_INTERFACE);
		createEAttribute(classbaEClass, CLASSBA__MODIFY_ACCES);
		createEAttribute(classbaEClass, CLASSBA__PATH);
		createEReference(classbaEClass, CLASSBA__LST_RELATIONSHIP_SOURCEBA);
		createEReference(classbaEClass, CLASSBA__LST_ATTRIBUTESBA);
		createEReference(classbaEClass, CLASSBA__LST_RELATIONSHIP_TARGETBA);
		createEReference(classbaEClass, CLASSBA__LST_METHODBA);

		relationshipbaEClass = createEClass(RELATIONSHIPBA);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__IDE);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__IS_AGREGATION);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__IS_CONTAINMENT);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__IS_GENERALIZATION);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__IS_ASSOCIATION);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__IS_IMPLEMENTATION);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__MULT_S);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__MULT_T);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__ROL_S);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__ROL_T);
		createEReference(relationshipbaEClass, RELATIONSHIPBA__SOURCE);
		createEReference(relationshipbaEClass, RELATIONSHIPBA__TARGET);

		clasifierEClass = createEClass(CLASIFIER);
		createEAttribute(clasifierEClass, CLASIFIER__NAME);
		createEReference(clasifierEClass, CLASIFIER__LST_ATTRIBUTEBA_C);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);

		attributebaEClass = createEClass(ATTRIBUTEBA);
		createEAttribute(attributebaEClass, ATTRIBUTEBA__NAME);
		createEAttribute(attributebaEClass, ATTRIBUTEBA__DEFAULT_VALUE);
		createEReference(attributebaEClass, ATTRIBUTEBA__CLASSBA);
		createEReference(attributebaEClass, ATTRIBUTEBA__TYPE);
		createEAttribute(attributebaEClass, ATTRIBUTEBA__MODIFY_ACCES);

		methodbaEClass = createEClass(METHODBA);
		createEAttribute(methodbaEClass, METHODBA__NAME);
		createEReference(methodbaEClass, METHODBA__RETORNO);
		createEReference(methodbaEClass, METHODBA__CLASSBA);
		createEReference(methodbaEClass, METHODBA__LST_PARAMETERSBA);
		createEAttribute(methodbaEClass, METHODBA__MODIFY_ACCES);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__METHODBA);
		createEReference(parameterEClass, PARAMETER__TYPE);

		// Create enums
		accessModifybaEEnum = createEEnum(ACCESS_MODIFYBA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classbaEClass.getESuperTypes().add(this.getClasifier());
		primitiveDataTypeEClass.getESuperTypes().add(this.getClasifier());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryAbstractaEClass, ModelFactoryAbstracta.class, "ModelFactoryAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactoryAbstracta_LstProjectba(), this.getProjectba(), null, "lstProjectba", null, 0, -1, ModelFactoryAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactoryAbstracta_LstClasifierba(), this.getClasifier(), null, "lstClasifierba", null, 0, -1, ModelFactoryAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectbaEClass, Projectba.class, "Projectba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectba_Name(), ecorePackage.getEString(), "name", null, 0, 1, Projectba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectba_Path(), ecorePackage.getEString(), "path", null, 0, 1, Projectba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectba_LstPackages(), this.getPackageba(), null, "lstPackages", null, 0, -1, Projectba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packagebaEClass, Packageba.class, "Packageba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageba_Name(), ecorePackage.getEString(), "name", null, 0, 1, Packageba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageba_Path(), ecorePackage.getEString(), "path", null, 0, 1, Packageba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageba_ListPackages(), this.getPackageba(), null, "listPackages", null, 0, -1, Packageba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageba_LstClass(), this.getClassba(), null, "lstClass", null, 0, -1, Packageba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classbaEClass, Classba.class, "Classba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassba_IsAbstract(), ecorePackage.getEBooleanObject(), "isAbstract", null, 0, 1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassba_IsInterface(), ecorePackage.getEBooleanObject(), "isInterface", null, 0, 1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassba_ModifyAcces(), this.getAccessModifyba(), "modifyAcces", null, 0, 1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassba_Path(), ecorePackage.getEString(), "path", null, 0, 1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassba_LstRelationshipSourceba(), this.getRelationshipba(), null, "lstRelationshipSourceba", null, 0, -1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassba_LstAttributesba(), this.getAttributeba(), null, "lstAttributesba", null, 0, -1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassba_LstRelationshipTargetba(), this.getRelationshipba(), null, "lstRelationshipTargetba", null, 0, -1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassba_LstMethodba(), this.getMethodba(), null, "lstMethodba", null, 0, -1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipbaEClass, Relationshipba.class, "Relationshipba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipba_Ide(), ecorePackage.getEString(), "ide", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_IsAgregation(), ecorePackage.getEBooleanObject(), "isAgregation", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_IsContainment(), ecorePackage.getEBooleanObject(), "isContainment", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_IsGeneralization(), ecorePackage.getEBooleanObject(), "isGeneralization", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_IsAssociation(), ecorePackage.getEBooleanObject(), "isAssociation", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_IsImplementation(), ecorePackage.getEBooleanObject(), "isImplementation", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_MultS(), ecorePackage.getEString(), "multS", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_MultT(), ecorePackage.getEString(), "multT", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_RolS(), ecorePackage.getEString(), "rolS", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_RolT(), ecorePackage.getEString(), "rolT", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipba_Source(), this.getClassba(), null, "source", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipba_Target(), this.getClassba(), null, "target", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clasifierEClass, Clasifier.class, "Clasifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClasifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Clasifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClasifier_LstAttributebaC(), this.getAttributeba(), null, "lstAttributebaC", null, 0, -1, Clasifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributebaEClass, Attributeba.class, "Attributeba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeba_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attributeba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeba_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Attributeba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeba_Classba(), this.getClassba(), null, "classba", null, 0, 1, Attributeba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeba_Type(), this.getClasifier(), null, "type", null, 0, 1, Attributeba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeba_ModifyAcces(), this.getAccessModifyba(), "modifyAcces", null, 0, 1, Attributeba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodbaEClass, Methodba.class, "Methodba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodba_Name(), ecorePackage.getEString(), "name", null, 0, 1, Methodba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodba_Retorno(), this.getClasifier(), null, "retorno", null, 0, 1, Methodba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodba_Classba(), this.getClassba(), null, "classba", null, 0, 1, Methodba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodba_LstParametersba(), this.getParameter(), null, "lstParametersba", null, 0, -1, Methodba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodba_ModifyAcces(), this.getAccessModifyba(), "modifyAcces", null, 0, 1, Methodba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Methodba(), this.getMethodba(), null, "methodba", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), this.getClasifier(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessModifybaEEnum, AccessModifyba.class, "AccessModifyba");
		addEEnumLiteral(accessModifybaEEnum, AccessModifyba.PUBLIC);
		addEEnumLiteral(accessModifybaEEnum, AccessModifyba.PRIVATE);
		addEEnumLiteral(accessModifybaEEnum, AccessModifyba.PROTECTED);
		addEEnumLiteral(accessModifybaEEnum, AccessModifyba.DEFAULT);

		// Create resource
		createResource(eNS_URI);
	}

} //AbstractaPackageImpl
