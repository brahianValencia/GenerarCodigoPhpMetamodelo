/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.Operationba2CreateCommand;
import concreta.diagram.edit.commands.OperationbaCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class InterfaceClassbaInterfaceClassbaLstMethodbaCompartmentItemSemanticEditPolicy
		extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InterfaceClassbaInterfaceClassbaLstMethodbaCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.InterfaceClassba_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Operationba_3006 == req.getElementType()) {
			return getGEFWrapper(new OperationbaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
