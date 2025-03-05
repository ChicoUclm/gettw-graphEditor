/**
 */
package gettw.impl;

import gettw.ArrowHeads;
import gettw.Colors;
import gettw.CustomLink;
import gettw.GettwPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gettw.impl.CustomLinkImpl#getLinkStrokeColor <em>Link Stroke Color</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getLinkStrokeWidth <em>Link Stroke Width</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getFromArrowShape <em>From Arrow Shape</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getFromArrowColor <em>From Arrow Color</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getFromArrowStrokeColor <em>From Arrow Stroke Color</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getFromArrowStrokeWidth <em>From Arrow Stroke Width</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getToArrowShape <em>To Arrow Shape</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getToArrowColor <em>To Arrow Color</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getToArrowStrokeColor <em>To Arrow Stroke Color</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getToArrowStrokeWidth <em>To Arrow Stroke Width</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getIsDashed <em>Is Dashed</em>}</li>
 *   <li>{@link gettw.impl.CustomLinkImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomLinkImpl extends LinkImpl implements CustomLink {
	/**
	 * The default value of the '{@link #getLinkStrokeColor() <em>Link Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected static final Colors LINK_STROKE_COLOR_EDEFAULT = Colors.BLACK;

	/**
	 * The cached value of the '{@link #getLinkStrokeColor() <em>Link Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected Colors linkStrokeColor = LINK_STROKE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkStrokeWidth() <em>Link Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LINK_STROKE_WIDTH_EDEFAULT = new Integer(2);

	/**
	 * The cached value of the '{@link #getLinkStrokeWidth() <em>Link Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer linkStrokeWidth = LINK_STROKE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromArrowShape() <em>From Arrow Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromArrowShape()
	 * @generated
	 * @ordered
	 */
	protected static final ArrowHeads FROM_ARROW_SHAPE_EDEFAULT = ArrowHeads.NONE;

	/**
	 * The cached value of the '{@link #getFromArrowShape() <em>From Arrow Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromArrowShape()
	 * @generated
	 * @ordered
	 */
	protected ArrowHeads fromArrowShape = FROM_ARROW_SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromArrowColor() <em>From Arrow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromArrowColor()
	 * @generated
	 * @ordered
	 */
	protected static final Colors FROM_ARROW_COLOR_EDEFAULT = Colors.BLACK;

	/**
	 * The cached value of the '{@link #getFromArrowColor() <em>From Arrow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromArrowColor()
	 * @generated
	 * @ordered
	 */
	protected Colors fromArrowColor = FROM_ARROW_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromArrowStrokeColor() <em>From Arrow Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromArrowStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected static final Colors FROM_ARROW_STROKE_COLOR_EDEFAULT = Colors.BLACK;

	/**
	 * The cached value of the '{@link #getFromArrowStrokeColor() <em>From Arrow Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromArrowStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected Colors fromArrowStrokeColor = FROM_ARROW_STROKE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromArrowStrokeWidth() <em>From Arrow Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromArrowStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FROM_ARROW_STROKE_WIDTH_EDEFAULT = new Integer(2);

	/**
	 * The cached value of the '{@link #getFromArrowStrokeWidth() <em>From Arrow Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromArrowStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer fromArrowStrokeWidth = FROM_ARROW_STROKE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getToArrowShape() <em>To Arrow Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrowShape()
	 * @generated
	 * @ordered
	 */
	protected static final ArrowHeads TO_ARROW_SHAPE_EDEFAULT = ArrowHeads.NONE;

	/**
	 * The cached value of the '{@link #getToArrowShape() <em>To Arrow Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrowShape()
	 * @generated
	 * @ordered
	 */
	protected ArrowHeads toArrowShape = TO_ARROW_SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToArrowColor() <em>To Arrow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrowColor()
	 * @generated
	 * @ordered
	 */
	protected static final Colors TO_ARROW_COLOR_EDEFAULT = Colors.BLACK;

	/**
	 * The cached value of the '{@link #getToArrowColor() <em>To Arrow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrowColor()
	 * @generated
	 * @ordered
	 */
	protected Colors toArrowColor = TO_ARROW_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getToArrowStrokeColor() <em>To Arrow Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrowStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected static final Colors TO_ARROW_STROKE_COLOR_EDEFAULT = Colors.BLACK;

	/**
	 * The cached value of the '{@link #getToArrowStrokeColor() <em>To Arrow Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrowStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected Colors toArrowStrokeColor = TO_ARROW_STROKE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getToArrowStrokeWidth() <em>To Arrow Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrowStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TO_ARROW_STROKE_WIDTH_EDEFAULT = new Integer(2);

	/**
	 * The cached value of the '{@link #getToArrowStrokeWidth() <em>To Arrow Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrowStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer toArrowStrokeWidth = TO_ARROW_STROKE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDashed() <em>Is Dashed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDashed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DASHED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsDashed() <em>Is Dashed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDashed()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDashed = IS_DASHED_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GettwPackage.Literals.CUSTOM_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colors getLinkStrokeColor() {
		return linkStrokeColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkStrokeColor(Colors newLinkStrokeColor) {
		Colors oldLinkStrokeColor = linkStrokeColor;
		linkStrokeColor = newLinkStrokeColor == null ? LINK_STROKE_COLOR_EDEFAULT : newLinkStrokeColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__LINK_STROKE_COLOR, oldLinkStrokeColor, linkStrokeColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLinkStrokeWidth() {
		return linkStrokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkStrokeWidth(Integer newLinkStrokeWidth) {
		Integer oldLinkStrokeWidth = linkStrokeWidth;
		linkStrokeWidth = newLinkStrokeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__LINK_STROKE_WIDTH, oldLinkStrokeWidth, linkStrokeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowHeads getFromArrowShape() {
		return fromArrowShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromArrowShape(ArrowHeads newFromArrowShape) {
		ArrowHeads oldFromArrowShape = fromArrowShape;
		fromArrowShape = newFromArrowShape == null ? FROM_ARROW_SHAPE_EDEFAULT : newFromArrowShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__FROM_ARROW_SHAPE, oldFromArrowShape, fromArrowShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colors getFromArrowColor() {
		return fromArrowColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromArrowColor(Colors newFromArrowColor) {
		Colors oldFromArrowColor = fromArrowColor;
		fromArrowColor = newFromArrowColor == null ? FROM_ARROW_COLOR_EDEFAULT : newFromArrowColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__FROM_ARROW_COLOR, oldFromArrowColor, fromArrowColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colors getFromArrowStrokeColor() {
		return fromArrowStrokeColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromArrowStrokeColor(Colors newFromArrowStrokeColor) {
		Colors oldFromArrowStrokeColor = fromArrowStrokeColor;
		fromArrowStrokeColor = newFromArrowStrokeColor == null ? FROM_ARROW_STROKE_COLOR_EDEFAULT : newFromArrowStrokeColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_COLOR, oldFromArrowStrokeColor, fromArrowStrokeColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFromArrowStrokeWidth() {
		return fromArrowStrokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromArrowStrokeWidth(Integer newFromArrowStrokeWidth) {
		Integer oldFromArrowStrokeWidth = fromArrowStrokeWidth;
		fromArrowStrokeWidth = newFromArrowStrokeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_WIDTH, oldFromArrowStrokeWidth, fromArrowStrokeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowHeads getToArrowShape() {
		return toArrowShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToArrowShape(ArrowHeads newToArrowShape) {
		ArrowHeads oldToArrowShape = toArrowShape;
		toArrowShape = newToArrowShape == null ? TO_ARROW_SHAPE_EDEFAULT : newToArrowShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__TO_ARROW_SHAPE, oldToArrowShape, toArrowShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colors getToArrowColor() {
		return toArrowColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToArrowColor(Colors newToArrowColor) {
		Colors oldToArrowColor = toArrowColor;
		toArrowColor = newToArrowColor == null ? TO_ARROW_COLOR_EDEFAULT : newToArrowColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__TO_ARROW_COLOR, oldToArrowColor, toArrowColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colors getToArrowStrokeColor() {
		return toArrowStrokeColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToArrowStrokeColor(Colors newToArrowStrokeColor) {
		Colors oldToArrowStrokeColor = toArrowStrokeColor;
		toArrowStrokeColor = newToArrowStrokeColor == null ? TO_ARROW_STROKE_COLOR_EDEFAULT : newToArrowStrokeColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_COLOR, oldToArrowStrokeColor, toArrowStrokeColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getToArrowStrokeWidth() {
		return toArrowStrokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToArrowStrokeWidth(Integer newToArrowStrokeWidth) {
		Integer oldToArrowStrokeWidth = toArrowStrokeWidth;
		toArrowStrokeWidth = newToArrowStrokeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_WIDTH, oldToArrowStrokeWidth, toArrowStrokeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsDashed() {
		return isDashed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDashed(Boolean newIsDashed) {
		Boolean oldIsDashed = isDashed;
		isDashed = newIsDashed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__IS_DASHED, oldIsDashed, isDashed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GettwPackage.CUSTOM_LINK__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GettwPackage.CUSTOM_LINK__LINK_STROKE_COLOR:
				return getLinkStrokeColor();
			case GettwPackage.CUSTOM_LINK__LINK_STROKE_WIDTH:
				return getLinkStrokeWidth();
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_SHAPE:
				return getFromArrowShape();
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_COLOR:
				return getFromArrowColor();
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_COLOR:
				return getFromArrowStrokeColor();
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_WIDTH:
				return getFromArrowStrokeWidth();
			case GettwPackage.CUSTOM_LINK__TO_ARROW_SHAPE:
				return getToArrowShape();
			case GettwPackage.CUSTOM_LINK__TO_ARROW_COLOR:
				return getToArrowColor();
			case GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_COLOR:
				return getToArrowStrokeColor();
			case GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_WIDTH:
				return getToArrowStrokeWidth();
			case GettwPackage.CUSTOM_LINK__IS_DASHED:
				return getIsDashed();
			case GettwPackage.CUSTOM_LINK__TEXT:
				return getText();
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
			case GettwPackage.CUSTOM_LINK__LINK_STROKE_COLOR:
				setLinkStrokeColor((Colors)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__LINK_STROKE_WIDTH:
				setLinkStrokeWidth((Integer)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_SHAPE:
				setFromArrowShape((ArrowHeads)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_COLOR:
				setFromArrowColor((Colors)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_COLOR:
				setFromArrowStrokeColor((Colors)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_WIDTH:
				setFromArrowStrokeWidth((Integer)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_SHAPE:
				setToArrowShape((ArrowHeads)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_COLOR:
				setToArrowColor((Colors)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_COLOR:
				setToArrowStrokeColor((Colors)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_WIDTH:
				setToArrowStrokeWidth((Integer)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__IS_DASHED:
				setIsDashed((Boolean)newValue);
				return;
			case GettwPackage.CUSTOM_LINK__TEXT:
				setText((String)newValue);
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
			case GettwPackage.CUSTOM_LINK__LINK_STROKE_COLOR:
				setLinkStrokeColor(LINK_STROKE_COLOR_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__LINK_STROKE_WIDTH:
				setLinkStrokeWidth(LINK_STROKE_WIDTH_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_SHAPE:
				setFromArrowShape(FROM_ARROW_SHAPE_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_COLOR:
				setFromArrowColor(FROM_ARROW_COLOR_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_COLOR:
				setFromArrowStrokeColor(FROM_ARROW_STROKE_COLOR_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_WIDTH:
				setFromArrowStrokeWidth(FROM_ARROW_STROKE_WIDTH_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_SHAPE:
				setToArrowShape(TO_ARROW_SHAPE_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_COLOR:
				setToArrowColor(TO_ARROW_COLOR_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_COLOR:
				setToArrowStrokeColor(TO_ARROW_STROKE_COLOR_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_WIDTH:
				setToArrowStrokeWidth(TO_ARROW_STROKE_WIDTH_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__IS_DASHED:
				setIsDashed(IS_DASHED_EDEFAULT);
				return;
			case GettwPackage.CUSTOM_LINK__TEXT:
				setText(TEXT_EDEFAULT);
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
			case GettwPackage.CUSTOM_LINK__LINK_STROKE_COLOR:
				return linkStrokeColor != LINK_STROKE_COLOR_EDEFAULT;
			case GettwPackage.CUSTOM_LINK__LINK_STROKE_WIDTH:
				return LINK_STROKE_WIDTH_EDEFAULT == null ? linkStrokeWidth != null : !LINK_STROKE_WIDTH_EDEFAULT.equals(linkStrokeWidth);
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_SHAPE:
				return fromArrowShape != FROM_ARROW_SHAPE_EDEFAULT;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_COLOR:
				return fromArrowColor != FROM_ARROW_COLOR_EDEFAULT;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_COLOR:
				return fromArrowStrokeColor != FROM_ARROW_STROKE_COLOR_EDEFAULT;
			case GettwPackage.CUSTOM_LINK__FROM_ARROW_STROKE_WIDTH:
				return FROM_ARROW_STROKE_WIDTH_EDEFAULT == null ? fromArrowStrokeWidth != null : !FROM_ARROW_STROKE_WIDTH_EDEFAULT.equals(fromArrowStrokeWidth);
			case GettwPackage.CUSTOM_LINK__TO_ARROW_SHAPE:
				return toArrowShape != TO_ARROW_SHAPE_EDEFAULT;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_COLOR:
				return toArrowColor != TO_ARROW_COLOR_EDEFAULT;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_COLOR:
				return toArrowStrokeColor != TO_ARROW_STROKE_COLOR_EDEFAULT;
			case GettwPackage.CUSTOM_LINK__TO_ARROW_STROKE_WIDTH:
				return TO_ARROW_STROKE_WIDTH_EDEFAULT == null ? toArrowStrokeWidth != null : !TO_ARROW_STROKE_WIDTH_EDEFAULT.equals(toArrowStrokeWidth);
			case GettwPackage.CUSTOM_LINK__IS_DASHED:
				return IS_DASHED_EDEFAULT == null ? isDashed != null : !IS_DASHED_EDEFAULT.equals(isDashed);
			case GettwPackage.CUSTOM_LINK__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
		result.append(" (linkStrokeColor: ");
		result.append(linkStrokeColor);
		result.append(", linkStrokeWidth: ");
		result.append(linkStrokeWidth);
		result.append(", fromArrowShape: ");
		result.append(fromArrowShape);
		result.append(", fromArrowColor: ");
		result.append(fromArrowColor);
		result.append(", fromArrowStrokeColor: ");
		result.append(fromArrowStrokeColor);
		result.append(", fromArrowStrokeWidth: ");
		result.append(fromArrowStrokeWidth);
		result.append(", toArrowShape: ");
		result.append(toArrowShape);
		result.append(", toArrowColor: ");
		result.append(toArrowColor);
		result.append(", toArrowStrokeColor: ");
		result.append(toArrowStrokeColor);
		result.append(", toArrowStrokeWidth: ");
		result.append(toArrowStrokeWidth);
		result.append(", isDashed: ");
		result.append(isDashed);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //CustomLinkImpl
