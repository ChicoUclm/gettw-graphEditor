/**
 */
package gettw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Colors</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gettw.GettwPackage#getColors()
 * @model
 * @generated
 */
public enum Colors implements Enumerator {
	/**
	 * The '<em><b>Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(0, "black", "black"),

	/**
	 * The '<em><b>Blue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(1, "blue", "blue"),

	/**
	 * The '<em><b>Lightblue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTBLUE_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTBLUE(2, "lightblue", "lightblue"),

	/**
	 * The '<em><b>Darkblue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKBLUE_VALUE
	 * @generated
	 * @ordered
	 */
	DARKBLUE(3, "darkblue", "darkblue"), /**
	 * The '<em><b>Gray</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	GRAY(4, "gray", "gray"), /**
	 * The '<em><b>Lightgray</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTGRAY_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTGRAY(5, "lightgray", "lightgray"), /**
	 * The '<em><b>Darkgray</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKGRAY_VALUE
	 * @generated
	 * @ordered
	 */
	DARKGRAY(6, "darkgray", "darkgray"),

	/**
	 * The '<em><b>Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(7, "green", "green"),

	/**
	 * The '<em><b>Lightgreen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTGREEN_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTGREEN(8, "lightgreen", "lightgreen"),

	/**
	 * The '<em><b>Darkgreen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKGREEN_VALUE
	 * @generated
	 * @ordered
	 */
	DARKGREEN(9, "darkgreen", "darkgreen"),

	/**
	 * The '<em><b>Orange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORANGE(10, "orange", "orange"),

	/**
	 * The '<em><b>Lightorange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTORANGE(11, "lightorange", "lightorange"),

	/**
	 * The '<em><b>Darkorange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	DARKORANGE(12, "darkorange", "darkorange"),

	/**
	 * The '<em><b>Pink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINK_VALUE
	 * @generated
	 * @ordered
	 */
	PINK(13, "pink", "pink"), /**
	 * The '<em><b>Purple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PURPLE(14, "purple", "purple"), /**
	 * The '<em><b>Red</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(15, "red", "red"), /**
	 * The '<em><b>Lightred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTRED_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTRED(16, "lightred", "lightred"), /**
	 * The '<em><b>Darkred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKRED_VALUE
	 * @generated
	 * @ordered
	 */
	DARKRED(17, "darkred", "darkred"),

	/**
	 * The '<em><b>Transparent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPARENT(18, "transparent", "transparent"), /**
	 * The '<em><b>Yellow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	YELLOW(19, "yellow", "yellow"), /**
	 * The '<em><b>Lightyellow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTYELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTYELLOW(20, "lightyellow", "lightyellow"), /**
	 * The '<em><b>Darkyellow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKYELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	DARKYELLOW(21, "darkyellow", "darkyellow"), /**
	 * The '<em><b>White</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(22, "white", "white");

	/**
	 * The '<em><b>Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model name="black"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 0;

	/**
	 * The '<em><b>Blue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE
	 * @model name="blue"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 1;

	/**
	 * The '<em><b>Lightblue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTBLUE
	 * @model name="lightblue"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTBLUE_VALUE = 2;

	/**
	 * The '<em><b>Darkblue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKBLUE
	 * @model name="darkblue"
	 * @generated
	 * @ordered
	 */
	public static final int DARKBLUE_VALUE = 3;

	/**
	 * The '<em><b>Gray</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAY
	 * @model name="gray"
	 * @generated
	 * @ordered
	 */
	public static final int GRAY_VALUE = 4;

	/**
	 * The '<em><b>Lightgray</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTGRAY
	 * @model name="lightgray"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTGRAY_VALUE = 5;

	/**
	 * The '<em><b>Darkgray</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKGRAY
	 * @model name="darkgray"
	 * @generated
	 * @ordered
	 */
	public static final int DARKGRAY_VALUE = 6;

	/**
	 * The '<em><b>Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model name="green"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 7;

	/**
	 * The '<em><b>Lightgreen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTGREEN
	 * @model name="lightgreen"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTGREEN_VALUE = 8;

	/**
	 * The '<em><b>Darkgreen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKGREEN
	 * @model name="darkgreen"
	 * @generated
	 * @ordered
	 */
	public static final int DARKGREEN_VALUE = 9;

	/**
	 * The '<em><b>Orange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORANGE
	 * @model name="orange"
	 * @generated
	 * @ordered
	 */
	public static final int ORANGE_VALUE = 10;

	/**
	 * The '<em><b>Lightorange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTORANGE
	 * @model name="lightorange"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTORANGE_VALUE = 11;

	/**
	 * The '<em><b>Darkorange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKORANGE
	 * @model name="darkorange"
	 * @generated
	 * @ordered
	 */
	public static final int DARKORANGE_VALUE = 12;

	/**
	 * The '<em><b>Pink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINK
	 * @model name="pink"
	 * @generated
	 * @ordered
	 */
	public static final int PINK_VALUE = 13;

	/**
	 * The '<em><b>Purple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPLE
	 * @model name="purple"
	 * @generated
	 * @ordered
	 */
	public static final int PURPLE_VALUE = 14;

	/**
	 * The '<em><b>Red</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model name="red"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 15;

	/**
	 * The '<em><b>Lightred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTRED
	 * @model name="lightred"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTRED_VALUE = 16;

	/**
	 * The '<em><b>Darkred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKRED
	 * @model name="darkred"
	 * @generated
	 * @ordered
	 */
	public static final int DARKRED_VALUE = 17;

	/**
	 * The '<em><b>Transparent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENT
	 * @model name="transparent"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPARENT_VALUE = 18;

	/**
	 * The '<em><b>Yellow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW
	 * @model name="yellow"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_VALUE = 19;

	/**
	 * The '<em><b>Lightyellow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTYELLOW
	 * @model name="lightyellow"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTYELLOW_VALUE = 20;

	/**
	 * The '<em><b>Darkyellow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKYELLOW
	 * @model name="darkyellow"
	 * @generated
	 * @ordered
	 */
	public static final int DARKYELLOW_VALUE = 21;

	/**
	 * The '<em><b>White</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE
	 * @model name="white"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 22;

	/**
	 * An array of all the '<em><b>Colors</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Colors[] VALUES_ARRAY =
		new Colors[] {
			BLACK,
			BLUE,
			LIGHTBLUE,
			DARKBLUE,
			GRAY,
			LIGHTGRAY,
			DARKGRAY,
			GREEN,
			LIGHTGREEN,
			DARKGREEN,
			ORANGE,
			LIGHTORANGE,
			DARKORANGE,
			PINK,
			PURPLE,
			RED,
			LIGHTRED,
			DARKRED,
			TRANSPARENT,
			YELLOW,
			LIGHTYELLOW,
			DARKYELLOW,
			WHITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Colors</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Colors> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Colors</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Colors get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Colors result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colors</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Colors getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Colors result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colors</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Colors get(int value) {
		switch (value) {
			case BLACK_VALUE: return BLACK;
			case BLUE_VALUE: return BLUE;
			case LIGHTBLUE_VALUE: return LIGHTBLUE;
			case DARKBLUE_VALUE: return DARKBLUE;
			case GRAY_VALUE: return GRAY;
			case LIGHTGRAY_VALUE: return LIGHTGRAY;
			case DARKGRAY_VALUE: return DARKGRAY;
			case GREEN_VALUE: return GREEN;
			case LIGHTGREEN_VALUE: return LIGHTGREEN;
			case DARKGREEN_VALUE: return DARKGREEN;
			case ORANGE_VALUE: return ORANGE;
			case LIGHTORANGE_VALUE: return LIGHTORANGE;
			case DARKORANGE_VALUE: return DARKORANGE;
			case PINK_VALUE: return PINK;
			case PURPLE_VALUE: return PURPLE;
			case RED_VALUE: return RED;
			case LIGHTRED_VALUE: return LIGHTRED;
			case DARKRED_VALUE: return DARKRED;
			case TRANSPARENT_VALUE: return TRANSPARENT;
			case YELLOW_VALUE: return YELLOW;
			case LIGHTYELLOW_VALUE: return LIGHTYELLOW;
			case DARKYELLOW_VALUE: return DARKYELLOW;
			case WHITE_VALUE: return WHITE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Colors(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Colors
