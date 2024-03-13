
/*
 * 
 */
package concreta.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ConcretaPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAbsctractClassba1CreationTool());
		paletteContainer.add(createAttributeba2CreationTool());
		paletteContainer.add(createClassba3CreationTool());
		paletteContainer.add(createInterfaceClassba4CreationTool());
		paletteContainer.add(createMethodba5CreationTool());
		paletteContainer.add(createOperationba6CreationTool());
		paletteContainer.add(createPackageba7CreationTool());
		paletteContainer.add(createParameter8CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAggregation1CreationTool());
		paletteContainer.add(createAssociation2CreationTool());
		paletteContainer.add(createContainment3CreationTool());
		paletteContainer.add(createGeneralization4CreationTool());
		paletteContainer.add(createImplementation5CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAbsctractClassba1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AbsctractClassba1CreationTool_title,
				Messages.AbsctractClassba1CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.AbsctractClassba_2002));
		entry.setId("createAbsctractClassba1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.AbsctractClassba_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttributeba2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ConcretaElementTypes.Attributeba_3001);
		types.add(ConcretaElementTypes.Attributeba_3003);
		types.add(ConcretaElementTypes.Attributeba_3005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Attributeba2CreationTool_title,
				Messages.Attributeba2CreationTool_desc, types);
		entry.setId("createAttributeba2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Attributeba_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassba3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Classba3CreationTool_title,
				Messages.Classba3CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Classba_2001));
		entry.setId("createClassba3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Classba_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInterfaceClassba4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InterfaceClassba4CreationTool_title,
				Messages.InterfaceClassba4CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.InterfaceClassba_2003));
		entry.setId("createInterfaceClassba4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.InterfaceClassba_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMethodba5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcretaElementTypes.Methodba_3002);
		types.add(ConcretaElementTypes.Methodba_3007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Methodba5CreationTool_title,
				Messages.Methodba5CreationTool_desc, types);
		entry.setId("createMethodba5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Methodba_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOperationba6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Operationba6CreationTool_title,
				Messages.Operationba6CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.Operationba_3006));
		entry.setId("createOperationba6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Operationba_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPackageba7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Packageba7CreationTool_title,
				Messages.Packageba7CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Packageba_2004));
		entry.setId("createPackageba7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Packageba_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParameter8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcretaElementTypes.Parameter_3008);
		types.add(ConcretaElementTypes.Parameter_3009);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Parameter8CreationTool_title,
				Messages.Parameter8CreationTool_desc, types);
		entry.setId("createParameter8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Parameter_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAggregation1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Aggregation1CreationTool_title,
				Messages.Aggregation1CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.Aggregation_4002));
		entry.setId("createAggregation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Aggregation_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssociation2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Association2CreationTool_title,
				Messages.Association2CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.Association_4003));
		entry.setId("createAssociation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Association_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainment3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Containment3CreationTool_title,
				Messages.Containment3CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.Containment_4001));
		entry.setId("createContainment3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Containment_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGeneralization4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Generalization4CreationTool_title,
				Messages.Generalization4CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.Generalization_4004));
		entry.setId("createGeneralization4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Generalization_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImplementation5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Implementation5CreationTool_title,
				Messages.Implementation5CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.Implementation_4005));
		entry.setId("createImplementation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Implementation_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
