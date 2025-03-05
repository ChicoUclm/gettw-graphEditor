/**
 */
package gettw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shapes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gettw.GettwPackage#getShapes()
 * @model
 * @generated
 */
public enum Shapes implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Ellipse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELLIPSE_VALUE
	 * @generated
	 * @ordered
	 */
	ELLIPSE(1, "Ellipse", "Ellipse"), /**
	 * The '<em><b>Rectangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	RECTANGLE(2, "Rectangle", "Rectangle"), /**
	 * The '<em><b>Square</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_VALUE
	 * @generated
	 * @ordered
	 */
	SQUARE(3, "Square", "Square"),

	/**
	 * The '<em><b>Triangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGLE(4, "Triangle", "Triangle"),

	/**
	 * The '<em><b>Actor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTOR(5, "Actor", "Actor"), /**
	 * The '<em><b>ACvoltage Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACVOLTAGE_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	ACVOLTAGE_SOURCE(6, "ACvoltageSource", "ACvoltageSource"), /**
	 * The '<em><b>And Gate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_GATE_VALUE
	 * @generated
	 * @ordered
	 */
	AND_GATE(7, "AndGate", "AndGate"), /**
	 * The '<em><b>Arrow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW(8, "Arrow", "Arrow"), /**
	 * The '<em><b>Asterisk Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASTERISK_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	ASTERISK_LINE(9, "AsteriskLine", "AsteriskLine"), /**
	 * The '<em><b>Bar H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_H_VALUE
	 * @generated
	 * @ordered
	 */
	BAR_H(10, "BarH", "BarH"), /**
	 * The '<em><b>Bar V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_V_VALUE
	 * @generated
	 * @ordered
	 */
	BAR_V(11, "BarV", "BarV"), /**
	 * The '<em><b>Border</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER_VALUE
	 * @generated
	 * @ordered
	 */
	BORDER(12, "Border", "Border"), /**
	 * The '<em><b>Buffer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFFER_VALUE
	 * @generated
	 * @ordered
	 */
	BUFFER(13, "Buffer", "Buffer"), /**
	 * The '<em><b>Capacitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPACITOR_VALUE
	 * @generated
	 * @ordered
	 */
	CAPACITOR(14, "Capacitor", "Capacitor"),

	/**
	 * The '<em><b>Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARD_VALUE
	 * @generated
	 * @ordered
	 */
	CARD(15, "Card", "Card"), /**
	 * The '<em><b>Chevron</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEVRON_VALUE
	 * @generated
	 * @ordered
	 */
	CHEVRON(16, "Chevron", "Chevron"), /**
	 * The '<em><b>Circle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCLE(17, "Circle", "Circle"), /**
	 * The '<em><b>Circle Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCLE_LINE(18, "CircleLine", "CircleLine"), /**
	 * The '<em><b>Clock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CLOCK(19, "Clock", "Clock"), /**
	 * The '<em><b>Cloud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD(20, "Cloud", "Cloud"), /**
	 * The '<em><b>Club</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUB_VALUE
	 * @generated
	 * @ordered
	 */
	CLUB(21, "Club", "Club"), /**
	 * The '<em><b>Cone1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONE1_VALUE
	 * @generated
	 * @ordered
	 */
	CONE1(22, "Cone1", "Cone1"), /**
	 * The '<em><b>Cone2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONE2_VALUE
	 * @generated
	 * @ordered
	 */
	CONE2(23, "Cone2", "Cone2"),

	/**
	 * The '<em><b>Create Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_REQUEST(24, "CreateRequest", "CreateRequest"), /**
	 * The '<em><b>Cube1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE1_VALUE
	 * @generated
	 * @ordered
	 */
	CUBE1(25, "Cube1", "Cube1"), /**
	 * The '<em><b>Cube2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE2_VALUE
	 * @generated
	 * @ordered
	 */
	CUBE2(26, "Cube2", "Cube2"), /**
	 * The '<em><b>Curve1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVE1_VALUE
	 * @generated
	 * @ordered
	 */
	CURVE1(27, "Curve1", "Curve1"), /**
	 * The '<em><b>Curve2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVE2_VALUE
	 * @generated
	 * @ordered
	 */
	CURVE2(28, "Curve2", "Curve2"), /**
	 * The '<em><b>Curve3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVE3_VALUE
	 * @generated
	 * @ordered
	 */
	CURVE3(29, "Curve3", "Curve3"), /**
	 * The '<em><b>Curve4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVE4_VALUE
	 * @generated
	 * @ordered
	 */
	CURVE4(30, "Curve4", "Curve4"), /**
	 * The '<em><b>Cylinder1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER1_VALUE
	 * @generated
	 * @ordered
	 */
	CYLINDER1(31, "Cylinder1", "Cylinder1"), /**
	 * The '<em><b>Cylinder2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER2_VALUE
	 * @generated
	 * @ordered
	 */
	CYLINDER2(32, "Cylinder2", "Cylinder2"), /**
	 * The '<em><b>Cylinder3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER3_VALUE
	 * @generated
	 * @ordered
	 */
	CYLINDER3(33, "Cylinder3", "Cylinder3"), /**
	 * The '<em><b>Cylinder4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER4_VALUE
	 * @generated
	 * @ordered
	 */
	CYLINDER4(34, "Cylinder4", "Cylinder4"),

	/**
	 * The '<em><b>Database</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATABASE_VALUE
	 * @generated
	 * @ordered
	 */
	DATABASE(35, "Database", "Database"),

	/**
	 * The '<em><b>Data Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_STORAGE(36, "DataStorage", "DataStorage"), /**
	 * The '<em><b>DCvoltage Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCVOLTAGE_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	DCVOLTAGE_SOURCE(37, "DCvoltageSource", "DCvoltageSource"), /**
	 * The '<em><b>Decagon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECAGON_VALUE
	 * @generated
	 * @ordered
	 */
	DECAGON(38, "Decagon", "Decagon"), /**
	 * The '<em><b>Diamond</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMOND_VALUE
	 * @generated
	 * @ordered
	 */
	DIAMOND(39, "Diamond", "Diamond"), /**
	 * The '<em><b>Diode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIODE_VALUE
	 * @generated
	 * @ordered
	 */
	DIODE(40, "Diode", "Diode"),

	/**
	 * The '<em><b>Disk Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISK_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DISK_STORAGE(41, "DiskStorage", "DiskStorage"),

	/**
	 * The '<em><b>Display</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLAY(42, "Display", "Display"),

	/**
	 * The '<em><b>Divided Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDED_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	DIVIDED_EVENT(43, "DividedEvent", "DividedEvent"),

	/**
	 * The '<em><b>Divided Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDED_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	DIVIDED_PROCESS(44, "DividedProcess", "DividedProcess"),

	/**
	 * The '<em><b>Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT(45, "Document", "Document"), /**
	 * The '<em><b>Dodecagon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DODECAGON_VALUE
	 * @generated
	 * @ordered
	 */
	DODECAGON(46, "Dodecagon", "Dodecagon"), /**
	 * The '<em><b>Double Arrow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_ARROW(47, "DoubleArrow", "DoubleArrow"), /**
	 * The '<em><b>Double End Arrow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_END_ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_END_ARROW(48, "DoubleEndArrow", "DoubleEndArrow"),

	/**
	 * The '<em><b>External Organization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_ORGANIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_ORGANIZATION(49, "ExternalOrganization", "ExternalOrganization"),

	/**
	 * The '<em><b>External Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_PROCESS(50, "ExternalProcess", "ExternalProcess"), /**
	 * The '<em><b>Eight Pointed Star</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHT_POINTED_STAR_VALUE
	 * @generated
	 * @ordered
	 */
	EIGHT_POINTED_STAR(51, "EightPointedStar", "EightPointedStar"), /**
	 * The '<em><b>Eight Pointed Burst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHT_POINTED_BURST_VALUE
	 * @generated
	 * @ordered
	 */
	EIGHT_POINTED_BURST(52, "EightPointedBurst", "EightPointedBurst"),

	/**
	 * The '<em><b>File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_VALUE
	 * @generated
	 * @ordered
	 */
	FILE(53, "File", "File"), /**
	 * The '<em><b>Five Pointed Burst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_POINTED_BURST_VALUE
	 * @generated
	 * @ordered
	 */
	FIVE_POINTED_BURST(54, "FivePointedBurst", "FivePointedBurst"), /**
	 * The '<em><b>Five Pointed Star</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_POINTED_STAR_VALUE
	 * @generated
	 * @ordered
	 */
	FIVE_POINTED_STAR(55, "FivePointedStar", "FivePointedStar"), /**
	 * The '<em><b>Fragile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAGILE_VALUE
	 * @generated
	 * @ordered
	 */
	FRAGILE(56, "Fragile", "Fragile"), /**
	 * The '<em><b>Framed Rectangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAMED_RECTANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	FRAMED_RECTANGLE(57, "FramedRectangle", "FramedRectangle"), /**
	 * The '<em><b>Gender Male</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENDER_MALE_VALUE
	 * @generated
	 * @ordered
	 */
	GENDER_MALE(58, "GenderMale", "GenderMale"), /**
	 * The '<em><b>Gender Female</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENDER_FEMALE_VALUE
	 * @generated
	 * @ordered
	 */
	GENDER_FEMALE(59, "GenderFemale", "GenderFemale"), /**
	 * The '<em><b>Ground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_VALUE
	 * @generated
	 * @ordered
	 */
	GROUND(60, "Ground", "Ground"), /**
	 * The '<em><b>Heart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEART_VALUE
	 * @generated
	 * @ordered
	 */
	HEART(61, "Heart", "Heart"), /**
	 * The '<em><b>Hexagon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXAGON_VALUE
	 * @generated
	 * @ordered
	 */
	HEXAGON(62, "Hexagon", "Hexagon"), /**
	 * The '<em><b>Heptagon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEPTAGON_VALUE
	 * @generated
	 * @ordered
	 */
	HEPTAGON(63, "Heptagon", "Heptagon"), /**
	 * The '<em><b>Hour Glass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_GLASS_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR_GLASS(64, "HourGlass", "HourGlass"), /**
	 * The '<em><b>IBeam Arrow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IBEAM_ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	IBEAM_ARROW(65, "IBeamArrow", "IBeamArrow"), /**
	 * The '<em><b>Inductor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	INDUCTOR(66, "Inductor", "Inductor"),

	/**
	 * The '<em><b>Internal Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_STORAGE(67, "InternalStorage", "InternalStorage"), /**
	 * The '<em><b>Interrupt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERRUPT_VALUE
	 * @generated
	 * @ordered
	 */
	INTERRUPT(68, "Interrupt", "Interrupt"), /**
	 * The '<em><b>Inverter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERTER_VALUE
	 * @generated
	 * @ordered
	 */
	INVERTER(69, "Inverter", "Inverter"),

	/**
	 * The '<em><b>Junction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	JUNCTION(70, "Junction", "Junction"), /**
	 * The '<em><b>Lightning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTNING_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTNING(71, "Lightning", "Lightning"), /**
	 * The '<em><b>Line1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE1_VALUE
	 * @generated
	 * @ordered
	 */
	LINE1(72, "Line1", "Line1"), /**
	 * The '<em><b>Line2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE2_VALUE
	 * @generated
	 * @ordered
	 */
	LINE2(73, "Line2", "Line2"),

	/**
	 * The '<em><b>Lined Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINED_DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	LINED_DOCUMENT(74, "LinedDocument", "LinedDocument"), /**
	 * The '<em><b>Line H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_H_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_H(75, "LineH", "LineH"), /**
	 * The '<em><b>Line V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_V_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_V(76, "LineV", "LineV"), /**
	 * The '<em><b>Logic And</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_AND_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_AND(77, "LogicAnd", "LogicAnd"), /**
	 * The '<em><b>Logic Falsity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_FALSITY_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_FALSITY(78, "LogicFalsity", "LogicFalsity"), /**
	 * The '<em><b>Logic For All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_FOR_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_FOR_ALL(79, "LogicForAll", "LogicForAll"), /**
	 * The '<em><b>Logic Iff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_IFF_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_IFF(80, "LogicIff", "LogicIff"), /**
	 * The '<em><b>Logic Implies</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_IMPLIES_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_IMPLIES(81, "LogicImplies", "LogicImplies"), /**
	 * The '<em><b>Logic Intersect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_INTERSECT_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_INTERSECT(82, "LogicIntersect", "LogicIntersect"), /**
	 * The '<em><b>Logic Is Defined As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_IS_DEFINED_AS_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_IS_DEFINED_AS(83, "LogicIsDefinedAs", "LogicIsDefinedAs"), /**
	 * The '<em><b>Logic Not</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_NOT_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_NOT(84, "LogicNot", "LogicNot"), /**
	 * The '<em><b>Logic Or</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_OR_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_OR(85, "LogicOr", "LogicOr"), /**
	 * The '<em><b>Logic There Exists</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_THERE_EXISTS_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_THERE_EXISTS(86, "LogicThereExists", "LogicThereExists"), /**
	 * The '<em><b>Logic Truth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_TRUTH_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_TRUTH(87, "LogicTruth", "LogicTruth"), /**
	 * The '<em><b>Logic Union</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_UNION(88, "LogicUnion", "LogicUnion"), /**
	 * The '<em><b>Logic Xor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_XOR_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_XOR(89, "LogicXor", "LogicXor"), /**
	 * The '<em><b>Minus Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS_LINE(90, "MinusLine", "MinusLine"),

	/**
	 * The '<em><b>Multi Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_DOCUMENT(91, "MultiDocument", "MultiDocument"),

	/**
	 * The '<em><b>Multi Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_PROCESS(92, "MultiProcess", "MultiProcess"), /**
	 * The '<em><b>Nand Gate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAND_GATE_VALUE
	 * @generated
	 * @ordered
	 */
	NAND_GATE(93, "NandGate", "NandGate"), /**
	 * The '<em><b>Nine Pointed Burst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINE_POINTED_BURST_VALUE
	 * @generated
	 * @ordered
	 */
	NINE_POINTED_BURST(94, "NinePointedBurst", "NinePointedBurst"), /**
	 * The '<em><b>Nine Pointed Star</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINE_POINTED_STAR_VALUE
	 * @generated
	 * @ordered
	 */
	NINE_POINTED_STAR(95, "NinePointedStar", "NinePointedStar"), /**
	 * The '<em><b>Nonagon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONAGON_VALUE
	 * @generated
	 * @ordered
	 */
	NONAGON(96, "Nonagon", "Nonagon"), /**
	 * The '<em><b>Nor Gate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOR_GATE_VALUE
	 * @generated
	 * @ordered
	 */
	NOR_GATE(97, "NorGate", "NorGate"), /**
	 * The '<em><b>Not Allowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ALLOWED(98, "NotAllowed", "NotAllowed"), /**
	 * The '<em><b>Octagon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTAGON_VALUE
	 * @generated
	 * @ordered
	 */
	OCTAGON(99, "Octagon", "Octagon"), /**
	 * The '<em><b>Or Gate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_GATE_VALUE
	 * @generated
	 * @ordered
	 */
	OR_GATE(100, "OrGate", "OrGate"), /**
	 * The '<em><b>Parallelogram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLELOGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLELOGRAM(101, "Parallelogram", "Parallelogram"), /**
	 * The '<em><b>Peace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEACE_VALUE
	 * @generated
	 * @ordered
	 */
	PEACE(102, "Peace", "Peace"), /**
	 * The '<em><b>Pentagon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENTAGON_VALUE
	 * @generated
	 * @ordered
	 */
	PENTAGON(103, "Pentagon", "Pentagon"), /**
	 * The '<em><b>Pie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_VALUE
	 * @generated
	 * @ordered
	 */
	PIE(104, "Pie", "Pie"), /**
	 * The '<em><b>Pie Piece</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_PIECE_VALUE
	 * @generated
	 * @ordered
	 */
	PIE_PIECE(105, "PiePiece", "PiePiece"), /**
	 * The '<em><b>Plus Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_LINE(106, "PlusLine", "PlusLine"), /**
	 * The '<em><b>Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	POINTER(107, "Pointer", "Pointer"), /**
	 * The '<em><b>Prism1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRISM1_VALUE
	 * @generated
	 * @ordered
	 */
	PRISM1(108, "Prism1", "Prism1"), /**
	 * The '<em><b>Prism2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRISM2_VALUE
	 * @generated
	 * @ordered
	 */
	PRISM2(109, "Prism2", "Prism2"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(110, "Procedure", "Procedure"),

	/**
	 * The '<em><b>Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS(111, "Process", "Process"), /**
	 * The '<em><b>Pyramid1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PYRAMID1_VALUE
	 * @generated
	 * @ordered
	 */
	PYRAMID1(112, "Pyramid1", "Pyramid1"), /**
	 * The '<em><b>Pyramid2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PYRAMID2_VALUE
	 * @generated
	 * @ordered
	 */
	PYRAMID2(113, "Pyramid2", "Pyramid2"), /**
	 * The '<em><b>Resistor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESISTOR_VALUE
	 * @generated
	 * @ordered
	 */
	RESISTOR(114, "Resistor", "Resistor"), /**
	 * The '<em><b>Ring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RING_VALUE
	 * @generated
	 * @ordered
	 */
	RING(115, "Ring", "Ring"), /**
	 * The '<em><b>Rounded Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUNDED_POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	ROUNDED_POINTER(116, "RoundedPointer", "RoundedPointer"), /**
	 * The '<em><b>Rounded Rectangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUNDED_RECTANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	ROUNDED_RECTANGLE(117, "RoundedRectangle", "RoundedRectangle"), /**
	 * The '<em><b>Seven Pointed Burst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVEN_POINTED_BURST_VALUE
	 * @generated
	 * @ordered
	 */
	SEVEN_POINTED_BURST(118, "SevenPointedBurst", "SevenPointedBurst"), /**
	 * The '<em><b>Seven Pointed Star</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVEN_POINTED_STAR_VALUE
	 * @generated
	 * @ordered
	 */
	SEVEN_POINTED_STAR(119, "SevenPointedStar", "SevenPointedStar"), /**
	 * The '<em><b>Six Pointed Burst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX_POINTED_BURST_VALUE
	 * @generated
	 * @ordered
	 */
	SIX_POINTED_BURST(120, "SixPointedBurst", "SixPointedBurst"), /**
	 * The '<em><b>Six Pointed Star</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX_POINTED_STAR_VALUE
	 * @generated
	 * @ordered
	 */
	SIX_POINTED_STAR(121, "SixPointedStar", "SixPointedStar"), /**
	 * The '<em><b>Spade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPADE_VALUE
	 * @generated
	 * @ordered
	 */
	SPADE(122, "Spade", "Spade"), /**
	 * The '<em><b>Split End Arrow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPLIT_END_ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	SPLIT_END_ARROW(123, "SplitEndArrow", "SplitEndArrow"), /**
	 * The '<em><b>Stop Sign</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_SIGN_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_SIGN(124, "StopSign", "StopSign"), /**
	 * The '<em><b>Square Arrow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	SQUARE_ARROW(125, "SquareArrow", "SquareArrow"), /**
	 * The '<em><b>Ten Pointed Burst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEN_POINTED_BURST_VALUE
	 * @generated
	 * @ordered
	 */
	TEN_POINTED_BURST(126, "TenPointedBurst", "TenPointedBurst"), /**
	 * The '<em><b>Ten Pointed Star</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEN_POINTED_STAR_VALUE
	 * @generated
	 * @ordered
	 */
	TEN_POINTED_STAR(127, "TenPointedStar", "TenPointedStar"), /**
	 * The '<em><b>Thick Cross</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THICK_CROSS_VALUE
	 * @generated
	 * @ordered
	 */
	THICK_CROSS(128, "ThickCross", "ThickCross"), /**
	 * The '<em><b>Thick X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THICK_X_VALUE
	 * @generated
	 * @ordered
	 */
	THICK_X(129, "ThickX", "ThickX"), /**
	 * The '<em><b>Thin Cross</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIN_CROSS_VALUE
	 * @generated
	 * @ordered
	 */
	THIN_CROSS(130, "ThinCross", "ThinCross"), /**
	 * The '<em><b>Thin X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIN_X_VALUE
	 * @generated
	 * @ordered
	 */
	THIN_X(131, "ThinX", "ThinX"), /**
	 * The '<em><b>Triangle Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGLE_RIGHT(132, "TriangleRight", "TriangleRight"), /**
	 * The '<em><b>Triangle Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGLE_DOWN(133, "TriangleDown", "TriangleDown"), /**
	 * The '<em><b>Triangle Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGLE_LEFT(134, "TriangleLeft", "TriangleLeft"), /**
	 * The '<em><b>Trapezoid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAPEZOID_VALUE
	 * @generated
	 * @ordered
	 */
	TRAPEZOID(135, "Trapezoid", "Trapezoid"), /**
	 * The '<em><b>Yin Yang</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YIN_YANG_VALUE
	 * @generated
	 * @ordered
	 */
	YIN_YANG(136, "YinYang", "YinYang"), /**
	 * The '<em><b>XLine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLINE_VALUE
	 * @generated
	 * @ordered
	 */
	XLINE(137, "XLine", "XLine"), /**
	 * The '<em><b>Xnor Gate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XNOR_GATE_VALUE
	 * @generated
	 * @ordered
	 */
	XNOR_GATE(138, "XnorGate", "XnorGate"), /**
	 * The '<em><b>Xor Gate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XOR_GATE_VALUE
	 * @generated
	 * @ordered
	 */
	XOR_GATE(139, "XorGate", "XorGate");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Ellipse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELLIPSE
	 * @model name="Ellipse"
	 * @generated
	 * @ordered
	 */
	public static final int ELLIPSE_VALUE = 1;

	/**
	 * The '<em><b>Rectangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTANGLE
	 * @model name="Rectangle"
	 * @generated
	 * @ordered
	 */
	public static final int RECTANGLE_VALUE = 2;

	/**
	 * The '<em><b>Square</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE
	 * @model name="Square"
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE_VALUE = 3;

	/**
	 * The '<em><b>Triangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE
	 * @model name="Triangle"
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGLE_VALUE = 4;

	/**
	 * The '<em><b>Actor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR
	 * @model name="Actor"
	 * @generated
	 * @ordered
	 */
	public static final int ACTOR_VALUE = 5;

	/**
	 * The '<em><b>ACvoltage Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACVOLTAGE_SOURCE
	 * @model name="ACvoltageSource"
	 * @generated
	 * @ordered
	 */
	public static final int ACVOLTAGE_SOURCE_VALUE = 6;

	/**
	 * The '<em><b>And Gate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_GATE
	 * @model name="AndGate"
	 * @generated
	 * @ordered
	 */
	public static final int AND_GATE_VALUE = 7;

	/**
	 * The '<em><b>Arrow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW
	 * @model name="Arrow"
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_VALUE = 8;

	/**
	 * The '<em><b>Asterisk Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASTERISK_LINE
	 * @model name="AsteriskLine"
	 * @generated
	 * @ordered
	 */
	public static final int ASTERISK_LINE_VALUE = 9;

	/**
	 * The '<em><b>Bar H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_H
	 * @model name="BarH"
	 * @generated
	 * @ordered
	 */
	public static final int BAR_H_VALUE = 10;

	/**
	 * The '<em><b>Bar V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_V
	 * @model name="BarV"
	 * @generated
	 * @ordered
	 */
	public static final int BAR_V_VALUE = 11;

	/**
	 * The '<em><b>Border</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER
	 * @model name="Border"
	 * @generated
	 * @ordered
	 */
	public static final int BORDER_VALUE = 12;

	/**
	 * The '<em><b>Buffer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUFFER
	 * @model name="Buffer"
	 * @generated
	 * @ordered
	 */
	public static final int BUFFER_VALUE = 13;

	/**
	 * The '<em><b>Capacitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPACITOR
	 * @model name="Capacitor"
	 * @generated
	 * @ordered
	 */
	public static final int CAPACITOR_VALUE = 14;

	/**
	 * The '<em><b>Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARD
	 * @model name="Card"
	 * @generated
	 * @ordered
	 */
	public static final int CARD_VALUE = 15;

	/**
	 * The '<em><b>Chevron</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEVRON
	 * @model name="Chevron"
	 * @generated
	 * @ordered
	 */
	public static final int CHEVRON_VALUE = 16;

	/**
	 * The '<em><b>Circle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE
	 * @model name="Circle"
	 * @generated
	 * @ordered
	 */
	public static final int CIRCLE_VALUE = 17;

	/**
	 * The '<em><b>Circle Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE_LINE
	 * @model name="CircleLine"
	 * @generated
	 * @ordered
	 */
	public static final int CIRCLE_LINE_VALUE = 18;

	/**
	 * The '<em><b>Clock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOCK
	 * @model name="Clock"
	 * @generated
	 * @ordered
	 */
	public static final int CLOCK_VALUE = 19;

	/**
	 * The '<em><b>Cloud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD
	 * @model name="Cloud"
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_VALUE = 20;

	/**
	 * The '<em><b>Club</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUB
	 * @model name="Club"
	 * @generated
	 * @ordered
	 */
	public static final int CLUB_VALUE = 21;

	/**
	 * The '<em><b>Cone1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONE1
	 * @model name="Cone1"
	 * @generated
	 * @ordered
	 */
	public static final int CONE1_VALUE = 22;

	/**
	 * The '<em><b>Cone2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONE2
	 * @model name="Cone2"
	 * @generated
	 * @ordered
	 */
	public static final int CONE2_VALUE = 23;

	/**
	 * The '<em><b>Create Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_REQUEST
	 * @model name="CreateRequest"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_REQUEST_VALUE = 24;

	/**
	 * The '<em><b>Cube1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE1
	 * @model name="Cube1"
	 * @generated
	 * @ordered
	 */
	public static final int CUBE1_VALUE = 25;

	/**
	 * The '<em><b>Cube2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE2
	 * @model name="Cube2"
	 * @generated
	 * @ordered
	 */
	public static final int CUBE2_VALUE = 26;

	/**
	 * The '<em><b>Curve1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVE1
	 * @model name="Curve1"
	 * @generated
	 * @ordered
	 */
	public static final int CURVE1_VALUE = 27;

	/**
	 * The '<em><b>Curve2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVE2
	 * @model name="Curve2"
	 * @generated
	 * @ordered
	 */
	public static final int CURVE2_VALUE = 28;

	/**
	 * The '<em><b>Curve3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVE3
	 * @model name="Curve3"
	 * @generated
	 * @ordered
	 */
	public static final int CURVE3_VALUE = 29;

	/**
	 * The '<em><b>Curve4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVE4
	 * @model name="Curve4"
	 * @generated
	 * @ordered
	 */
	public static final int CURVE4_VALUE = 30;

	/**
	 * The '<em><b>Cylinder1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER1
	 * @model name="Cylinder1"
	 * @generated
	 * @ordered
	 */
	public static final int CYLINDER1_VALUE = 31;

	/**
	 * The '<em><b>Cylinder2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER2
	 * @model name="Cylinder2"
	 * @generated
	 * @ordered
	 */
	public static final int CYLINDER2_VALUE = 32;

	/**
	 * The '<em><b>Cylinder3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER3
	 * @model name="Cylinder3"
	 * @generated
	 * @ordered
	 */
	public static final int CYLINDER3_VALUE = 33;

	/**
	 * The '<em><b>Cylinder4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER4
	 * @model name="Cylinder4"
	 * @generated
	 * @ordered
	 */
	public static final int CYLINDER4_VALUE = 34;

	/**
	 * The '<em><b>Database</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATABASE
	 * @model name="Database"
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_VALUE = 35;

	/**
	 * The '<em><b>Data Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_STORAGE
	 * @model name="DataStorage"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_STORAGE_VALUE = 36;

	/**
	 * The '<em><b>DCvoltage Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCVOLTAGE_SOURCE
	 * @model name="DCvoltageSource"
	 * @generated
	 * @ordered
	 */
	public static final int DCVOLTAGE_SOURCE_VALUE = 37;

	/**
	 * The '<em><b>Decagon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECAGON
	 * @model name="Decagon"
	 * @generated
	 * @ordered
	 */
	public static final int DECAGON_VALUE = 38;

	/**
	 * The '<em><b>Diamond</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMOND
	 * @model name="Diamond"
	 * @generated
	 * @ordered
	 */
	public static final int DIAMOND_VALUE = 39;

	/**
	 * The '<em><b>Diode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIODE
	 * @model name="Diode"
	 * @generated
	 * @ordered
	 */
	public static final int DIODE_VALUE = 40;

	/**
	 * The '<em><b>Disk Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISK_STORAGE
	 * @model name="DiskStorage"
	 * @generated
	 * @ordered
	 */
	public static final int DISK_STORAGE_VALUE = 41;

	/**
	 * The '<em><b>Display</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY
	 * @model name="Display"
	 * @generated
	 * @ordered
	 */
	public static final int DISPLAY_VALUE = 42;

	/**
	 * The '<em><b>Divided Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDED_EVENT
	 * @model name="DividedEvent"
	 * @generated
	 * @ordered
	 */
	public static final int DIVIDED_EVENT_VALUE = 43;

	/**
	 * The '<em><b>Divided Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDED_PROCESS
	 * @model name="DividedProcess"
	 * @generated
	 * @ordered
	 */
	public static final int DIVIDED_PROCESS_VALUE = 44;

	/**
	 * The '<em><b>Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT
	 * @model name="Document"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_VALUE = 45;

	/**
	 * The '<em><b>Dodecagon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DODECAGON
	 * @model name="Dodecagon"
	 * @generated
	 * @ordered
	 */
	public static final int DODECAGON_VALUE = 46;

	/**
	 * The '<em><b>Double Arrow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ARROW
	 * @model name="DoubleArrow"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_ARROW_VALUE = 47;

	/**
	 * The '<em><b>Double End Arrow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_END_ARROW
	 * @model name="DoubleEndArrow"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_END_ARROW_VALUE = 48;

	/**
	 * The '<em><b>External Organization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_ORGANIZATION
	 * @model name="ExternalOrganization"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_ORGANIZATION_VALUE = 49;

	/**
	 * The '<em><b>External Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_PROCESS
	 * @model name="ExternalProcess"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_PROCESS_VALUE = 50;

	/**
	 * The '<em><b>Eight Pointed Star</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHT_POINTED_STAR
	 * @model name="EightPointedStar"
	 * @generated
	 * @ordered
	 */
	public static final int EIGHT_POINTED_STAR_VALUE = 51;

	/**
	 * The '<em><b>Eight Pointed Burst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHT_POINTED_BURST
	 * @model name="EightPointedBurst"
	 * @generated
	 * @ordered
	 */
	public static final int EIGHT_POINTED_BURST_VALUE = 52;

	/**
	 * The '<em><b>File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE
	 * @model name="File"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_VALUE = 53;

	/**
	 * The '<em><b>Five Pointed Burst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_POINTED_BURST
	 * @model name="FivePointedBurst"
	 * @generated
	 * @ordered
	 */
	public static final int FIVE_POINTED_BURST_VALUE = 54;

	/**
	 * The '<em><b>Five Pointed Star</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_POINTED_STAR
	 * @model name="FivePointedStar"
	 * @generated
	 * @ordered
	 */
	public static final int FIVE_POINTED_STAR_VALUE = 55;

	/**
	 * The '<em><b>Fragile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAGILE
	 * @model name="Fragile"
	 * @generated
	 * @ordered
	 */
	public static final int FRAGILE_VALUE = 56;

	/**
	 * The '<em><b>Framed Rectangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAMED_RECTANGLE
	 * @model name="FramedRectangle"
	 * @generated
	 * @ordered
	 */
	public static final int FRAMED_RECTANGLE_VALUE = 57;

	/**
	 * The '<em><b>Gender Male</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENDER_MALE
	 * @model name="GenderMale"
	 * @generated
	 * @ordered
	 */
	public static final int GENDER_MALE_VALUE = 58;

	/**
	 * The '<em><b>Gender Female</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENDER_FEMALE
	 * @model name="GenderFemale"
	 * @generated
	 * @ordered
	 */
	public static final int GENDER_FEMALE_VALUE = 59;

	/**
	 * The '<em><b>Ground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND
	 * @model name="Ground"
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_VALUE = 60;

	/**
	 * The '<em><b>Heart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEART
	 * @model name="Heart"
	 * @generated
	 * @ordered
	 */
	public static final int HEART_VALUE = 61;

	/**
	 * The '<em><b>Hexagon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXAGON
	 * @model name="Hexagon"
	 * @generated
	 * @ordered
	 */
	public static final int HEXAGON_VALUE = 62;

	/**
	 * The '<em><b>Heptagon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEPTAGON
	 * @model name="Heptagon"
	 * @generated
	 * @ordered
	 */
	public static final int HEPTAGON_VALUE = 63;

	/**
	 * The '<em><b>Hour Glass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_GLASS
	 * @model name="HourGlass"
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_GLASS_VALUE = 64;

	/**
	 * The '<em><b>IBeam Arrow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IBEAM_ARROW
	 * @model name="IBeamArrow"
	 * @generated
	 * @ordered
	 */
	public static final int IBEAM_ARROW_VALUE = 65;

	/**
	 * The '<em><b>Inductor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUCTOR
	 * @model name="Inductor"
	 * @generated
	 * @ordered
	 */
	public static final int INDUCTOR_VALUE = 66;

	/**
	 * The '<em><b>Internal Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_STORAGE
	 * @model name="InternalStorage"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_STORAGE_VALUE = 67;

	/**
	 * The '<em><b>Interrupt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERRUPT
	 * @model name="Interrupt"
	 * @generated
	 * @ordered
	 */
	public static final int INTERRUPT_VALUE = 68;

	/**
	 * The '<em><b>Inverter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERTER
	 * @model name="Inverter"
	 * @generated
	 * @ordered
	 */
	public static final int INVERTER_VALUE = 69;

	/**
	 * The '<em><b>Junction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUNCTION
	 * @model name="Junction"
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION_VALUE = 70;

	/**
	 * The '<em><b>Lightning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTNING
	 * @model name="Lightning"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTNING_VALUE = 71;

	/**
	 * The '<em><b>Line1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE1
	 * @model name="Line1"
	 * @generated
	 * @ordered
	 */
	public static final int LINE1_VALUE = 72;

	/**
	 * The '<em><b>Line2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE2
	 * @model name="Line2"
	 * @generated
	 * @ordered
	 */
	public static final int LINE2_VALUE = 73;

	/**
	 * The '<em><b>Lined Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINED_DOCUMENT
	 * @model name="LinedDocument"
	 * @generated
	 * @ordered
	 */
	public static final int LINED_DOCUMENT_VALUE = 74;

	/**
	 * The '<em><b>Line H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_H
	 * @model name="LineH"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_H_VALUE = 75;

	/**
	 * The '<em><b>Line V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_V
	 * @model name="LineV"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_V_VALUE = 76;

	/**
	 * The '<em><b>Logic And</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_AND
	 * @model name="LogicAnd"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_AND_VALUE = 77;

	/**
	 * The '<em><b>Logic Falsity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_FALSITY
	 * @model name="LogicFalsity"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_FALSITY_VALUE = 78;

	/**
	 * The '<em><b>Logic For All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_FOR_ALL
	 * @model name="LogicForAll"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_FOR_ALL_VALUE = 79;

	/**
	 * The '<em><b>Logic Iff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_IFF
	 * @model name="LogicIff"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_IFF_VALUE = 80;

	/**
	 * The '<em><b>Logic Implies</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_IMPLIES
	 * @model name="LogicImplies"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_IMPLIES_VALUE = 81;

	/**
	 * The '<em><b>Logic Intersect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_INTERSECT
	 * @model name="LogicIntersect"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_INTERSECT_VALUE = 82;

	/**
	 * The '<em><b>Logic Is Defined As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_IS_DEFINED_AS
	 * @model name="LogicIsDefinedAs"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_IS_DEFINED_AS_VALUE = 83;

	/**
	 * The '<em><b>Logic Not</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_NOT
	 * @model name="LogicNot"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_NOT_VALUE = 84;

	/**
	 * The '<em><b>Logic Or</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_OR
	 * @model name="LogicOr"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_OR_VALUE = 85;

	/**
	 * The '<em><b>Logic There Exists</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_THERE_EXISTS
	 * @model name="LogicThereExists"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_THERE_EXISTS_VALUE = 86;

	/**
	 * The '<em><b>Logic Truth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_TRUTH
	 * @model name="LogicTruth"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_TRUTH_VALUE = 87;

	/**
	 * The '<em><b>Logic Union</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_UNION
	 * @model name="LogicUnion"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_UNION_VALUE = 88;

	/**
	 * The '<em><b>Logic Xor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_XOR
	 * @model name="LogicXor"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_XOR_VALUE = 89;

	/**
	 * The '<em><b>Minus Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_LINE
	 * @model name="MinusLine"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_LINE_VALUE = 90;

	/**
	 * The '<em><b>Multi Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_DOCUMENT
	 * @model name="MultiDocument"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_DOCUMENT_VALUE = 91;

	/**
	 * The '<em><b>Multi Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_PROCESS
	 * @model name="MultiProcess"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_PROCESS_VALUE = 92;

	/**
	 * The '<em><b>Nand Gate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAND_GATE
	 * @model name="NandGate"
	 * @generated
	 * @ordered
	 */
	public static final int NAND_GATE_VALUE = 93;

	/**
	 * The '<em><b>Nine Pointed Burst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINE_POINTED_BURST
	 * @model name="NinePointedBurst"
	 * @generated
	 * @ordered
	 */
	public static final int NINE_POINTED_BURST_VALUE = 94;

	/**
	 * The '<em><b>Nine Pointed Star</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINE_POINTED_STAR
	 * @model name="NinePointedStar"
	 * @generated
	 * @ordered
	 */
	public static final int NINE_POINTED_STAR_VALUE = 95;

	/**
	 * The '<em><b>Nonagon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONAGON
	 * @model name="Nonagon"
	 * @generated
	 * @ordered
	 */
	public static final int NONAGON_VALUE = 96;

	/**
	 * The '<em><b>Nor Gate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOR_GATE
	 * @model name="NorGate"
	 * @generated
	 * @ordered
	 */
	public static final int NOR_GATE_VALUE = 97;

	/**
	 * The '<em><b>Not Allowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ALLOWED
	 * @model name="NotAllowed"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ALLOWED_VALUE = 98;

	/**
	 * The '<em><b>Octagon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTAGON
	 * @model name="Octagon"
	 * @generated
	 * @ordered
	 */
	public static final int OCTAGON_VALUE = 99;

	/**
	 * The '<em><b>Or Gate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_GATE
	 * @model name="OrGate"
	 * @generated
	 * @ordered
	 */
	public static final int OR_GATE_VALUE = 100;

	/**
	 * The '<em><b>Parallelogram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLELOGRAM
	 * @model name="Parallelogram"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLELOGRAM_VALUE = 101;

	/**
	 * The '<em><b>Peace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEACE
	 * @model name="Peace"
	 * @generated
	 * @ordered
	 */
	public static final int PEACE_VALUE = 102;

	/**
	 * The '<em><b>Pentagon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENTAGON
	 * @model name="Pentagon"
	 * @generated
	 * @ordered
	 */
	public static final int PENTAGON_VALUE = 103;

	/**
	 * The '<em><b>Pie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE
	 * @model name="Pie"
	 * @generated
	 * @ordered
	 */
	public static final int PIE_VALUE = 104;

	/**
	 * The '<em><b>Pie Piece</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_PIECE
	 * @model name="PiePiece"
	 * @generated
	 * @ordered
	 */
	public static final int PIE_PIECE_VALUE = 105;

	/**
	 * The '<em><b>Plus Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_LINE
	 * @model name="PlusLine"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_LINE_VALUE = 106;

	/**
	 * The '<em><b>Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINTER
	 * @model name="Pointer"
	 * @generated
	 * @ordered
	 */
	public static final int POINTER_VALUE = 107;

	/**
	 * The '<em><b>Prism1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRISM1
	 * @model name="Prism1"
	 * @generated
	 * @ordered
	 */
	public static final int PRISM1_VALUE = 108;

	/**
	 * The '<em><b>Prism2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRISM2
	 * @model name="Prism2"
	 * @generated
	 * @ordered
	 */
	public static final int PRISM2_VALUE = 109;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE
	 * @model name="Procedure"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 110;

	/**
	 * The '<em><b>Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS
	 * @model name="Process"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_VALUE = 111;

	/**
	 * The '<em><b>Pyramid1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PYRAMID1
	 * @model name="Pyramid1"
	 * @generated
	 * @ordered
	 */
	public static final int PYRAMID1_VALUE = 112;

	/**
	 * The '<em><b>Pyramid2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PYRAMID2
	 * @model name="Pyramid2"
	 * @generated
	 * @ordered
	 */
	public static final int PYRAMID2_VALUE = 113;

	/**
	 * The '<em><b>Resistor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESISTOR
	 * @model name="Resistor"
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR_VALUE = 114;

	/**
	 * The '<em><b>Ring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RING
	 * @model name="Ring"
	 * @generated
	 * @ordered
	 */
	public static final int RING_VALUE = 115;

	/**
	 * The '<em><b>Rounded Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUNDED_POINTER
	 * @model name="RoundedPointer"
	 * @generated
	 * @ordered
	 */
	public static final int ROUNDED_POINTER_VALUE = 116;

	/**
	 * The '<em><b>Rounded Rectangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUNDED_RECTANGLE
	 * @model name="RoundedRectangle"
	 * @generated
	 * @ordered
	 */
	public static final int ROUNDED_RECTANGLE_VALUE = 117;

	/**
	 * The '<em><b>Seven Pointed Burst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVEN_POINTED_BURST
	 * @model name="SevenPointedBurst"
	 * @generated
	 * @ordered
	 */
	public static final int SEVEN_POINTED_BURST_VALUE = 118;

	/**
	 * The '<em><b>Seven Pointed Star</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVEN_POINTED_STAR
	 * @model name="SevenPointedStar"
	 * @generated
	 * @ordered
	 */
	public static final int SEVEN_POINTED_STAR_VALUE = 119;

	/**
	 * The '<em><b>Six Pointed Burst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX_POINTED_BURST
	 * @model name="SixPointedBurst"
	 * @generated
	 * @ordered
	 */
	public static final int SIX_POINTED_BURST_VALUE = 120;

	/**
	 * The '<em><b>Six Pointed Star</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX_POINTED_STAR
	 * @model name="SixPointedStar"
	 * @generated
	 * @ordered
	 */
	public static final int SIX_POINTED_STAR_VALUE = 121;

	/**
	 * The '<em><b>Spade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPADE
	 * @model name="Spade"
	 * @generated
	 * @ordered
	 */
	public static final int SPADE_VALUE = 122;

	/**
	 * The '<em><b>Split End Arrow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPLIT_END_ARROW
	 * @model name="SplitEndArrow"
	 * @generated
	 * @ordered
	 */
	public static final int SPLIT_END_ARROW_VALUE = 123;

	/**
	 * The '<em><b>Stop Sign</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_SIGN
	 * @model name="StopSign"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_SIGN_VALUE = 124;

	/**
	 * The '<em><b>Square Arrow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_ARROW
	 * @model name="SquareArrow"
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE_ARROW_VALUE = 125;

	/**
	 * The '<em><b>Ten Pointed Burst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEN_POINTED_BURST
	 * @model name="TenPointedBurst"
	 * @generated
	 * @ordered
	 */
	public static final int TEN_POINTED_BURST_VALUE = 126;

	/**
	 * The '<em><b>Ten Pointed Star</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEN_POINTED_STAR
	 * @model name="TenPointedStar"
	 * @generated
	 * @ordered
	 */
	public static final int TEN_POINTED_STAR_VALUE = 127;

	/**
	 * The '<em><b>Thick Cross</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THICK_CROSS
	 * @model name="ThickCross"
	 * @generated
	 * @ordered
	 */
	public static final int THICK_CROSS_VALUE = 128;

	/**
	 * The '<em><b>Thick X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THICK_X
	 * @model name="ThickX"
	 * @generated
	 * @ordered
	 */
	public static final int THICK_X_VALUE = 129;

	/**
	 * The '<em><b>Thin Cross</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIN_CROSS
	 * @model name="ThinCross"
	 * @generated
	 * @ordered
	 */
	public static final int THIN_CROSS_VALUE = 130;

	/**
	 * The '<em><b>Thin X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIN_X
	 * @model name="ThinX"
	 * @generated
	 * @ordered
	 */
	public static final int THIN_X_VALUE = 131;

	/**
	 * The '<em><b>Triangle Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE_RIGHT
	 * @model name="TriangleRight"
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGLE_RIGHT_VALUE = 132;

	/**
	 * The '<em><b>Triangle Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE_DOWN
	 * @model name="TriangleDown"
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGLE_DOWN_VALUE = 133;

	/**
	 * The '<em><b>Triangle Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGLE_LEFT
	 * @model name="TriangleLeft"
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGLE_LEFT_VALUE = 134;

	/**
	 * The '<em><b>Trapezoid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAPEZOID
	 * @model name="Trapezoid"
	 * @generated
	 * @ordered
	 */
	public static final int TRAPEZOID_VALUE = 135;

	/**
	 * The '<em><b>Yin Yang</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YIN_YANG
	 * @model name="YinYang"
	 * @generated
	 * @ordered
	 */
	public static final int YIN_YANG_VALUE = 136;

	/**
	 * The '<em><b>XLine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XLINE
	 * @model name="XLine"
	 * @generated
	 * @ordered
	 */
	public static final int XLINE_VALUE = 137;

	/**
	 * The '<em><b>Xnor Gate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XNOR_GATE
	 * @model name="XnorGate"
	 * @generated
	 * @ordered
	 */
	public static final int XNOR_GATE_VALUE = 138;

	/**
	 * The '<em><b>Xor Gate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XOR_GATE
	 * @model name="XorGate"
	 * @generated
	 * @ordered
	 */
	public static final int XOR_GATE_VALUE = 139;

	/**
	 * An array of all the '<em><b>Shapes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Shapes[] VALUES_ARRAY =
		new Shapes[] {
			NONE,
			ELLIPSE,
			RECTANGLE,
			SQUARE,
			TRIANGLE,
			ACTOR,
			ACVOLTAGE_SOURCE,
			AND_GATE,
			ARROW,
			ASTERISK_LINE,
			BAR_H,
			BAR_V,
			BORDER,
			BUFFER,
			CAPACITOR,
			CARD,
			CHEVRON,
			CIRCLE,
			CIRCLE_LINE,
			CLOCK,
			CLOUD,
			CLUB,
			CONE1,
			CONE2,
			CREATE_REQUEST,
			CUBE1,
			CUBE2,
			CURVE1,
			CURVE2,
			CURVE3,
			CURVE4,
			CYLINDER1,
			CYLINDER2,
			CYLINDER3,
			CYLINDER4,
			DATABASE,
			DATA_STORAGE,
			DCVOLTAGE_SOURCE,
			DECAGON,
			DIAMOND,
			DIODE,
			DISK_STORAGE,
			DISPLAY,
			DIVIDED_EVENT,
			DIVIDED_PROCESS,
			DOCUMENT,
			DODECAGON,
			DOUBLE_ARROW,
			DOUBLE_END_ARROW,
			EXTERNAL_ORGANIZATION,
			EXTERNAL_PROCESS,
			EIGHT_POINTED_STAR,
			EIGHT_POINTED_BURST,
			FILE,
			FIVE_POINTED_BURST,
			FIVE_POINTED_STAR,
			FRAGILE,
			FRAMED_RECTANGLE,
			GENDER_MALE,
			GENDER_FEMALE,
			GROUND,
			HEART,
			HEXAGON,
			HEPTAGON,
			HOUR_GLASS,
			IBEAM_ARROW,
			INDUCTOR,
			INTERNAL_STORAGE,
			INTERRUPT,
			INVERTER,
			JUNCTION,
			LIGHTNING,
			LINE1,
			LINE2,
			LINED_DOCUMENT,
			LINE_H,
			LINE_V,
			LOGIC_AND,
			LOGIC_FALSITY,
			LOGIC_FOR_ALL,
			LOGIC_IFF,
			LOGIC_IMPLIES,
			LOGIC_INTERSECT,
			LOGIC_IS_DEFINED_AS,
			LOGIC_NOT,
			LOGIC_OR,
			LOGIC_THERE_EXISTS,
			LOGIC_TRUTH,
			LOGIC_UNION,
			LOGIC_XOR,
			MINUS_LINE,
			MULTI_DOCUMENT,
			MULTI_PROCESS,
			NAND_GATE,
			NINE_POINTED_BURST,
			NINE_POINTED_STAR,
			NONAGON,
			NOR_GATE,
			NOT_ALLOWED,
			OCTAGON,
			OR_GATE,
			PARALLELOGRAM,
			PEACE,
			PENTAGON,
			PIE,
			PIE_PIECE,
			PLUS_LINE,
			POINTER,
			PRISM1,
			PRISM2,
			PROCEDURE,
			PROCESS,
			PYRAMID1,
			PYRAMID2,
			RESISTOR,
			RING,
			ROUNDED_POINTER,
			ROUNDED_RECTANGLE,
			SEVEN_POINTED_BURST,
			SEVEN_POINTED_STAR,
			SIX_POINTED_BURST,
			SIX_POINTED_STAR,
			SPADE,
			SPLIT_END_ARROW,
			STOP_SIGN,
			SQUARE_ARROW,
			TEN_POINTED_BURST,
			TEN_POINTED_STAR,
			THICK_CROSS,
			THICK_X,
			THIN_CROSS,
			THIN_X,
			TRIANGLE_RIGHT,
			TRIANGLE_DOWN,
			TRIANGLE_LEFT,
			TRAPEZOID,
			YIN_YANG,
			XLINE,
			XNOR_GATE,
			XOR_GATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Shapes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Shapes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Shapes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Shapes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Shapes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shapes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Shapes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Shapes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shapes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Shapes get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case ELLIPSE_VALUE: return ELLIPSE;
			case RECTANGLE_VALUE: return RECTANGLE;
			case SQUARE_VALUE: return SQUARE;
			case TRIANGLE_VALUE: return TRIANGLE;
			case ACTOR_VALUE: return ACTOR;
			case ACVOLTAGE_SOURCE_VALUE: return ACVOLTAGE_SOURCE;
			case AND_GATE_VALUE: return AND_GATE;
			case ARROW_VALUE: return ARROW;
			case ASTERISK_LINE_VALUE: return ASTERISK_LINE;
			case BAR_H_VALUE: return BAR_H;
			case BAR_V_VALUE: return BAR_V;
			case BORDER_VALUE: return BORDER;
			case BUFFER_VALUE: return BUFFER;
			case CAPACITOR_VALUE: return CAPACITOR;
			case CARD_VALUE: return CARD;
			case CHEVRON_VALUE: return CHEVRON;
			case CIRCLE_VALUE: return CIRCLE;
			case CIRCLE_LINE_VALUE: return CIRCLE_LINE;
			case CLOCK_VALUE: return CLOCK;
			case CLOUD_VALUE: return CLOUD;
			case CLUB_VALUE: return CLUB;
			case CONE1_VALUE: return CONE1;
			case CONE2_VALUE: return CONE2;
			case CREATE_REQUEST_VALUE: return CREATE_REQUEST;
			case CUBE1_VALUE: return CUBE1;
			case CUBE2_VALUE: return CUBE2;
			case CURVE1_VALUE: return CURVE1;
			case CURVE2_VALUE: return CURVE2;
			case CURVE3_VALUE: return CURVE3;
			case CURVE4_VALUE: return CURVE4;
			case CYLINDER1_VALUE: return CYLINDER1;
			case CYLINDER2_VALUE: return CYLINDER2;
			case CYLINDER3_VALUE: return CYLINDER3;
			case CYLINDER4_VALUE: return CYLINDER4;
			case DATABASE_VALUE: return DATABASE;
			case DATA_STORAGE_VALUE: return DATA_STORAGE;
			case DCVOLTAGE_SOURCE_VALUE: return DCVOLTAGE_SOURCE;
			case DECAGON_VALUE: return DECAGON;
			case DIAMOND_VALUE: return DIAMOND;
			case DIODE_VALUE: return DIODE;
			case DISK_STORAGE_VALUE: return DISK_STORAGE;
			case DISPLAY_VALUE: return DISPLAY;
			case DIVIDED_EVENT_VALUE: return DIVIDED_EVENT;
			case DIVIDED_PROCESS_VALUE: return DIVIDED_PROCESS;
			case DOCUMENT_VALUE: return DOCUMENT;
			case DODECAGON_VALUE: return DODECAGON;
			case DOUBLE_ARROW_VALUE: return DOUBLE_ARROW;
			case DOUBLE_END_ARROW_VALUE: return DOUBLE_END_ARROW;
			case EXTERNAL_ORGANIZATION_VALUE: return EXTERNAL_ORGANIZATION;
			case EXTERNAL_PROCESS_VALUE: return EXTERNAL_PROCESS;
			case EIGHT_POINTED_STAR_VALUE: return EIGHT_POINTED_STAR;
			case EIGHT_POINTED_BURST_VALUE: return EIGHT_POINTED_BURST;
			case FILE_VALUE: return FILE;
			case FIVE_POINTED_BURST_VALUE: return FIVE_POINTED_BURST;
			case FIVE_POINTED_STAR_VALUE: return FIVE_POINTED_STAR;
			case FRAGILE_VALUE: return FRAGILE;
			case FRAMED_RECTANGLE_VALUE: return FRAMED_RECTANGLE;
			case GENDER_MALE_VALUE: return GENDER_MALE;
			case GENDER_FEMALE_VALUE: return GENDER_FEMALE;
			case GROUND_VALUE: return GROUND;
			case HEART_VALUE: return HEART;
			case HEXAGON_VALUE: return HEXAGON;
			case HEPTAGON_VALUE: return HEPTAGON;
			case HOUR_GLASS_VALUE: return HOUR_GLASS;
			case IBEAM_ARROW_VALUE: return IBEAM_ARROW;
			case INDUCTOR_VALUE: return INDUCTOR;
			case INTERNAL_STORAGE_VALUE: return INTERNAL_STORAGE;
			case INTERRUPT_VALUE: return INTERRUPT;
			case INVERTER_VALUE: return INVERTER;
			case JUNCTION_VALUE: return JUNCTION;
			case LIGHTNING_VALUE: return LIGHTNING;
			case LINE1_VALUE: return LINE1;
			case LINE2_VALUE: return LINE2;
			case LINED_DOCUMENT_VALUE: return LINED_DOCUMENT;
			case LINE_H_VALUE: return LINE_H;
			case LINE_V_VALUE: return LINE_V;
			case LOGIC_AND_VALUE: return LOGIC_AND;
			case LOGIC_FALSITY_VALUE: return LOGIC_FALSITY;
			case LOGIC_FOR_ALL_VALUE: return LOGIC_FOR_ALL;
			case LOGIC_IFF_VALUE: return LOGIC_IFF;
			case LOGIC_IMPLIES_VALUE: return LOGIC_IMPLIES;
			case LOGIC_INTERSECT_VALUE: return LOGIC_INTERSECT;
			case LOGIC_IS_DEFINED_AS_VALUE: return LOGIC_IS_DEFINED_AS;
			case LOGIC_NOT_VALUE: return LOGIC_NOT;
			case LOGIC_OR_VALUE: return LOGIC_OR;
			case LOGIC_THERE_EXISTS_VALUE: return LOGIC_THERE_EXISTS;
			case LOGIC_TRUTH_VALUE: return LOGIC_TRUTH;
			case LOGIC_UNION_VALUE: return LOGIC_UNION;
			case LOGIC_XOR_VALUE: return LOGIC_XOR;
			case MINUS_LINE_VALUE: return MINUS_LINE;
			case MULTI_DOCUMENT_VALUE: return MULTI_DOCUMENT;
			case MULTI_PROCESS_VALUE: return MULTI_PROCESS;
			case NAND_GATE_VALUE: return NAND_GATE;
			case NINE_POINTED_BURST_VALUE: return NINE_POINTED_BURST;
			case NINE_POINTED_STAR_VALUE: return NINE_POINTED_STAR;
			case NONAGON_VALUE: return NONAGON;
			case NOR_GATE_VALUE: return NOR_GATE;
			case NOT_ALLOWED_VALUE: return NOT_ALLOWED;
			case OCTAGON_VALUE: return OCTAGON;
			case OR_GATE_VALUE: return OR_GATE;
			case PARALLELOGRAM_VALUE: return PARALLELOGRAM;
			case PEACE_VALUE: return PEACE;
			case PENTAGON_VALUE: return PENTAGON;
			case PIE_VALUE: return PIE;
			case PIE_PIECE_VALUE: return PIE_PIECE;
			case PLUS_LINE_VALUE: return PLUS_LINE;
			case POINTER_VALUE: return POINTER;
			case PRISM1_VALUE: return PRISM1;
			case PRISM2_VALUE: return PRISM2;
			case PROCEDURE_VALUE: return PROCEDURE;
			case PROCESS_VALUE: return PROCESS;
			case PYRAMID1_VALUE: return PYRAMID1;
			case PYRAMID2_VALUE: return PYRAMID2;
			case RESISTOR_VALUE: return RESISTOR;
			case RING_VALUE: return RING;
			case ROUNDED_POINTER_VALUE: return ROUNDED_POINTER;
			case ROUNDED_RECTANGLE_VALUE: return ROUNDED_RECTANGLE;
			case SEVEN_POINTED_BURST_VALUE: return SEVEN_POINTED_BURST;
			case SEVEN_POINTED_STAR_VALUE: return SEVEN_POINTED_STAR;
			case SIX_POINTED_BURST_VALUE: return SIX_POINTED_BURST;
			case SIX_POINTED_STAR_VALUE: return SIX_POINTED_STAR;
			case SPADE_VALUE: return SPADE;
			case SPLIT_END_ARROW_VALUE: return SPLIT_END_ARROW;
			case STOP_SIGN_VALUE: return STOP_SIGN;
			case SQUARE_ARROW_VALUE: return SQUARE_ARROW;
			case TEN_POINTED_BURST_VALUE: return TEN_POINTED_BURST;
			case TEN_POINTED_STAR_VALUE: return TEN_POINTED_STAR;
			case THICK_CROSS_VALUE: return THICK_CROSS;
			case THICK_X_VALUE: return THICK_X;
			case THIN_CROSS_VALUE: return THIN_CROSS;
			case THIN_X_VALUE: return THIN_X;
			case TRIANGLE_RIGHT_VALUE: return TRIANGLE_RIGHT;
			case TRIANGLE_DOWN_VALUE: return TRIANGLE_DOWN;
			case TRIANGLE_LEFT_VALUE: return TRIANGLE_LEFT;
			case TRAPEZOID_VALUE: return TRAPEZOID;
			case YIN_YANG_VALUE: return YIN_YANG;
			case XLINE_VALUE: return XLINE;
			case XNOR_GATE_VALUE: return XNOR_GATE;
			case XOR_GATE_VALUE: return XOR_GATE;
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
	private Shapes(int value, String name, String literal) {
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
	
} //Shapes
