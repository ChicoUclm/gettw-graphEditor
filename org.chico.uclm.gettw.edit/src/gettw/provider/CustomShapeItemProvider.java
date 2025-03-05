/**
 */
package gettw.provider;


import gettw.CustomShape;
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
 * This is the item provider adapter for a {@link gettw.CustomShape} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomShapeItemProvider extends GraphElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomShapeItemProvider(AdapterFactory adapterFactory) {
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

			addShapePropertyDescriptor(object);
			addTextPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addStrokePropertyDescriptor(object);
			addStrokeWidthPropertyDescriptor(object);
			addSup_sub_indexesPropertyDescriptor(object);
			addText_subscriptPropertyDescriptor(object);
			addText_superscriptPropertyDescriptor(object);
			addEditablePropertyDescriptor(object);
			addTextIsHeaderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Shape feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShapePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomShape_shape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomShape_shape_feature", "_UI_CustomShape_type"),
				 GettwPackage.Literals.CUSTOM_SHAPE__SHAPE,
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
				 getString("_UI_CustomShape_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomShape_text_feature", "_UI_CustomShape_type"),
				 GettwPackage.Literals.CUSTOM_SHAPE__TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomShape_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomShape_color_feature", "_UI_CustomShape_type"),
				 GettwPackage.Literals.CUSTOM_SHAPE__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomShape_stroke_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomShape_stroke_feature", "_UI_CustomShape_type"),
				 GettwPackage.Literals.CUSTOM_SHAPE__STROKE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stroke Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrokeWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomShape_strokeWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomShape_strokeWidth_feature", "_UI_CustomShape_type"),
				 GettwPackage.Literals.CUSTOM_SHAPE__STROKE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sup sub indexes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSup_sub_indexesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomShape_sup_sub_indexes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomShape_sup_sub_indexes_feature", "_UI_CustomShape_type"),
				 GettwPackage.Literals.CUSTOM_SHAPE__SUP_SUB_INDEXES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text subscript feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addText_subscriptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomShape_text_subscript_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomShape_text_subscript_feature", "_UI_CustomShape_type"),
				 GettwPackage.Literals.CUSTOM_SHAPE__TEXT_SUBSCRIPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text superscript feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addText_superscriptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomShape_text_superscript_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomShape_text_superscript_feature", "_UI_CustomShape_type"),
				 GettwPackage.Literals.CUSTOM_SHAPE__TEXT_SUPERSCRIPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Editable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomShape_editable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomShape_editable_feature", "_UI_CustomShape_type"),
				 GettwPackage.Literals.CUSTOM_SHAPE__EDITABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Is Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextIsHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomShape_textIsHeader_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomShape_textIsHeader_feature", "_UI_CustomShape_type"),
				 GettwPackage.Literals.CUSTOM_SHAPE__TEXT_IS_HEADER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CustomShape.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CustomShape"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CustomShape)object).getId_();
		return label == null || label.length() == 0 ?
			getString("_UI_CustomShape_type") :
			getString("_UI_CustomShape_type") + " " + label;
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

		switch (notification.getFeatureID(CustomShape.class)) {
			case GettwPackage.CUSTOM_SHAPE__SHAPE:
			case GettwPackage.CUSTOM_SHAPE__TEXT:
			case GettwPackage.CUSTOM_SHAPE__COLOR:
			case GettwPackage.CUSTOM_SHAPE__STROKE:
			case GettwPackage.CUSTOM_SHAPE__STROKE_WIDTH:
			case GettwPackage.CUSTOM_SHAPE__SUP_SUB_INDEXES:
			case GettwPackage.CUSTOM_SHAPE__TEXT_SUBSCRIPT:
			case GettwPackage.CUSTOM_SHAPE__TEXT_SUPERSCRIPT:
			case GettwPackage.CUSTOM_SHAPE__EDITABLE:
			case GettwPackage.CUSTOM_SHAPE__TEXT_IS_HEADER:
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
