/**
 */
package projektStudenten.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projektStudenten.CourseSet;
import projektStudenten.Program;
import projektStudenten.ProjektStudentenFactory;
import projektStudenten.ProjektStudentenPackage;
import projektStudenten.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projektStudenten.impl.ProgramImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link projektStudenten.impl.ProgramImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link projektStudenten.impl.ProgramImpl#getEnrolled <em>Enrolled</em>}</li>
 *   <li>{@link projektStudenten.impl.ProgramImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected CourseSet required;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected CourseSet courses;

	/**
	 * The cached value of the '{@link #getEnrolled() <em>Enrolled</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolled()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> enrolled;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjektStudentenPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseSet getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(CourseSet newRequired, NotificationChain msgs) {
		CourseSet oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.PROGRAM__REQUIRED, oldRequired, newRequired);
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
	public void setRequired(CourseSet newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjektStudentenPackage.PROGRAM__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjektStudentenPackage.PROGRAM__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.PROGRAM__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseSet getCourses() {
		if (courses == null) {
	        courses = ProjektStudentenFactory.eINSTANCE.createCourseSet();
	    }
	    return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourses(CourseSet newCourses, NotificationChain msgs) {
		CourseSet oldCourses = courses;
		courses = newCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.PROGRAM__COURSES, oldCourses, newCourses);
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
	public void setCourses(CourseSet newCourses) {
		if (newCourses != courses) {
			NotificationChain msgs = null;
			if (courses != null)
				msgs = ((InternalEObject)courses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjektStudentenPackage.PROGRAM__COURSES, null, msgs);
			if (newCourses != null)
				msgs = ((InternalEObject)newCourses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjektStudentenPackage.PROGRAM__COURSES, null, msgs);
			msgs = basicSetCourses(newCourses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.PROGRAM__COURSES, newCourses, newCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getEnrolled() {
		if (enrolled == null) {
			enrolled = new EObjectWithInverseResolvingEList<Student>(Student.class, this, ProjektStudentenPackage.PROGRAM__ENROLLED, ProjektStudentenPackage.STUDENT__PROGRAM);
		}
		return enrolled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.PROGRAM__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjektStudentenPackage.PROGRAM__ENROLLED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnrolled()).basicAdd(otherEnd, msgs);
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
			case ProjektStudentenPackage.PROGRAM__REQUIRED:
				return basicSetRequired(null, msgs);
			case ProjektStudentenPackage.PROGRAM__COURSES:
				return basicSetCourses(null, msgs);
			case ProjektStudentenPackage.PROGRAM__ENROLLED:
				return ((InternalEList<?>)getEnrolled()).basicRemove(otherEnd, msgs);
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
			case ProjektStudentenPackage.PROGRAM__REQUIRED:
				return getRequired();
			case ProjektStudentenPackage.PROGRAM__COURSES:
				return getCourses();
			case ProjektStudentenPackage.PROGRAM__ENROLLED:
				return getEnrolled();
			case ProjektStudentenPackage.PROGRAM__LABEL:
				return getLabel();
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
			case ProjektStudentenPackage.PROGRAM__REQUIRED:
				setRequired((CourseSet)newValue);
				return;
			case ProjektStudentenPackage.PROGRAM__COURSES:
				setCourses((CourseSet)newValue);
				return;
			case ProjektStudentenPackage.PROGRAM__ENROLLED:
				getEnrolled().clear();
				getEnrolled().addAll((Collection<? extends Student>)newValue);
				return;
			case ProjektStudentenPackage.PROGRAM__LABEL:
				setLabel((String)newValue);
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
			case ProjektStudentenPackage.PROGRAM__REQUIRED:
				setRequired((CourseSet)null);
				return;
			case ProjektStudentenPackage.PROGRAM__COURSES:
				setCourses((CourseSet)null);
				return;
			case ProjektStudentenPackage.PROGRAM__ENROLLED:
				getEnrolled().clear();
				return;
			case ProjektStudentenPackage.PROGRAM__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case ProjektStudentenPackage.PROGRAM__REQUIRED:
				return required != null;
			case ProjektStudentenPackage.PROGRAM__COURSES:
				return courses != null;
			case ProjektStudentenPackage.PROGRAM__ENROLLED:
				return enrolled != null && !enrolled.isEmpty();
			case ProjektStudentenPackage.PROGRAM__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		}
		return super.eIsSet(featureID);
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
