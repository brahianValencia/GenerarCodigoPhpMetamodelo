/*
 * 
 */
package concreta.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.jface.preference.IPreferenceStore;

import concreta.diagram.part.ConcretaDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	* @generated
	*/
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(ConcretaDiagramEditorPlugin.getInstance().getPreferenceStore());
	}

	/**
	 * @generated NOT
	 */
	public static void initDefaults(IPreferenceStore preferenceStore) {
		preferenceStore.setDefault(IPreferenceConstants.PREF_LINE_STYLE, Routing.RECTILINEAR);
	}
}
