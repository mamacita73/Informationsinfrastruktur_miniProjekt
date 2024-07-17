/**
 */
package projektStudenten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projektStudenten.Program#getRequired <em>Required</em>}</li>
 *   <li>{@link projektStudenten.Program#getCourses <em>Courses</em>}</li>
 *   <li>{@link projektStudenten.Program#getEnrolled <em>Enrolled</em>}</li>
 *   <li>{@link projektStudenten.Program#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see projektStudenten.ProjektStudentenPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(CourseSet)
	 * @see projektStudenten.ProjektStudentenPackage#getProgram_Required()
	 * @model containment="true"
	 * @generated
	 */
	CourseSet getRequired();

	/**
	 * Sets the value of the '{@link projektStudenten.Program#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(CourseSet value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference.
	 * @see #setCourses(CourseSet)
	 * @see projektStudenten.ProjektStudentenPackage#getProgram_Courses()
	 * @model containment="true"
	 * @generated
	 */
	CourseSet getCourses();

	/**
	 * Sets the value of the '{@link projektStudenten.Program#getCourses <em>Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courses</em>' containment reference.
	 * @see #getCourses()
	 * @generated
	 */
	void setCourses(CourseSet value);

	/**
	 * Returns the value of the '<em><b>Enrolled</b></em>' reference list.
	 * The list contents are of type {@link projektStudenten.Student}.
	 * It is bidirectional and its opposite is '{@link projektStudenten.Student#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled</em>' reference list.
	 * @see projektStudenten.ProjektStudentenPackage#getProgram_Enrolled()
	 * @see projektStudenten.Student#getProgram
	 * @model opposite="program"
	 * @generated
	 */
	EList<Student> getEnrolled();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see projektStudenten.ProjektStudentenPackage#getProgram_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link projektStudenten.Program#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Program
