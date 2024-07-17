/**
 */
package projektStudenten.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projektStudenten.Course;
import projektStudenten.CourseSet;
import projektStudenten.Program;
import projektStudenten.ProjektStudentenPackage;
import projektStudenten.Result;
import projektStudenten.Semester;
import projektStudenten.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projektStudenten.impl.StudentImpl#getCompletedCourses <em>Completed Courses</em>}</li>
 *   <li>{@link projektStudenten.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link projektStudenten.impl.StudentImpl#getTranscript <em>Transcript</em>}</li>
 *   <li>{@link projektStudenten.impl.StudentImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link projektStudenten.impl.StudentImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link projektStudenten.impl.StudentImpl#getEnrolledCourses <em>Enrolled Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
	/**
	 * The cached value of the '{@link #getCompletedCourses() <em>Completed Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseSet> completedCourses;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTranscript() <em>Transcript</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranscript()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> transcript;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected Program program;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final Semester SEMESTER_EDEFAULT = Semester.ONE;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester semester = SEMESTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnrolledCourses() <em>Enrolled Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolledCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseSet> enrolledCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjektStudentenPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseSet> getCompletedCourses() {
		if (completedCourses == null) {
			completedCourses = new EObjectContainmentEList<CourseSet>(CourseSet.class, this, ProjektStudentenPackage.STUDENT__COMPLETED_COURSES);
		}
		return completedCourses;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Result> getTranscript() {
		if (transcript == null) {
			transcript = new EObjectResolvingEList<Result>(Result.class, this, ProjektStudentenPackage.STUDENT__TRANSCRIPT);
		}
		return transcript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		if (program != null && program.eIsProxy()) {
			InternalEObject oldProgram = (InternalEObject)program;
			program = (Program)eResolveProxy(oldProgram);
			if (program != oldProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjektStudentenPackage.STUDENT__PROGRAM, oldProgram, program));
			}
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program basicGetProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		Program oldProgram = program;
		program = newProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.STUDENT__PROGRAM, oldProgram, newProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		if (newProgram != program) {
			NotificationChain msgs = null;
			if (program != null)
				msgs = ((InternalEObject)program).eInverseRemove(this, ProjektStudentenPackage.PROGRAM__ENROLLED, Program.class, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, ProjektStudentenPackage.PROGRAM__ENROLLED, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.STUDENT__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(Semester newSemester) {
		Semester oldSemester = semester;
		semester = newSemester == null ? SEMESTER_EDEFAULT : newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.STUDENT__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseSet> getEnrolledCourses() {
		if (enrolledCourses == null) {
			enrolledCourses = new EObjectResolvingEList<CourseSet>(CourseSet.class, this, ProjektStudentenPackage.STUDENT__ENROLLED_COURSES);
		}
		return enrolledCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canComplete(Course c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjektStudentenPackage.STUDENT__PROGRAM:
				if (program != null)
					msgs = ((InternalEObject)program).eInverseRemove(this, ProjektStudentenPackage.PROGRAM__ENROLLED, Program.class, msgs);
				return basicSetProgram((Program)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjektStudentenPackage.STUDENT__COMPLETED_COURSES:
				return ((InternalEList<?>)getCompletedCourses()).basicRemove(otherEnd, msgs);
			case ProjektStudentenPackage.STUDENT__PROGRAM:
				return basicSetProgram(null, msgs);
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
			case ProjektStudentenPackage.STUDENT__COMPLETED_COURSES:
				return getCompletedCourses();
			case ProjektStudentenPackage.STUDENT__NAME:
				return getName();
			case ProjektStudentenPackage.STUDENT__TRANSCRIPT:
				return getTranscript();
			case ProjektStudentenPackage.STUDENT__PROGRAM:
				if (resolve) return getProgram();
				return basicGetProgram();
			case ProjektStudentenPackage.STUDENT__SEMESTER:
				return getSemester();
			case ProjektStudentenPackage.STUDENT__ENROLLED_COURSES:
				return getEnrolledCourses();
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
			case ProjektStudentenPackage.STUDENT__COMPLETED_COURSES:
				getCompletedCourses().clear();
				getCompletedCourses().addAll((Collection<? extends CourseSet>)newValue);
				return;
			case ProjektStudentenPackage.STUDENT__NAME:
				setName((String)newValue);
				return;
			case ProjektStudentenPackage.STUDENT__TRANSCRIPT:
				getTranscript().clear();
				getTranscript().addAll((Collection<? extends Result>)newValue);
				return;
			case ProjektStudentenPackage.STUDENT__PROGRAM:
				setProgram((Program)newValue);
				return;
			case ProjektStudentenPackage.STUDENT__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case ProjektStudentenPackage.STUDENT__ENROLLED_COURSES:
				getEnrolledCourses().clear();
				getEnrolledCourses().addAll((Collection<? extends CourseSet>)newValue);
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
			case ProjektStudentenPackage.STUDENT__COMPLETED_COURSES:
				getCompletedCourses().clear();
				return;
			case ProjektStudentenPackage.STUDENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjektStudentenPackage.STUDENT__TRANSCRIPT:
				getTranscript().clear();
				return;
			case ProjektStudentenPackage.STUDENT__PROGRAM:
				setProgram((Program)null);
				return;
			case ProjektStudentenPackage.STUDENT__SEMESTER:
				setSemester(SEMESTER_EDEFAULT);
				return;
			case ProjektStudentenPackage.STUDENT__ENROLLED_COURSES:
				getEnrolledCourses().clear();
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
			case ProjektStudentenPackage.STUDENT__COMPLETED_COURSES:
				return completedCourses != null && !completedCourses.isEmpty();
			case ProjektStudentenPackage.STUDENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjektStudentenPackage.STUDENT__TRANSCRIPT:
				return transcript != null && !transcript.isEmpty();
			case ProjektStudentenPackage.STUDENT__PROGRAM:
				return program != null;
			case ProjektStudentenPackage.STUDENT__SEMESTER:
				return semester != SEMESTER_EDEFAULT;
			case ProjektStudentenPackage.STUDENT__ENROLLED_COURSES:
				return enrolledCourses != null && !enrolledCourses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProjektStudentenPackage.STUDENT___CAN_COMPLETE__COURSE:
				return canComplete((Course)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", semester: ");
		result.append(semester);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
