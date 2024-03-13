/*
 * 
 */
package concreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import concreta.diagram.providers.ConcretaElementTypes;
import concreta.diagram.providers.ConcretaModelingAssistantProvider;

/**
 * @generated
 */
public class ConcretaModelingAssistantProviderOfDiagramClassbaEditPart extends ConcretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ConcretaElementTypes.Classba_2001);
		types.add(ConcretaElementTypes.AbsctractClassba_2002);
		types.add(ConcretaElementTypes.InterfaceClassba_2003);
		types.add(ConcretaElementTypes.Packageba_2004);
		return types;
	}

}
