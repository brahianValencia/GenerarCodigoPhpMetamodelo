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
import concreta.diagram.edit.parts.AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.AbsctractClassbaEditPart;
import concreta.diagram.edit.parts.AbsctractClassbaNameEditPart;
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
import concreta.diagram.edit.parts.Attributeba2EditPart;
import concreta.diagram.edit.parts.Attributeba3EditPart;
import concreta.diagram.edit.parts.AttributebaEditPart;
import concreta.diagram.edit.parts.AttributebaName2EditPart;
import concreta.diagram.edit.parts.AttributebaName3EditPart;
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
import concreta.diagram.edit.parts.InterfaceClassbaEditPart;
import concreta.diagram.edit.parts.InterfaceClassbaInterfaceClassbaLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.InterfaceClassbaInterfaceClassbaLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.InterfaceClassbaNameEditPart;
import concreta.diagram.edit.parts.Methodba2EditPart;
import concreta.diagram.edit.parts.MethodbaEditPart;
import concreta.diagram.edit.parts.MethodbaMethodbaLstParametersbaCompartment2EditPart;
import concreta.diagram.edit.parts.MethodbaMethodbaLstParametersbaCompartmentEditPart;
import concreta.diagram.edit.parts.MethodbaName2EditPart;
import concreta.diagram.edit.parts.MethodbaNameEditPart;
import concreta.diagram.edit.parts.Operationba2EditPart;
import concreta.diagram.edit.parts.OperationbaEditPart;
import concreta.diagram.edit.parts.OperationbaName2EditPart;
import concreta.diagram.edit.parts.OperationbaNameEditPart;
import concreta.diagram.edit.parts.OperationbaOperationbaLstParametersbaCompartmentEditPart;
import concreta.diagram.edit.parts.PackagebaEditPart;
import concreta.diagram.edit.parts.PackagebaNameEditPart;
import concreta.diagram.edit.parts.Parameter2EditPart;
import concreta.diagram.edit.parts.ParameterEditPart;
import concreta.diagram.edit.parts.ParameterName2EditPart;
import concreta.diagram.edit.parts.ParameterNameEditPart;

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
			if (ConcretaPackage.eINSTANCE.getClassba().isSuperTypeOf(domainElement.eClass())) {
				return ClassbaEditPart.VISUAL_ID;
			}
			if (ConcretaPackage.eINSTANCE.getAbsctractClassba().isSuperTypeOf(domainElement.eClass())) {
				return AbsctractClassbaEditPart.VISUAL_ID;
			}
			if (ConcretaPackage.eINSTANCE.getInterfaceClassba().isSuperTypeOf(domainElement.eClass())) {
				return InterfaceClassbaEditPart.VISUAL_ID;
			}
			if (ConcretaPackage.eINSTANCE.getPackageba().isSuperTypeOf(domainElement.eClass())) {
				return PackagebaEditPart.VISUAL_ID;
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
		case MethodbaMethodbaLstParametersbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getAttributeba().isSuperTypeOf(domainElement.eClass())) {
				return Attributeba2EditPart.VISUAL_ID;
			}
			break;
		case AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMethodba().isSuperTypeOf(domainElement.eClass())) {
				return Methodba2EditPart.VISUAL_ID;
			}
			break;
		case MethodbaMethodbaLstParametersbaCompartment2EditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case InterfaceClassbaInterfaceClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getAttributeba().isSuperTypeOf(domainElement.eClass())) {
				return Attributeba3EditPart.VISUAL_ID;
			}
			break;
		case InterfaceClassbaInterfaceClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getOperationba().isSuperTypeOf(domainElement.eClass())) {
				return OperationbaEditPart.VISUAL_ID;
			}
			break;
		case OperationbaOperationbaLstParametersbaCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return Parameter2EditPart.VISUAL_ID;
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
			if (ClassbaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbsctractClassbaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceClassbaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagebaEditPart.VISUAL_ID == nodeVisualID) {
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
		case AbsctractClassbaEditPart.VISUAL_ID:
			if (AbsctractClassbaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceClassbaEditPart.VISUAL_ID:
			if (InterfaceClassbaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceClassbaInterfaceClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceClassbaInterfaceClassbaLstMethodbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
			if (MethodbaMethodbaLstParametersbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterEditPart.VISUAL_ID:
			if (ParameterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Attributeba2EditPart.VISUAL_ID:
			if (AttributebaName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Methodba2EditPart.VISUAL_ID:
			if (MethodbaName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MethodbaMethodbaLstParametersbaCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Attributeba3EditPart.VISUAL_ID:
			if (AttributebaName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationbaEditPart.VISUAL_ID:
			if (OperationbaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationbaOperationbaLstParametersbaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Parameter2EditPart.VISUAL_ID:
			if (ParameterName2EditPart.VISUAL_ID == nodeVisualID) {
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
		case MethodbaMethodbaLstParametersbaCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
			if (Attributeba2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
			if (Methodba2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodbaMethodbaLstParametersbaCompartment2EditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceClassbaInterfaceClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
			if (Attributeba3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceClassbaInterfaceClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
			if (OperationbaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationbaOperationbaLstParametersbaCompartmentEditPart.VISUAL_ID:
			if (Parameter2EditPart.VISUAL_ID == nodeVisualID) {
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
		case ClassbaClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
		case ClassbaClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
		case MethodbaMethodbaLstParametersbaCompartmentEditPart.VISUAL_ID:
		case AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
		case AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
		case MethodbaMethodbaLstParametersbaCompartment2EditPart.VISUAL_ID:
		case InterfaceClassbaInterfaceClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
		case InterfaceClassbaInterfaceClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
		case OperationbaOperationbaLstParametersbaCompartmentEditPart.VISUAL_ID:
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
		case Attributeba2EditPart.VISUAL_ID:
		case Attributeba3EditPart.VISUAL_ID:
		case ParameterEditPart.VISUAL_ID:
		case Parameter2EditPart.VISUAL_ID:
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
