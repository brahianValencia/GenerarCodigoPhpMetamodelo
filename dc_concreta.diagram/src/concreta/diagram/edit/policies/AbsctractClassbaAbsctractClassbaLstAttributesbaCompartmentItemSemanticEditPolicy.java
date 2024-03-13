/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.Attributeba2CreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentItemSemanticEditPolicy
		extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.AbsctractClassba_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Attributeba_3003 == req.getElementType()) {
			return getGEFWrapper(new Attributeba2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
