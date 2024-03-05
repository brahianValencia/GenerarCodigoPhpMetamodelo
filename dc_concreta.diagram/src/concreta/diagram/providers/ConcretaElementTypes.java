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
import concreta.diagram.edit.parts.AbstractEditPart;
import concreta.diagram.edit.parts.AggregationEditPart;
import concreta.diagram.edit.parts.AssociationEditPart;
import concreta.diagram.edit.parts.AttributebaEditPart;
import concreta.diagram.edit.parts.ClassbaEditPart;
import concreta.diagram.edit.parts.ContainmentEditPart;
import concreta.diagram.edit.parts.DiagramClassbaEditPart;
import concreta.diagram.edit.parts.GeneralizationEditPart;
import concreta.diagram.edit.parts.InterfaceEditPart;
import concreta.diagram.edit.parts.MethodbaEditPart;
import concreta.diagram.edit.parts.PackagebaEditPart;
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
	public static final IElementType Interface_2002 = getElementType("dc_concreta.diagram.Interface_2002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Abstract_2003 = getElementType("dc_concreta.diagram.Abstract_2003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Classba_2001 = getElementType("dc_concreta.diagram.Classba_2001"); //$NON-NLS-1$
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

			elements.put(Interface_2002, ConcretaPackage.eINSTANCE.getInterface());

			elements.put(Abstract_2003, ConcretaPackage.eINSTANCE.getAbstract());

			elements.put(Classba_2001, ConcretaPackage.eINSTANCE.getClassba());

			elements.put(Packageba_2004, ConcretaPackage.eINSTANCE.getPackageba());

			elements.put(Attributeba_3001, ConcretaPackage.eINSTANCE.getAttributeba());

			elements.put(Methodba_3002, ConcretaPackage.eINSTANCE.getMethodba());

			elements.put(Containment_4001, ConcretaPackage.eINSTANCE.getContainment());

			elements.put(Aggregation_4002, ConcretaPackage.eINSTANCE.getAggregation());

			elements.put(Association_4003, ConcretaPackage.eINSTANCE.getAssociation());

			elements.put(Generalization_4004, ConcretaPackage.eINSTANCE.getGeneralization());
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
			KNOWN_ELEMENT_TYPES.add(Interface_2002);
			KNOWN_ELEMENT_TYPES.add(Abstract_2003);
			KNOWN_ELEMENT_TYPES.add(Classba_2001);
			KNOWN_ELEMENT_TYPES.add(Packageba_2004);
			KNOWN_ELEMENT_TYPES.add(Attributeba_3001);
			KNOWN_ELEMENT_TYPES.add(Methodba_3002);
			KNOWN_ELEMENT_TYPES.add(Containment_4001);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4002);
			KNOWN_ELEMENT_TYPES.add(Association_4003);
			KNOWN_ELEMENT_TYPES.add(Generalization_4004);
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
		case InterfaceEditPart.VISUAL_ID:
			return Interface_2002;
		case AbstractEditPart.VISUAL_ID:
			return Abstract_2003;
		case ClassbaEditPart.VISUAL_ID:
			return Classba_2001;
		case PackagebaEditPart.VISUAL_ID:
			return Packageba_2004;
		case AttributebaEditPart.VISUAL_ID:
			return Attributeba_3001;
		case MethodbaEditPart.VISUAL_ID:
			return Methodba_3002;
		case ContainmentEditPart.VISUAL_ID:
			return Containment_4001;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_4002;
		case AssociationEditPart.VISUAL_ID:
			return Association_4003;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_4004;
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
