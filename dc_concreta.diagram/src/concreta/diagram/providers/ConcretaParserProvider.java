/*
 * 
 */
package concreta.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import concreta.ConcretaPackage;
import concreta.diagram.edit.parts.AbstractNameEditPart;
import concreta.diagram.edit.parts.AttributebaNameEditPart;
import concreta.diagram.edit.parts.ClassbaNameEditPart;
import concreta.diagram.edit.parts.InterfaceNameEditPart;
import concreta.diagram.edit.parts.MethodbaNameEditPart;
import concreta.diagram.edit.parts.PackagebaNameEditPart;
import concreta.diagram.parsers.MessageFormatParser;
import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser interfaceName_5004Parser;

	/**
	* @generated
	*/
	private IParser getInterfaceName_5004Parser() {
		if (interfaceName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getClasifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interfaceName_5004Parser = parser;
		}
		return interfaceName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser abstractName_5005Parser;

	/**
	* @generated
	*/
	private IParser getAbstractName_5005Parser() {
		if (abstractName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getClasifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			abstractName_5005Parser = parser;
		}
		return abstractName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser classbaName_5003Parser;

	/**
	* @generated
	*/
	private IParser getClassbaName_5003Parser() {
		if (classbaName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getClasifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classbaName_5003Parser = parser;
		}
		return classbaName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser packagebaName_5006Parser;

	/**
	* @generated
	*/
	private IParser getPackagebaName_5006Parser() {
		if (packagebaName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getPackageba_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packagebaName_5006Parser = parser;
		}
		return packagebaName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser attributebaName_5001Parser;

	/**
	* @generated
	*/
	private IParser getAttributebaName_5001Parser() {
		if (attributebaName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getAttributeba_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributebaName_5001Parser = parser;
		}
		return attributebaName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser methodbaName_5002Parser;

	/**
	* @generated
	*/
	private IParser getMethodbaName_5002Parser() {
		if (methodbaName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getMethodba_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			methodbaName_5002Parser = parser;
		}
		return methodbaName_5002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case InterfaceNameEditPart.VISUAL_ID:
			return getInterfaceName_5004Parser();
		case AbstractNameEditPart.VISUAL_ID:
			return getAbstractName_5005Parser();
		case ClassbaNameEditPart.VISUAL_ID:
			return getClassbaName_5003Parser();
		case PackagebaNameEditPart.VISUAL_ID:
			return getPackagebaName_5006Parser();
		case AttributebaNameEditPart.VISUAL_ID:
			return getAttributebaName_5001Parser();
		case MethodbaNameEditPart.VISUAL_ID:
			return getMethodbaName_5002Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ConcretaVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ConcretaVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ConcretaElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}