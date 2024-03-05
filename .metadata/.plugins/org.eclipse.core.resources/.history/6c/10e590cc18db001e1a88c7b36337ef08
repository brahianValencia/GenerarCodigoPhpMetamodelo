/*
* 
*/
package concreta.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import concreta.Abstract;
import concreta.Attributeba;
import concreta.Classba;
import concreta.DiagramClassba;
import concreta.Interface;
import concreta.Methodba;
import concreta.Packageba;
import concreta.diagram.edit.parts.AbstractAbstractLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.AbstractAbstractLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.AbstractEditPart;
import concreta.diagram.edit.parts.AttributebaEditPart;
import concreta.diagram.edit.parts.ClassbaClassbaLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.ClassbaClassbaLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.ClassbaEditPart;
import concreta.diagram.edit.parts.DiagramClassbaEditPart;
import concreta.diagram.edit.parts.InterfaceEditPart;
import concreta.diagram.edit.parts.InterfaceInterfaceLstAttributesbaCompartmentEditPart;
import concreta.diagram.edit.parts.InterfaceInterfaceLstMethodbaCompartmentEditPart;
import concreta.diagram.edit.parts.MethodbaEditPart;
import concreta.diagram.edit.parts.PackagebaEditPart;

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
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getDiagramClassba_1000ContainedLinks(View view) {
		return Collections.emptyList();
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
	public static List<ConcretaLinkDescriptor> getInterface_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAbstract_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClassba_2001IncomingLinks(View view) {
		return Collections.emptyList();
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
	public static List<ConcretaLinkDescriptor> getInterface_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getAbstract_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getClassba_2001OutgoingLinks(View view) {
		return Collections.emptyList();
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
