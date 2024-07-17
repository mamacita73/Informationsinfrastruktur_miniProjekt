/**
 */
package projektStudenten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projektStudenten.Result#getKey <em>Key</em>}</li>
 *   <li>{@link projektStudenten.Result#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see projektStudenten.ProjektStudentenPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Course)
	 * @see projektStudenten.ProjektStudentenPackage#getResult_Key()
	 * @model
	 * @generated
	 */
	Course getKey();

	/**
	 * Sets the value of the '{@link projektStudenten.Result#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Course value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"F"</code>.
	 * The literals are from the enumeration {@link projektStudenten.Grade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see projektStudenten.Grade
	 * @see #setValue(Grade)
	 * @see projektStudenten.ProjektStudentenPackage#getResult_Value()
	 * @model default="F"
	 * @generated
	 */
	Grade getValue();

	/**
	 * Sets the value of the '{@link projektStudenten.Result#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see projektStudenten.Grade
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Grade value);

} // Result
