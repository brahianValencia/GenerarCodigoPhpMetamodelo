/**
 */
package concreta;

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
 * @see concreta.ConcretaFactory
 * @model kind="package"
 * @generated
 */
public interface ConcretaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concreta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://concreta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concreta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcretaPackage eINSTANCE = concreta.impl.ConcretaPackageImpl.init();

	/**
	 * The meta object id for the '{@link concreta.impl.ModelFactoryConcretaImpl <em>Model Factory Concreta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.ModelFactoryConcretaImpl
	 * @see concreta.impl.ConcretaPackageImpl#getModelFactoryConcreta()
	 * @generated
	 */
	int MODEL_FACTORY_CONCRETA = 0;

	/**
	 * The feature id for the '<em><b>Lst Projectba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_CONCRETA__LST_PROJECTBA = 0;

	/**
	 * The feature id for the '<em><b>Lst Clasifierba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_CONCRETA__LST_CLASIFIERBA = 1;

	/**
	 * The number of structural features of the '<em>Model Factory Concreta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_CONCRETA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link concreta.impl.ProjectbaImpl <em>Projectba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.ProjectbaImpl
	 * @see concreta.impl.ConcretaPackageImpl#getProjectba()
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
	 * The feature id for the '<em><b>Lst Diagram Classba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTBA__LST_DIAGRAM_CLASSBA = 2;

	/**
	 * The number of structural features of the '<em>Projectba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTBA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link concreta.impl.DiagramClassbaImpl <em>Diagram Classba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.DiagramClassbaImpl
	 * @see concreta.impl.ConcretaPackageImpl#getDiagramClassba()
	 * @generated
	 */
	int DIAGRAM_CLASSBA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CLASSBA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CLASSBA__PATH = 1;

	/**
	 * The feature id for the '<em><b>Lst Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CLASSBA__LST_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Lst Packageba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CLASSBA__LST_PACKAGEBA = 3;

	/**
	 * The feature id for the '<em><b>Lst Relationshipba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CLASSBA__LST_RELATIONSHIPBA = 4;

	/**
	 * The number of structural features of the '<em>Diagram Classba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CLASSBA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link concreta.impl.PackagebaImpl <em>Packageba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.PackagebaImpl
	 * @see concreta.impl.ConcretaPackageImpl#getPackageba()
	 * @generated
	 */
	int PACKAGEBA = 3;

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
	 * The meta object id for the '{@link concreta.impl.ClasifierImpl <em>Clasifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.ClasifierImpl
	 * @see concreta.impl.ConcretaPackageImpl#getClasifier()
	 * @generated
	 */
	int CLASIFIER = 12;

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
	 * The meta object id for the '{@link concreta.impl.ClassbaImpl <em>Classba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.ClassbaImpl
	 * @see concreta.impl.ConcretaPackageImpl#getClassba()
	 * @generated
	 */
	int CLASSBA = 4;

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
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__PATH = CLASIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lst Attributesba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__LST_ATTRIBUTESBA = CLASIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lst Methodba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__LST_METHODBA = CLASIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA__ACCESS_MODIFY = CLASIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSBA_FEATURE_COUNT = CLASIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link concreta.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.InterfaceImpl
	 * @see concreta.impl.ConcretaPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = CLASSBA__NAME;

	/**
	 * The feature id for the '<em><b>Lst Attributeba C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__LST_ATTRIBUTEBA_C = CLASSBA__LST_ATTRIBUTEBA_C;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PATH = CLASSBA__PATH;

	/**
	 * The feature id for the '<em><b>Lst Attributesba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__LST_ATTRIBUTESBA = CLASSBA__LST_ATTRIBUTESBA;

	/**
	 * The feature id for the '<em><b>Lst Methodba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__LST_METHODBA = CLASSBA__LST_METHODBA;

	/**
	 * The feature id for the '<em><b>Access Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ACCESS_MODIFY = CLASSBA__ACCESS_MODIFY;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CLASSBA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link concreta.impl.AbstractImpl <em>Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.AbstractImpl
	 * @see concreta.impl.ConcretaPackageImpl#getAbstract()
	 * @generated
	 */
	int ABSTRACT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__NAME = CLASSBA__NAME;

	/**
	 * The feature id for the '<em><b>Lst Attributeba C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__LST_ATTRIBUTEBA_C = CLASSBA__LST_ATTRIBUTEBA_C;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__PATH = CLASSBA__PATH;

	/**
	 * The feature id for the '<em><b>Lst Attributesba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__LST_ATTRIBUTESBA = CLASSBA__LST_ATTRIBUTESBA;

	/**
	 * The feature id for the '<em><b>Lst Methodba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__LST_METHODBA = CLASSBA__LST_METHODBA;

	/**
	 * The feature id for the '<em><b>Access Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ACCESS_MODIFY = CLASSBA__ACCESS_MODIFY;

	/**
	 * The number of structural features of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_COUNT = CLASSBA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link concreta.impl.RelationshipbaImpl <em>Relationshipba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.RelationshipbaImpl
	 * @see concreta.impl.ConcretaPackageImpl#getRelationshipba()
	 * @generated
	 */
	int RELATIONSHIPBA = 7;

	/**
	 * The feature id for the '<em><b>Mult S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__MULT_S = 0;

	/**
	 * The feature id for the '<em><b>Mult T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__MULT_T = 1;

	/**
	 * The feature id for the '<em><b>Rol S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__ROL_S = 2;

	/**
	 * The feature id for the '<em><b>Rol TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__ROL_TS = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA__TARGET = 5;

	/**
	 * The number of structural features of the '<em>Relationshipba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPBA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link concreta.impl.ContainmentImpl <em>Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.ContainmentImpl
	 * @see concreta.impl.ConcretaPackageImpl#getContainment()
	 * @generated
	 */
	int CONTAINMENT = 8;

	/**
	 * The feature id for the '<em><b>Mult S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__MULT_S = RELATIONSHIPBA__MULT_S;

	/**
	 * The feature id for the '<em><b>Mult T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__MULT_T = RELATIONSHIPBA__MULT_T;

	/**
	 * The feature id for the '<em><b>Rol S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__ROL_S = RELATIONSHIPBA__ROL_S;

	/**
	 * The feature id for the '<em><b>Rol TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__ROL_TS = RELATIONSHIPBA__ROL_TS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__SOURCE = RELATIONSHIPBA__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__TARGET = RELATIONSHIPBA__TARGET;

	/**
	 * The number of structural features of the '<em>Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_FEATURE_COUNT = RELATIONSHIPBA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link concreta.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.AggregationImpl
	 * @see concreta.impl.ConcretaPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 9;

	/**
	 * The feature id for the '<em><b>Mult S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__MULT_S = RELATIONSHIPBA__MULT_S;

	/**
	 * The feature id for the '<em><b>Mult T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__MULT_T = RELATIONSHIPBA__MULT_T;

	/**
	 * The feature id for the '<em><b>Rol S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__ROL_S = RELATIONSHIPBA__ROL_S;

	/**
	 * The feature id for the '<em><b>Rol TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__ROL_TS = RELATIONSHIPBA__ROL_TS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE = RELATIONSHIPBA__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET = RELATIONSHIPBA__TARGET;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = RELATIONSHIPBA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link concreta.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.AssociationImpl
	 * @see concreta.impl.ConcretaPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 10;

	/**
	 * The feature id for the '<em><b>Mult S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MULT_S = RELATIONSHIPBA__MULT_S;

	/**
	 * The feature id for the '<em><b>Mult T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MULT_T = RELATIONSHIPBA__MULT_T;

	/**
	 * The feature id for the '<em><b>Rol S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ROL_S = RELATIONSHIPBA__ROL_S;

	/**
	 * The feature id for the '<em><b>Rol TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ROL_TS = RELATIONSHIPBA__ROL_TS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = RELATIONSHIPBA__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = RELATIONSHIPBA__TARGET;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = RELATIONSHIPBA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link concreta.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.GeneralizationImpl
	 * @see concreta.impl.ConcretaPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 11;

	/**
	 * The feature id for the '<em><b>Mult S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__MULT_S = RELATIONSHIPBA__MULT_S;

	/**
	 * The feature id for the '<em><b>Mult T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__MULT_T = RELATIONSHIPBA__MULT_T;

	/**
	 * The feature id for the '<em><b>Rol S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__ROL_S = RELATIONSHIPBA__ROL_S;

	/**
	 * The feature id for the '<em><b>Rol TS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__ROL_TS = RELATIONSHIPBA__ROL_TS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = RELATIONSHIPBA__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = RELATIONSHIPBA__TARGET;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = RELATIONSHIPBA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link concreta.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.PrimitiveDataTypeImpl
	 * @see concreta.impl.ConcretaPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 13;

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
	 * The meta object id for the '{@link concreta.impl.AttributebaImpl <em>Attributeba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.AttributebaImpl
	 * @see concreta.impl.ConcretaPackageImpl#getAttributeba()
	 * @generated
	 */
	int ATTRIBUTEBA = 14;

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
	 * The feature id for the '<em><b>Access Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEBA__ACCESS_MODIFY = 4;

	/**
	 * The number of structural features of the '<em>Attributeba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEBA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link concreta.impl.MethodbaImpl <em>Methodba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MethodbaImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMethodba()
	 * @generated
	 */
	int METHODBA = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Access Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA__ACCESS_MODIFY = 1;

	/**
	 * The feature id for the '<em><b>Retorno</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA__RETORNO = 2;

	/**
	 * The feature id for the '<em><b>Classba</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA__CLASSBA = 3;

	/**
	 * The feature id for the '<em><b>Lst Parametersba</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA__LST_PARAMETERSBA = 4;

	/**
	 * The number of structural features of the '<em>Methodba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODBA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link concreta.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.ParameterImpl
	 * @see concreta.impl.ConcretaPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

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
	 * The meta object id for the '{@link concreta.AccessModifyba <em>Access Modifyba</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.AccessModifyba
	 * @see concreta.impl.ConcretaPackageImpl#getAccessModifyba()
	 * @generated
	 */
	int ACCESS_MODIFYBA = 17;


	/**
	 * Returns the meta object for class '{@link concreta.ModelFactoryConcreta <em>Model Factory Concreta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Concreta</em>'.
	 * @see concreta.ModelFactoryConcreta
	 * @generated
	 */
	EClass getModelFactoryConcreta();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.ModelFactoryConcreta#getLstProjectba <em>Lst Projectba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Projectba</em>'.
	 * @see concreta.ModelFactoryConcreta#getLstProjectba()
	 * @see #getModelFactoryConcreta()
	 * @generated
	 */
	EReference getModelFactoryConcreta_LstProjectba();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.ModelFactoryConcreta#getLstClasifierba <em>Lst Clasifierba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Clasifierba</em>'.
	 * @see concreta.ModelFactoryConcreta#getLstClasifierba()
	 * @see #getModelFactoryConcreta()
	 * @generated
	 */
	EReference getModelFactoryConcreta_LstClasifierba();

	/**
	 * Returns the meta object for class '{@link concreta.Projectba <em>Projectba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projectba</em>'.
	 * @see concreta.Projectba
	 * @generated
	 */
	EClass getProjectba();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Projectba#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concreta.Projectba#getName()
	 * @see #getProjectba()
	 * @generated
	 */
	EAttribute getProjectba_Name();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Projectba#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concreta.Projectba#getPath()
	 * @see #getProjectba()
	 * @generated
	 */
	EAttribute getProjectba_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.Projectba#getLstDiagramClassba <em>Lst Diagram Classba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Diagram Classba</em>'.
	 * @see concreta.Projectba#getLstDiagramClassba()
	 * @see #getProjectba()
	 * @generated
	 */
	EReference getProjectba_LstDiagramClassba();

	/**
	 * Returns the meta object for class '{@link concreta.DiagramClassba <em>Diagram Classba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Classba</em>'.
	 * @see concreta.DiagramClassba
	 * @generated
	 */
	EClass getDiagramClassba();

	/**
	 * Returns the meta object for the attribute '{@link concreta.DiagramClassba#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concreta.DiagramClassba#getName()
	 * @see #getDiagramClassba()
	 * @generated
	 */
	EAttribute getDiagramClassba_Name();

	/**
	 * Returns the meta object for the attribute '{@link concreta.DiagramClassba#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concreta.DiagramClassba#getPath()
	 * @see #getDiagramClassba()
	 * @generated
	 */
	EAttribute getDiagramClassba_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.DiagramClassba#getLstClass <em>Lst Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Class</em>'.
	 * @see concreta.DiagramClassba#getLstClass()
	 * @see #getDiagramClassba()
	 * @generated
	 */
	EReference getDiagramClassba_LstClass();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.DiagramClassba#getLstPackageba <em>Lst Packageba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Packageba</em>'.
	 * @see concreta.DiagramClassba#getLstPackageba()
	 * @see #getDiagramClassba()
	 * @generated
	 */
	EReference getDiagramClassba_LstPackageba();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.DiagramClassba#getLstRelationshipba <em>Lst Relationshipba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Relationshipba</em>'.
	 * @see concreta.DiagramClassba#getLstRelationshipba()
	 * @see #getDiagramClassba()
	 * @generated
	 */
	EReference getDiagramClassba_LstRelationshipba();

	/**
	 * Returns the meta object for class '{@link concreta.Packageba <em>Packageba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packageba</em>'.
	 * @see concreta.Packageba
	 * @generated
	 */
	EClass getPackageba();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Packageba#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concreta.Packageba#getName()
	 * @see #getPackageba()
	 * @generated
	 */
	EAttribute getPackageba_Name();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Packageba#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concreta.Packageba#getPath()
	 * @see #getPackageba()
	 * @generated
	 */
	EAttribute getPackageba_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.Packageba#getListPackages <em>List Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Packages</em>'.
	 * @see concreta.Packageba#getListPackages()
	 * @see #getPackageba()
	 * @generated
	 */
	EReference getPackageba_ListPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.Packageba#getLstClass <em>Lst Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Class</em>'.
	 * @see concreta.Packageba#getLstClass()
	 * @see #getPackageba()
	 * @generated
	 */
	EReference getPackageba_LstClass();

	/**
	 * Returns the meta object for class '{@link concreta.Classba <em>Classba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classba</em>'.
	 * @see concreta.Classba
	 * @generated
	 */
	EClass getClassba();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Classba#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concreta.Classba#getPath()
	 * @see #getClassba()
	 * @generated
	 */
	EAttribute getClassba_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.Classba#getLstAttributesba <em>Lst Attributesba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attributesba</em>'.
	 * @see concreta.Classba#getLstAttributesba()
	 * @see #getClassba()
	 * @generated
	 */
	EReference getClassba_LstAttributesba();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.Classba#getLstMethodba <em>Lst Methodba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Methodba</em>'.
	 * @see concreta.Classba#getLstMethodba()
	 * @see #getClassba()
	 * @generated
	 */
	EReference getClassba_LstMethodba();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Classba#getAccessModify <em>Access Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modify</em>'.
	 * @see concreta.Classba#getAccessModify()
	 * @see #getClassba()
	 * @generated
	 */
	EAttribute getClassba_AccessModify();

	/**
	 * Returns the meta object for class '{@link concreta.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see concreta.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link concreta.Abstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract</em>'.
	 * @see concreta.Abstract
	 * @generated
	 */
	EClass getAbstract();

	/**
	 * Returns the meta object for class '{@link concreta.Relationshipba <em>Relationshipba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationshipba</em>'.
	 * @see concreta.Relationshipba
	 * @generated
	 */
	EClass getRelationshipba();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Relationshipba#getMultS <em>Mult S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult S</em>'.
	 * @see concreta.Relationshipba#getMultS()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_MultS();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Relationshipba#getMultT <em>Mult T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult T</em>'.
	 * @see concreta.Relationshipba#getMultT()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_MultT();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Relationshipba#getRolS <em>Rol S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol S</em>'.
	 * @see concreta.Relationshipba#getRolS()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_RolS();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Relationshipba#getRolTS <em>Rol TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol TS</em>'.
	 * @see concreta.Relationshipba#getRolTS()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EAttribute getRelationshipba_RolTS();

	/**
	 * Returns the meta object for the reference '{@link concreta.Relationshipba#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concreta.Relationshipba#getSource()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EReference getRelationshipba_Source();

	/**
	 * Returns the meta object for the reference '{@link concreta.Relationshipba#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concreta.Relationshipba#getTarget()
	 * @see #getRelationshipba()
	 * @generated
	 */
	EReference getRelationshipba_Target();

	/**
	 * Returns the meta object for class '{@link concreta.Containment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment</em>'.
	 * @see concreta.Containment
	 * @generated
	 */
	EClass getContainment();

	/**
	 * Returns the meta object for class '{@link concreta.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see concreta.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link concreta.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see concreta.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for class '{@link concreta.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see concreta.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for class '{@link concreta.Clasifier <em>Clasifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clasifier</em>'.
	 * @see concreta.Clasifier
	 * @generated
	 */
	EClass getClasifier();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Clasifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concreta.Clasifier#getName()
	 * @see #getClasifier()
	 * @generated
	 */
	EAttribute getClasifier_Name();

	/**
	 * Returns the meta object for the reference list '{@link concreta.Clasifier#getLstAttributebaC <em>Lst Attributeba C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Attributeba C</em>'.
	 * @see concreta.Clasifier#getLstAttributebaC()
	 * @see #getClasifier()
	 * @generated
	 */
	EReference getClasifier_LstAttributebaC();

	/**
	 * Returns the meta object for class '{@link concreta.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see concreta.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link concreta.Attributeba <em>Attributeba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributeba</em>'.
	 * @see concreta.Attributeba
	 * @generated
	 */
	EClass getAttributeba();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Attributeba#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concreta.Attributeba#getName()
	 * @see #getAttributeba()
	 * @generated
	 */
	EAttribute getAttributeba_Name();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Attributeba#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see concreta.Attributeba#getDefaultValue()
	 * @see #getAttributeba()
	 * @generated
	 */
	EAttribute getAttributeba_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link concreta.Attributeba#getClassba <em>Classba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classba</em>'.
	 * @see concreta.Attributeba#getClassba()
	 * @see #getAttributeba()
	 * @generated
	 */
	EReference getAttributeba_Classba();

	/**
	 * Returns the meta object for the reference '{@link concreta.Attributeba#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see concreta.Attributeba#getType()
	 * @see #getAttributeba()
	 * @generated
	 */
	EReference getAttributeba_Type();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Attributeba#getAccessModify <em>Access Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modify</em>'.
	 * @see concreta.Attributeba#getAccessModify()
	 * @see #getAttributeba()
	 * @generated
	 */
	EAttribute getAttributeba_AccessModify();

	/**
	 * Returns the meta object for class '{@link concreta.Methodba <em>Methodba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methodba</em>'.
	 * @see concreta.Methodba
	 * @generated
	 */
	EClass getMethodba();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Methodba#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concreta.Methodba#getName()
	 * @see #getMethodba()
	 * @generated
	 */
	EAttribute getMethodba_Name();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Methodba#getAccessModify <em>Access Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modify</em>'.
	 * @see concreta.Methodba#getAccessModify()
	 * @see #getMethodba()
	 * @generated
	 */
	EAttribute getMethodba_AccessModify();

	/**
	 * Returns the meta object for the containment reference '{@link concreta.Methodba#getRetorno <em>Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retorno</em>'.
	 * @see concreta.Methodba#getRetorno()
	 * @see #getMethodba()
	 * @generated
	 */
	EReference getMethodba_Retorno();

	/**
	 * Returns the meta object for the reference '{@link concreta.Methodba#getClassba <em>Classba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classba</em>'.
	 * @see concreta.Methodba#getClassba()
	 * @see #getMethodba()
	 * @generated
	 */
	EReference getMethodba_Classba();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.Methodba#getLstParametersba <em>Lst Parametersba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Parametersba</em>'.
	 * @see concreta.Methodba#getLstParametersba()
	 * @see #getMethodba()
	 * @generated
	 */
	EReference getMethodba_LstParametersba();

	/**
	 * Returns the meta object for class '{@link concreta.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see concreta.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link concreta.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concreta.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link concreta.Parameter#getMethodba <em>Methodba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Methodba</em>'.
	 * @see concreta.Parameter#getMethodba()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Methodba();

	/**
	 * Returns the meta object for the reference '{@link concreta.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see concreta.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for enum '{@link concreta.AccessModifyba <em>Access Modifyba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Modifyba</em>'.
	 * @see concreta.AccessModifyba
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
	ConcretaFactory getConcretaFactory();

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
		 * The meta object literal for the '{@link concreta.impl.ModelFactoryConcretaImpl <em>Model Factory Concreta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.ModelFactoryConcretaImpl
		 * @see concreta.impl.ConcretaPackageImpl#getModelFactoryConcreta()
		 * @generated
		 */
		EClass MODEL_FACTORY_CONCRETA = eINSTANCE.getModelFactoryConcreta();

		/**
		 * The meta object literal for the '<em><b>Lst Projectba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_CONCRETA__LST_PROJECTBA = eINSTANCE.getModelFactoryConcreta_LstProjectba();

		/**
		 * The meta object literal for the '<em><b>Lst Clasifierba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_CONCRETA__LST_CLASIFIERBA = eINSTANCE.getModelFactoryConcreta_LstClasifierba();

		/**
		 * The meta object literal for the '{@link concreta.impl.ProjectbaImpl <em>Projectba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.ProjectbaImpl
		 * @see concreta.impl.ConcretaPackageImpl#getProjectba()
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
		 * The meta object literal for the '<em><b>Lst Diagram Classba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTBA__LST_DIAGRAM_CLASSBA = eINSTANCE.getProjectba_LstDiagramClassba();

		/**
		 * The meta object literal for the '{@link concreta.impl.DiagramClassbaImpl <em>Diagram Classba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.DiagramClassbaImpl
		 * @see concreta.impl.ConcretaPackageImpl#getDiagramClassba()
		 * @generated
		 */
		EClass DIAGRAM_CLASSBA = eINSTANCE.getDiagramClassba();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_CLASSBA__NAME = eINSTANCE.getDiagramClassba_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_CLASSBA__PATH = eINSTANCE.getDiagramClassba_Path();

		/**
		 * The meta object literal for the '<em><b>Lst Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_CLASSBA__LST_CLASS = eINSTANCE.getDiagramClassba_LstClass();

		/**
		 * The meta object literal for the '<em><b>Lst Packageba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_CLASSBA__LST_PACKAGEBA = eINSTANCE.getDiagramClassba_LstPackageba();

		/**
		 * The meta object literal for the '<em><b>Lst Relationshipba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_CLASSBA__LST_RELATIONSHIPBA = eINSTANCE.getDiagramClassba_LstRelationshipba();

		/**
		 * The meta object literal for the '{@link concreta.impl.PackagebaImpl <em>Packageba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.PackagebaImpl
		 * @see concreta.impl.ConcretaPackageImpl#getPackageba()
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
		 * The meta object literal for the '{@link concreta.impl.ClassbaImpl <em>Classba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.ClassbaImpl
		 * @see concreta.impl.ConcretaPackageImpl#getClassba()
		 * @generated
		 */
		EClass CLASSBA = eINSTANCE.getClassba();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSBA__PATH = eINSTANCE.getClassba_Path();

		/**
		 * The meta object literal for the '<em><b>Lst Attributesba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSBA__LST_ATTRIBUTESBA = eINSTANCE.getClassba_LstAttributesba();

		/**
		 * The meta object literal for the '<em><b>Lst Methodba</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSBA__LST_METHODBA = eINSTANCE.getClassba_LstMethodba();

		/**
		 * The meta object literal for the '<em><b>Access Modify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSBA__ACCESS_MODIFY = eINSTANCE.getClassba_AccessModify();

		/**
		 * The meta object literal for the '{@link concreta.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.InterfaceImpl
		 * @see concreta.impl.ConcretaPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link concreta.impl.AbstractImpl <em>Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.AbstractImpl
		 * @see concreta.impl.ConcretaPackageImpl#getAbstract()
		 * @generated
		 */
		EClass ABSTRACT = eINSTANCE.getAbstract();

		/**
		 * The meta object literal for the '{@link concreta.impl.RelationshipbaImpl <em>Relationshipba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.RelationshipbaImpl
		 * @see concreta.impl.ConcretaPackageImpl#getRelationshipba()
		 * @generated
		 */
		EClass RELATIONSHIPBA = eINSTANCE.getRelationshipba();

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
		 * The meta object literal for the '<em><b>Rol TS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPBA__ROL_TS = eINSTANCE.getRelationshipba_RolTS();

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
		 * The meta object literal for the '{@link concreta.impl.ContainmentImpl <em>Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.ContainmentImpl
		 * @see concreta.impl.ConcretaPackageImpl#getContainment()
		 * @generated
		 */
		EClass CONTAINMENT = eINSTANCE.getContainment();

		/**
		 * The meta object literal for the '{@link concreta.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.AggregationImpl
		 * @see concreta.impl.ConcretaPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link concreta.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.AssociationImpl
		 * @see concreta.impl.ConcretaPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '{@link concreta.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.GeneralizationImpl
		 * @see concreta.impl.ConcretaPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '{@link concreta.impl.ClasifierImpl <em>Clasifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.ClasifierImpl
		 * @see concreta.impl.ConcretaPackageImpl#getClasifier()
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
		 * The meta object literal for the '{@link concreta.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.PrimitiveDataTypeImpl
		 * @see concreta.impl.ConcretaPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '{@link concreta.impl.AttributebaImpl <em>Attributeba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.AttributebaImpl
		 * @see concreta.impl.ConcretaPackageImpl#getAttributeba()
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
		 * The meta object literal for the '<em><b>Access Modify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEBA__ACCESS_MODIFY = eINSTANCE.getAttributeba_AccessModify();

		/**
		 * The meta object literal for the '{@link concreta.impl.MethodbaImpl <em>Methodba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MethodbaImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMethodba()
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
		 * The meta object literal for the '<em><b>Access Modify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODBA__ACCESS_MODIFY = eINSTANCE.getMethodba_AccessModify();

		/**
		 * The meta object literal for the '<em><b>Retorno</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link concreta.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.ParameterImpl
		 * @see concreta.impl.ConcretaPackageImpl#getParameter()
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
		 * The meta object literal for the '{@link concreta.AccessModifyba <em>Access Modifyba</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.AccessModifyba
		 * @see concreta.impl.ConcretaPackageImpl#getAccessModifyba()
		 * @generated
		 */
		EEnum ACCESS_MODIFYBA = eINSTANCE.getAccessModifyba();

	}

} //ConcretaPackage