/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.AttributebaCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ClassbaClassbaLstAttributesbaCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassbaClassbaLstAttributesbaCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.Classba_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Attributeba_3001 == req.getElementType()) {
			return getGEFWrapper(new AttributebaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
