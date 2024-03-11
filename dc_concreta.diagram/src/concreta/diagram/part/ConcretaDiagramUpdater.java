/*
* 
*/
package concreta.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import concreta.Abstract;
import concreta.Aggregation;
import concreta.Association;
import concreta.Attributeba;
import concreta.Classba;
import concreta.ConcretaPackage;
import concreta.Containment;
import concreta.DiagramClassba;
import concreta.Generalization;
import concreta.Implementation;
import concreta.Interface;
import concreta.Methodba;
import concreta.Packageba;
import concreta.diagram.edit.parts.AbstractAbstractLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.AbstractAbstractLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.AbstractEditPart;
import concreta.diagram.edit.parts.AggregationEditPart;
import concreta.diagram.edit.parts.AssociationEditPart;
import concreta.diagram.edit.parts.AttributebaEditPart;
import concreta.diagram.edit.parts.ClassbaClassbaLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.ClassbaClassbaLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.ClassbaEditPart;
import concreta.diagram.edit.parts.ContainmentEditPart;
import concreta.diagram.edit.parts.DiagramClassbaEditPart;
import concreta.diagram.edit.parts.GeneralizationEditPart;
import concreta.diagram.edit.parts.ImplementationEditPart;
import concreta.diagram.edit.parts.InterfaceEditPart;
import concreta.diagram.edit.parts.InterfaceInterfaceLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.InterfaceInterfaceLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.MethodbaEditPart;
import concreta.diagram.edit.parts.PackagebaEditPart;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ConcretaDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getSemanticChildren(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case DiagramClassbaEditPart.VISUAL_ID:
			return getDiagramClassba_1000SemanticChildren(view);
		case InterfaceInterfaceLstAttributesbaCompartmentEditPart.VISUAL_ID:
			return getInterfaceInterfaceLstAttributesbaCompartment_7003SemanticChildren(view);
		case InterfaceInterfaceLstMethodbaCompartmentEditPart.VISUAL_ID:
			return getInterfaceInterfaceLstMethodbaCompartment_7004SemanticChildren(view);
		case AbstractAbstractLstAttributesbaCompartmentEditPart.VISUAL_ID:
			return getAbstractAbstractLstAttributesbaCompartment_7005SemanticChildren(view);
		case AbstractAbstractLstMethodbaCompartmentEditPart.VISUAL_ID:
			return getAbstractAbstractLstMethodbaCompartment_7006SemanticChildren(view);
		case ClassbaClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID:
			return getClassbaClassbaLstAttributesbaCompartment_7001SemanticChildren(view);
		case ClassbaClassbaLstMethodbaCompartmentEditPart.VISUAL_ID:
			return getClassbaClassbaLstMethodbaCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getDiagramClassba_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DiagramClassba modelElement = (DiagramClassba) view.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstClass().iterator(); it.hasNext();) {
			Classba childElement = (Classba) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InterfaceEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AbstractEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassbaEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLstPackageba().iterator(); it.hasNext();) {
			Packageba childElement = (Packageba) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PackagebaEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getInterfaceInterfaceLstAttributesbaCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Interface modelElement = (Interface) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAttributesba().iterator(); it.hasNext();) {
			Attributeba childElement = (Attributeba) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributebaEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getInterfaceInterfaceLstMethodbaCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Interface modelElement = (Interface) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstMethodba().iterator(); it.hasNext();) {
			Methodba childElement = (Methodba) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MethodbaEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getAbstractAbstractLstAttributesbaCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Abstract modelElement = (Abstract) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAttributesba().iterator(); it.hasNext();) {
			Attributeba childElement = (Attributeba) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributebaEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getAbstractAbstractLstMethodbaCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Abstract modelElement = (Abstract) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstMethodba().iterator(); it.hasNext();) {
			Methodba childElement = (Methodba) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MethodbaEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getClassbaClassbaLstAttributesbaCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Classba modelElement = (Classba) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAttributesba().iterator(); it.hasNext();) {
			Attributeba childElement = (Attributeba) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributebaEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getClassbaClassbaLstMethodbaCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Classba modelElement = (Classba) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstMethodba().iterator(); it.hasNext();) {
			Methodba childElement = (Methodba) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MethodbaEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getContainedLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case DiagramClassbaEditPart.VISUAL_ID:
			return getDiagramClassba_1000ContainedLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2002ContainedLinks(view);
		case AbstractEditPart.VISUAL_ID:
			return getAbstract_2003ContainedLinks(view);
		case ClassbaEditPart.VISUAL_ID:
			return getClassba_2001ContainedLinks(view);
		case PackagebaEditPart.VISUAL_ID:
			return getPackageba_2004ContainedLinks(view);
		case AttributebaEditPart.VISUAL_ID:
			return getAttributeba_3001ContainedLinks(view);
		case MethodbaEditPart.VISUAL_ID:
			return getMethodba_3002ContainedLinks(view);
		case ContainmentEditPart.VISUAL_ID:
			return getContainment_4001ContainedLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4002ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4004ContainedLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getIncomingLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2002IncomingLinks(view);
		case AbstractEditPart.VISUAL_ID:
			return getAbstract_2003IncomingLinks(view);
		case ClassbaEditPart.VISUAL_ID:
			return getClassba_2001IncomingLinks(view);
		case PackagebaEditPart.VISUAL_ID:
			return getPackageba_2004IncomingLinks(view);
		case AttributebaEditPart.VISUAL_ID:
			return getAttributeba_3001IncomingLinks(view);
		case MethodbaEditPart.VISUAL_ID:
			return getMethodba_3002IncomingLinks(view);
		case ContainmentEditPart.VISUAL_ID:
			return getContainment_4001IncomingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4002IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4004IncomingLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2002OutgoingLinks(view);
		case AbstractEditPart.VISUAL_ID:
			return getAbstract_2003OutgoingLinks(view);
		case ClassbaEditPart.VISUAL_ID:
			return getClassba_2001OutgoingLinks(view);
		case PackagebaEditPart.VISUAL_ID:
			return getPackageba_2004OutgoingLinks(view);
		case AttributebaEditPart.VISUAL_ID:
			return getAttributeba_3001OutgoingLinks(view);
		case MethodbaEditPart.VISUAL_ID:
			return getMethodba_3002OutgoingLinks(view);
		case ContainmentEditPart.VISUAL_ID:
			return getContainment_4001OutgoingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4002OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4004OutgoingLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getDiagramClassba_1000ContainedLinks(View view) {
		DiagramClassba modelElement = (DiagramClassba) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Containment_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_4005(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getInterface_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAbstract_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClassba_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getPackageba_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getAttributeba_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMethodba_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getContainment_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAggregation_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAssociation_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getGeneralization_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getImplementation_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getInterface_2002IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Containment_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4005(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAbstract_2003IncomingLinks(View view) {
		Abstract modelElement = (Abstract) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Containment_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClassba_2001IncomingLinks(View view) {
		Classba modelElement = (Classba) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Containment_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4005(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getPackageba_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getAttributeba_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMethodba_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getContainment_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAggregation_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAssociation_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getGeneralization_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getImplementation_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getInterface_2002OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Containment_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4005(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAbstract_2003OutgoingLinks(View view) {
		Abstract modelElement = (Abstract) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Containment_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClassba_2001OutgoingLinks(View view) {
		Classba modelElement = (Classba) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Containment_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4005(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getPackageba_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getAttributeba_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMethodba_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getContainment_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAggregation_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAssociation_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getGeneralization_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getImplementation_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_Containment_4001(
			DiagramClassba container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationshipba().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Containment) {
				continue;
			}
			Containment link = (Containment) linkObject;
			if (ContainmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba dst = link.getTarget();
			Classba src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Containment_4001,
					ContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_Aggregation_4002(
			DiagramClassba container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationshipba().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba dst = link.getTarget();
			Classba src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Aggregation_4002,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_Association_4003(
			DiagramClassba container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationshipba().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba dst = link.getTarget();
			Classba src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_Generalization_4004(
			DiagramClassba container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationshipba().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba dst = link.getTarget();
			Classba src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Generalization_4004,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_Implementation_4005(
			DiagramClassba container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationshipba().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) linkObject;
			if (ImplementationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba dst = link.getTarget();
			Classba src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Implementation_4005,
					ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Containment_4001(Classba target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getRelationshipba_Target()
					|| false == setting.getEObject() instanceof Containment) {
				continue;
			}
			Containment link = (Containment) setting.getEObject();
			if (ContainmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.Containment_4001,
					ContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Aggregation_4002(Classba target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getRelationshipba_Target()
					|| false == setting.getEObject() instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) setting.getEObject();
			if (AggregationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.Aggregation_4002,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4003(Classba target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getRelationshipba_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Generalization_4004(Classba target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getRelationshipba_Target()
					|| false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (GeneralizationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.Generalization_4004,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_Implementation_4005(Classba target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getRelationshipba_Target()
					|| false == setting.getEObject() instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) setting.getEObject();
			if (ImplementationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.Implementation_4005,
					ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Containment_4001(Classba source) {
		DiagramClassba container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DiagramClassba) {
				container = (DiagramClassba) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationshipba().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Containment) {
				continue;
			}
			Containment link = (Containment) linkObject;
			if (ContainmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba dst = link.getTarget();
			Classba src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Containment_4001,
					ContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Aggregation_4002(Classba source) {
		DiagramClassba container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DiagramClassba) {
				container = (DiagramClassba) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationshipba().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba dst = link.getTarget();
			Classba src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Aggregation_4002,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4003(Classba source) {
		DiagramClassba container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DiagramClassba) {
				container = (DiagramClassba) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationshipba().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba dst = link.getTarget();
			Classba src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Generalization_4004(
			Classba source) {
		DiagramClassba container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DiagramClassba) {
				container = (DiagramClassba) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationshipba().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba dst = link.getTarget();
			Classba src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Generalization_4004,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_Implementation_4005(
			Classba source) {
		DiagramClassba container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof DiagramClassba) {
				container = (DiagramClassba) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelationshipba().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) linkObject;
			if (ImplementationEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classba dst = link.getTarget();
			Classba src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.Implementation_4005,
					ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ConcretaNodeDescriptor> getSemanticChildren(View view) {
			return ConcretaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getContainedLinks(View view) {
			return ConcretaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getIncomingLinks(View view) {
			return ConcretaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getOutgoingLinks(View view) {
			return ConcretaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
