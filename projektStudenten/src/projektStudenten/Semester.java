/**
 */
package projektStudenten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Semester</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see projektStudenten.ProjektStudentenPackage#getSemester()
 * @model
 * @generated
 */
public enum Semester implements Enumerator {
	/**
	 * The '<em><b>ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE(0, "ONE", "ONE"),

	/**
	 * The '<em><b>TWO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_VALUE
	 * @generated
	 * @ordered
	 */
	TWO(1, "TWO", "TWO"),

	/**
	 * The '<em><b>THREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_VALUE
	 * @generated
	 * @ordered
	 */
	THREE(2, "THREE", "THREE"),

	/**
	 * The '<em><b>FOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUR_VALUE
	 * @generated
	 * @ordered
	 */
	FOUR(3, "FOUR", "FOUR"),

	/**
	 * The '<em><b>FIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_VALUE
	 * @generated
	 * @ordered
	 */
	FIVE(4, "FIVE", "FIVE"),

	/**
	 * The '<em><b>SIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX_VALUE
	 * @generated
	 * @ordered
	 */
	SIX(5, "SIX", "SIX");

	/**
	 * The '<em><b>ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_VALUE = 0;

	/**
	 * The '<em><b>TWO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_VALUE = 1;

	/**
	 * The '<em><b>THREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THREE_VALUE = 2;

	/**
	 * The '<em><b>FOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOUR_VALUE = 3;

	/**
	 * The '<em><b>FIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIVE_VALUE = 4;

	/**
	 * The '<em><b>SIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIX_VALUE = 5;

	/**
	 * An array of all the '<em><b>Semester</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Semester[] VALUES_ARRAY =
		new Semester[] {
			ONE,
			TWO,
			THREE,
			FOUR,
			FIVE,
			SIX,
		};

	/**
	 * A public read-only list of all the '<em><b>Semester</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Semester> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Semester</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Semester get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Semester result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Semester</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Semester getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Semester result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Semester</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Semester get(int value) {
		switch (value) {
			case ONE_VALUE: return ONE;
			case TWO_VALUE: return TWO;
			case THREE_VALUE: return THREE;
			case FOUR_VALUE: return FOUR;
			case FIVE_VALUE: return FIVE;
			case SIX_VALUE: return SIX;
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
	private Semester(int value, String name, String literal) {
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
	
} //Semester
