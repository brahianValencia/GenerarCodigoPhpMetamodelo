/**
 */
package concreta.provider;


import concreta.ConcretaFactory;
import concreta.ConcretaPackage;
import concreta.DiagramClassba;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link concreta.DiagramClassba} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramClassbaItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramClassbaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiagramClassba_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiagramClassba_name_feature", "_UI_DiagramClassba_type"),
				 ConcretaPackage.Literals.DIAGRAM_CLASSBA__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiagramClassba_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiagramClassba_path_feature", "_UI_DiagramClassba_type"),
				 ConcretaPackage.Literals.DIAGRAM_CLASSBA__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_CLASS);
			childrenFeatures.add(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_ABSTRACTA_CLASSBA);
			childrenFeatures.add(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_INTERFACE_CLASSBA);
			childrenFeatures.add(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_PACKAGEBA);
			childrenFeatures.add(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DiagramClassba.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiagramClassba"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiagramClassba)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiagramClassba_type") :
			getString("_UI_DiagramClassba_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DiagramClassba.class)) {
			case ConcretaPackage.DIAGRAM_CLASSBA__NAME:
			case ConcretaPackage.DIAGRAM_CLASSBA__PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_CLASS:
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_ABSTRACTA_CLASSBA:
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_INTERFACE_CLASSBA:
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_PACKAGEBA:
			case ConcretaPackage.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_CLASS,
				 ConcretaFactory.eINSTANCE.createClassba()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_ABSTRACTA_CLASSBA,
				 ConcretaFactory.eINSTANCE.createAbsctractClassba()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_INTERFACE_CLASSBA,
				 ConcretaFactory.eINSTANCE.createInterfaceClassba()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_PACKAGEBA,
				 ConcretaFactory.eINSTANCE.createPackageba()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA,
				 ConcretaFactory.eINSTANCE.createContainment()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA,
				 ConcretaFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA,
				 ConcretaFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA,
				 ConcretaFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(ConcretaPackage.Literals.DIAGRAM_CLASSBA__LST_RELATIONSHIPBA,
				 ConcretaFactory.eINSTANCE.createImplementation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConcretaEditPlugin.INSTANCE;
	}

}
