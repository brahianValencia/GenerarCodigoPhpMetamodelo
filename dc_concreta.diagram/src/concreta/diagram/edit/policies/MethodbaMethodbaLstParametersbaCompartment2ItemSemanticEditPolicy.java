/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import concreta.diagram.edit.commands.ParameterCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class MethodbaMethodbaLstParametersbaCompartment2ItemSemanticEditPolicy
		extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MethodbaMethodbaLstParametersbaCompartment2ItemSemanticEditPolicy() {
		super(ConcretaElementTypes.Methodba_3007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.Parameter_3008 == req.getElementType()) {
			return getGEFWrapper(new ParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
