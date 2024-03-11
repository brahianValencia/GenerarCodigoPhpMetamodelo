/*
* 
*/
package concreta.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import concreta.ConcretaPackage;
import concreta.DiagramClassba;
import concreta.diagram.edit.parts.AbstractAbstractLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.AbstractAbstractLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.AbstractEditPart;
import concreta.diagram.edit.parts.AbstractNameEditPart;
import concreta.diagram.edit.parts.AggregationEditPart;
import concreta.diagram.edit.parts.AggregationMultSEditPart;
import concreta.diagram.edit.parts.AggregationMultTEditPart;
import concreta.diagram.edit.parts.AggregationRolSEditPart;
import concreta.diagram.edit.parts.AggregationRolTEditPart;
import concreta.diagram.edit.parts.AssociationEditPart;
import concreta.diagram.edit.parts.AssociationMultSEditPart;
import concreta.diagram.edit.parts.AssociationMultTEditPart;
import concreta.diagram.edit.parts.AssociationRolSEditPart;
import concreta.diagram.edit.parts.AssociationRolTEditPart;
import concreta.diagram.edit.parts.AttributebaEditPart;
import concreta.diagram.edit.parts.AttributebaNameEditPart;
import concreta.diagram.edit.parts.ClassbaClassbaLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.ClassbaClassbaLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.ClassbaEditPart;
import concreta.diagram.edit.parts.ClassbaNameEditPart;
import concreta.diagram.edit.parts.ContainmentEditPart;
import concreta.diagram.edit.parts.ContainmentMultSEditPart;
import concreta.diagram.edit.parts.ContainmentMultTEditPart;
import concreta.diagram.edit.parts.ContainmentRolSEditPart;
import concreta.diagram.edit.parts.ContainmentRolTEditPart;
import concreta.diagram.edit.parts.DiagramClassbaEditPart;
import concreta.diagram.edit.parts.GeneralizationEditPart;
import concreta.diagram.edit.parts.ImplementationEditPart;
import concreta.diagram.edit.parts.InterfaceEditPart;
import concreta.diagram.edit.parts.InterfaceInterfaceLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.InterfaceInterfaceLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.InterfaceNameEditPart;
import concreta.diagram.edit.parts.MethodbaEditPart;
import concreta.diagram.edit.parts.MethodbaNameEditPart;
import concreta.diagram.edit.parts.PackagebaEditPart;
import concreta.diagram.edit.parts.PackagebaNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ConcretaVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "dc_concreta.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DiagramClassbaEditPart.MODEL_ID.equals(view.getType())) {
				return DiagramClassbaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ConcretaDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretaPackage.eINSTANCE.getDiagramClassba().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((DiagramClassba) domainElement)) {
			return DiagramClassbaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(containerView);
		if (!DiagramClassbaEditPart.MODEL_ID.equals(containerModelID) && !"concreta".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DiagramClassbaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramClassbaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DiagramClassbaEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
				return InterfaceEditPart.VISUAL_ID;
			}
			if (ConcretaPackage.eINSTANCE.getAbstract().isSuperTypeOf(domainElement.eClass())) {
				return AbstractEditPart.VISUAL_ID;
			}
			if (ConcretaPackage.eINSTANCE.getClassba().isSuperTypeOf(domainElement.eClass())) {
				return ClassbaEditPart.VISUAL_ID;
			}
			if (ConcretaPackage.eINSTANCE.getPackageba().isSuperTypeOf(domainElement.eClass())) {
				return PackagebaEditPart.VISUAL_ID;
			}
			break;
		case InterfaceInterfaceLstAttributesbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getAttributeba().isSuperTypeOf(domainElement.eClass())) {
				return AttributebaEditPart.VISUAL_ID;
			}
			break;
		case InterfaceInterfaceLstMethodbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMethodba().isSuperTypeOf(domainElement.eClass())) {
				return MethodbaEditPart.VISUAL_ID;
			}
			break;
		case AbstractAbstractLstAttributesbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getAttributeba().isSuperTypeOf(domainElement.eClass())) {
				return AttributebaEditPart.VISUAL_ID;
			}
			break;
		case AbstractAbstractLstMethodbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMethodba().isSuperTypeOf(domainElement.eClass())) {
				return MethodbaEditPart.VISUAL_ID;
			}
			break;
		case ClassbaClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getAttributeba().isSuperTypeOf(domainElement.eClass())) {
				return AttributebaEditPart.VISUAL_ID;
			}
			break;
		case ClassbaClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMethodba().isSuperTypeOf(domainElement.eClass())) {
				return MethodbaEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(containerView);
		if (!DiagramClassbaEditPart.MODEL_ID.equals(containerModelID) && !"concreta".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DiagramClassbaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramClassbaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DiagramClassbaEditPart.VISUAL_ID:
			if (InterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassbaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagebaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceEditPart.VISUAL_ID:
			if (InterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceInterfaceLstAttributesbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceInterfaceLstMethodbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractEditPart.VISUAL_ID:
			if (AbstractNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractAbstractLstAttributesbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbstractAbstractLstMethodbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassbaEditPart.VISUAL_ID:
			if (ClassbaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassbaClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassbaClassbaLstMethodbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackagebaEditPart.VISUAL_ID:
			if (PackagebaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributebaEditPart.VISUAL_ID:
			if (AttributebaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodbaEditPart.VISUAL_ID:
			if (MethodbaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceInterfaceLstAttributesbaCompartmentEditPart.VISUAL_ID:
			if (AttributebaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceInterfaceLstMethodbaCompartmentEditPart.VISUAL_ID:
			if (MethodbaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractAbstractLstAttributesbaCompartmentEditPart.VISUAL_ID:
			if (AttributebaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbstractAbstractLstMethodbaCompartmentEditPart.VISUAL_ID:
			if (MethodbaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassbaClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
			if (AttributebaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassbaClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
			if (MethodbaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainmentEditPart.VISUAL_ID:
			if (ContainmentRolSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainmentMultSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainmentRolTEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainmentMultTEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregationEditPart.VISUAL_ID:
			if (AggregationRolSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationMultSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationRolTEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationMultTEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEditPart.VISUAL_ID:
			if (AssociationRolSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationMultSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationRolTEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationMultTEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretaPackage.eINSTANCE.getContainment().isSuperTypeOf(domainElement.eClass())) {
			return ContainmentEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getAggregation().isSuperTypeOf(domainElement.eClass())) {
			return AggregationEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElement.eClass())) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getImplementation().isSuperTypeOf(domainElement.eClass())) {
			return ImplementationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(DiagramClassba element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case InterfaceInterfaceLstAttributesbaCompartmentEditPart.VISUAL_ID:
		case InterfaceInterfaceLstMethodbaCompartmentEditPart.VISUAL_ID:
		case AbstractAbstractLstAttributesbaCompartmentEditPart.VISUAL_ID:
		case AbstractAbstractLstMethodbaCompartmentEditPart.VISUAL_ID:
		case ClassbaClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
		case ClassbaClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DiagramClassbaEditPart.VISUAL_ID:
			return false;
		case PackagebaEditPart.VISUAL_ID:
		case AttributebaEditPart.VISUAL_ID:
		case MethodbaEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
