/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.Methodba2CreateCommand;
import concreta.diagram.edit.commands.OperationbaCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentItemSemanticEditPolicy
		extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.AbsctractClassba_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Methodba_3007 == req.getElementType()) {
			return getGEFWrapper(new Methodba2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
