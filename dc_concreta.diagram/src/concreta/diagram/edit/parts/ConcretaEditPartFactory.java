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

			case InterfaceEditPart.VISUAL_ID:
				return new InterfaceEditPart(view);

			case InterfaceNameEditPart.VISUAL_ID:
				return new InterfaceNameEditPart(view);

			case AbstractEditPart.VISUAL_ID:
				return new AbstractEditPart(view);

			case AbstractNameEditPart.VISUAL_ID:
				return new AbstractNameEditPart(view);

			case ClassbaEditPart.VISUAL_ID:
				return new ClassbaEditPart(view);

			case ClassbaNameEditPart.VISUAL_ID:
				return new ClassbaNameEditPart(view);

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

			case InterfaceInterfaceLstAttributesbaCompartmentEditPart.VISUAL_ID:
				return new InterfaceInterfaceLstAttributesbaCompartmentEditPart(view);

			case InterfaceInterfaceLstMethodbaCompartmentEditPart.VISUAL_ID:
				return new InterfaceInterfaceLstMethodbaCompartmentEditPart(view);

			case AbstractAbstractLstAttributesbaCompartmentEditPart.VISUAL_ID:
				return new AbstractAbstractLstAttributesbaCompartmentEditPart(view);

			case AbstractAbstractLstMethodbaCompartmentEditPart.VISUAL_ID:
				return new AbstractAbstractLstMethodbaCompartmentEditPart(view);

			case ClassbaClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
				return new ClassbaClassbaLstAttributesbaCompartmentEditPart(view);

			case ClassbaClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
				return new ClassbaClassbaLstMethodbaCompartmentEditPart(view);
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