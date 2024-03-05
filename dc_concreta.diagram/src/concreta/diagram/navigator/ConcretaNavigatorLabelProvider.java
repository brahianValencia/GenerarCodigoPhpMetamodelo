/*
* 
*/
package concreta.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import concreta.DiagramClassba;
import concreta.diagram.edit.parts.AbstractEditPart;
import concreta.diagram.edit.parts.AbstractNameEditPart;
import concreta.diagram.edit.parts.AttributebaEditPart;
import concreta.diagram.edit.parts.AttributebaNameEditPart;
import concreta.diagram.edit.parts.ClassbaEditPart;
import concreta.diagram.edit.parts.ClassbaNameEditPart;
import concreta.diagram.edit.parts.DiagramClassbaEditPart;
import concreta.diagram.edit.parts.InterfaceEditPart;
import concreta.diagram.edit.parts.InterfaceNameEditPart;
import concreta.diagram.edit.parts.MethodbaEditPart;
import concreta.diagram.edit.parts.MethodbaNameEditPart;
import concreta.diagram.edit.parts.PackagebaEditPart;
import concreta.diagram.edit.parts.PackagebaNameEditPart;
import concreta.diagram.part.ConcretaDiagramEditorPlugin;
import concreta.diagram.part.ConcretaVisualIDRegistry;
import concreta.diagram.providers.ConcretaElementTypes;
import concreta.diagram.providers.ConcretaParserProvider;

/**
 * @generated
 */
public class ConcretaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ConcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConcretaNavigatorItem && !isOwnView(((ConcretaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) element;
			return ConcretaDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case DiagramClassbaEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://concreta?DiagramClassba", //$NON-NLS-1$
					ConcretaElementTypes.DiagramClassba_1000);
		case ClassbaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://concreta?Classba", ConcretaElementTypes.Classba_2001); //$NON-NLS-1$
		case InterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://concreta?Interface", ConcretaElementTypes.Interface_2002); //$NON-NLS-1$
		case AbstractEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://concreta?Abstract", ConcretaElementTypes.Abstract_2003); //$NON-NLS-1$
		case PackagebaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://concreta?Packageba", ConcretaElementTypes.Packageba_2004); //$NON-NLS-1$
		case AttributebaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://concreta?Attributeba", ConcretaElementTypes.Attributeba_3001); //$NON-NLS-1$
		case MethodbaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://concreta?Methodba", ConcretaElementTypes.Methodba_3002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConcretaDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ConcretaElementTypes.isKnownElementType(elementType)) {
			image = ConcretaElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case DiagramClassbaEditPart.VISUAL_ID:
			return getDiagramClassba_1000Text(view);
		case ClassbaEditPart.VISUAL_ID:
			return getClassba_2001Text(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2002Text(view);
		case AbstractEditPart.VISUAL_ID:
			return getAbstract_2003Text(view);
		case PackagebaEditPart.VISUAL_ID:
			return getPackageba_2004Text(view);
		case AttributebaEditPart.VISUAL_ID:
			return getAttributeba_3001Text(view);
		case MethodbaEditPart.VISUAL_ID:
			return getMethodba_3002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getDiagramClassba_1000Text(View view) {
		DiagramClassba domainModelElement = (DiagramClassba) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassba_2001Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Classba_2001,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(ClassbaNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInterface_2002Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Interface_2002,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(InterfaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAbstract_2003Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Abstract_2003,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(AbstractNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPackageba_2004Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Packageba_2004,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(PackagebaNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttributeba_3001Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Attributeba_3001,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(AttributebaNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMethodba_3002Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.Methodba_3002,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(MethodbaNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return DiagramClassbaEditPart.MODEL_ID.equals(ConcretaVisualIDRegistry.getModelID(view));
	}

}