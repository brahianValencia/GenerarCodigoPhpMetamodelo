/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import concreta.diagram.edit.commands.Parameter2CreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class OperationbaOperationbaLstParametersbaCompartmentItemSemanticEditPolicy
		extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public OperationbaOperationbaLstParametersbaCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.Operationba_3006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Parameter_3009 == req.getElementType()) {
			return getGEFWrapper(new Parameter2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
