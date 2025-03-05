/**
 */
package gettw.impl;

import gettw.GettwPackage;
import gettw.Superscript;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Superscript</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gettw.impl.SuperscriptImpl#getSuperscript <em>Superscript</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperscriptImpl extends TextImpl implements Superscript {
	/**
	 * The default value of the '{@link #getSuperscript() <em>Superscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperscript()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPERSCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuperscript() <em>Superscript</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperscript()
	 * @generated
	 * @ordered
	 */
	protected String superscript = SUPERSCRIPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperscriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GettwPackage.Literals.SUPERSCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuperscript() {
		return superscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperscript(String newSuperscript) {
		String oldSuperscript = superscript;
		superscript = newSuperscript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.SUPERSCRIPT__SUPERSCRIPT, oldSuperscript, superscript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GettwPackage.SUPERSCRIPT__SUPERSCRIPT:
				return getSuperscript();
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
			case GettwPackage.SUPERSCRIPT__SUPERSCRIPT:
				setSuperscript((String)newValue);
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
			case GettwPackage.SUPERSCRIPT__SUPERSCRIPT:
				setSuperscript(SUPERSCRIPT_EDEFAULT);
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
			case GettwPackage.SUPERSCRIPT__SUPERSCRIPT:
				return SUPERSCRIPT_EDEFAULT == null ? superscript != null : !SUPERSCRIPT_EDEFAULT.equals(superscript);
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
		result.append(" (superscript: ");
		result.append(superscript);
		result.append(')');
		return result.toString();
	}

} //SuperscriptImpl
