/**
 */
package projektStudenten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projektStudenten.Course#getTitle <em>Title</em>}</li>
 *   <li>{@link projektStudenten.Course#getAllPrereqs <em>All Prereqs</em>}</li>
 * </ul>
 *
 * @see projektStudenten.ProjektStudentenPackage#getCourse()
 * @model abstract="true"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see projektStudenten.ProjektStudentenPackage#getCourse_Title()
	 * @model ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link projektStudenten.Course#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>All Prereqs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Prereqs</em>' containment reference.
	 * @see #setAllPrereqs(CourseSet)
	 * @see projektStudenten.ProjektStudentenPackage#getCourse_AllPrereqs()
	 * @model containment="true"
	 * @generated
	 */
	CourseSet getAllPrereqs();

	/**
	 * Sets the value of the '{@link projektStudenten.Course#getAllPrereqs <em>All Prereqs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Prereqs</em>' containment reference.
	 * @see #getAllPrereqs()
	 * @generated
	 */
	void setAllPrereqs(CourseSet coursSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isElective();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CourseSet allPrereqs();

} // Course
