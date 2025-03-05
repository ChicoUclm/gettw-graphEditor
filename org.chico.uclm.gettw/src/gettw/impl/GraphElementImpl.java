/**
 */
package gettw.impl;

import gettw.GettwPackage;
import gettw.GraphElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gettw.impl.GraphElementImpl#getId_ <em>Id </em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GraphElementImpl extends EObjectImpl implements GraphElement {
	/**
	 * The default value of the '{@link #getId_() <em>Id </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_()
	 * @generated
	 * @ordered
	 */
	protected static final String ID__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_() <em>Id </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_()
	 * @generated
	 * @ordered
	 */
	protected String id_ = ID__EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GettwPackage.Literals.GRAPH_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId_() {
		return id_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId_(String newId_) {
		String oldId_ = id_;
		id_ = newId_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.GRAPH_ELEMENT__ID_, oldId_, id_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GettwPackage.GRAPH_ELEMENT__ID_:
				return getId_();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GettwPackage.GRAPH_ELEMENT__ID_:
				setId_((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GettwPackage.GRAPH_ELEMENT__ID_:
				setId_(ID__EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GettwPackage.GRAPH_ELEMENT__ID_:
				return ID__EDEFAULT == null ? id_ != null : !ID__EDEFAULT.equals(id_);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id_: ");
		result.append(id_);
		result.append(')');
		return result.toString();
	}

} //GraphElementImpl
