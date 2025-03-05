/**
 */
package gettw.impl;

import gettw.Colors;
import gettw.GettwPackage;
import gettw.Shape;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gettw.impl.ShapeImpl#getText <em>Text</em>}</li>
 *   <li>{@link gettw.impl.ShapeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link gettw.impl.ShapeImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link gettw.impl.ShapeImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link gettw.impl.ShapeImpl#getEditable <em>Editable</em>}</li>
 *   <li>{@link gettw.impl.ShapeImpl#getTextIsHeader <em>Text Is Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeImpl extends GraphElementImpl implements Shape {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Colors COLOR_EDEFAULT = Colors.BLACK;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Colors color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final Colors STROKE_EDEFAULT = Colors.BLACK;

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected Colors stroke = STROKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STROKE_WIDTH_EDEFAULT = new Integer(2);

	/**
	 * The cached value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer strokeWidth = STROKE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EDITABLE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected Boolean editable = EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextIsHeader() <em>Text Is Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextIsHeader()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TEXT_IS_HEADER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTextIsHeader() <em>Text Is Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextIsHeader()
	 * @generated
	 * @ordered
	 */
	protected Boolean textIsHeader = TEXT_IS_HEADER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GettwPackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.SHAPE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colors getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(Colors newColor) {
		Colors oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.SHAPE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colors getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStroke(Colors newStroke) {
		Colors oldStroke = stroke;
		stroke = newStroke == null ? STROKE_EDEFAULT : newStroke;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.SHAPE__STROKE, oldStroke, stroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStrokeWidth() {
		return strokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrokeWidth(Integer newStrokeWidth) {
		Integer oldStrokeWidth = strokeWidth;
		strokeWidth = newStrokeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.SHAPE__STROKE_WIDTH, oldStrokeWidth, strokeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditable(Boolean newEditable) {
		Boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.SHAPE__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTextIsHeader() {
		return textIsHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextIsHeader(Boolean newTextIsHeader) {
		Boolean oldTextIsHeader = textIsHeader;
		textIsHeader = newTextIsHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.SHAPE__TEXT_IS_HEADER, oldTextIsHeader, textIsHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GettwPackage.SHAPE__TEXT:
				return getText();
			case GettwPackage.SHAPE__COLOR:
				return getColor();
			case GettwPackage.SHAPE__STROKE:
				return getStroke();
			case GettwPackage.SHAPE__STROKE_WIDTH:
				return getStrokeWidth();
			case GettwPackage.SHAPE__EDITABLE:
				return getEditable();
			case GettwPackage.SHAPE__TEXT_IS_HEADER:
				return getTextIsHeader();
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
			case GettwPackage.SHAPE__TEXT:
				setText((String)newValue);
				return;
			case GettwPackage.SHAPE__COLOR:
				setColor((Colors)newValue);
				return;
			case GettwPackage.SHAPE__STROKE:
				setStroke((Colors)newValue);
				return;
			case GettwPackage.SHAPE__STROKE_WIDTH:
				setStrokeWidth((Integer)newValue);
				return;
			case GettwPackage.SHAPE__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case GettwPackage.SHAPE__TEXT_IS_HEADER:
				setTextIsHeader((Boolean)newValue);
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
			case GettwPackage.SHAPE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case GettwPackage.SHAPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case GettwPackage.SHAPE__STROKE:
				setStroke(STROKE_EDEFAULT);
				return;
			case GettwPackage.SHAPE__STROKE_WIDTH:
				setStrokeWidth(STROKE_WIDTH_EDEFAULT);
				return;
			case GettwPackage.SHAPE__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case GettwPackage.SHAPE__TEXT_IS_HEADER:
				setTextIsHeader(TEXT_IS_HEADER_EDEFAULT);
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
			case GettwPackage.SHAPE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case GettwPackage.SHAPE__COLOR:
				return color != COLOR_EDEFAULT;
			case GettwPackage.SHAPE__STROKE:
				return stroke != STROKE_EDEFAULT;
			case GettwPackage.SHAPE__STROKE_WIDTH:
				return STROKE_WIDTH_EDEFAULT == null ? strokeWidth != null : !STROKE_WIDTH_EDEFAULT.equals(strokeWidth);
			case GettwPackage.SHAPE__EDITABLE:
				return EDITABLE_EDEFAULT == null ? editable != null : !EDITABLE_EDEFAULT.equals(editable);
			case GettwPackage.SHAPE__TEXT_IS_HEADER:
				return TEXT_IS_HEADER_EDEFAULT == null ? textIsHeader != null : !TEXT_IS_HEADER_EDEFAULT.equals(textIsHeader);
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
		result.append(" (text: ");
		result.append(text);
		result.append(", color: ");
		result.append(color);
		result.append(", stroke: ");
		result.append(stroke);
		result.append(", strokeWidth: ");
		result.append(strokeWidth);
		result.append(", editable: ");
		result.append(editable);
		result.append(", textIsHeader: ");
		result.append(textIsHeader);
		result.append(')');
		return result.toString();
	}

} //ShapeImpl
