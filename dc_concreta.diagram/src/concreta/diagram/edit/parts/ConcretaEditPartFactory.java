/*
 * 
 */
package concreta.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConcretaVisualIDRegistry.getVisualID(view)) {

			case DiagramClassbaEditPart.VISUAL_ID:
				return new DiagramClassbaEditPart(view);

			case ClassbaEditPart.VISUAL_ID:
				return new ClassbaEditPart(view);

			case ClassbaNameEditPart.VISUAL_ID:
				return new ClassbaNameEditPart(view);

			case AbsctractClassbaEditPart.VISUAL_ID:
				return new AbsctractClassbaEditPart(view);

			case AbsctractClassbaNameEditPart.VISUAL_ID:
				return new AbsctractClassbaNameEditPart(view);

			case InterfaceClassbaEditPart.VISUAL_ID:
				return new InterfaceClassbaEditPart(view);

			case InterfaceClassbaNameEditPart.VISUAL_ID:
				return new InterfaceClassbaNameEditPart(view);

			case PackagebaEditPart.VISUAL_ID:
				return new PackagebaEditPart(view);

			case PackagebaNameEditPart.VISUAL_ID:
				return new PackagebaNameEditPart(view);

			case AttributebaEditPart.VISUAL_ID:
				return new AttributebaEditPart(view);

			case AttributebaNameEditPart.VISUAL_ID:
				return new AttributebaNameEditPart(view);

			case MethodbaEditPart.VISUAL_ID:
				return new MethodbaEditPart(view);

			case MethodbaNameEditPart.VISUAL_ID:
				return new MethodbaNameEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case ParameterNameEditPart.VISUAL_ID:
				return new ParameterNameEditPart(view);

			case Attributeba2EditPart.VISUAL_ID:
				return new Attributeba2EditPart(view);

			case AttributebaName2EditPart.VISUAL_ID:
				return new AttributebaName2EditPart(view);

			case Methodba2EditPart.VISUAL_ID:
				return new Methodba2EditPart(view);

			case MethodbaName2EditPart.VISUAL_ID:
				return new MethodbaName2EditPart(view);

			case Attributeba3EditPart.VISUAL_ID:
				return new Attributeba3EditPart(view);

			case AttributebaName3EditPart.VISUAL_ID:
				return new AttributebaName3EditPart(view);

			case OperationbaEditPart.VISUAL_ID:
				return new OperationbaEditPart(view);

			case OperationbaNameEditPart.VISUAL_ID:
				return new OperationbaNameEditPart(view);

			case Parameter2EditPart.VISUAL_ID:
				return new Parameter2EditPart(view);

			case ParameterName2EditPart.VISUAL_ID:
				return new ParameterName2EditPart(view);

			case ClassbaClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
				return new ClassbaClassbaLstAttributesbaCompartmentEditPart(view);

			case ClassbaClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
				return new ClassbaClassbaLstMethodbaCompartmentEditPart(view);

			case MethodbaMethodbaLstParametersbaCompartmentEditPart.VISUAL_ID:
				return new MethodbaMethodbaLstParametersbaCompartmentEditPart(view);

			case AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
				return new AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart(view);

			case AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
				return new AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart(view);

			case MethodbaMethodbaLstParametersbaCompartment2EditPart.VISUAL_ID:
				return new MethodbaMethodbaLstParametersbaCompartment2EditPart(view);

			case InterfaceClassbaInterfaceClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
				return new InterfaceClassbaInterfaceClassbaLstAttributesbaCompartmentEditPart(view);

			case InterfaceClassbaInterfaceClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
				return new InterfaceClassbaInterfaceClassbaLstMethodbaCompartmentEditPart(view);

			case OperationbaOperationbaLstParametersbaCompartmentEditPart.VISUAL_ID:
				return new OperationbaOperationbaLstParametersbaCompartmentEditPart(view);

			case ContainmentEditPart.VISUAL_ID:
				return new ContainmentEditPart(view);

			case ContainmentRolSEditPart.VISUAL_ID:
				return new ContainmentRolSEditPart(view);

			case ContainmentMultSEditPart.VISUAL_ID:
				return new ContainmentMultSEditPart(view);

			case ContainmentRolTEditPart.VISUAL_ID:
				return new ContainmentRolTEditPart(view);

			case ContainmentMultTEditPart.VISUAL_ID:
				return new ContainmentMultTEditPart(view);

			case AggregationEditPart.VISUAL_ID:
				return new AggregationEditPart(view);

			case AggregationRolSEditPart.VISUAL_ID:
				return new AggregationRolSEditPart(view);

			case AggregationMultSEditPart.VISUAL_ID:
				return new AggregationMultSEditPart(view);

			case AggregationRolTEditPart.VISUAL_ID:
				return new AggregationRolTEditPart(view);

			case AggregationMultTEditPart.VISUAL_ID:
				return new AggregationMultTEditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case AssociationRolSEditPart.VISUAL_ID:
				return new AssociationRolSEditPart(view);

			case AssociationMultSEditPart.VISUAL_ID:
				return new AssociationMultSEditPart(view);

			case AssociationRolTEditPart.VISUAL_ID:
				return new AssociationRolTEditPart(view);

			case AssociationMultTEditPart.VISUAL_ID:
				return new AssociationMultTEditPart(view);

			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

			case ImplementationEditPart.VISUAL_ID:
				return new ImplementationEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
