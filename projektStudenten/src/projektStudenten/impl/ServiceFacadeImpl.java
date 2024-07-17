/**
 */
package projektStudenten.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projektStudenten.Course;
import projektStudenten.Program;
import projektStudenten.ProjektStudentenPackage;
import projektStudenten.Result;
import projektStudenten.ServiceFacade;
import projektStudenten.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projektStudenten.impl.ServiceFacadeImpl#getResults <em>Results</em>}</li>
 *   <li>{@link projektStudenten.impl.ServiceFacadeImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link projektStudenten.impl.ServiceFacadeImpl#getPrograms <em>Programs</em>}</li>
 *   <li>{@link projektStudenten.impl.ServiceFacadeImpl#getAllCourses <em>All Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceFacadeImpl extends MinimalEObjectImpl.Container implements ServiceFacade {
	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> results;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programs;

	/**
	 * The cached value of the '{@link #getAllCourses() <em>All Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> allCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjektStudentenPackage.Literals.SERVICE_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Result> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<Result>(Result.class, this, ProjektStudentenPackage.SERVICE_FACADE__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentEList<Student>(Student.class, this, ProjektStudentenPackage.SERVICE_FACADE__STUDENTS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Program> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentEList<Program>(Program.class, this, ProjektStudentenPackage.SERVICE_FACADE__PROGRAMS);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getAllCourses() {
		if (allCourses == null) {
			allCourses = new EObjectContainmentEList<Course>(Course.class, this, ProjektStudentenPackage.SERVICE_FACADE__ALL_COURSES);
		}
		return allCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjektStudentenPackage.SERVICE_FACADE__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case ProjektStudentenPackage.SERVICE_FACADE__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
			case ProjektStudentenPackage.SERVICE_FACADE__PROGRAMS:
				return ((InternalEList<?>)getPrograms()).basicRemove(otherEnd, msgs);
			case ProjektStudentenPackage.SERVICE_FACADE__ALL_COURSES:
				return ((InternalEList<?>)getAllCourses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjektStudentenPackage.SERVICE_FACADE__RESULTS:
				return getResults();
			case ProjektStudentenPackage.SERVICE_FACADE__STUDENTS:
				return getStudents();
			case ProjektStudentenPackage.SERVICE_FACADE__PROGRAMS:
				return getPrograms();
			case ProjektStudentenPackage.SERVICE_FACADE__ALL_COURSES:
				return getAllCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjektStudentenPackage.SERVICE_FACADE__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends Result>)newValue);
				return;
			case ProjektStudentenPackage.SERVICE_FACADE__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
			case ProjektStudentenPackage.SERVICE_FACADE__PROGRAMS:
				getPrograms().clear();
				getPrograms().addAll((Collection<? extends Program>)newValue);
				return;
			case ProjektStudentenPackage.SERVICE_FACADE__ALL_COURSES:
				getAllCourses().clear();
				getAllCourses().addAll((Collection<? extends Course>)newValue);
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
			case ProjektStudentenPackage.SERVICE_FACADE__RESULTS:
				getResults().clear();
				return;
			case ProjektStudentenPackage.SERVICE_FACADE__STUDENTS:
				getStudents().clear();
				return;
			case ProjektStudentenPackage.SERVICE_FACADE__PROGRAMS:
				getPrograms().clear();
				return;
			case ProjektStudentenPackage.SERVICE_FACADE__ALL_COURSES:
				getAllCourses().clear();
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
			case ProjektStudentenPackage.SERVICE_FACADE__RESULTS:
				return results != null && !results.isEmpty();
			case ProjektStudentenPackage.SERVICE_FACADE__STUDENTS:
				return students != null && !students.isEmpty();
			case ProjektStudentenPackage.SERVICE_FACADE__PROGRAMS:
				return programs != null && !programs.isEmpty();
			case ProjektStudentenPackage.SERVICE_FACADE__ALL_COURSES:
				return allCourses != null && !allCourses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceFacadeImpl
