/**
 */
package concreta.impl;

import concreta.Abstract;
import concreta.AccessModifyba;
import concreta.Aggregation;
import concreta.Association;
import concreta.Attributeba;
import concreta.Clasifier;
import concreta.Classba;
import concreta.ConcretaFactory;
import concreta.ConcretaPackage;
import concreta.Containment;
import concreta.DiagramClassba;
import concreta.Generalization;
import concreta.Interface;
import concreta.Methodba;
import concreta.ModelFactoryConcreta;
import concreta.Packageba;
import concreta.Parameter;
import concreta.PrimitiveDataType;
import concreta.Projectba;
import concreta.Relationshipba;

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
public class ConcretaPackageImpl extends EPackageImpl implements ConcretaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryConcretaEClass = null;

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
	private EClass diagramClassbaEClass = null;

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
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEClass = null;

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
	private EClass containmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

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
	 * @see concreta.ConcretaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcretaPackageImpl() {
		super(eNS_URI, ConcretaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConcretaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcretaPackage init() {
		if (isInited) return (ConcretaPackage)EPackage.Registry.INSTANCE.getEPackage(ConcretaPackage.eNS_URI);

		// Obtain or create and register package
		ConcretaPackageImpl theConcretaPackage = (ConcretaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConcretaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConcretaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConcretaPackage.createPackageContents();

		// Initialize created meta-data
		theConcretaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcretaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcretaPackage.eNS_URI, theConcretaPackage);
		return theConcretaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactoryConcreta() {
		return modelFactoryConcretaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryConcreta_LstProjectba() {
		return (EReference)modelFactoryConcretaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryConcreta_LstClasifierba() {
		return (EReference)modelFactoryConcretaEClass.getEStructuralFeatures().get(1);
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
	public EReference getProjectba_LstDiagramClassba() {
		return (EReference)projectbaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramClassba() {
		return diagramClassbaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramClassba_Name() {
		return (EAttribute)diagramClassbaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramClassba_Path() {
		return (EAttribute)diagramClassbaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramClassba_LstClass() {
		return (EReference)diagramClassbaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramClassba_LstPackageba() {
		return (EReference)diagramClassbaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramClassba_LstRelationshipba() {
		return (EReference)diagramClassbaEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getClassba_Path() {
		return (EAttribute)classbaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassba_LstAttributesba() {
		return (EReference)classbaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassba_LstMethodba() {
		return (EReference)classbaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassba_AccessModify() {
		return (EAttribute)classbaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstract() {
		return abstractEClass;
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
	public EAttribute getRelationshipba_MultS() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_MultT() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_RolS() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipba_RolTS() {
		return (EAttribute)relationshipbaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipba_Source() {
		return (EReference)relationshipbaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipba_Target() {
		return (EReference)relationshipbaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainment() {
		return containmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregation() {
		return aggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
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
	public EAttribute getAttributeba_AccessModify() {
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
	public EAttribute getMethodba_AccessModify() {
		return (EAttribute)methodbaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodba_Retorno() {
		return (EReference)methodbaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodba_Classba() {
		return (EReference)methodbaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodba_LstParametersba() {
		return (EReference)methodbaEClass.getEStructuralFeatures().get(4);
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
	public ConcretaFactory getConcretaFactory() {
		return (ConcretaFactory)getEFactoryInstance();
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
		modelFactoryConcretaEClass = createEClass(MODEL_FACTORY_CONCRETA);
		createEReference(modelFactoryConcretaEClass, MODEL_FACTORY_CONCRETA__LST_PROJECTBA);
		createEReference(modelFactoryConcretaEClass, MODEL_FACTORY_CONCRETA__LST_CLASIFIERBA);

		projectbaEClass = createEClass(PROJECTBA);
		createEAttribute(projectbaEClass, PROJECTBA__NAME);
		createEAttribute(projectbaEClass, PROJECTBA__PATH);
		createEReference(projectbaEClass, PROJECTBA__LST_DIAGRAM_CLASSBA);

		diagramClassbaEClass = createEClass(DIAGRAM_CLASSBA);
		createEAttribute(diagramClassbaEClass, DIAGRAM_CLASSBA__NAME);
		createEAttribute(diagramClassbaEClass, DIAGRAM_CLASSBA__PATH);
		createEReference(diagramClassbaEClass, DIAGRAM_CLASSBA__LST_CLASS);
		createEReference(diagramClassbaEClass, DIAGRAM_CLASSBA__LST_PACKAGEBA);
		createEReference(diagramClassbaEClass, DIAGRAM_CLASSBA__LST_RELATIONSHIPBA);

		packagebaEClass = createEClass(PACKAGEBA);
		createEAttribute(packagebaEClass, PACKAGEBA__NAME);
		createEAttribute(packagebaEClass, PACKAGEBA__PATH);
		createEReference(packagebaEClass, PACKAGEBA__LIST_PACKAGES);
		createEReference(packagebaEClass, PACKAGEBA__LST_CLASS);

		classbaEClass = createEClass(CLASSBA);
		createEAttribute(classbaEClass, CLASSBA__PATH);
		createEReference(classbaEClass, CLASSBA__LST_ATTRIBUTESBA);
		createEReference(classbaEClass, CLASSBA__LST_METHODBA);
		createEAttribute(classbaEClass, CLASSBA__ACCESS_MODIFY);

		interfaceEClass = createEClass(INTERFACE);

		abstractEClass = createEClass(ABSTRACT);

		relationshipbaEClass = createEClass(RELATIONSHIPBA);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__MULT_S);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__MULT_T);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__ROL_S);
		createEAttribute(relationshipbaEClass, RELATIONSHIPBA__ROL_TS);
		createEReference(relationshipbaEClass, RELATIONSHIPBA__SOURCE);
		createEReference(relationshipbaEClass, RELATIONSHIPBA__TARGET);

		containmentEClass = createEClass(CONTAINMENT);

		aggregationEClass = createEClass(AGGREGATION);

		associationEClass = createEClass(ASSOCIATION);

		generalizationEClass = createEClass(GENERALIZATION);

		clasifierEClass = createEClass(CLASIFIER);
		createEAttribute(clasifierEClass, CLASIFIER__NAME);
		createEReference(clasifierEClass, CLASIFIER__LST_ATTRIBUTEBA_C);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);

		attributebaEClass = createEClass(ATTRIBUTEBA);
		createEAttribute(attributebaEClass, ATTRIBUTEBA__NAME);
		createEAttribute(attributebaEClass, ATTRIBUTEBA__DEFAULT_VALUE);
		createEReference(attributebaEClass, ATTRIBUTEBA__CLASSBA);
		createEReference(attributebaEClass, ATTRIBUTEBA__TYPE);
		createEAttribute(attributebaEClass, ATTRIBUTEBA__ACCESS_MODIFY);

		methodbaEClass = createEClass(METHODBA);
		createEAttribute(methodbaEClass, METHODBA__NAME);
		createEAttribute(methodbaEClass, METHODBA__ACCESS_MODIFY);
		createEReference(methodbaEClass, METHODBA__RETORNO);
		createEReference(methodbaEClass, METHODBA__CLASSBA);
		createEReference(methodbaEClass, METHODBA__LST_PARAMETERSBA);

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
		interfaceEClass.getESuperTypes().add(this.getClassba());
		abstractEClass.getESuperTypes().add(this.getClassba());
		containmentEClass.getESuperTypes().add(this.getRelationshipba());
		aggregationEClass.getESuperTypes().add(this.getRelationshipba());
		associationEClass.getESuperTypes().add(this.getRelationshipba());
		generalizationEClass.getESuperTypes().add(this.getRelationshipba());
		primitiveDataTypeEClass.getESuperTypes().add(this.getClasifier());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryConcretaEClass, ModelFactoryConcreta.class, "ModelFactoryConcreta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactoryConcreta_LstProjectba(), this.getProjectba(), null, "lstProjectba", null, 0, -1, ModelFactoryConcreta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactoryConcreta_LstClasifierba(), this.getClasifier(), null, "lstClasifierba", null, 0, -1, ModelFactoryConcreta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectbaEClass, Projectba.class, "Projectba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectba_Name(), ecorePackage.getEString(), "name", null, 0, 1, Projectba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectba_Path(), ecorePackage.getEString(), "path", null, 0, 1, Projectba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectba_LstDiagramClassba(), this.getDiagramClassba(), null, "lstDiagramClassba", null, 0, -1, Projectba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramClassbaEClass, DiagramClassba.class, "DiagramClassba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagramClassba_Name(), ecorePackage.getEString(), "name", null, 0, 1, DiagramClassba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramClassba_Path(), ecorePackage.getEString(), "path", null, 0, 1, DiagramClassba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramClassba_LstClass(), this.getClassba(), null, "lstClass", null, 0, -1, DiagramClassba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramClassba_LstPackageba(), this.getPackageba(), null, "lstPackageba", null, 0, -1, DiagramClassba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramClassba_LstRelationshipba(), this.getRelationshipba(), null, "lstRelationshipba", null, 0, -1, DiagramClassba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packagebaEClass, Packageba.class, "Packageba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageba_Name(), ecorePackage.getEString(), "name", null, 0, 1, Packageba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageba_Path(), ecorePackage.getEString(), "path", null, 0, 1, Packageba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageba_ListPackages(), this.getPackageba(), null, "listPackages", null, 0, -1, Packageba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageba_LstClass(), this.getClassba(), null, "lstClass", null, 0, -1, Packageba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classbaEClass, Classba.class, "Classba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassba_Path(), ecorePackage.getEString(), "path", null, 0, 1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassba_LstAttributesba(), this.getAttributeba(), null, "lstAttributesba", null, 0, -1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassba_LstMethodba(), this.getMethodba(), null, "lstMethodba", null, 0, -1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassba_AccessModify(), this.getAccessModifyba(), "accessModify", null, 0, 1, Classba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractEClass, Abstract.class, "Abstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipbaEClass, Relationshipba.class, "Relationshipba", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipba_MultS(), ecorePackage.getEString(), "multS", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_MultT(), ecorePackage.getEString(), "multT", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_RolS(), ecorePackage.getEString(), "rolS", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipba_RolTS(), ecorePackage.getEString(), "rolTS", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipba_Source(), this.getClassba(), null, "source", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipba_Target(), this.getClassba(), null, "target", null, 0, 1, Relationshipba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentEClass, Containment.class, "Containment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clasifierEClass, Clasifier.class, "Clasifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClasifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Clasifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClasifier_LstAttributebaC(), this.getAttributeba(), null, "lstAttributebaC", null, 0, -1, Clasifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributebaEClass, Attributeba.class, "Attributeba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeba_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attributeba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeba_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Attributeba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeba_Classba(), this.getClassba(), null, "classba", null, 0, 1, Attributeba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeba_Type(), this.getClasifier(), null, "type", null, 0, 1, Attributeba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeba_AccessModify(), this.getAccessModifyba(), "accessModify", null, 0, 1, Attributeba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodbaEClass, Methodba.class, "Methodba", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodba_Name(), ecorePackage.getEString(), "name", null, 0, 1, Methodba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodba_AccessModify(), this.getAccessModifyba(), "accessModify", null, 0, 1, Methodba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodba_Retorno(), this.getClasifier(), null, "retorno", null, 0, 1, Methodba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodba_Classba(), this.getClassba(), null, "classba", null, 0, 1, Methodba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodba_LstParametersba(), this.getParameter(), null, "lstParametersba", null, 0, -1, Methodba.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (diagramClassbaEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (packagebaEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.style", "solid",
			 "figure", "rectangle",
			 "color", "201,209,113"
		   });	
		addAnnotation
		  (classbaEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.style", "solid",
			 "figure", "rectangle",
			 "color", "201,209,113"
		   });	
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.style", "solid",
			 "figure", "rectangle",
			 "color", "119,104,71"
		   });	
		addAnnotation
		  (abstractEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.style", "solid",
			 "figure", "rectangle",
			 "color", "106,112,230"
		   });	
		addAnnotation
		  (attributebaEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.style", "solid",
			 "figure", "rectangle",
			 "color", "201,209,113"
		   });	
		addAnnotation
		  (methodbaEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getClassba_LstAttributesba(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getClassba_LstMethodba(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });
	}

} //ConcretaPackageImpl