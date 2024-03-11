/*
 * 
 */
package concreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import concreta.diagram.edit.parts.AbstractEditPart;
import concreta.diagram.edit.parts.ClassbaEditPart;
import concreta.diagram.edit.parts.InterfaceEditPart;
import concreta.diagram.providers.ConcretaElementTypes;
import concreta.diagram.providers.ConcretaModelingAssistantProvider;

/**
 * @generated
 */
public class ConcretaModelingAssistantProviderOfClassbaEditPart extends ConcretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcretaElementTypes.Attributeba_3001);
		types.add(ConcretaElementTypes.Methodba_3002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ClassbaEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ClassbaEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ConcretaElementTypes.Containment_4001);
		types.add(ConcretaElementTypes.Aggregation_4002);
		types.add(ConcretaElementTypes.Association_4003);
		types.add(ConcretaElementTypes.Generalization_4004);
		types.add(ConcretaElementTypes.Implementation_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ClassbaEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ClassbaEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ConcretaElementTypes.Containment_4001);
		}
		if (targetEditPart instanceof AbstractEditPart) {
			types.add(ConcretaElementTypes.Containment_4001);
		}
		if (targetEditPart instanceof ClassbaEditPart) {
			types.add(ConcretaElementTypes.Containment_4001);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ConcretaElementTypes.Aggregation_4002);
		}
		if (targetEditPart instanceof AbstractEditPart) {
			types.add(ConcretaElementTypes.Aggregation_4002);
		}
		if (targetEditPart instanceof ClassbaEditPart) {
			types.add(ConcretaElementTypes.Aggregation_4002);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ConcretaElementTypes.Association_4003);
		}
		if (targetEditPart instanceof AbstractEditPart) {
			types.add(ConcretaElementTypes.Association_4003);
		}
		if (targetEditPart instanceof ClassbaEditPart) {
			types.add(ConcretaElementTypes.Association_4003);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ConcretaElementTypes.Generalization_4004);
		}
		if (targetEditPart instanceof AbstractEditPart) {
			types.add(ConcretaElementTypes.Generalization_4004);
		}
		if (targetEditPart instanceof ClassbaEditPart) {
			types.add(ConcretaElementTypes.Generalization_4004);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ConcretaElementTypes.Implementation_4005);
		}
		if (targetEditPart instanceof AbstractEditPart) {
			types.add(ConcretaElementTypes.Implementation_4005);
		}
		if (targetEditPart instanceof ClassbaEditPart) {
			types.add(ConcretaElementTypes.Implementation_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ClassbaEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ClassbaEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcretaElementTypes.Containment_4001) {
			types.add(ConcretaElementTypes.Interface_2002);
			types.add(ConcretaElementTypes.Abstract_2003);
			types.add(ConcretaElementTypes.Classba_2001);
		} else if (relationshipType == ConcretaElementTypes.Aggregation_4002) {
			types.add(ConcretaElementTypes.Interface_2002);
			types.add(ConcretaElementTypes.Abstract_2003);
			types.add(ConcretaElementTypes.Classba_2001);
		} else if (relationshipType == ConcretaElementTypes.Association_4003) {
			types.add(ConcretaElementTypes.Interface_2002);
			types.add(ConcretaElementTypes.Abstract_2003);
			types.add(ConcretaElementTypes.Classba_2001);
		} else if (relationshipType == ConcretaElementTypes.Generalization_4004) {
			types.add(ConcretaElementTypes.Interface_2002);
			types.add(ConcretaElementTypes.Abstract_2003);
			types.add(ConcretaElementTypes.Classba_2001);
		} else if (relationshipType == ConcretaElementTypes.Implementation_4005) {
			types.add(ConcretaElementTypes.Interface_2002);
			types.add(ConcretaElementTypes.Abstract_2003);
			types.add(ConcretaElementTypes.Classba_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ClassbaEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ClassbaEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ConcretaElementTypes.Containment_4001);
		types.add(ConcretaElementTypes.Aggregation_4002);
		types.add(ConcretaElementTypes.Association_4003);
		types.add(ConcretaElementTypes.Generalization_4004);
		types.add(ConcretaElementTypes.Implementation_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ClassbaEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ClassbaEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcretaElementTypes.Containment_4001) {
			types.add(ConcretaElementTypes.Interface_2002);
			types.add(ConcretaElementTypes.Abstract_2003);
			types.add(ConcretaElementTypes.Classba_2001);
		} else if (relationshipType == ConcretaElementTypes.Aggregation_4002) {
			types.add(ConcretaElementTypes.Interface_2002);
			types.add(ConcretaElementTypes.Abstract_2003);
			types.add(ConcretaElementTypes.Classba_2001);
		} else if (relationshipType == ConcretaElementTypes.Association_4003) {
			types.add(ConcretaElementTypes.Interface_2002);
			types.add(ConcretaElementTypes.Abstract_2003);
			types.add(ConcretaElementTypes.Classba_2001);
		} else if (relationshipType == ConcretaElementTypes.Generalization_4004) {
			types.add(ConcretaElementTypes.Interface_2002);
			types.add(ConcretaElementTypes.Abstract_2003);
			types.add(ConcretaElementTypes.Classba_2001);
		} else if (relationshipType == ConcretaElementTypes.Implementation_4005) {
			types.add(ConcretaElementTypes.Interface_2002);
			types.add(ConcretaElementTypes.Abstract_2003);
			types.add(ConcretaElementTypes.Classba_2001);
		}
		return types;
	}

}
