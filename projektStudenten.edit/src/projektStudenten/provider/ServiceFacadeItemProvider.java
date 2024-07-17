/**
 */
package projektStudenten.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import projektStudenten.ProjektStudentenFactory;
import projektStudenten.ProjektStudentenPackage;
import projektStudenten.ServiceFacade;

/**
 * This is the item provider adapter for a {@link projektStudenten.ServiceFacade} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceFacadeItemProvider 
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
	public ServiceFacadeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ProjektStudentenPackage.Literals.SERVICE_FACADE__RESULTS);
			childrenFeatures.add(ProjektStudentenPackage.Literals.SERVICE_FACADE__STUDENTS);
			childrenFeatures.add(ProjektStudentenPackage.Literals.SERVICE_FACADE__PROGRAMS);
			childrenFeatures.add(ProjektStudentenPackage.Literals.SERVICE_FACADE__ALL_COURSES);
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
	 * This returns ServiceFacade.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceFacade"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ServiceFacade_type");
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

		switch (notification.getFeatureID(ServiceFacade.class)) {
			case ProjektStudentenPackage.SERVICE_FACADE__RESULTS:
			case ProjektStudentenPackage.SERVICE_FACADE__STUDENTS:
			case ProjektStudentenPackage.SERVICE_FACADE__PROGRAMS:
			case ProjektStudentenPackage.SERVICE_FACADE__ALL_COURSES:
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
				(ProjektStudentenPackage.Literals.SERVICE_FACADE__RESULTS,
				 ProjektStudentenFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(ProjektStudentenPackage.Literals.SERVICE_FACADE__STUDENTS,
				 ProjektStudentenFactory.eINSTANCE.createStudent()));

		newChildDescriptors.add
			(createChildParameter
				(ProjektStudentenPackage.Literals.SERVICE_FACADE__PROGRAMS,
				 ProjektStudentenFactory.eINSTANCE.createProgram()));

		newChildDescriptors.add
			(createChildParameter
				(ProjektStudentenPackage.Literals.SERVICE_FACADE__ALL_COURSES,
				 ProjektStudentenFactory.eINSTANCE.createAdvanced()));

		newChildDescriptors.add
			(createChildParameter
				(ProjektStudentenPackage.Literals.SERVICE_FACADE__ALL_COURSES,
				 ProjektStudentenFactory.eINSTANCE.createIntroductory()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ProjektStudentenEditPlugin.INSTANCE;
	}

}
