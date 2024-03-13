/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.Attributeba3CreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class InterfaceClassbaInterfaceClassbaLstAttributesbaCompartmentItemSemanticEditPolicy
		extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InterfaceClassbaInterfaceClassbaLstAttributesbaCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.InterfaceClassba_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Attributeba_3005 == req.getElementType()) {
			return getGEFWrapper(new Attributeba3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
