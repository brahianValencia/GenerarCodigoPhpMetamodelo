
/*
 * 
 */
package concreta.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteContainer.add(createAbstract1CreationTool());
		paletteContainer.add(createAttributeba2CreationTool());
		paletteContainer.add(createClassba3CreationTool());
		paletteContainer.add(createInterface4CreationTool());
		paletteContainer.add(createMethodba5CreationTool());
		paletteContainer.add(createPackageba6CreationTool());
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
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAbstract1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Abstract1CreationTool_title,
				Messages.Abstract1CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Abstract_2003));
		entry.setId("createAbstract1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Abstract_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttributeba2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Attributeba2CreationTool_title,
				Messages.Attributeba2CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.Attributeba_3001));
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
	private ToolEntry createInterface4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Interface4CreationTool_title,
				Messages.Interface4CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Interface_2002));
		entry.setId("createInterface4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Interface_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMethodba5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Methodba5CreationTool_title,
				Messages.Methodba5CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Methodba_3002));
		entry.setId("createMethodba5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Methodba_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPackageba6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Packageba6CreationTool_title,
				Messages.Packageba6CreationTool_desc, Collections.singletonList(ConcretaElementTypes.Packageba_2004));
		entry.setId("createPackageba6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.Packageba_2004));
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

}
