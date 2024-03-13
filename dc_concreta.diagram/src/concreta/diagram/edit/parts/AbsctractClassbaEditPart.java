/*
 * 
 */
package concreta.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import concreta.diagram.edit.policies.AbsctractClassbaItemSemanticEditPolicy;
import concreta.diagram.edit.policies.OpenDiagramEditPolicy;
import concreta.diagram.part.ConcretaVisualIDRegistry;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class AbsctractClassbaEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2002;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public AbsctractClassbaEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(ConcretaVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AbsctractClassbaItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new AbsctractClassbaFigure();
	}

	/**
	* @generated
	*/
	public AbsctractClassbaFigure getPrimaryShape() {
		return (AbsctractClassbaFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AbsctractClassbaNameEditPart) {
			((AbsctractClassbaNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAbsctractClassbaLabelFigure());
			return true;
		}
		if (childEditPart instanceof AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbsctractClassbaLstAttributesbaCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbsctractClassbaLstMethodbaCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AbsctractClassbaNameEditPart) {
			return true;
		}
		if (childEditPart instanceof AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbsctractClassbaLstAttributesbaCompartmentFigure();
			pane.remove(
					((AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAbsctractClassbaLstMethodbaCompartmentFigure();
			pane.remove(((AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart) {
			return getPrimaryShape().getAbsctractClassbaLstAttributesbaCompartmentFigure();
		}
		if (editPart instanceof AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart) {
			return getPrimaryShape().getAbsctractClassbaLstMethodbaCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ConcretaVisualIDRegistry.getType(AbsctractClassbaNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == ConcretaElementTypes.Attributeba_3003) {
				return getChildBySemanticHint(ConcretaVisualIDRegistry
						.getType(AbsctractClassbaAbsctractClassbaLstAttributesbaCompartmentEditPart.VISUAL_ID));
			}
			if (type == ConcretaElementTypes.Methodba_3007) {
				return getChildBySemanticHint(ConcretaVisualIDRegistry
						.getType(AbsctractClassbaAbsctractClassbaLstMethodbaCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class AbsctractClassbaFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAbsctractClassbaLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAbsctractClassbaLstAttributesbaCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAbsctractClassbaLstMethodbaCompartmentFigure;

		/**
		 * @generated
		 */
		public AbsctractClassbaFigure() {
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAbsctractClassbaLabelFigure = new WrappingLabel();

			fFigureAbsctractClassbaLabelFigure.setText("AbsctractClassba");
			fFigureAbsctractClassbaLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureAbsctractClassbaLabelFigure);

			fAbsctractClassbaLstAttributesbaCompartmentFigure = new RectangleFigure();

			fAbsctractClassbaLstAttributesbaCompartmentFigure.setOutline(false);

			this.add(fAbsctractClassbaLstAttributesbaCompartmentFigure);

			fAbsctractClassbaLstMethodbaCompartmentFigure = new RectangleFigure();

			fAbsctractClassbaLstMethodbaCompartmentFigure.setOutline(false);

			this.add(fAbsctractClassbaLstMethodbaCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAbsctractClassbaLabelFigure() {
			return fFigureAbsctractClassbaLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAbsctractClassbaLstAttributesbaCompartmentFigure() {
			return fAbsctractClassbaLstAttributesbaCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAbsctractClassbaLstMethodbaCompartmentFigure() {
			return fAbsctractClassbaLstMethodbaCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 106, 112, 230);

}
