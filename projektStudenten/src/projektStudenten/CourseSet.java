/**
 */
package projektStudenten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projektStudenten.CourseSet#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see projektStudenten.ProjektStudentenPackage#getCourseSet()
 * @model
 * @generated
 */
public interface CourseSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link projektStudenten.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see projektStudenten.ProjektStudentenPackage#getCourseSet_Elements()
	 * @model
	 * @generated
	 */
	EList<Course> getElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CourseSet allPrereqs();
	
/**
 * Fügt einem Kurs zum Kursset hinzu 
 * @param course der hinzuzufügene Kurs
 * @author nadja
 */
	public void addCourse(Course course);

} // CourseSet
