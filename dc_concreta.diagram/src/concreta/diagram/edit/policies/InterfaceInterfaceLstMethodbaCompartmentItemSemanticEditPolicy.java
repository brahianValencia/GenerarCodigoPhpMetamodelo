/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.MethodbaCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class InterfaceInterfaceLstMethodbaCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InterfaceInterfaceLstMethodbaCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.Interface_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Methodba_3002 == req.getElementType()) {
			return getGEFWrapper(new MethodbaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
