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
import concreta.diagram.edit.parts.AbsctractClassbaNameEditPart;
import concreta.diagram.edit.parts.AggregationMultSEditPart;
import concreta.diagram.edit.parts.AggregationMultTEditPart;
import concreta.diagram.edit.parts.AggregationRolSEditPart;
import concreta.diagram.edit.parts.AggregationRolTEditPart;
import concreta.diagram.edit.parts.AssociationMultSEditPart;
import concreta.diagram.edit.parts.AssociationMultTEditPart;
import concreta.diagram.edit.parts.AssociationRolSEditPart;
import concreta.diagram.edit.parts.AssociationRolTEditPart;
import concreta.diagram.edit.parts.AttributebaName2EditPart;
import concreta.diagram.edit.parts.AttributebaName3EditPart;
import concreta.diagram.edit.parts.AttributebaNameEditPart;
import concreta.diagram.edit.parts.ClassbaNameEditPart;
import concreta.diagram.edit.parts.ContainmentMultSEditPart;
import concreta.diagram.edit.parts.ContainmentMultTEditPart;
import concreta.diagram.edit.parts.ContainmentRolSEditPart;
import concreta.diagram.edit.parts.ContainmentRolTEditPart;
import concreta.diagram.edit.parts.InterfaceClassbaNameEditPart;
import concreta.diagram.edit.parts.MethodbaName2EditPart;
import concreta.diagram.edit.parts.MethodbaNameEditPart;
import concreta.diagram.edit.parts.OperationbaName2EditPart;
import concreta.diagram.edit.parts.OperationbaNameEditPart;
import concreta.diagram.edit.parts.PackagebaNameEditPart;
import concreta.diagram.edit.parts.ParameterName2EditPart;
import concreta.diagram.edit.parts.ParameterNameEditPart;
import concreta.diagram.parsers.MessageFormatParser;
import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaParserProvider extends AbstractProvider implements IParserProvider {

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
	private IParser absctractClassbaName_5006Parser;

	/**
	* @generated
	*/
	private IParser getAbsctractClassbaName_5006Parser() {
		if (absctractClassbaName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getClasifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			absctractClassbaName_5006Parser = parser;
		}
		return absctractClassbaName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser interfaceClassbaName_5009Parser;

	/**
	* @generated
	*/
	private IParser getInterfaceClassbaName_5009Parser() {
		if (interfaceClassbaName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getClasifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interfaceClassbaName_5009Parser = parser;
		}
		return interfaceClassbaName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser packagebaName_5010Parser;

	/**
	* @generated
	*/
	private IParser getPackagebaName_5010Parser() {
		if (packagebaName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getPackageba_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packagebaName_5010Parser = parser;
		}
		return packagebaName_5010Parser;
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
	private IParser parameterName_5012Parser;

	/**
	* @generated
	*/
	private IParser getParameterName_5012Parser() {
		if (parameterName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parameterName_5012Parser = parser;
		}
		return parameterName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser attributebaName_5004Parser;

	/**
	* @generated
	*/
	private IParser getAttributebaName_5004Parser() {
		if (attributebaName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getAttributeba_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributebaName_5004Parser = parser;
		}
		return attributebaName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser methodbaName_5011Parser;

	/**
	* @generated
	*/
	private IParser getMethodbaName_5011Parser() {
		if (methodbaName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getMethodba_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			methodbaName_5011Parser = parser;
		}
		return methodbaName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser attributebaName_5007Parser;

	/**
	* @generated
	*/
	private IParser getAttributebaName_5007Parser() {
		if (attributebaName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getAttributeba_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributebaName_5007Parser = parser;
		}
		return attributebaName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser operationbaName_5008Parser;

	/**
	* @generated
	*/
	private IParser getOperationbaName_5008Parser() {
		if (operationbaName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getOperationba_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationbaName_5008Parser = parser;
		}
		return operationbaName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser parameterName_5013Parser;

	/**
	* @generated
	*/
	private IParser getParameterName_5013Parser() {
		if (parameterName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getParameter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parameterName_5013Parser = parser;
		}
		return parameterName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentRolS_6001Parser;

	/**
	* @generated
	*/
	private IParser getContainmentRolS_6001Parser() {
		if (containmentRolS_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_RolS() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentRolS_6001Parser = parser;
		}
		return containmentRolS_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentMultS_6002Parser;

	/**
	* @generated
	*/
	private IParser getContainmentMultS_6002Parser() {
		if (containmentMultS_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_MultS() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentMultS_6002Parser = parser;
		}
		return containmentMultS_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentRolT_6003Parser;

	/**
	* @generated
	*/
	private IParser getContainmentRolT_6003Parser() {
		if (containmentRolT_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_RolT() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentRolT_6003Parser = parser;
		}
		return containmentRolT_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentMultT_6004Parser;

	/**
	* @generated
	*/
	private IParser getContainmentMultT_6004Parser() {
		if (containmentMultT_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_MultT() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentMultT_6004Parser = parser;
		}
		return containmentMultT_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregationRolS_6005Parser;

	/**
	* @generated
	*/
	private IParser getAggregationRolS_6005Parser() {
		if (aggregationRolS_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_RolS() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationRolS_6005Parser = parser;
		}
		return aggregationRolS_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregationMultS_6006Parser;

	/**
	* @generated
	*/
	private IParser getAggregationMultS_6006Parser() {
		if (aggregationMultS_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_MultS() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationMultS_6006Parser = parser;
		}
		return aggregationMultS_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregationRolT_6007Parser;

	/**
	* @generated
	*/
	private IParser getAggregationRolT_6007Parser() {
		if (aggregationRolT_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_RolT() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationRolT_6007Parser = parser;
		}
		return aggregationRolT_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregationMultT_6008Parser;

	/**
	* @generated
	*/
	private IParser getAggregationMultT_6008Parser() {
		if (aggregationMultT_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_MultT() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationMultT_6008Parser = parser;
		}
		return aggregationMultT_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser associationRolS_6009Parser;

	/**
	* @generated
	*/
	private IParser getAssociationRolS_6009Parser() {
		if (associationRolS_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_RolS() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationRolS_6009Parser = parser;
		}
		return associationRolS_6009Parser;
	}

	/**
	* @generated
	*/
	private IParser associationMultS_6010Parser;

	/**
	* @generated
	*/
	private IParser getAssociationMultS_6010Parser() {
		if (associationMultS_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_MultS() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationMultS_6010Parser = parser;
		}
		return associationMultS_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser associationRolT_6011Parser;

	/**
	* @generated
	*/
	private IParser getAssociationRolT_6011Parser() {
		if (associationRolT_6011Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_RolT() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationRolT_6011Parser = parser;
		}
		return associationRolT_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser associationMultT_6012Parser;

	/**
	* @generated
	*/
	private IParser getAssociationMultT_6012Parser() {
		if (associationMultT_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretaPackage.eINSTANCE.getRelationshipba_MultT() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationMultT_6012Parser = parser;
		}
		return associationMultT_6012Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ClassbaNameEditPart.VISUAL_ID:
			return getClassbaName_5003Parser();
		case AbsctractClassbaNameEditPart.VISUAL_ID:
			return getAbsctractClassbaName_5006Parser();
		case InterfaceClassbaNameEditPart.VISUAL_ID:
			return getInterfaceClassbaName_5009Parser();
		case PackagebaNameEditPart.VISUAL_ID:
			return getPackagebaName_5010Parser();
		case AttributebaNameEditPart.VISUAL_ID:
			return getAttributebaName_5001Parser();
		case MethodbaNameEditPart.VISUAL_ID:
			return getMethodbaName_5002Parser();
		case ParameterNameEditPart.VISUAL_ID:
			return getParameterName_5012Parser();
		case AttributebaName2EditPart.VISUAL_ID:
			return getAttributebaName_5004Parser();
		case MethodbaName2EditPart.VISUAL_ID:
			return getMethodbaName_5011Parser();
		case AttributebaName3EditPart.VISUAL_ID:
			return getAttributebaName_5007Parser();
		case OperationbaNameEditPart.VISUAL_ID:
			return getOperationbaName_5008Parser();
		case ParameterName2EditPart.VISUAL_ID:
			return getParameterName_5013Parser();
		case ContainmentRolSEditPart.VISUAL_ID:
			return getContainmentRolS_6001Parser();
		case ContainmentMultSEditPart.VISUAL_ID:
			return getContainmentMultS_6002Parser();
		case ContainmentRolTEditPart.VISUAL_ID:
			return getContainmentRolT_6003Parser();
		case ContainmentMultTEditPart.VISUAL_ID:
			return getContainmentMultT_6004Parser();
		case AggregationRolSEditPart.VISUAL_ID:
			return getAggregationRolS_6005Parser();
		case AggregationMultSEditPart.VISUAL_ID:
			return getAggregationMultS_6006Parser();
		case AggregationRolTEditPart.VISUAL_ID:
			return getAggregationRolT_6007Parser();
		case AggregationMultTEditPart.VISUAL_ID:
			return getAggregationMultT_6008Parser();
		case AssociationRolSEditPart.VISUAL_ID:
			return getAssociationRolS_6009Parser();
		case AssociationMultSEditPart.VISUAL_ID:
			return getAssociationMultS_6010Parser();
		case AssociationRolTEditPart.VISUAL_ID:
			return getAssociationRolT_6011Parser();
		case AssociationMultTEditPart.VISUAL_ID:
			return getAssociationMultT_6012Parser();
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
