/**
 */
package gettw.provider;


import gettw.CustomLink;
import gettw.GettwPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gettw.CustomLink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomLinkItemProvider extends LinkItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLinkItemProvider(AdapterFactory adapterFactory) {
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

			addLinkStrokeColorPropertyDescriptor(object);
			addLinkStrokeWidthPropertyDescriptor(object);
			addFromArrowShapePropertyDescriptor(object);
			addFromArrowColorPropertyDescriptor(object);
			addFromArrowStrokeColorPropertyDescriptor(object);
			addFromArrowStrokeWidthPropertyDescriptor(object);
			addToArrowShapePropertyDescriptor(object);
			addToArrowColorPropertyDescriptor(object);
			addToArrowStrokeColorPropertyDescriptor(object);
			addToArrowStrokeWidthPropertyDescriptor(object);
			addIsDashedPropertyDescriptor(object);
			addTextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Link Stroke Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkStrokeColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_linkStrokeColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_linkStrokeColor_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__LINK_STROKE_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Stroke Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkStrokeWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_linkStrokeWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_linkStrokeWidth_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__LINK_STROKE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Arrow Shape feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromArrowShapePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_fromArrowShape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_fromArrowShape_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__FROM_ARROW_SHAPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Arrow Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromArrowColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_fromArrowColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_fromArrowColor_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__FROM_ARROW_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Arrow Stroke Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromArrowStrokeColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_fromArrowStrokeColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_fromArrowStrokeColor_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__FROM_ARROW_STROKE_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Arrow Stroke Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromArrowStrokeWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_fromArrowStrokeWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_fromArrowStrokeWidth_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__FROM_ARROW_STROKE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Arrow Shape feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToArrowShapePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_toArrowShape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_toArrowShape_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__TO_ARROW_SHAPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Arrow Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToArrowColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_toArrowColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_toArrowColor_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__TO_ARROW_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Arrow Stroke Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToArrowStrokeColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_toArrowStrokeColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_toArrowStrokeColor_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__TO_ARROW_STROKE_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Arrow Stroke Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToArrowStrokeWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_toArrowStrokeWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_toArrowStrokeWidth_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__TO_ARROW_STROKE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Dashed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDashedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_isDashed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_isDashed_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__IS_DASHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomLink_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomLink_text_feature", "_UI_CustomLink_type"),
				 GettwPackage.Literals.CUSTOM_LINK__TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CustomLink.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CustomLink"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CustomLink)object).getId_();
		return label == null || label.length() == 0 ?
			getString("_UI_CustomLink_type") :
			getString("_UI_CustomLink_type") + " " + label;
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

		switch (notification.getFeatureID(CustomLink.class)) {
			case GettwPackage.CUSTOM_LINK__LINK_STROKE_COLOR:
			case GettwPackage.CUSTOM_LINK__LINK_STROKE_WIDTH:
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_SHAPE:
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_COLOR:
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_COLOR:
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_WIDTH:
			case GettwPackage.CUSTOM_LINK__TO_ARROW_SHAPE:
			case GettwPackage.CUSTOM_LINK__TO_ARROW_COLOR:
			case GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_COLOR:
			case GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_WIDTH:
			case GettwPackage.CUSTOM_LINK__IS_DASHED:
			case GettwPackage.CUSTOM_LINK__TEXT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
