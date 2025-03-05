/**
 */
package gettw.impl;

import gettw.GettwPackage;
import gettw.Subscript;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscript</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gettw.impl.SubscriptImpl#getSubscript <em>Subscript</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptImpl extends TextImpl implements Subscript {
	/**
	 * The default value of the '{@link #getSubscript() <em>Subscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscript()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscript() <em>Subscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscript()
	 * @generated
	 * @ordered
	 */
	protected String subscript = SUBSCRIPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GettwPackage.Literals.SUBSCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscript() {
		return subscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscript(String newSubscript) {
		String oldSubscript = subscript;
		subscript = newSubscript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.SUBSCRIPT__SUBSCRIPT, oldSubscript, subscript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GettwPackage.SUBSCRIPT__SUBSCRIPT:
				return getSubscript();
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
			case GettwPackage.SUBSCRIPT__SUBSCRIPT:
				setSubscript((String)newValue);
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
			case GettwPackage.SUBSCRIPT__SUBSCRIPT:
				setSubscript(SUBSCRIPT_EDEFAULT);
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
			case GettwPackage.SUBSCRIPT__SUBSCRIPT:
				return SUBSCRIPT_EDEFAULT == null ? subscript != null : !SUBSCRIPT_EDEFAULT.equals(subscript);
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
		result.append(" (subscript: ");
		result.append(subscript);
		result.append(')');
		return result.toString();
	}

} //SubscriptImpl
