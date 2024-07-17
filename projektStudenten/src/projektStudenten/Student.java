/**
 */
package projektStudenten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projektStudenten.Student#getCompletedCourses <em>Completed Courses</em>}</li>
 *   <li>{@link projektStudenten.Student#getName <em>Name</em>}</li>
 *   <li>{@link projektStudenten.Student#getTranscript <em>Transcript</em>}</li>
 *   <li>{@link projektStudenten.Student#getProgram <em>Program</em>}</li>
 *   <li>{@link projektStudenten.Student#getSemester <em>Semester</em>}</li>
 *   <li>{@link projektStudenten.Student#getEnrolledCourses <em>Enrolled Courses</em>}</li>
 * </ul>
 *
 * @see projektStudenten.ProjektStudentenPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Completed Courses</b></em>' containment reference list.
	 * The list contents are of type {@link projektStudenten.CourseSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed Courses</em>' containment reference list.
	 * @see projektStudenten.ProjektStudentenPackage#getStudent_CompletedCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseSet> getCompletedCourses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projektStudenten.ProjektStudentenPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projektStudenten.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transcript</b></em>' reference list.
	 * The list contents are of type {@link projektStudenten.Result}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transcript</em>' reference list.
	 * @see projektStudenten.ProjektStudentenPackage#getStudent_Transcript()
	 * @model
	 * @generated
	 */
	EList<Result> getTranscript();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projektStudenten.Program#getEnrolled <em>Enrolled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see projektStudenten.ProjektStudentenPackage#getStudent_Program()
	 * @see projektStudenten.Program#getEnrolled
	 * @model opposite="enrolled"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link projektStudenten.Student#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * The default value is <code>"ONE"</code>.
	 * The literals are from the enumeration {@link projektStudenten.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see projektStudenten.Semester
	 * @see #setSemester(Semester)
	 * @see projektStudenten.ProjektStudentenPackage#getStudent_Semester()
	 * @model default="ONE"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link projektStudenten.Student#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see projektStudenten.Semester
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Enrolled Courses</b></em>' reference list.
	 * The list contents are of type {@link projektStudenten.CourseSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled Courses</em>' reference list.
	 * @see projektStudenten.ProjektStudentenPackage#getStudent_EnrolledCourses()
	 * @model
	 * @generated
	 */
	EList<CourseSet> getEnrolledCourses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canComplete(Course c);

} // Student
