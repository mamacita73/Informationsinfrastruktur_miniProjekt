/**
 */
package projektStudenten;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advanced</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projektStudenten.Advanced#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see projektStudenten.ProjektStudentenPackage#getAdvanced()
 * @model
 * @generated
 */
public interface Advanced extends Course {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link projektStudenten.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see projektStudenten.ProjektStudentenPackage#getAdvanced_Course()
	 * @model
	 * @generated
	 */
	EList<Course> getCourse();

} // Advanced
