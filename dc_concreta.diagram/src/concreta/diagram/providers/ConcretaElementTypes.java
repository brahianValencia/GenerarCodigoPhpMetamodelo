/*
 * 
 */
package concreta.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import concreta.ConcretaPackage;
import concreta.diagram.edit.parts.AbsctractClassbaEditPart;
import concreta.diagram.edit.parts.AggregationEditPart;
import concreta.diagram.edit.parts.AssociationEditPart;
import concreta.diagram.edit.parts.Attributeba2EditPart;
import concreta.diagram.edit.parts.Attributeba3EditPart;
import concreta.diagram.edit.parts.AttributebaEditPart;
import concreta.diagram.edit.parts.ClassbaEditPart;
import concreta.diagram.edit.parts.ContainmentEditPart;
import concreta.diagram.edit.parts.DiagramClassbaEditPart;
import concreta.diagram.edit.parts.GeneralizationEditPart;
import concreta.diagram.edit.parts.ImplementationEditPart;
import concreta.diagram.edit.parts.InterfaceClassbaEditPart;
import concreta.diagram.edit.parts.Methodba2EditPart;
import concreta.diagram.edit.parts.MethodbaEditPart;
import concreta.diagram.edit.parts.Operationba2EditPart;
import concreta.diagram.edit.parts.OperationbaEditPart;
import concreta.diagram.edit.parts.PackagebaEditPart;
import concreta.diagram.edit.parts.Parameter2EditPart;
import concreta.diagram.edit.parts.ParameterEditPart;
import concreta.diagram.part.ConcretaDiagramEditorPlugin;

/**
 * @generated
 */
public class ConcretaElementTypes {

	/**
	* @generated
	*/
	private ConcretaElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ConcretaDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType DiagramClassba_1000 = getElementType("dc_concreta.diagram.DiagramClassba_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Classba_2001 = getElementType("dc_concreta.diagram.Classba_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AbsctractClassba_2002 = getElementType(
			"dc_concreta.diagram.AbsctractClassba_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InterfaceClassba_2003 = getElementType(
			"dc_concreta.diagram.InterfaceClassba_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Packageba_2004 = getElementType("dc_concreta.diagram.Packageba_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attributeba_3001 = getElementType("dc_concreta.diagram.Attributeba_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Methodba_3002 = getElementType("dc_concreta.diagram.Methodba_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parameter_3008 = getElementType("dc_concreta.diagram.Parameter_3008"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Attributeba_3003 = getElementType("dc_concreta.diagram.Attributeba_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Methodba_3007 = getElementType("dc_concreta.diagram.Methodba_3007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Attributeba_3005 = getElementType("dc_concreta.diagram.Attributeba_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Operationba_3006 = getElementType("dc_concreta.diagram.Operationba_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parameter_3009 = getElementType("dc_concreta.diagram.Parameter_3009"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Containment_4001 = getElementType("dc_concreta.diagram.Containment_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Aggregation_4002 = getElementType("dc_concreta.diagram.Aggregation_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Association_4003 = getElementType("dc_concreta.diagram.Association_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Generalization_4004 = getElementType("dc_concreta.diagram.Generalization_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Implementation_4005 = getElementType("dc_concreta.diagram.Implementation_4005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(DiagramClassba_1000, ConcretaPackage.eINSTANCE.getDiagramClassba());

			elements.put(Classba_2001, ConcretaPackage.eINSTANCE.getClassba());

			elements.put(AbsctractClassba_2002, ConcretaPackage.eINSTANCE.getAbsctractClassba());

			elements.put(InterfaceClassba_2003, ConcretaPackage.eINSTANCE.getInterfaceClassba());

			elements.put(Packageba_2004, ConcretaPackage.eINSTANCE.getPackageba());

			elements.put(Attributeba_3001, ConcretaPackage.eINSTANCE.getAttributeba());

			elements.put(Methodba_3002, ConcretaPackage.eINSTANCE.getMethodba());

			elements.put(Parameter_3008, ConcretaPackage.eINSTANCE.getParameter());

			elements.put(Attributeba_3003, ConcretaPackage.eINSTANCE.getAttributeba());

			elements.put(Methodba_3007, ConcretaPackage.eINSTANCE.getMethodba());

			elements.put(Attributeba_3005, ConcretaPackage.eINSTANCE.getAttributeba());

			elements.put(Operationba_3006, ConcretaPackage.eINSTANCE.getOperationba());

			elements.put(Parameter_3009, ConcretaPackage.eINSTANCE.getParameter());

			elements.put(Containment_4001, ConcretaPackage.eINSTANCE.getContainment());

			elements.put(Aggregation_4002, ConcretaPackage.eINSTANCE.getAggregation());

			elements.put(Association_4003, ConcretaPackage.eINSTANCE.getAssociation());

			elements.put(Generalization_4004, ConcretaPackage.eINSTANCE.getGeneralization());

			elements.put(Implementation_4005, ConcretaPackage.eINSTANCE.getImplementation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(DiagramClassba_1000);
			KNOWN_ELEMENT_TYPES.add(Classba_2001);
			KNOWN_ELEMENT_TYPES.add(AbsctractClassba_2002);
			KNOWN_ELEMENT_TYPES.add(InterfaceClassba_2003);
			KNOWN_ELEMENT_TYPES.add(Packageba_2004);
			KNOWN_ELEMENT_TYPES.add(Attributeba_3001);
			KNOWN_ELEMENT_TYPES.add(Methodba_3002);
			KNOWN_ELEMENT_TYPES.add(Parameter_3008);
			KNOWN_ELEMENT_TYPES.add(Attributeba_3003);
			KNOWN_ELEMENT_TYPES.add(Methodba_3007);
			KNOWN_ELEMENT_TYPES.add(Attributeba_3005);
			KNOWN_ELEMENT_TYPES.add(Operationba_3006);
			KNOWN_ELEMENT_TYPES.add(Parameter_3009);
			KNOWN_ELEMENT_TYPES.add(Containment_4001);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4002);
			KNOWN_ELEMENT_TYPES.add(Association_4003);
			KNOWN_ELEMENT_TYPES.add(Generalization_4004);
			KNOWN_ELEMENT_TYPES.add(Implementation_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DiagramClassbaEditPart.VISUAL_ID:
			return DiagramClassba_1000;
		case ClassbaEditPart.VISUAL_ID:
			return Classba_2001;
		case AbsctractClassbaEditPart.VISUAL_ID:
			return AbsctractClassba_2002;
		case InterfaceClassbaEditPart.VISUAL_ID:
			return InterfaceClassba_2003;
		case PackagebaEditPart.VISUAL_ID:
			return Packageba_2004;
		case AttributebaEditPart.VISUAL_ID:
			return Attributeba_3001;
		case MethodbaEditPart.VISUAL_ID:
			return Methodba_3002;
		case ParameterEditPart.VISUAL_ID:
			return Parameter_3008;
		case Attributeba2EditPart.VISUAL_ID:
			return Attributeba_3003;
		case Methodba2EditPart.VISUAL_ID:
			return Methodba_3007;
		case Attributeba3EditPart.VISUAL_ID:
			return Attributeba_3005;
		case OperationbaEditPart.VISUAL_ID:
			return Operationba_3006;
		case Parameter2EditPart.VISUAL_ID:
			return Parameter_3009;
		case ContainmentEditPart.VISUAL_ID:
			return Containment_4001;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_4002;
		case AssociationEditPart.VISUAL_ID:
			return Association_4003;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_4004;
		case ImplementationEditPart.VISUAL_ID:
			return Implementation_4005;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return concreta.diagram.providers.ConcretaElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return concreta.diagram.providers.ConcretaElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return concreta.diagram.providers.ConcretaElementTypes.getElement(elementTypeAdapter);
		}
	};

}
