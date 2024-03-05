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
public class AbstractAbstractLstMethodbaCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AbstractAbstractLstMethodbaCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.Abstract_2003);
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
